package org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.InstitutionService;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class BootstrapInstitutions {

    public List<Institution> InstantiateAndPopulateInstitutionsList(InstitutionService institutionService){
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

        List<Institution> institutionList = new LinkedList<>();

        institutionList.add(institution1);
        institutionList.add(institution2);
        institutionList.add(institution3);

        return institutionList;
    }
}
