import Model.Produit;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl mt = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != -1) {
            System.out.println("/******************************************************************************************************/");
            System.out.println("""
                    1. Afficher la liste des produits.
                    2. Rechercher un produit par son id.
                    3. Ajouter un nouveau produit dans la liste.
                    4. Supprimer un produit par id.
                    5. Quitter ce programme.""");
            System.out.println("Donnez votre choix : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> { /* Show products List*/
                    if (mt.getAll().size() == 0) {
                        System.out.println("No Product In the List !");
                    } else {
                        for (Produit product : mt.getAll()) {
                            System.out.println(product.toString());
                        }
                    }
                }
                case 2 -> { /*Find Produtc by id*/
                    System.out.println("Donnez l'ID a rechercher :");
                    long idToFind = sc.nextLong();
                    Produit productToFind = mt.findById(idToFind);
                    if (productToFind != null) {
                        System.out.println(productToFind.toString());
                    } else {
                        System.out.println("No Product Found with the id " + idToFind);
                    }
                }
                case 3 -> {
                    Produit productToAdd = getProductInfo(sc);
                    mt.add(productToAdd);
                }
                case 4 -> {  /*Delete product*/
                    System.out.println("Donnez l'ID a supprimer :");
                    long idToDelete = sc.nextLong();
                    mt.delete(idToDelete);
                }
                case 5 -> {
                    System.out.println("Good Bye xD");
                    return;
                }
                default -> System.out.println("Not a choice :)");
            }
        }
    }

    public static Produit getProductInfo(Scanner sc) {
        System.out.println("Donnez id :");
        long id = sc.nextLong();
        System.out.println("Donnez le nom");
        String nom = sc.next();
        System.out.println("Donnez la marque ");
        String marque = sc.nextLine();
        System.out.println("Donnez le prix");
        double prix = sc.nextDouble();
        System.out.println("Donnez la description");
        String description = sc.nextLine();
        System.out.println("Donnez la quantite en stock");
        int nbrInStock = sc.nextInt();

        return new Produit(id, nom, marque, prix, description, nbrInStock);
    }
}