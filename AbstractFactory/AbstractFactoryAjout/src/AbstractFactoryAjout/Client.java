package AbstractFactoryAjout;


public class Client {

	public static void main(String[] args) {
	
		IproduitFactory produitFactory1=new ProduitFactory1();
		IproduitFactory produitFactory2=new ProduitFactory2();
		
		ProduitA produitA = null;
		ProduitB produitB = null;
		ProduitC produitC = null;
		
		System.out.println("utilisation de la premiere fabrique ");
		produitA = produitFactory1.getProduitA();
		produitB = produitFactory1.getProduitB();
		produitC = produitFactory1.getProduitC();
		produitA.methodeA();
		produitB.methodeB();
		produitC.methodeC();
		
		System.out.println("utilisation de la seconde fabrique ");
		produitA = produitFactory2.getProduitA();
		produitB = produitFactory2.getProduitB();
		produitC = produitFactory2.getProduitC();
		produitA.methodeA();
		produitB.methodeB();
		produitC.methodeC();

	}

}
