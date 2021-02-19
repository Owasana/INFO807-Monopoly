package com.usmb.monopoly;

public abstract class CaseAchetable extends Case {
    public EtatCase etat;

    public int coutAchat() {
        return 0;
    }

    public void setEtat(EtatCase etat) {
    }

    public int coutTerrainNu() {
        return 0;
    }

    public void coutTaxe() {
    }

}
