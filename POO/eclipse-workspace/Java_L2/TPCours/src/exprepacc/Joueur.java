package exprepacc;

public class Joueur {
	private String nom;
	private int points;
	
	
	public Joueur() {
		this.points = 0;
		this.nom = Clavier.lireString("Entrez votre nom : ");
	}
	
	public void gagnerPoint() {
		this.points += 1;
	}
	
	public int getPoints() {
		return points;
	}
	public String getNom(){
		return this.nom;
	}
	
	public void perdrePoint() {
		if (this.points != 0) {
			this.points -= 1;
		}
	}

}
