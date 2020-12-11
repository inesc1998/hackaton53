package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapIsolatedCases;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Godfather;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.CasesService;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.GodfatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

@Controller
@RequestMapping("/cases")
public class CasesController {

    private BootstrapIsolatedCases bootstrapIsolatedCases = new BootstrapIsolatedCases();
    private CasesService casesService;
    private GodfatherService godfatherService;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String casesList(Model model) {
        List<IsolatedCase> casesList = bootstrapIsolatedCases.InstantiateAndPopulateCasesList(casesService);
        model.addAttribute("cases", casesList);
        return "caseslist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")  //id do case associado ao godfather
    public String addGodfather(@PathVariable Integer id, Model model) {
            model.addAttribute("godfather", new Godfather());
            model.addAttribute("choiceId", id);
            return "form";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/{id}"}/*, params = "action=save"*/)
    public String saveGodfather(@PathVariable Integer id, @ModelAttribute("godfather") Godfather godfather, RedirectAttributes redirectAttributes) {
        //godfatherService.populateList(godfather);
        redirectAttributes.addFlashAttribute("lastAction", " Your donation is very important for us " + godfather.getName() + ". We will get in touch soon!");
        return "redirect:/cases/" + id;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about/{id}")  //id do case associado ao godfather
    public String about(@PathVariable Integer id, Model model) {
        List<IsolatedCase> casesList = bootstrapIsolatedCases.InstantiateAndPopulateCasesList(casesService);
        IsolatedCase isolatedCase = casesList.get(id-1);
        model.addAttribute("case", isolatedCase);
        model.addAttribute("choiceId", id);
        return "/aboutCases";
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
