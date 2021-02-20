package com.usmb.monopoly.model;

public class Propriété extends CaseAchetable {
    public int[] loyers;

    public int coutConstructionMaison;

    public Quartier quartier;

    public Couleurs couleur;

    public Propriété(String nom, Couleurs couleur, int prix, int loyers[], int coutConstructionMaison) {
        super(nom, prix);
        this.couleur = couleur;
        this.loyers = loyers;
        this.coutConstructionMaison = coutConstructionMaison;
    }

    @Override
    public void acheter(Joueur joueur, Patrimoine patrimoine) {
        super.acheter(joueur, patrimoine);
        patrimoine.ajouterPropriete(this);
    }

    @Override
    public int coutTerrainNu() {
        return 0;
    }

    @Override
    public int coutTaxe() {
        return 0;
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
