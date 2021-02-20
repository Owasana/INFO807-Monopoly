package com.usmb.monopoly.model;

public class Propriété extends CaseAchetable {
    public int[] loyers;

    public int prix;

    public int coutConstructionMaison;

    public Quartier quartier;

    public Couleurs couleur;

    public Propriété(String nom, Couleurs couleur, int prix, int loyers[], int coutConstructionMaison) {
        super(nom);
        this.couleur = couleur;
        this.prix = prix;
        this.loyers = loyers;
        this.coutConstructionMaison = coutConstructionMaison;
    }

    public Couleurs getCouleur() {
        return couleur;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public void devenirConstructible() {
        this.etat.devenirConstructible();
    }

    public int getCoutConstructionMaison() {
        return coutConstructionMaison;
    }

    public int coutLoyer(int nbMaison) {
        return this.loyers[nbMaison];
    }

}
