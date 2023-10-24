package factory2;

public class ProduitFactory2 extends ProduitFactory {
	
	protected ProduitA createProduitA() {
		return new ProduitsA2();
	}

}
