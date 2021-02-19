package com.usmb.monopoly;
import java.util.HashMap;
import java.util.ArrayList;

public class Patrimoine {
    public HashMap<Couleurs, Quartier> quartiers = new HashMap<Couleurs, Quartier> ();
    public ArrayList<Service> services = new ArrayList<Service>();
    public ArrayList<Gare> gares = new ArrayList<Gare>();

    public void ajouterCase(Case _case) {
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
