package tpcours31;

public class Personne {
	private String nom;
	private String adresse;
	private Voiture mavoiture;
	private int age;
	
	public Personne(String nom,String adresse,int age) {
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.mavoiture = null;
	}
	public Personne(String nom,String adresse,Voiture voiture,int age) {
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.mavoiture = voiture;
	}
	
	//Get
	public String getNom() {
		return nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public Voiture getVoiture() {
		return mavoiture;
	}
	public int getAge() {
		return age;
	}
	
	//toString
	public String toString() {
		return this.nom+" qui vit à "+this.adresse+" conduit la voiture "+mavoiture;
	}
	

}
