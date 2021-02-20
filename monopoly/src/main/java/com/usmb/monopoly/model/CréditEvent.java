package com.usmb.monopoly.model;

public class CréditEvent extends JoueurEvent {
    public int montant;
    public int solde;

    public CréditEvent(int montant, int solde) {
        super(EventType.CREDIT);
        this.montant = montant;
        this.solde = solde;
    }
}
