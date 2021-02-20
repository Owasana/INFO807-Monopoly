package com.usmb.monopoly.model;

public abstract class EtatPossedée extends EtatCase {
    public Joueur proprietaire;

    public EtatPossedée(CaseAchetable _case, Joueur joueur) {
        super(_case);
    }

    public boolean estProprietaire(Joueur joueur) {
        return this.proprietaire == joueur;
    }

    @Override
    public void acheter(Joueur proprietaire) {

    }

    @Override
    public void arriverSur(Joueur joueur) {

    }
}
