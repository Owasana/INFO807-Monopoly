package com.usmb.monopoly.model;

public abstract class CaseAchetable extends Case {
    public EtatCase etat;

    public CaseAchetable(String nom, Couleurs couleur, Case suivant) {
        super(nom, couleur, suivant);
        this.etat = new EtatLibre(this);
    }

    public void arriverSur(Joueur joueur) {
        super.arriverSur(joueur);
        this.etat.arriverSur(joueur);
    }

    public int coutAchat() {
        return 0;
    }

    public void setEtat(EtatCase etat) {
        this.etat = etat;
    }

    public int coutTerrainNu() {
        return 0;
    }

    public void coutTaxe() {
    }

}
