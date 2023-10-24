package FactoryDuCours;


public class ProduitFactory {
	
	public static final int TYPE_PRODUITA1 =1;
	public static final int TYPE_PRODUITA2 =2;
	
	public Produit getProduit(int typeProduit) {
		Produit Produit = null;
		
		switch (typeProduit) {
		case TYPE_PRODUITA1:
			Produit = new ProduitA1();
			break;	
		case TYPE_PRODUITA2:
			Produit = new ProduitA2();
			break;
			
		default:
			throw new IllegalArgumentException("Type de produit inconnu");
		}
		
		return Produit;
	}

}
