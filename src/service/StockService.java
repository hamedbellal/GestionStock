package service;

import model.Produit;
import java.util.List;

public interface StockService {
    void ajouterProduit(Produit produit);
    List<Produit> listerProduits();
    void modifierProduit(int id, Produit produit);
    void supprimerProduit(int id);
}
