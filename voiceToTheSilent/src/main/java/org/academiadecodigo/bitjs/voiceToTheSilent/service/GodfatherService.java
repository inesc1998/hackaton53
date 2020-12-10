package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.Godfather;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;

@Service
public class GodfatherService {

     private List<Godfather> godfathersList = new LinkedList<>();

     public void populateList(Godfather newGodfather){
         this.godfathersList.add(newGodfather);
     }

    public List<Godfather> getGodfathersList() {
        return godfathersList;
    }

    public void setGodfathersList(List<Godfather> godfathersList) {
        this.godfathersList = godfathersList;
    }
}
