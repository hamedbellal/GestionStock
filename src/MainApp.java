import controller.StockController;
import model.Produit;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StockController stockController = new StockController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Lister les produits");
            System.out.println("3. Modifier un produit");
            System.out.println("4. Supprimer un produit");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.println("Nom du produit : ");
                    String nom = scanner.nextLine();
                    System.out.println("Description : ");
                    String description = scanner.nextLine();
                    System.out.println("Quantité : ");
                    int quantite = scanner.nextInt();
                    System.out.println("Prix : ");
                    double prix = scanner.nextDouble();

                    Produit produit = new Produit(nom, description, quantite, prix);
                    stockController.ajouterProduit(produit);
                    break;
                case 2:
                    stockController.listerProduits().forEach(System.out::println);
                    break;
                case 3:
                    // Implémentation pour modifier un produit
                    break;
                case 4:
                    // Implémentation pour supprimer un produit
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
