package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import java.util.HashMap;

public class InstitutionService {

    private HashMap<Integer, Institution> institutionsList = new HashMap<>();

    public void populateList(Institution newInstitution) {
        this.institutionsList.put(newInstitution.getId(), newInstitution);
    }

    public HashMap<Integer, Institution> getInstitutionsList() {
        return institutionsList;
    }

    public void setInstitutionsList(HashMap<Integer, Institution> institutionsList) {
        this.institutionsList = institutionsList;
    }
}
