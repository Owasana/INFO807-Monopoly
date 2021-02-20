package com.usmb.monopoly.model;

public class EtatConstructible extends EtatPossedée {
    public int nbMaisonsConstruites;
    private final static int NB_MAX_MAISON = 5;

    public EtatConstructible(CaseAchetable _case, Joueur joueur) {
        super(_case, joueur);
    }

    public boolean estComplet() {
        return nbMaisonsConstruites == NB_MAX_MAISON;
    }

    public boolean estVide() {
        return nbMaisonsConstruites == 0;
    }

    @Override
    public void construireMaison(int nbMaison, Joueur joueur) {
        // Clampage
        nbMaison = Math.min(nbMaison, NB_MAX_MAISON - this.nbMaisonsConstruites);

        this.nbMaisonsConstruites += nbMaison;

        // Paiement
        Propriété prop = (Propriété)this._case;
        joueur.débiter(nbMaison * prop.getCoutConstructionMaison());

        // Remplissage de la propriété
        if (estComplet()) {
            this._case.setEtat(new EtatComplet(this._case, this.proprietaire));
        }
    }

    @Override
    public void devenirConstructible() {

    }

    @Override
    public int coutTaxe(Joueur joueur) {
        if (estVide()) {
            return this._case.coutTerrainNu(joueur);
        }

        Propriété prop = (Propriété) this._case;
        return prop.coutLoyer(this.nbMaisonsConstruites);
    }
}
