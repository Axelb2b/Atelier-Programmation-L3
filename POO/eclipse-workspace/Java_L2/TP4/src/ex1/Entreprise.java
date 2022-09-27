package ex1;

import java.util.ArrayList;
public class Entreprise { 
	private String nom;
	private ArrayList<Personne> employes;
	
	public Entreprise(String nom){
		this.nom=nom;
		employes = new ArrayList<Personne>();
		}
	
	public void embaucher(Personne p, double salaire){ 
		employes.add(p);
		p.setSalaire(salaire);
	} 
	
	public void sommeSalaire() {
		System.out.println ("Somme:");
		double somme = 0;
		for (int i=0; i < employes.size() ; i++ ) {
			somme += employes.get(i).getSalaire();		
			}
		System.out.println(somme);
	}
	
}
