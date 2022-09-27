package chap4;

public class Enseignant extends Personne {
	private double salaire;
	private int nbHeureCours;
	
	public Enseignant(String nom,int age,double salaire,int nbheur) {
		super(nom,age);
		this.salaire = salaire;
		this.nbHeureCours = nbheur;
	}
	
	public String toString() {
		return "Enseignant "+super.toString()+this.salaire+" euros";
		}
	
	public void afficher() {
		super.afficher();
		System.out.println("Salaire : "+this.salaire+"\nNombre d'heure de cours : "+this.nbHeureCours);
	}
}
