package ex2;

public class Roue {
	private double diametre;
	private double largeur;
	private double prix;
	
	
	public Roue(double diametre,double largeur,double prix) {
		this.diametre = diametre;
		this.largeur = largeur;
		this.prix = prix;
	}
	
	public double getDiametre() {
		return diametre;
	}
	public double getLargeur() {
		return largeur;
	}
	public double getPrix() {
		return prix;
	}
	
	public String toString() {
		return this.diametre+"x"+this.largeur;
	}
}
