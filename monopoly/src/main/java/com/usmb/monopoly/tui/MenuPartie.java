package com.usmb.monopoly.tui;

import com.usmb.monopoly.model.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class MenuPartie implements Observer {
    private Partie partie;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<JoueurEvent> events;

    public MenuPartie(Partie partie) {
        System.out.println("Partie démarrée");

        partie.observerTourJoueur(this);
        //partie.jouer();
    }

    public void tourJoueur(Joueur joueur) {
        System.out.println("Tour de " + joueur.getNom());

        events = new ArrayList<>();
        joueur.avancer();

        for (JoueurEvent event : events) {
            switch (event.type) {
                case FACTURE:
                {
                    payerFacture(joueur, event);
                    break;
                }
                case PROPOSITION_ACHAT:
                {
                    proposerAchat(joueur, event);
                    break;
                }
            }
        }
    }

    private void proposerAchat(Joueur joueur, JoueurEvent event) {
        PropositionAchatEvent propoosition = (PropositionAchatEvent)event;
        System.out.println("Proposition d'acchat de " + propoosition.nomCase + " à " + propoosition.cout);
    }

    private void payerFacture(Joueur joueur, JoueurEvent event) {

    }

    public void caseCourante(JoueurEvent event) {
        CaseCouranteEvent caseEvent = (CaseCouranteEvent)event;
        System.out.println("Arrivé sur nouvelle case : " + caseEvent.nomCase);
    }

    @Override
    public void update(Observable observable, Object o) {
        Joueur joueur = (Joueur)observable;

        JoueurEvent event = (JoueurEvent) o;

        switch (event.type) {
            case CASE_COURANTE_MODIFIE:
            {
                caseCourante(event);
                break;
            }
            case JOUEUR_TOUR:
            {
                tourJoueur(joueur);
                break;
            }
            case FACTURE:
            case PROPOSITION_ACHAT:
            {
                events.add(event);
                break;
            }
            case LANCER_DÈS:
            {
                lancerDès(event);
                break;
            }
        }
    }

    private void lancerDès(JoueurEvent event) {
        DèsEvent dèsEvent = (DèsEvent) event;
        System.out.println("Lancer de dès : " + dèsEvent.lancer);
    }
}
