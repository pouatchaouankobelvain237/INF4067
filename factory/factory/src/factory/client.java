package factory;

public class client {

	public static void main(String[] args) {
		produitFactory ProduitFactory = new produitFactory();
		
		produitA ProduitA = null;
		
		
		ProduitA = ProduitFactory.getproduitA(produitFactory.TYPE_PRODUITA1);
		ProduitA.methodeA();
		
		ProduitA = ProduitFactory.getproduitA(produitFactory.TYPE_PRODUITA2);
		ProduitA.methodeA();
		
		ProduitA = ProduitFactory.getproduitA(produitFactory.TYPE_PRODUITA3);
		ProduitA.methodeA();
		
		ProduitA = ProduitFactory.getproduitA(4);
		ProduitA.methodeA();

	}

}
