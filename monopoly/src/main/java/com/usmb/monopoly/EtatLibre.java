package com.usmb.monopoly;

public class EtatLibre extends EtatCase {
    @Override
    public boolean estAchetable() {
        return true;
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
