package Builder;

public class Client {
	private String nom;
	private Directeur directeur;
	
	public Client(String nom, Directeur directeur) {
	    this.nom = nom;
	    this.directeur = directeur;
	  }
	
	 public Pizza commanderPizza() {
		    return directeur.creerPizza();
		  }


	public static void main(String[] args) {
		
		Directeur dir = new Directeur("Alice");
	    Client cli = new Client("Bob", dir);
	    
	    dir.choisirMonteurPizza(new MonteurPizzaPiquante());
	    dir.choisirMonteurPizza(new MonteurPizzaReine());
	    
	    
	    Pizza pizza = cli.commanderPizza();
	    
	    System.out.println("Le client " + cli.nom + " a commandé une pizza " + pizza);
		 
	}

}
