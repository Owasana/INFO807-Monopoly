package com.usmb.monopoly.model;
import java.util.ArrayList;
import java.util.List;

public class Quartier {
    int nbProperties;

    public Quartier(int nbProperties) {
        this.nbProperties = nbProperties;
    }

    public List<Propriété> propriétés = new ArrayList<Propriété> ();

    public void ajouterPropriete(Propriété properiete) {
        propriétés.add(properiete);
        properiete.setQuartier(this);

        if (estConstructible()) {
            devenirConstructible();
        }
    }

    public boolean estConstructible() {
        return (propriétés.size() == nbProperties);
    }

    public void devenirConstructible() {
        for (Propriété prop : this.propriétés) {
            prop.devenirConstructible();
        }
    }

}
