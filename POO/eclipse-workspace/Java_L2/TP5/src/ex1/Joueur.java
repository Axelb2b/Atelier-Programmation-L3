package ex1;

public class Joueur {
	private String nom;
	
	
	public Joueur() {
		this.nom = Clavier.lireString("Entrez votre nom:");
	}
	public String getNom() {
		return this.nom;
	}
	public int nouvelleProp(int numero) {
		return Clavier.lireInt("Entrez un nombre : ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		return "nom : "+this.nom;
	}
}
