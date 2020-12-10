package org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import org.academiadecodigo.bitjs.voiceToTheSilent.service.FamilyService;

import java.util.List;

public class BootstrapFamilies {

    private FamilyService familyService;

    public List<Family> InstantiateAndPopulateFamiliesList(){

        Family family1 = new Family();
        family1.setId(1);
        family1.setName("Abebe");
        family1.setElements(6);
        family1.setAddress("Ethiopia");
        family1.setHistory("Well for freshwater and irrigation , to provide food and avoid the constant drought that keep Africa's horn in famine. Water For Good");
        family1.setInstitution("UNHCR");

        Family family2 = new Family();
        family2.setId(2);
        family2.setName("Khatib");
        family2.setElements(8);
        family2.setAddress("Jordan");
        family2.setHistory("Establish an permaculture farm which provide fresh food ,erosion diminishing  with little water usage. Greening the desert project.");
        family2.setInstitution("ENTRAJUDA");

        Family family3 = new Family();
        family3.setId(3);
        family3.setName("Ngoy");
        family3.setElements(10);
        family3.setAddress("Uganda");
        family3.setHistory("With several sons the Ngoy live in constant fear that rebels could kidnap them and force them to became boy soldiers.");
        family3.setInstitution("UNICEF");

        Family family4 = new Family();
        family4.setId(4);
        family4.setName("Abubakar");
        family4.setElements(10);
        family4.setAddress("Niger");
        family4.setHistory("Malaria kill thousands every single year leaving many impaired , Abubakar live in the shadow of this silent killer, so sleep under nets are mandatory.");
        family4.setInstitution("AFRICARE");

        familyService.populateList(family1);
        familyService.populateList(family2);
        familyService.populateList(family3);
        familyService.populateList(family4);

        return familyService.getFamiliesList();
    }
}
