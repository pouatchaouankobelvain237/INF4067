package Builder;

public class Directeur {
	
	private String nom;
	private MonteurPizza monteurPizza;
	
	
	public Directeur(String nom) {
	    this.nom = nom;
	}
	
	public void choisirMonteurPizza(MonteurPizza mp) {
	    monteurPizza = mp;
	  }
	
	public Pizza creerPizza() {
	    monteurPizza.creeNouvellePizza();
	    monteurPizza.monterPate();
	    monteurPizza.monterSauce();
	    monteurPizza.monterGarniture();
	    return monteurPizza.getPizza();
	  }
	


}
