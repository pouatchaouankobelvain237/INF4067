package factory;

public class produitFactory {
	
	public static final int TYPE_PRODUITA1 =1;
	public static final int TYPE_PRODUITA2 =2;
	public static final int TYPE_PRODUITA3 =3;
	
	public produitA getproduitA(int typeProduit) {
		produitA ProduitA = null;
		
		switch (typeProduit) {
		case TYPE_PRODUITA1:
			ProduitA = new produitA1();
			break;	
		case TYPE_PRODUITA2:
			ProduitA = new produitA2();
			break;
		case TYPE_PRODUITA3:
			ProduitA = new produitA3();
			break;
			
		default:
			throw new IllegalArgumentException("Type de produit inconnu");
		}
		
		return ProduitA;
	}

}
