package com.usmb.monopoly.view;
import com.usmb.monopoly.model.Jeu;
import com.usmb.monopoly.model.Partie;

import java.awt.*;

public class Window extends Frame {
    private Jeu jeu;
    private CréationPartieView creationPartie;
    private PartieView partie;

    public Window(Jeu jeu) {
        super();
        setVisible(true);

        this.jeu = jeu;
        this.creationPartie = new CréationPartieView(this);
        add(this.creationPartie);
        this.creationPartie.setVisible(false);

        setTitle(" Titre de la Fenetre ");
        setSize(800, 800);

        création();
    }

    public void création()
    {
        this.creationPartie.setVisible(true);
    }

    public void demarrer(String nom1, String nom2, String nom3) {
        Partie partie = this.jeu.creerPartie(nom1);

        partie.ajouterJoueur(nom2);
        if (!nom3.isEmpty()) {
            partie.ajouterJoueur(nom3);
        }

        System.out.println("Partie créee");

        this.creationPartie.setVisible(false);
        this.partie = new PartieView(partie);
        add(this.partie);
        this.partie.setVisible(true);
        revalidate();
        repaint();
    }
}
