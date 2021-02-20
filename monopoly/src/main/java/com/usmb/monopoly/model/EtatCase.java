package com.usmb.monopoly.model;

public abstract class EtatCase {
    public CaseAchetable _case;

    public EtatCase(CaseAchetable _case) {
        this._case = _case;
    }

    public abstract void acheter(Joueur proprietaire, Patrimoine patrimoine);

    public abstract void arriverSur(Joueur joueur);

    public abstract void construireMaison(int nbMaison, Joueur joueur);

    public abstract void devenirConstructible();

    public abstract int coutTaxe(Joueur joueur);

    public abstract void payerTaxe(Joueur joueur);
}
