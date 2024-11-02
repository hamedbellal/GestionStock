package repository;

import model.Produit;
import java.util.List;

public interface ProduitRepository {
    void ajouterProduit(Produit produit);
    List<Produit> getAllProduits();
    void modifierProduit(int id, Produit produit);
    void supprimerProduit(int id);
}
