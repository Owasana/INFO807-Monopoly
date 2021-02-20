package com.usmb.monopoly.model;

public class Case {
    public int numero;

    public Case suivant;

    public String nom;

    public Case(String nom) {
        this.nom = nom;
    }

    public void setSuivant(Case suivant) {
        this.suivant = suivant;
    }

    public void avancer(int nbCases, Joueur joueur) {
        if (nbCases > 1) {
            this.suivant.passerSur(joueur);
            this.suivant.avancer(nbCases - 1, joueur);
        }
        else if (nbCases > 0) {
            this.suivant.avancer(nbCases - 1, joueur);
        }
        else if (nbCases == 0) {
            this.arriverSur(joueur);
        }
    }

    public void acheter(Joueur joueur, Patrimoine patrimoine) {

    }

    public String getNom() { return nom; }

    public void arriverSur(Joueur joueur) {
        joueur.setCaseCourante(this);
    }

    public void passerSur(Joueur joueur) {

    }

    public void construireMaison(int nbMaisons, Joueur joueur) {
    }

    public void payerTaxe(Joueur joueur) {
    }
}
