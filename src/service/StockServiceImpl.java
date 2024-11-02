package service;

import model.Produit;
import repository.ProduitRepositoryImpl;
import java.util.List;

public class StockServiceImpl implements StockService {
    private final ProduitRepositoryImpl produitRepository = new ProduitRepositoryImpl();

    @Override
    public void ajouterProduit(Produit produit) {
        produitRepository.ajouterProduit(produit);
    }

    @Override
    public List<Produit> listerProduits() {
        return produitRepository.getAllProduits();
    }

    @Override
    public void modifierProduit(int id, Produit produit) {
        // Implémentation de la modification
    }

    @Override
    public void supprimerProduit(int id) {
        // Implémentation de la suppression
    }
}
