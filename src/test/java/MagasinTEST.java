import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tn.enicarthage.Magasin;
import tn.enicarthage.Produit;

public class MagasinTEST {
    private Magasin magasin;
    private Produit p1;
    private Produit p2;

	    @Before
	    public void setUp() {
	        magasin = new Magasin();
	        p1 = new Produit();
	        p1.setCode("10");
	        p1.setLibelle("Clavier");
	        p1.setPrix(5);
	        p2 = new Produit();
	        p2.setCode("11");
	        p2.setLibelle("Souris");
	        p2.setPrix(20); 
	        magasin.ajouterProduit(p1);
	        magasin.ajouterProduit(p2);
	    }
	
	    @Test
	    public void testComparerSelonPrix() {
	        Produit plusCher = magasin.comparerSelonPrix(p1, p2);
	        assertEquals(p2, plusCher);
	    }
	    
	    @Test
	    public void testCalculerPrixDeuxProduits() {
	        double total = magasin.calculerPrixDeuxProduits(p1, p2);
	        assertEquals(25.0, total, 0.001);
	    }
	    
	    @Test
	    public void testSupprimerProduit() {
	        magasin.supprimerProduit(p1);
	        assertFalse(magasin.getProduits().contains(p1));
	    }
	    
	    @After
	    public void tearDown() {
	        magasin = null;
	        p1 = null;
	        p2 = null;
	    }
	    
}
