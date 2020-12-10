package org.academiadecodigo.bitjs.voiceToTheSilent.service;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;
import java.util.LinkedList;
import java.util.List;

public class CasesService {

    private List<IsolatedCase> casesList = new LinkedList<>();

    public void populateList(IsolatedCase newCase){
        this.casesList.add(newCase);
    }
    public List<IsolatedCase> getCasesList() {
        return casesList;
    }

    public void setCasesList(List<IsolatedCase> casesList) {
        this.casesList = casesList;
    }
}
