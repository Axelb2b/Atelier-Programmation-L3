package ex1;

import java.util.ArrayList;
public class EntrepriseQ3 { 
	private String nom;
	private Personne[] employes;
	private static int nbempl = 0;
	
	public EntrepriseQ3(String nom){
		this.nom=nom;
		employes = new Personne[500];
		}
	
	public void embaucher(Personne p, double salaire){ 
		if (nbempl < 50) {
			employes[nbempl] = p;
			p.setSalaire(salaire);
		}
	} 
		
	public void sommeSalaire() {
		System.out.println ("Somme:");
		double somme = 0;
		for (int i=0; i < nbempl; i++ ) {
			somme += employes[i].getSalaire();		
			}
		System.out.println(somme);
	}
	
}
