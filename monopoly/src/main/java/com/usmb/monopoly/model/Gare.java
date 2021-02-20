package com.usmb.monopoly.model;

public class Gare extends CaseAchetable {
    public int prix;

    public int taxes;

    public Patrimoine patrimoine;

    public Gare(String nom, Couleurs couleur, Case suivant) {
        super(nom, couleur, suivant);
    }
}
