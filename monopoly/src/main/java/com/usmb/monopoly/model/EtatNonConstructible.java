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
        _case.setEtat(new EtatConstructible(_case, this.proprietaire));
    }

    @Override
    public int coutTaxe() {
        return 0;
    }
}
