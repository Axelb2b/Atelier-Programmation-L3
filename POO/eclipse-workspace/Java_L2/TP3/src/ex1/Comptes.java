package ex1;

import ex2.TabClasse;

public class Comptes {
	private String numero;
	private double solde;
	private Personne personne;
	private int nbdepot;
	
	//constructeurs
	public Comptes(String numero,double depotInit,Personne personne) {
		this.numero = numero;
		this.solde = depotInit;
		this.personne = personne;
		this.nbdepot = 0;
	}
	
	public Comptes(String numero,double solde,String nom,String adresse) {
		this.numero = numero;
		this.solde = solde;
		Personne personne = new Personne(nom,adresse);
		this.personne = personne;
		this.nbdepot = 0;
	}
	public Comptes(String numero,String nom,String adresse) {
		this.numero = numero;
		this.solde = 0;
		Personne personne = new Personne(nom,adresse);
		this.personne = personne;
		this.nbdepot = 0;
	}
	public Comptes(String numero,Personne personne) {
		this.numero = numero;
		this.personne = personne;
		solde = 0;
		this.nbdepot = 0;
	}
	
	//get
	
	public String getNumero(){
		return numero;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public String getNomTitulaire() {
		return this.personne.getNom();
	}
	
	public boolean estVide() {
		if (this.solde == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void deposer(double montant) {
		this.solde = this.solde + montant;
		this.nbdepot += 1;
	}
	
	public void retirer(double montant) {
		if (this.solde - montant > 0) {
			this.solde = this.solde - montant;
		}else {
			System.out.println("Impossible, solde insuffisant");
		}
	}
	
	public void faireUnVirement(double montant,Comptes destinataire) {
		if (this.solde-montant >= 0) {
			this.solde = this.solde - montant;
			destinataire.solde = destinataire.solde + montant;
			nbdepot += 1;
		}else {
			System.out.println("Opération impossible, solde insuffisant");
		}
	}
	public String toString() {
		return "compte courant de "+this.personne.getNom()+" (numéro de compte : "+this.numero+" solde : "+this.solde;
	}
	
	
	

}
