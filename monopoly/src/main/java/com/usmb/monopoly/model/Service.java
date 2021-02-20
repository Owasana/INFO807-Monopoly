package com.usmb.monopoly.model;

public class Service extends CaseAchetable {
    public int loyers[];

    public Patrimoine patrimoine;

    public Service(String nom, int prix, int loyers[]) {
        super(nom, prix);
        this.loyers = loyers;
    }

    @Override
    public void acheter(Joueur joueur, Patrimoine patrimoine) {
        super.acheter(joueur, patrimoine);
        patrimoine.ajouterService(this);
    }

    @Override
    public int coutTerrainNu() {
        return 0;
    }

    @Override
    public int coutTaxe() {
        return this.loyers[this.patrimoine.nombreService()];
    }

    public void setPatrimoine(Patrimoine patrimoine) {
        this.patrimoine = patrimoine;
    }
}
