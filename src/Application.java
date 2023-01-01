import Model.Produit;

public class Application {
    public static void main(String[] args) {
        Produit p1 = new Produit(1,"cafe","asta",15.2,"asta cafe description",5);
        System.out.println(p1.toString());
    }
}