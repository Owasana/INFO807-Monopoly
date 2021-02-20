package com.usmb.monopoly.model;

public class Gare extends CaseAchetable {
    public int prix;

    public int loyer;

    public Patrimoine patrimoine;

    public Gare(String nom, int prix, int loyer) {
        super(nom);
        this.prix = prix;
        this.loyer = loyer;
    }
}
