package Singleton2;

public final class Singleton {
	private static Singleton instance = null;
	
// D'autres attributs, classique et non static
	private int x;
	private int y;
	
// constructeur de l'objet 
	
private Singleton() {
	
// La présence d'un constructeur privé supprime le construsteur public par defaut.
	
	super();
}

// un autre constructeur.
private Singleton(int x, int y)
{
	this.x=x;
	this.y= y;
}

// methode renvoyant une instance de la classe Singleton

public static Singleton getInstance() {
	if (instance == null) {
		instance= new Singleton();
	}
	return instance;
}

// Methode renvoyant une instance de la classe Singleton

public static Singleton getInstance(int x, int y) {
	if (instance == null) {
		instance = new Singleton(x, y);
	}
	return instance;
}

public int somme(int x, int y) {
	return x+y;
}

public float moyenne(int x, int y) {
	return somme(x, y)/2;
}

public void affiche() {
	System.out.println("\nje suis une instance mes valeurs sont: x = " + this.x + "et  y =" + this.y);
}
	
// redefinir la methode clone pour empêcher son utilisation 

	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}


}
