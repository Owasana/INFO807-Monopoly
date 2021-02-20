package com.usmb.monopoly.model;

public class EtatNonConstructible extends EtatPossedée {
    public EtatNonConstructible(CaseAchetable _case, Joueur joueur) {
        super(_case, joueur);
    }

    @Override
    public void construireMaison(int nbMaison, Joueur joueur) {

    }

    @Override
    public void devenirConstructible() {
        this._case.setEtat(new EtatConstructible(this._case, this.proprietaire));
    }

    @Override
    public int coutTaxe(Joueur joueur) {
        return this._case.coutTaxeBase(joueur);
    }
}
