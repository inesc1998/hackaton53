package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Family;
import java.util.HashMap;

public class FamilyService {

    private HashMap<Integer, Family> familiesList = new HashMap<>();

    public void populateList(Family newFamily){
        this.familiesList.put(newFamily.getId(),newFamily);
    }

    public HashMap<Integer, Family> getFamiliesList() {
        return familiesList;
    }

    public void setFamiliesList(HashMap<Integer, Family> familiesList) {
        this.familiesList = familiesList;
    }

}
