package com.usmb.monopoly.model;

public class EtatLibre extends EtatCase {
    public EtatLibre(CaseAchetable _case) {
        super(_case);
    }

    @Override
    public void acheter(Joueur proprietaire) {

    }

    @Override
    public void arriverSur(Joueur joueur) {

    }

    @Override
    public void construireMaison(int nbMaison, Joueur joueur) {

    }

    @Override
    public void devenirConstructible() {

    }

    @Override
    public int coutTaxe() {
        return 0;
    }
}
