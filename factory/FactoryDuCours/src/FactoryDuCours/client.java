package FactoryDuCours;


public class client {

	public static void main(String[] args) {
ProduitFactory ProduitFactory = new ProduitFactory();
		
		Produit Produit = null;
		

		Produit = ProduitFactory.getProduit(ProduitFactory.TYPE_PRODUITA1);
		Produit.methode();
		
		Produit = ProduitFactory.getProduit(ProduitFactory.TYPE_PRODUITA2);
		Produit.methode();
		
		Produit = ProduitFactory.getProduit(3);
		Produit.methode();

	}

}
