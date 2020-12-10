package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap.BootstrapIsolatedCases;
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

    private BootstrapIsolatedCases bootstrapIsolatedCases;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String optionsMenu() {
            return "voicets/helplist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/cases"})
    public String casesList(Model model) {

        List<IsolatedCase> casesList = bootstrapIsolatedCases.InstantiateAndPopulateCasesList();
        model.addAttribute("cases", casesList);
        return "voicets/helplist"; //html file names
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/institutions"})
    public String institutionsList(Model model) {

        return "voicets/helplist"; //html file names
    }

    @Autowired
    public void setBootstrapIsolatedCases(BootstrapIsolatedCases bootstrapIsolatedCases) {
        this.bootstrapIsolatedCases = bootstrapIsolatedCases;
    }
}