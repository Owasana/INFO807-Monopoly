package com.usmb.monopoly;

public class EtatNonConstructible extends EtatPossedée {
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
