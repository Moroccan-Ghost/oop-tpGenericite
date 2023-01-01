package Model;

public class Produit {
    private int id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nbrStock;

    public Produit(int id, String nom, String marque, double prix, String description, int nbrStock) {
        this.setId(id);
        this.setNom(nom);
        this.setMarque(marque);
        this.setPrix(prix);
        this.setDescription(description);
        this.setNbrStock(nbrStock);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbrStock() {
        return nbrStock;
    }

    public void setNbrStock(int nbrStock) {
        this.nbrStock = nbrStock;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + this.getId() + ", nom='" + this.getNom() + '\'' + ", marque='" + this.getMarque() + '\'' + ", prix=" + this.getPrix() + ", description='" + this.getDescription() + '\'' + ", nbrStock=" + this.getNbrStock() + '}';
    }
}
