package com.usmb.monopoly.model;

public class FactureEvent extends JoueurEvent {
    public Case _case;

    public FactureEvent(Case _case) {
        super(EventType.FACTURE);
        this. _case = _case;
    }
}
