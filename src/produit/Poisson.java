package produit;

public class Poisson extends Produit {
    private String dateDePeche;

    public Poisson(String dateDePeche) {
        super("Poisson");
        this.dateDePeche = dateDePeche;
    }

    @Override
    public String decrire() {
        return "Poisson pêché " + dateDePeche + ".";
    }
}