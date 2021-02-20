package com.usmb.monopoly.model;

public class Service extends CaseAchetable {
    public int loyers[];

    public int prix;

    public Patrimoine patrimoine;

    public Service(String nom, int prix, int loyers[]) {
        super(nom);
        this.prix = prix;
        this.loyers = loyers;
    }
}
