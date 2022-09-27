package ex1;

import ex2.TabClasse;

public class Compte {
	private String numero;
	private double solde;
	private Personne personne;
	//suite
	private double[] depots;
	private int nbdepot;
	
	//constructeurs
	public Compte(String numero,double depotInit,Personne personne) {
		this.numero = numero;
		this.solde = depotInit;
		this.personne = personne;
		this.depots = new double[100];
		this.nbdepot = 0;
	}
	
	public Compte(String numero,double solde,String nom,String adresse) {
		this.numero = numero;
		this.solde = solde;
		Personne personne = new Personne(nom,adresse);
		this.personne = personne;
		this.depots = new double[100];
		this.nbdepot = 0;
	}
	public Compte(String numero,String nom,String adresse) {
		this.numero = numero;
		this.solde = 0;
		Personne personne = new Personne(nom,adresse);
		this.personne = personne;
		this.depots = new double[100];
		this.nbdepot = 0;
	}
	public Compte(String numero,Personne personne) {
		this.numero = numero;
		this.personne = personne;
		solde = 0;
		this.depots = new double[100];
		this.nbdepot = 0;
	}
	
	//get
	public String getNumero() {
		return numero;
	}
	public double getSolde() {
		return solde;
	}
	 public String getNomTitulaire() {
		 return this.personne.getNom();
	 }
	
	//opération sur UN compte
	public boolean estVide() {
		if (this.solde == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deposer(double montant) {
		
		this.solde = this.solde + montant;
		this.nbdepot += 1;
		int i = this.nbdepot;
		this.depots[i]= montant;
		return true;
		
	}
	
	public boolean retirer(double montant) {
		if (this.solde - montant > 0) {
			this.solde = this.solde - montant;
			return true;
		}else {
			System.out.println("Impossible, solde insuffisant");
			return false;
		}
	}
	
	public void afiicherDepot() {
		System.out.println("Nombre total de dépots : "+this.nbdepot);
		for (int i = 1;i < nbdepot+1;i++) {
			System.out.println("Dépôt N° : "+i+" = "+this.depots[i]+" euros");
		}
	}
	
	public double afficherMax() {
		return TabClasse.maximum(depots);
	}
	
	public double sommeDepot() {
		return TabClasse.sommeElement(depots);
	}
	
	public double moyenne() {
		return (this.sommeDepot()/nbdepot);
	}
	//opération sur plusieurs comptes
	
	public void faireUnVirement(double montant,Compte destinataire) {
		if (this.solde-montant >= 0) {
			this.solde = this.solde - montant;
			destinataire.solde = destinataire.solde + montant;
			nbdepot += 1;
			this.depots[nbdepot]=montant;
		}else {
			System.out.println("Opération impossible, solde insuffisant");
		}
	}
	//toString
	
	public String toString() {
		return "compte courant de "+this.personne.getNom()+" (numéro de compte : "+this.numero+" solde : "+this.solde;
	}
	

}
