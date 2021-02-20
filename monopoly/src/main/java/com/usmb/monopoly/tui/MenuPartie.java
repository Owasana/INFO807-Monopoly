package com.usmb.monopoly.tui;

import com.usmb.monopoly.model.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class MenuPartie implements Observer {
    private Partie partie;
    private Scanner scanner = new Scanner(System.in).useDelimiter("\\n");;
    private ArrayList<JoueurEvent> events;

    public MenuPartie(Partie partie) {
        this.partie = partie;

        System.out.println("Partie démarrée");

        miseEnPlaceTest();

        partie.observerTourJoueur(this);
        partie.jouer();
    }

    public void miseEnPlaceTest() {

    }

    public void tourJoueur(Joueur joueur) {
        System.out.println("Tour de " + joueur.getNom());

        events = new ArrayList<>();
        System.out.print("Entrez la valeur du lancer : ");
        int lancer = scanner.nextInt();
        joueur.avancerTest(lancer);

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

        String choix;
        do {
            System.out.print("Entrez une opération : Construire (c), Passer (p) : ");
            choix = scanner.next();

            if (choix.startsWith("c")) {
                System.out.print("Entrez un nom de propriété : ");
                String nomProprieté = scanner.next().trim();
                System.out.println(nomProprieté);
                System.out.print("Entrez le nombre de maison à construire : ");
                int nbMaison = scanner.nextInt();
                this.partie.construireMaison(nomProprieté, nbMaison, joueur);
            }
        } while (!choix.startsWith("p"));
    }

    private void proposerAchat(Joueur joueur, JoueurEvent event) {
        PropositionAchatEvent propoosition = (PropositionAchatEvent)event;
        System.out.println("Proposition d'acchat de " + propoosition.nomCase + " à " + propoosition.cout);
        System.out.print("Voulez vous acheter ? o/n : ");
        if (scanner.next().startsWith("o")) {
            joueur.acheter();
        }
    }

    private void payerFacture(Joueur joueur, JoueurEvent event) {
        System.out.println("Facture à payer");

        FactureEvent factureEvent = (FactureEvent) event;
        joueur.payerFacture();
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
            case DEBIT:
            {
                debit(event, joueur);
                break;
            }
            case CREDIT:
            {
                credit(event, joueur);
                break;
            }
        }
    }

    private void credit(JoueurEvent event, Joueur joueur) {
        CréditEvent créditEvent = (CréditEvent)event;
        System.out.println(joueur.getNom() + " est crédité de " + créditEvent.montant + ", solde final de " + créditEvent.solde);
    }

    private void debit(JoueurEvent event, Joueur joueur) {
        DébitEvent débitEvent = (DébitEvent)event;
        System.out.println(joueur.getNom() + " est débité de " + débitEvent.montant + ", solde final de " + débitEvent.solde);
    }

    private void lancerDès(JoueurEvent event) {
        DèsEvent dèsEvent = (DèsEvent) event;
        System.out.println("Lancer de dès : " + dèsEvent.lancer);
    }
}
