package com.usmb.monopoly.model;

public class Taxes extends Case {
    public int coût;

    public Taxes(String nom, int coût) {
        super(nom);
        this.coût = coût;
    }

    @Override
    public void arriverSur(Joueur joueur) {
        super.arriverSur(joueur);
        joueur.facturer(this);
    }

    @Override
    public void payerTaxe(Joueur joueur) {
        super.payerTaxe(joueur);
        joueur.débiter(this.coût);
    }
}
