package com.usmb.monopoly.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Plateau {
    public List<Case> cases = new ArrayList<Case> ();
    public HashMap<String, Case> nomACase = new HashMap<String, Case>();

    public Départ départ;

    public Plateau() {
        this.départ = new Départ("Départ", 200);
        this.cases.add(this.départ);
        this.nomACase.put(this.départ.getNom(), this.départ);

        Path fileName = Path.of("case-donnée.json");
        String content = null;
        try {
            content = Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONArray root = new JSONArray(content);
        for (int i = 0; i < root.length(); i++) {
            JSONObject jsonCase = root.getJSONObject(i);
            ajouterCase(jsonCase);
        }

        for (int i = 0, prev = this.cases.size() - 1; i < this.cases.size(); prev = i, i++) {
            this.cases.get(prev).setSuivant(this.cases.get(i));
            //System.out.println(this.cases.get(prev).getNom() + " -> " + this.cases.get(i).getNom());
        }
    }

    private void ajouterCase(JSONObject jsonCase) {
        //System.out.println(jsonCase);
        Case _case;
        switch (jsonCase.getString("type")) {
            case "propriete":
            {
                String nom = jsonCase.getString("nom");
                String couleurStr = jsonCase.getString("groupe");
                Couleurs couleur = Couleurs.valueOf(couleurStr);
                int prix = jsonCase.getInt("prix");
                JSONArray jsonLoyers = jsonCase.getJSONArray("loyers");

                int loyers[] = {jsonLoyers.getInt(0), jsonLoyers.getInt(1), jsonLoyers.getInt(2),
                        jsonLoyers.getInt(3), jsonLoyers.getInt(4), };
                int prixMaison = jsonCase.getInt("prixMaison");

                _case = new Propriété(nom, couleur, prix, loyers, prixMaison);
                break;
            }
            case "gare":
            {
                String nom = jsonCase.getString("nom");
                int loyer = jsonCase.getJSONArray("loyers").getInt(0);
                _case = new Gare(nom, jsonCase.getInt("prix"), loyer);
                break;
            }
            case "compagnie":
            {
                String nom = jsonCase.getString("nom");
                JSONArray jsonLoyers = jsonCase.getJSONArray("loyers");
                int loyers[] = {jsonLoyers.getInt(0), jsonLoyers.getInt(1)};
                _case = new Service(nom, jsonCase.getInt("prix"), loyers);
                break;
            }
            case "taxe":
            {
                String nom = jsonCase.getString("nom");
                _case = new Taxes(nom, jsonCase.getInt("prix"));
                break;
            }
            default:
            {
                _case = new Case("Case Vide");
            }
        }

        this.cases.add(_case);
        this.nomACase.put(_case.getNom(), _case);
    }

    public void construireMaison(String numeroCase, int nombreMaison, Joueur joueur) {
        Case _case = this.getCase(numeroCase);
        _case.construireMaison(nombreMaison, joueur);
    }

    public Case getCase(String numeroCase) {
        return this.nomACase.get(numeroCase);
    }

    public void placerJoueurSurDepart(Joueur joueur) {
        joueur.setCaseCourante(this.départ);
    }
}
