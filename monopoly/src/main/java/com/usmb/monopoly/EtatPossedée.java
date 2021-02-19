package com.usmb.monopoly;

public abstract class EtatPossedée extends EtatCase {
    public Joueur proprietaire;

    public void init(Joueur proprietaire) {
    }

    public boolean estProprietaire(Joueur joueur) {
        return this.proprietaire == joueur;
    }

    @Override
    public boolean estAchetable() {
        return false;
    }

    @Override
    public void acheter(Joueur proprietaire) {

    }

    @Override
    public void arriverSur(Joueur joueur) {

    }
}
