package org.academiadecodigo.bitjs.voiceToTheSilent.bootstrap;

import org.academiadecodigo.bitjs.voiceToTheSilent.model.IsolatedCase;

public class Bootstrap {
    private IsolatedCase isolatedCase;
    private CasesService casesService;

    public void InstanciateAndPopulateCasesList(){
        IsolatedCase isolatedCase1 = new IsolatedCase();
        isolatedCase1.setId(1);
        isolatedCase1.setName("João Armas");
        isolatedCase1.setAddress("Rua de Jesus");
        isolatedCase1.setAge(8);
        isolatedCase1.setHistory("Armas family is struggling to get food to it's little child. As soon the pandemic crisis began little Armas couldn't get is daily tem meals, so it's colours are fading away");
        isolatedCase1.setInstitution("");
    }
}
