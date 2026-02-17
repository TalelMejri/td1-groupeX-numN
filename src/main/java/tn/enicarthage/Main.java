package tn.enicarthage;

public class Main {

    public static void main(String[] args) {
        Produit p1 = new Produit();
        p1.setCode("10");
        p1.setLibelle("Clavier");
        p1.setPrix(5);
        Produit p2 = new Produit();
        p2.setCode("11");
        p2.setLibelle("Souris");
        p2.setPrix(20); 
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        System.out.println("Produits");
        System.out.println(magasin.getProduits());
        Produit plusCher = magasin.comparerSelonPrix(p1, p2);
        System.out.println(" Cher" + plusCher);
        double total = magasin.calculerPrixDeuxProduits(p1, p2);
        System.out.println(" All :" + total);
        magasin.supprimerProduit(p1);
        System.out.println("Apres suppression :");
        System.out.println(magasin.getProduits());
    }
}
