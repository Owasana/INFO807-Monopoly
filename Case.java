
public abstract class Case {
    public int numero;

    public Couleurs couleur;

    public Case case;

    public Case avancer(int nbCases, Joueur joueur) {
    }

    public boolean estAchetable(int solde) {
    }

    public int acheter(Joueur joueur) {
    }

    public Couleurs getCouleur() {
    }

    public void arriverSur(Joueur joueur) {
    }

    public void passerSur(Joueur joueur) {
    }

    public void construireMaison(String nbMaisons, Joueur joueur) {
    }

    public void payerTaxe(Joueur joueur) {
    }

    public Case getCase(String nomCase) {
    }

}
