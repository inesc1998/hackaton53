package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapIsolatedCases;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/cases")
public class CasesController {

    private BootstrapIsolatedCases bootstrapIsolatedCases;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String casesList(Model model) {
        List<IsolatedCase> casesList = bootstrapIsolatedCases.InstantiateAndPopulateCasesList();
        model.addAttribute("cases", casesList);
        return "voicets/caseslist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showCustomer(@PathVariable Integer id, Model model) throws Exception {

        Customer customer = customerService.get(id);

        // command objects for customer show view
        model.addAttribute("customer", customerToCustomerDto.convert(customer));
        model.addAttribute("accounts", accountToAccountDto.convert(customer.getAccounts()));
        model.addAttribute("accountTypes", AccountType.list());
        model.addAttribute("customerBalance", customerService.getBalance(id));

        // command objects for modals
        AccountDto accountDto = new AccountDto();
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setId(id);

        model.addAttribute("account", accountDto);
        model.addAttribute("accountTransaction", accountTransactionDto);

        model.addAttribute("transfer", new TransferDto());
        return "customer/show";
    }
}
