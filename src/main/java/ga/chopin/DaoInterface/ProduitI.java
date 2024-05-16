package ga.chopin.DaoInterface;

import ga.chopin.Dao.Produit;

import java.util.List;

public interface ProduitI {

    //contient les fonctionnqlier metier qui sont en relation avec l'entie Produit


    public void saveProduit(Produit produit);
    public void updateProduit(Produit produit);
    public void deleteProduit(Produit produit);
    public Produit getProduitById(int id);
    public Produit getProduitByName(String name);
    public List<Produit> getAllProduits();


}
