package com.usmb.monopoly.model;

public class Case {
    public int numero;

    public Couleurs couleur;

    public Case suivant;

    public String nom;

    public Case(String nom, Couleurs couleur, Case suivant) {
        this.nom = nom;
        this.couleur = couleur;
        this.suivant = suivant;
    }

    public Case avancer(int nbCases, Joueur joueur) {
        return suivant;
    }

    public int acheter(Joueur joueur) {
        return 0;
    }

    public Couleurs getCouleur() {
        return couleur;
    }

    public String getNom() { return nom; }

    public void arriverSur(Joueur joueur) {
        joueur.setCaseCourante(this);
    }

    public void passerSur(Joueur joueur) {

    }

    public void construireMaison(String nbMaisons, Joueur joueur) {
    }

    public void payerTaxe(Joueur joueur) {
    }
}
