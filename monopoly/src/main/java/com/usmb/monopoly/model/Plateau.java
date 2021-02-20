package com.usmb.monopoly.model;
import java.util.ArrayList;
import java.util.List;

public class Plateau {
    public List<Case> cases = new ArrayList<Case> ();

    public Départ départ;

    public Plateau() {
        this.départ = new Départ("Départ", Couleurs.Bleu, null);
        this.cases.add(this.départ);

        for (int i = 0; i < 39; ++i) {
            this.cases.add(new Case("Case" + i, Couleurs.Bleu, null));
        }
    }

    public void construireMaison(String numeroCase, int nombreMaison, Joueur joueur) {
    }

    public Case getCase(String numeroCase) {
        return cases.get(0); // TODO
    }

    public void placerJoueurSurDepart(Joueur joueur) {
        joueur.setCaseCourante(this.départ);
    }

    public Case getCase(int i) {
        return cases.get(i);
    }
}
