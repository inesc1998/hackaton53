package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapIsolatedCases;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/cases")
public class CasesController {

    private BootstrapIsolatedCases bootstrapIsolatedCases;
    private GodfatherService godfatherService;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String casesList(Model model) {
        List<IsolatedCase> casesList = bootstrapIsolatedCases.InstantiateAndPopulateCasesList();
        model.addAttribute("cases", casesList);
        return "voicets/caseslist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")  //id do case associado ao godfather
    public String addGodfather(@PathVariable Integer id, Model model) {
            model.addAttribute("godfather", new Godfather());
            model.addAttribute("choiceId", id);
            return "voicets/form";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/{id}"}, params = "action=save")
    public String saveCustomer(@PathVariable Integer id, @Valid @ModelAttribute("godfather") Godfather godfather, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "voicets/form";
        }

        Godfather savedGodfather = godfatherService.populateList(godfather);

        //Se quisermos adicionar um botao a dizer que foi adicionado
        //redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getFirstName() + " " + savedCustomer.getLastName());
        return "redirect:voicets/";
    }

    @Autowired
    public void setBootstrapIsolatedCases(BootstrapIsolatedCases bootstrapIsolatedCases) {
        this.bootstrapIsolatedCases = bootstrapIsolatedCases;
    }

    @Autowired
    public void setGodfatherService(GodfatherService godfatherService) {
        this.godfatherService = godfatherService;
    }
}
