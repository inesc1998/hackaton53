package org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.InstitutionService;

import java.util.List;

public class BootstrapInstitutions {

    private InstitutionService institutionService;

    public List<Institution> InstantiateAndPopulateInstitutionsList(){
        Institution institution1 = new Institution();
        institution1.setId(1);
        institution1.setName("AFRICACARE");
        institution1.setCause("Africare is a leading non-governmental organization (NGO) committed to addressing African development and policy issues by working in partnership with African people to build sustainable, healthy and productive communities.");
        institution1.setCause("Build sustainable, healthy and productive communities");

        Institution institution2 = new Institution();
        institution2.setId(2);
        institution2.setName("UNICEF");
        institution2.setCause("Operation Smile(indigent suport). Water for Good (water management and usage improvement in 3 world");
        institution2.setCause("Multiple causes to aid several groups.");

        Institution institution3 = new Institution();
        institution3.setId(3);
        institution3.setName("Caritas");
        institution3.setCause("Social assistance. Food gathering.");
        institution3.setCause("Multiple causes to help less unfortunate people");

        institutionService.populateList(institution1);
        institutionService.populateList(institution2);
        institutionService.populateList(institution3);

        return institutionService.getInstitutionsList();
    }
}
