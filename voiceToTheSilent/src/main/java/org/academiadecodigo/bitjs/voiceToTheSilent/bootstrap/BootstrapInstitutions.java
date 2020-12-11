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

        Institution institution2 = new Institution();
        institution2.setId(2);
        institution2.setName("UNICEF");
        institution2.setCause("UNICEF works in the world’s toughest places to reach the most disadvantaged children and adolescents – and to protect the rights of every child, everywhere. Across more than 190 countries and territories, we do whatever it takes to help children survive, thrive and fulfill their potential, from early childhood through adolescence.");

        Institution institution3 = new Institution();
        institution3.setId(3);
        institution3.setName("Caritas");
        institution3.setCause("Caritas believe that people and the environment, not profits, should be at the heart of all policies. We oppose all kinds of exclusions and support all initiatives that promote sustainable development that benefit everyone and enable all people to find a meaningful role to play in society.");

        List<Institution> institutionList = new LinkedList<>();

        institutionList.add(institution1);
        institutionList.add(institution2);
        institutionList.add(institution3);

        return institutionList;
    }
}
