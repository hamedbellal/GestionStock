package controller;

import model.Produit;
import service.StockService;
import service.StockServiceImpl;
import java.util.List;

public class StockController {
    private final StockService stockService = new StockServiceImpl();

    public void ajouterProduit(Produit produit) {
        stockService.ajouterProduit(produit);
    }

    public List<Produit> listerProduits() {
        return stockService.listerProduits();
    }

    public void modifierProduit(int id, Produit produit) {
        stockService.modifierProduit(id, produit);
    }

    public void supprimerProduit(int id) {
        stockService.supprimerProduit(id);
    }
}
