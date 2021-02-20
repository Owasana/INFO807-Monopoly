package com.usmb.monopoly.model;

public class EtatComplet extends EtatPossedée {
    public EtatComplet(CaseAchetable _case, Joueur joueur) {
        super(_case, joueur);
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
