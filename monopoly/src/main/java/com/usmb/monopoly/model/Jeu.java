package com.usmb.monopoly.model;
import java.util.ArrayList;
import java.util.List;

public class Jeu {
    public List<Partie> parties = new ArrayList<Partie> ();

    public Partie creerPartie(String createur) {
        Partie partie = new Partie();
        partie.ajouterJoueur(createur);
        parties.add(partie);
        return partie;
    }
}
