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

    public Case avancer(int nbCases, Joueur joueur) {
        return suivant;
    }

    public int acheter(Joueur joueur) {
        return 0;
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
