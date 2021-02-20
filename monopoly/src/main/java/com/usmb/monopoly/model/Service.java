package com.usmb.monopoly.model;

public class Service extends CaseAchetable {
    public int taxes;

    public int prix;

    public Patrimoine patrimoine;

    public Service(String nom, Couleurs couleur, Case suivant) {
        super(nom, couleur, suivant);
    }
}
