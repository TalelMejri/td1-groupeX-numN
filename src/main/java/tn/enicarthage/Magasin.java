package tn.enicarthage;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Magasin {
	private static final Logger LG = Logger.getLogger(Magasin.class);
	private ArrayList<Produit> produits;
    
    public Magasin() {
        produits = new ArrayList<Produit>();
    }
    
    public Produit comparerSelonPrix(Produit p1, Produit p2) {
    	LG.info("Enter comparerSelonPrix");
        if (p1.getPrix() >= p2.getPrix()) {
            return p1;
        } else {
            return p2;
        }
    }
    
    public void ajouterProduit(Produit p) {
    	LG.info("Enter Ajouter Produit");
        produits.add(p);
    }

    public void supprimerProduit(Produit p) {
        produits.remove(p);
    }
    
    public double calculerPrixDeuxProduits(Produit p1, Produit p2) {
        double test= p1.getPrix() + p2.getPrix();
    	LG.debug("Prix totoal = "+test);
    	return test;
    }
}
