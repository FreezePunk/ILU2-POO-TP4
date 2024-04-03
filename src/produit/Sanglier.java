package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
    private double poids;
    private Gaulois chasseur;

    public Sanglier(double poids, Gaulois chasseur) {
        super("Sanglier");
        this.poids = poids;
        this.chasseur = chasseur;
    }

    @Override
    public String decrire() {
        return "Sanglier de " + poids + " kg chassé par " + chasseur.getNom() + ".";
    }
}