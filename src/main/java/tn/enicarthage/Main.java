package tn.enicarthage;

public class Main {

    public static void main(String[] args) {

        Produit p1 = new Produit();
        p1.setCode("P01");
        p1.setLibelle("Laptop");
        p1.setPrix(2500);

        Produit p2 = new Produit();
        p2.setCode("P02");
        p2.setLibelle("Souris");
        p2.setPrix(80);

        Magasin magasin = new Magasin();

        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);

        System.out.println(" Produits du magasin :");
        System.out.println(magasin.getProduits());

        Produit plusCher = magasin.comparerSelonPrix(p1, p2);
        System.out.println(" Produit le plus cher : " + plusCher);

        double total = magasin.calculerPrixDeuxProduits(p1, p2);
        System.out.println(" Prix total des deux produits : " + total + " DT");
        
        magasin.supprimerProduit(p2);
        System.out.println("Apres suppression :");
        System.out.println(magasin.getProduits());
    }
}
