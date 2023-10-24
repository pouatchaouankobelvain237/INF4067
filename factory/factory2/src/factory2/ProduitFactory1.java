package factory2;

// fabrique concrète 1----------------
public class ProduitFactory1 extends ProduitFactory {
	
	protected ProduitA createProduitA() {
		return new ProduitA1();
	}

}
