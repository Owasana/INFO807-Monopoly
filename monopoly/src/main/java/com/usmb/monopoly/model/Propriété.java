package com.usmb.monopoly.model;

public class Propriété extends CaseAchetable {
    public int[] loyer = new int[5];

    public int prix;

    public int coutConstructionMaison;

    public Quartier quartier;

    public Propriété(String nom, Couleurs couleur, Case suivant) {
        super(nom, couleur, suivant);
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public void devenirConstructible() {
    }

    public int getCoutConstructionMaison() {
        return coutConstructionMaison;
    }

    public int coutLoyer(int nbMaison) {
        return this.loyer[nbMaison];
    }

}
