package com.usmb.monopoly.model;

public abstract class EtatPossedée extends EtatCase {
    public Joueur proprietaire;

    public EtatPossedée(CaseAchetable _case, Joueur joueur) {
        super(_case);
        this.proprietaire = joueur;
    }

    public boolean estProprietaire(Joueur joueur) {
        return this.proprietaire == joueur;
    }

    @Override
    public void acheter(Joueur proprietaire, Patrimoine patrimoine) {

    }

    @Override
    public void arriverSur(Joueur joueur) {
        if (!estProprietaire(joueur)) {
            joueur.facturer(this._case);
        }
    }

    @Override
    public void payerTaxe(Joueur joueur) {
        int cout = coutTaxe(joueur);
        joueur.virement(this.proprietaire, cout);
    }
}
