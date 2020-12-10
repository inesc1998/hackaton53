package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Institution;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;

@Service
public class InstitutionService {

    private List<Institution> institutionsList = new LinkedList<>();

    public void populateList(Institution newInstitution) {
        this.institutionsList.add(newInstitution);
    }

    public List<Institution> getInstitutionsList() {
        return institutionsList;
    }

    public void setInstitutionsList(List<Institution> institutionsList) {
        this.institutionsList = institutionsList;
    }
}
