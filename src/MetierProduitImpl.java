import Model.IMetier;
import Model.Produit;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    private ArrayList<Produit> productsList = new ArrayList<>();

    @Override
    public void add(Produit o) {
        this.productsList.add(o);
        System.out.println("Product Added !");
    }

    @Override
    public List<Produit> getAll() {
        return this.productsList;
    }

    @Override
    public Produit findById(long id) {
        for (Produit product : productsList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id) {
                productsList.remove(i);
                System.out.println("Product Deleted !");
                break;
            }
        }
        System.out.println("No Product was Deleted id not found : " + id);
    }
}
