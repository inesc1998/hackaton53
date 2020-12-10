package org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.CasesService;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class BootstrapIsolatedCases {

    //private CasesService casesService;

    public List<IsolatedCase> InstantiateAndPopulateCasesList(CasesService casesService){

        IsolatedCase isolatedCase1 = new IsolatedCase();
        isolatedCase1.setId(1);
        isolatedCase1.setName("João Sousa");
        isolatedCase1.setAddress("Lisboa");
        isolatedCase1.setAge(8);
        isolatedCase1.setHistory("Sousa's family is struggling to get food to their little child. As soon the pandemic crisis began, both parents got unemployed and are struggling to put all daily meals in the table.");
        isolatedCase1.setInstitution("Caritas Faial");


        IsolatedCase isolatedCase2 = new IsolatedCase();
        isolatedCase2.setId(2);
        isolatedCase2.setName("Anjal");
        isolatedCase2.setAddress("India");
        isolatedCase2.setAge(9);
        isolatedCase2.setHistory("I come from a poor family. At home it's one room, just a room we live in.");
        isolatedCase2.setInstitution("Khan Academy");


        IsolatedCase isolatedCase3 = new IsolatedCase();
        isolatedCase3.setId(3);
        isolatedCase3.setName("Ramalandam");
        isolatedCase3.setAddress("Pakistan");
        isolatedCase3.setAge(13);
        isolatedCase3.setHistory("Ramalandam need hep for medical assistance");
        isolatedCase3.setInstitution("Uplift International");


        IsolatedCase isolatedCase4 = new IsolatedCase();
        isolatedCase4.setId(4);
        isolatedCase4.setName("Jamalian");
        isolatedCase4.setAddress("Kenya");
        isolatedCase4.setAge(16);
        isolatedCase4.setHistory("Jamalian spend 4 hours daily to fetch water for is family . Time she could use to study , rest or even to play with friends." );
        isolatedCase4.setInstitution("Water for good");


        IsolatedCase isolatedCase5 = new IsolatedCase();
        isolatedCase5.setId(5);
        isolatedCase5.setName("Hibraim");
        isolatedCase5.setAddress("Iraq");
        isolatedCase5.setAge(12);
        isolatedCase5.setHistory("Hibraim dream to attend a schoold class but need to make small jobs to get food.");
        isolatedCase5.setInstitution("Operation Smile");


        /*casesService.populateList(isolatedCase1);
        casesService.populateList(isolatedCase2);
        casesService.populateList(isolatedCase3);
        casesService.populateList(isolatedCase4);
        casesService.populateList(isolatedCase5);*/

        List<IsolatedCase> casesList = new LinkedList<>();

        casesList.add(isolatedCase1);
        casesList.add(isolatedCase2);
        casesList.add(isolatedCase3);
        casesList.add(isolatedCase4);
        casesList.add(isolatedCase5);

        //casesService.setCasesList(casesList);

        //System.out.println("------------CASESLIST:---------------------\n" + casesList);

        return casesList;
    }
}
