package ex1;

public class Personne {
	private String nom;
	private String adresse;
	
	public Personne(String nom,String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	//Get
	public String getNom() {
		return nom;
	}
	public String getAdresse() {
		return adresse;
	}
	
	//toString
	public String toString() {
		return "nom : "+this.nom+ "  adresse : "+this.adresse;
	}
	

}
