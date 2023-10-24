package Singleton;

public final class Singleton {
	
	private static Singleton instance = null;
	//d'autres attributs, classiques et non "static"
	private String attrib1;
	private int attrib2;
	//constructeur de l'objet
	private Singleton() {
		super();
	}
	
	// Methode renvoyant une instance de la classe Singleton
	public static Singleton getIntance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
		
	}
	// D'autres méthodes classiques et non "static"
	public void op1(int x, int y, int z) {
		this.attrib1 ="bonjour";
	}
	public void op2(int x, int y, int z) {
		
	}

}

