package com.usmb.monopoly.model;

import java.util.Observable;

public class Joueur extends Observable {

    public String nom;

    public int solde;

    public Case _case;

    public Gobelet gobelet;

    public Partie partie;

    public Patrimoine patrimoine = new Patrimoine();

    public Joueur(String nom, Gobelet gobelet, Partie partie) {
        this.nom = nom;
        this.gobelet = gobelet;
        this.partie = partie;
        this.solde = 1000000;
    }

    public void envoieEvenement(JoueurEvent event) {
        setChanged();
        notifyObservers(event);
    }

    public void jouerTour() {
        envoieEvenement(new JoueurEvent(JoueurEvent.EventType.JOUEUR_TOUR));
    }

    public int lancerDès() {
        int lancer = this.gobelet.tirer();
        envoieEvenement(new DèsEvent(lancer));
        return lancer;
    }

    public void avancer() {
        int lancer = this.lancerDès();
        _case.avancer(lancer, this);
    }

    public void avancerTest(int lancer) {
        _case.avancer(lancer, this);
    }

    public void setCaseCourante(Case _case) {
        this._case = _case;

        envoieEvenement(new CaseCouranteEvent(this._case.getNom()));
    }

    public void acheter() {
        this._case.acheter(this, patrimoine);
    }

    public void débiter(int valeur) {
        this.solde -= valeur;
        envoieEvenement(new DébitEvent(valeur, this.solde));
    }

    public void construireMaison(String numeroCase, int nombreMaison) {
        this.partie.construireMaison(numeroCase, nombreMaison, this);
    }

    public void proposerAchat(int cout) {
        if (cout < this.solde) {
            envoieEvenement(new PropositionAchatEvent(this._case.getNom(), cout));
        }
    }

    public void facturer(Case _case) {
        envoieEvenement(new FactureEvent(_case));
    }

    public void payerFacture() {
        this._case.payerTaxe(this);
    }

    public void virement(Joueur beneficiaire, int montant) {
        this.débiter(montant);
        beneficiaire.créditer(montant);
    }

    public void créditer(int montant) {
        this.solde += montant;
        envoieEvenement(new CréditEvent(montant, this.solde));
    }

    public String getNom() {
        return this.nom;
    }
}
