package com.usmb.monopoly.model;
import java.util.ArrayList;
import java.util.List;

public class Quartier {
    public Couleurs couleur;

    public List<Propriété> propriétés = new ArrayList<Propriété> ();

    public void ajouterPropriete(Propriété properiete) {
    }

    public Propriété getPropriete(int numeroCase) {
        return propriétés.get(numeroCase);
    }

    public boolean estConstructible() {
        return false;
    }

    public void devenirConstructible() {
    }

}
