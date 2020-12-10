package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapFamilies;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/families")
public class FamiliesController {

    private BootstrapFamilies bootstrapFamilies;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String familiesList(Model model) {
        List<Family> familyList = bootstrapFamilies.InstantiateAndPopulateFamiliesList();
        model.addAttribute("families", familyList);
        return "voicets/familieslist"; //html file names
    }

    @Autowired
    public void setBootstrapFamilies(BootstrapFamilies bootstrapFamilies) {
        this.bootstrapFamilies = bootstrapFamilies;
    }
}
