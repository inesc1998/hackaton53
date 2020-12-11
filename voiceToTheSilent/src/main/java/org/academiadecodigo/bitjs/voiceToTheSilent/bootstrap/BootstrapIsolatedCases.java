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
        isolatedCase1.setHistory("Sousa's family is struggling to get food to their little child. As soon the pandemic crisis began, both parents got unemployed and are struggling to put all daily meals on the table.");
        isolatedCase1.setInstitution("Caritas Faial");


        IsolatedCase isolatedCase2 = new IsolatedCase();
        isolatedCase2.setId(2);
        isolatedCase2.setName("Anjal");
        isolatedCase2.setAddress("India");
        isolatedCase2.setAge(9);
        isolatedCase2.setHistory("Anjal comes from a very poor family. Living in precarious conditions she and her family have to share the same room that lacks not only furniture but also an appropriate infrastructure.");
        isolatedCase2.setInstitution("Khan Academy");


        IsolatedCase isolatedCase3 = new IsolatedCase();
        isolatedCase3.setId(3);
        isolatedCase3.setName("Ramalandam");
        isolatedCase3.setAddress("Pakistan");
        isolatedCase3.setAge(13);
        isolatedCase3.setHistory("Ramalandam is in urgent need for medical assistance. He has a serious condition and in Pakistan medication is very expensive.");
        isolatedCase3.setInstitution("Uplift International");


        IsolatedCase isolatedCase4 = new IsolatedCase();
        isolatedCase4.setId(4);
        isolatedCase4.setName("Jamalian");
        isolatedCase4.setAddress("Kenya");
        isolatedCase4.setAge(16);
        isolatedCase4.setHistory("Jamalian lives in a town without access to fresh and drinkable water. He spends 4 hours every day, walking on foot to fetch water for his family." );
        isolatedCase4.setInstitution("Water for good");


        IsolatedCase isolatedCase5 = new IsolatedCase();
        isolatedCase5.setId(5);
        isolatedCase5.setName("Hibraim");
        isolatedCase5.setAddress("Iraq");
        isolatedCase5.setAge(12);
        isolatedCase5.setHistory("Hibraim dream to attend a school class but needs to make small jobs to get food for his family.");
        isolatedCase5.setInstitution("Operation Smile");

        List<IsolatedCase> casesList = new LinkedList<>();

        casesList.add(isolatedCase1);
        casesList.add(isolatedCase2);
        casesList.add(isolatedCase3);
        casesList.add(isolatedCase4);
        casesList.add(isolatedCase5);

        return casesList;
    }
}
