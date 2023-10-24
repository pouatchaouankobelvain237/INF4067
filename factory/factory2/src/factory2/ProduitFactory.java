package factory2;

// fabrique abstraite---------------------------

public abstract class ProduitFactory {
	
	public ProduitA getProduitA() {
		return createProduitA();
	}
	protected abstract ProduitA createProduitA();

}
 

