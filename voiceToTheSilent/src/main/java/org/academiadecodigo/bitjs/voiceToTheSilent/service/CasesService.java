package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import java.util.HashMap;

public class CasesService {

    private HashMap<Integer, IsolatedCase> casesList = new HashMap<>();

    public void populateList(IsolatedCase newCase){
        this.casesList.put(newCase.getId(),newCase);
    }

    public HashMap<Integer, IsolatedCase> getCasesList() {
        return casesList;
    }

    public void setCasesList(HashMap<Integer, IsolatedCase> casesList) {
        this.casesList = casesList;
    }
}
