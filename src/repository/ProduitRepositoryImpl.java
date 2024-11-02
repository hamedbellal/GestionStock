package repository;

import data.DatabaseConnection;
import model.Produit;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduitRepositoryImpl implements ProduitRepository {
    @Override
    public void ajouterProduit(Produit produit) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Produits (nom, description, quantite, prix) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produit.getNom());
            stmt.setString(2, produit.getDescription());
            stmt.setInt(3, produit.getQuantite());
            stmt.setDouble(4, produit.getPrix());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Produit> getAllProduits() {
        List<Produit> produits = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM Produits";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produit produit = new Produit();
                produit.setId(rs.getInt("id"));
                produit.setNom(rs.getString("nom"));
                produit.setDescription(rs.getString("description"));
                produit.setQuantite(rs.getInt("quantite"));
                produit.setPrix(rs.getDouble("prix"));
                produits.add(produit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produits;
    }

    // Ajoutez des méthodes `modifierProduit` et `supprimerProduit` ici pour compléter l'interface
}
