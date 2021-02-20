package com.usmb.monopoly.model;

public class Gare extends CaseAchetable {
    public int loyer;

    public Patrimoine patrimoine;

    public Gare(String nom, int prix, int loyer) {
        super(nom, prix);
        this.loyer = loyer;
    }

    @Override
    public void acheter(Joueur joueur, Patrimoine patrimoine) {
        super.acheter(joueur, patrimoine);
        patrimoine.ajouterGare(this);
    }

    @Override
    public int coutAchat() {
        return prix;
    }

    @Override
    public int coutTerrainNu() {
        return 0;
    }

    @Override
    public int coutTaxe() {
        return this.loyer * this.patrimoine.nombreGare();
    }

    public void setPatrimoine(Patrimoine patrimoine) {
        this.patrimoine = patrimoine;
    }
}
