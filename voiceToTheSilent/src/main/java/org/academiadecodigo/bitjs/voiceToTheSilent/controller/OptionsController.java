package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.service.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/options")
public class OptionsController {

    private CasesService casesService;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String optionsMenu() {
            return "voicets/helplist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/cases"})
    public String casesList(Model model) {

        model.addAttribute("cases", casesService.getCasesList());
        return "voicets/helplist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/institutions"})
    public String institutionsList(Model model) {
        model.addAttribute("institutions", casesService.getCasesList());
        return "voicets/helplist"; //html file names
    }



    @Autowired
    public void setCasesService(CasesService casesService) {
        this.casesService = casesService;
    }



}

