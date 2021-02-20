package com.usmb.monopoly.model;

public abstract class CaseAchetable extends Case {
    public EtatCase etat;
    public int prix;

    public CaseAchetable(String nom, int prix) {
        super(nom);
        this.etat = new EtatLibre(this);
        this.prix = prix;
    }

    @Override
    public void arriverSur(Joueur joueur) {
        super.arriverSur(joueur);
        this.etat.arriverSur(joueur);
    }

    @Override
    public void acheter(Joueur joueur, Patrimoine patrimoine) {
        this.etat.acheter(joueur, patrimoine);
    }

    @Override
    public void construireMaison(int nbMaisons, Joueur joueur) {
        super.construireMaison(nbMaisons, joueur);
        this.etat.construireMaison(nbMaisons, joueur);
    }

    public int coutAchat() {
        return this.prix;
    }

    public void setEtat(EtatCase etat) {
        this.etat = etat;
    }

    public abstract int coutTaxeBase(Joueur joueur);

    @Override
    public void payerTaxe(Joueur joueur) {
        super.payerTaxe(joueur);
        this.etat.payerTaxe(joueur);
    }
}
