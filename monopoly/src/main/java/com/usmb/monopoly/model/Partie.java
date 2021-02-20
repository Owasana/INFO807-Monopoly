package com.usmb.monopoly.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Partie {
    public List<Joueur> joueurs = new ArrayList<Joueur> ();

    public Plateau plateau;

    public Gobelet gobelet;

    public Partie() {
        this.plateau = new Plateau();
        this.gobelet = new Gobelet();
    }

    public void ajouterJoueur(String nom) {
        Joueur joueur = new Joueur(nom, gobelet, this);
        plateau.placerJoueurSurDepart(joueur);
        this.joueurs.add(joueur);
    }

    public void construireMaison(String numeroCase, int nombreMaison, Joueur joueur) {
        this.plateau.construireMaison(numeroCase, nombreMaison, joueur);
    }

    public void jouer() {
        int idxJoueurCourant = 0;

        while (true) { // TODO
            Joueur joueurCourrant = joueurs.get(idxJoueurCourant);
            joueurCourrant.jouerTour();
            if (!gobelet.getEstDernierLancerDouble()) {
                idxJoueurCourant = (idxJoueurCourant + 1) % joueurs.size();
            }
        }
    }

    public void observerTourJoueur(Observer obs) {
        for (Joueur joueur : joueurs) {
            joueur.addObserver(obs);
        }
    }
}
