package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapInstitutions;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Godfather;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.InstitutionService;
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
@RequestMapping("/institutions")
public class InstitutionsController {

    private BootstrapInstitutions bootstrapInstitutions = new BootstrapInstitutions();
    private InstitutionService institutionService;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String institutionsList(Model model) {
        List<Institution> institutionList = bootstrapInstitutions.InstantiateAndPopulateInstitutionsList(institutionService);
        model.addAttribute("institutions", institutionList);
        return "institutionslist"; //html file names
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
        return "redirect:/institutions/" + id;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about/{id}")  //id do case associado ao godfather
    public String about(@PathVariable Integer id, Model model) {
        List<Institution> institutionList = bootstrapInstitutions.InstantiateAndPopulateInstitutionsList(institutionService);
        Institution institution = institutionList.get(id-1);
        model.addAttribute("institution", institution);
        model.addAttribute("choiceId", id);
        return "aboutInstitutions";
    }

    @Autowired
    public void setBootstrapInstitutions(BootstrapInstitutions bootstrapInstitutions) {
        this.bootstrapInstitutions = bootstrapInstitutions;
    }
}
