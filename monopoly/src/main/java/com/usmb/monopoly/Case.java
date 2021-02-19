package com.usmb.monopoly;

public abstract class Case {
    public int numero;

    public Couleurs couleur;

    public Case suivant;

    public Case avancer(int nbCases, Joueur joueur) {
        return suivant;
    }

    public boolean estAchetable(int solde) {
        return true;
    }

    public int acheter(Joueur joueur) {
        return 0;
    }

    public Couleurs getCouleur() {
        return couleur;
    }

    public void arriverSur(Joueur joueur) {
    }

    public void passerSur(Joueur joueur) {
    }

    public void construireMaison(String nbMaisons, Joueur joueur) {
    }

    public void payerTaxe(Joueur joueur) {
    }
}
