package com.usmb.monopoly.model;

public class DébitEvent extends JoueurEvent {
    public int montant;
    public int solde;

    public DébitEvent(int montant, int solde) {
        super(EventType.DEBIT);
        this.montant = montant;
        this.solde = solde;
    }
}
