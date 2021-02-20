package com.usmb.monopoly.model;

public class EtatConstructible extends EtatPossedée {
    public int nbMaisonsConstruites;

    public EtatConstructible(CaseAchetable _case, Joueur joueur) {
        super(_case, joueur);
    }

    public boolean estComplet() {
        return nbMaisonsConstruites == 5;
    }

    public boolean estVide() {
        return nbMaisonsConstruites == 0;
    }

    @Override
    public void construireMaison(int nbMaison, Joueur joueur) {
        this.nbMaisonsConstruites += nbMaison;
    }

    @Override
    public void devenirConstructible() {

    }

    @Override
    public int coutTaxe() {
        return 0;
    }
}
