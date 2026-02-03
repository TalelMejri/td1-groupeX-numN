package tn.enicarthage;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Produit {
   private String code;
   private String libelle;
   private float prix;
   
}
