package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapIsolatedCases;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/options")
public class OptionsController {

    private BootstrapFamilies bootstrapFamilies;
    private BootstrapInstitutions bootstrapInstitutions;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String optionsMenu() {
        return "voicets/optionslist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/institutions"})
    public String institutionsList(Model model) {
        List<Institution> institutionList = bootstrapInstitutions.InstantiateAndPopulateInstitutionsList();
        model.addAttribute("institutions", institutionList);
        return "voicets/helplist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/families"})
    public String familiesList(Model model) {
        List<Family> familyList = bootstrapFamilies.InstantiateAndPopulateFamiliesList();
        model.addAttribute("families", familyList);
        return "voicets/helplist"; //html file names
    }

    @Autowired
    public void setBootstrapIsolatedCases(BootstrapIsolatedCases bootstrapIsolatedCases) {
        this.bootstrapIsolatedCases = bootstrapIsolatedCases;
    }

    @Autowired
    public void setBootstrapFamilies(BootstrapFamilies bootstrapFamilies) {
        this.bootstrapFamilies = bootstrapFamilies;
    }

    @Autowired
    public void setBootstrapInstitutions(BootstrapInstitutions bootstrapInstitutions) {
        this.bootstrapInstitutions = bootstrapInstitutions;
    }
}