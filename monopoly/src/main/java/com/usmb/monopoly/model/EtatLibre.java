package com.usmb.monopoly.model;

public class EtatLibre extends EtatCase {
    public EtatLibre(CaseAchetable _case) {
        super(_case);
    }

    @Override
    public void acheter(Joueur proprietaire, Patrimoine patrimoine) {
        this._case.setEtat(new EtatNonConstructible(this._case, proprietaire));
        proprietaire.débiter(this._case.coutAchat());
    }

    @Override
    public void arriverSur(Joueur joueur) {
        joueur.proposerAchat(this._case.coutAchat());
    }

    @Override
    public void construireMaison(int nbMaison, Joueur joueur) {

    }

    @Override
    public void devenirConstructible() {

    }

    @Override
    public int coutTaxe(Joueur joueur) {
        return 0;
    }

    @Override
    public void payerTaxe(Joueur joueur) {

    }
}
