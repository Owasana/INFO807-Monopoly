package com.usmb.monopoly.tui;

import com.usmb.monopoly.model.Jeu;
import com.usmb.monopoly.model.Partie;

import java.util.Scanner;

public class MenuCréation {
    private Jeu jeu;
    private Scanner scanner = new Scanner(System.in);

    public MenuCréation(Jeu jeu) {
        this.jeu = jeu;

        Partie partie = testPartie();

        MenuPartie menuPartie = new MenuPartie(partie);
    }

    public Partie créerPartie()
    {
        System.out.println("Entrer les noms, -1 pour terminer");
        String nomCreateur = scanner.next();
        Partie partie = this.jeu.creerPartie(nomCreateur);

        String nomJoueur = scanner.next();
        while (!nomJoueur.startsWith("-1")) {
            partie.ajouterJoueur(nomJoueur);
            nomJoueur = scanner.next();
        }

        return partie;
    }

    public Partie testPartie()
    {
        Partie partie = this.jeu.creerPartie("Paul");
        partie.ajouterJoueur("Luc");
        //partie.ajouterJoueur("Theo");

        return partie;
    }
}
