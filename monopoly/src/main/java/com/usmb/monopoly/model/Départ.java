package com.usmb.monopoly.model;

public class Départ extends Case {
    public int prime;

    public Départ(String nom, int prime) {
        super(nom);
        this.prime = prime;
    }

    @Override
    public void passerSur(Joueur joueur) {
        super.passerSur(joueur);
        joueur.créditer(prime);
    }
}
