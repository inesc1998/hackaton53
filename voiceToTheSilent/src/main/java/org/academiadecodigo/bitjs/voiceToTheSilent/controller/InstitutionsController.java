package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapInstitutions;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/institutions")
public class InstitutionsController {

    private BootstrapInstitutions bootstrapInstitutions;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String institutionsList(Model model) {
        List<Institution> institutionList = bootstrapInstitutions.InstantiateAndPopulateInstitutionsList();
        model.addAttribute("institutions", institutionList);
        return "voicets/institutionslist"; //html file names
    }

    @Autowired
    public void setBootstrapInstitutions(BootstrapInstitutions bootstrapInstitutions) {
        this.bootstrapInstitutions = bootstrapInstitutions;
    }
}
