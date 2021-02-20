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
    public int coutTaxeBase(Joueur joueur) {
        int coutBase = this.loyers[this.patrimoine.nombreService() - 1];
        return joueur.lancerDès() * coutBase;
    }

    public void setPatrimoine(Patrimoine patrimoine) {
        this.patrimoine = patrimoine;
    }
}
