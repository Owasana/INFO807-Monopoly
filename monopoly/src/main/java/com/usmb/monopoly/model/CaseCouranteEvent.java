package com.usmb.monopoly.model;

public class CaseCouranteEvent extends JoueurEvent {
    public String nomCase;

    public CaseCouranteEvent(String nomCase) {
        super(EventType.CASE_COURANTE_MODIFIE);
        this.nomCase = nomCase;
    }
}
