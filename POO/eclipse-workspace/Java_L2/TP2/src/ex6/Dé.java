package ex6;
import java.util.*;

public class Dé {
	private int valeur;
	private static Random r = new Random();
	
	public Dé() {
		this.valeur = 1;
	}
	
	public void lancer() {
		this.valeur = 1 + r.nextInt(6);
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public void somme(Dé d) {
		this.valeur = this.valeur + d.valeur;
	}

}
