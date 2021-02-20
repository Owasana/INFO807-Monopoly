package com.usmb.monopoly.model;

public class PropositionAchatEvent extends JoueurEvent {
    public String nomCase;
    public int cout;

    public PropositionAchatEvent(String nomCase, int cout) {
        super(EventType.PROPOSITION_ACHAT);
        this.nomCase = nomCase;
        this.cout = cout;
    }
}
