package com.usmb.monopoly.model;

public class DèsEvent extends JoueurEvent {
    public int lancer;
    public DèsEvent(int lancer) {
        super(EventType.LANCER_DÈS);
        this.lancer = lancer;
    }
}
