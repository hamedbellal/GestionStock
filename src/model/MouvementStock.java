package model;

import java.sql.Timestamp;

public class MouvementStock {
    private int id;
    private int produitId;
    private String type; // "entrée" ou "sortie"
    private int quantite;
    private Timestamp date;

    // Constructeurs, getters et setters
}
