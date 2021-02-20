package com.usmb.monopoly.model;

public class JoueurEvent {
    public enum EventType {
        JOUEUR_TOUR,
        CASE_COURANTE_MODIFIE,
        PROPOSITION_ACHAT,
        FACTURE,
        LANCER_DÈS,
        DEBIT,
        CREDIT
    };

    public EventType type;

    public JoueurEvent(EventType type) {
        this.type = type;
    }
}
