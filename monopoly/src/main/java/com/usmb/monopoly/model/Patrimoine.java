package com.usmb.monopoly.model;
import java.util.HashMap;
import java.util.ArrayList;

public class Patrimoine {
    public HashMap<Couleurs, Quartier> quartiers = new HashMap<Couleurs, Quartier> ();
    public ArrayList<Service> services = new ArrayList<Service>();
    public ArrayList<Gare> gares = new ArrayList<Gare>();

    public Patrimoine() {
        quartiers.put(Couleurs.Bleu, new Quartier(2));
        quartiers.put(Couleurs.Cyan, new Quartier(3));
        quartiers.put(Couleurs.Rouge, new Quartier(3));
        quartiers.put(Couleurs.Rose, new Quartier(3));
        quartiers.put(Couleurs.Orange, new Quartier(3));
        quartiers.put(Couleurs.Violet, new Quartier(2));
        quartiers.put(Couleurs.Vert, new Quartier(3));
        quartiers.put(Couleurs.Jaune, new Quartier(3));
    }

    public void ajouterService(Service _case) {
        _case.setPatrimoine(this);
        services.add(_case);
    }

    public void ajouterGare(Gare _case) {
        _case.setPatrimoine(this);
        gares.add(_case);
    }

    public void ajouterPropriete(Propriété _case, Couleurs couleur) {
        Quartier quartier = this.getQuartierParCouleur(couleur);
        quartier.ajouterPropriete(_case);
    }

    public Quartier getQuartierParCouleur(Couleurs couleur) {
        return quartiers.get(couleur);
    }

    public int nombreService() {
        return services.size();
    }

    public int nombreGare() {
        return gares.size();
    }

}
