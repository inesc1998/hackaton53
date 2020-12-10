package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import java.util.LinkedList;
import java.util.List;

public class FamilyService {

    private List<Family> familiesList = new LinkedList<>();

    public void populateList(Family newFamily){
        this.familiesList.add(newFamily);
    }

    public List<Family> getFamiliesList() {
        return familiesList;
    }

    public void setFamiliesList(List<Family> familiesList) {
        this.familiesList = familiesList;
    }
}
