package com.usmb.monopoly.model;

public class Propriété extends CaseAchetable {
    public int[] loyers;

    public int coutConstructionMaison;
    public int coutTerrainNu;

    public Quartier quartier;

    public Couleurs couleur;

    public Propriété(String nom, Couleurs couleur, int prix, int coutTerrainNu, int loyers[], int coutConstructionMaison) {
        super(nom, prix);
        this.couleur = couleur;
        this.coutTerrainNu = coutTerrainNu;
        this.loyers = loyers;
        this.coutConstructionMaison = coutConstructionMaison;
    }

    @Override
    public void acheter(Joueur joueur, Patrimoine patrimoine) {
        super.acheter(joueur, patrimoine);
        patrimoine.ajouterPropriete(this);
    }

    @Override
    public int coutTaxeBase(Joueur joueur) {
        return this.coutTerrainNu;
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
        return this.loyers[nbMaison - 1];
    }

}
