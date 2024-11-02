package model;

public class Produit {
    private int id;
    private String nom;
    private String description;
    private int quantite;
    private double prix;

    // Constructeur par défaut
    public Produit() {}

    // Constructeur avec paramètres
    public Produit(String nom, String description, int quantite, double prix) {
        this.nom = nom;
        this.description = description;
        this.quantite = quantite;
        this.prix = prix;
    }

    // Getters et setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}
