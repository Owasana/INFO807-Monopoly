package com.usmb.monopoly;

public abstract class EtatCase {
    public CaseAchetable _case;

    public abstract boolean estAchetable();

    public abstract void acheter(Joueur proprietaire);

    public abstract void arriverSur(Joueur joueur);

    public abstract void construireMaison(int nbMaison, Joueur joueur);

    public abstract void devenirConstructible();

    public abstract int coutTaxe();
}
