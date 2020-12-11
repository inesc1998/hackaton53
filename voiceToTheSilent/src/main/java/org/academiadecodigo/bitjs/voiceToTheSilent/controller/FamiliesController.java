package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapFamilies;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Godfather;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/families")
public class FamiliesController {

    private BootstrapFamilies bootstrapFamilies = new BootstrapFamilies();
    private FamilyService familyService;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String familiesList(Model model) {
        List<Family> familyList = bootstrapFamilies.InstantiateAndPopulateFamiliesList(familyService);
        model.addAttribute("families", familyList);
        return "/familieslist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")  //id do case associado ao godfather
    public String addGodfather(@PathVariable Integer id, Model model) {
        model.addAttribute("godfather", new Godfather());
        model.addAttribute("choiceId", id);
        return "form";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about/{id}")  //id do case associado ao godfather
    public String about(@PathVariable Integer id, Model model) {
        List<Family> familyList = bootstrapFamilies.InstantiateAndPopulateFamiliesList(familyService);
        Family family = familyList.get(id-1);
        model.addAttribute("family", family);
        model.addAttribute("choiceId", id);
        return "/aboutFamilies";
    }

    @Autowired
    public void setBootstrapFamilies(BootstrapFamilies bootstrapFamilies) {
        this.bootstrapFamilies = bootstrapFamilies;
    }

}
