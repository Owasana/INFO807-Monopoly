package com.usmb.monopoly;

public class Joueur {
    public String nom;

    public int solde;

    public Case _case;

    public Gobelet gobelet;

    public Patrimoine patrimoine;

    public void jouerTour() {
    }

    public int lancerDès() {
        return gobelet.tirer();
    }

    public void avancer() {
    }

    public void setCaseCourante(Case _case) {
    }

    public void acheter() {
    }

    public void débiter(int valeur) {
    }

    public void construireMaison(String numeroCase, int nombreMaison) {
    }

    public void finirTour() {
    }

    public void proposerAchat(Case _caseActuelle, int cout) {
    }

    public void facturer(Case _case) {
    }

    public void payerFacture() {
    }

    public void virement(Joueur beneficiaire, int montant) {
    }

    public void crediter(int montant) {
    }

}
