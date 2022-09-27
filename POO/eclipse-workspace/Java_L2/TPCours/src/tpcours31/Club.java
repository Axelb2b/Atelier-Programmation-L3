package tpcours31;

import java.util.ArrayList;

public class Club {
	private String nom;
	private String adresse;
	private ArrayList<Personne> membres;
	
	public Club(String nom,String adresse) {
		this.nom = nom;
		this.adresse = adresse;
		this.membres = new ArrayList<Personne>();
	}
	
	public void ajouterMembre(Personne p) {
		membres.add(p);
		}
	
	
	public void afficherMembre() {
		for (Personne p:membres) {
		System.out.println(p.getNom());
		}
	}
	
	public double moyenneAge() {
		int moyenne = 0;
		for (Personne p:membres) {
			moyenne += p.getAge();
			moyenne = moyenne/membres.size();
			}
		return moyenne;
	}
	
	public double moyenneAgeMoinsVite(){
		int moyenne = 0;
		for (int i = 0;i<membres.size();i++) {
			moyenne += membres.get(i).getAge();
			moyenne = moyenne / membres.size()
;		}
		return moyenne;
	}
	
	
	
	

}
