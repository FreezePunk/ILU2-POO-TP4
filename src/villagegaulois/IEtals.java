package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtals {
    boolean isEtalOccupe();

    Gaulois getVendeur();

    int getQuantite();

    Produit getProduit();

    void occuperEtal(Gaulois vendeur, Produit produit, int quantite);

    boolean contientProduit(Produit produit);

    int acheterProduit(int quantiteAcheter);

    void libererEtal();

    String[] etatEtal();
}
