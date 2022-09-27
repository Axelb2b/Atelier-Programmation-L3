package ex2;

public class Chien {
	private String nom;
	private String race;
	private static double nb = 0;
	private double nbAttribut;
	
	public Chien(String nom, String race) {
		this.nom = nom;
		this.race = race;
		this.nbAttribut = nb;
		nb ++;
	}
	
	public double getIdent() {
		return nbAttribut;
	}
	
	public static double getIdentMax() {
		return Chien.nb;
	}
	
	public String getNom() {
		return nom;
	}
	public String getRace() {
		return race;
	}
}
