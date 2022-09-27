package ex6;

import ex3.Clavier;

public class Jeu421 {
	private Dé d1;
	private Dé d2;
	private Dé d3;
	private boolean gg;
	private int nbEssai;
	
	public Jeu421() {
		this.d1 = new Dé();
		this.d2 = new Dé();
		this.d3 = new Dé();
		this.gg = false;
		this.nbEssai = 1;
	}
	
	public void lancerJeu() {
		this.d1.lancer();
		this.d2.lancer();
		this.d3.lancer();
		this.estGagnant();
		if (this.gg == true) {
			System.out.println("Bravo !! gagné en 1 coup !!");
		}
		while (this.gg != true) {
			nbEssai += 1;
			this.afficherDe();
			int i = this.lireDeConsole();
			if (i == 1) {
				d1.lancer();
			}else if (i == 2) {
				d2.lancer();
			}else if (i == 3) {
				d3.lancer();
			}this.estGagnant();
			}
		this.afficherDe();
		System.out.print("Bravo ! gagné en "+nbEssai+" coups !");
	}
	
	
	
	
	
	
	public void afficherDe() {
		System.out.println("Dé 1 : "+d1.getValeur()+"  Dé 2 : "+d2.getValeur()+"  Dé 3 : "+d3.getValeur());
	}
	
	public void estGagnant() {
		if (this.numeropresent(4) && this.numeropresent(2) && this.numeropresent(1) == true) {
			this.gg = true;
		}else {
			this.gg = false;
		}
	}
	public int lireDeConsole() {
		return Clavier.lireInt("quel dé voulez vous lancer :");
	}
	private boolean numeropresent(int n) {
		boolean estPresent = false;
		if (d1.getValeur() == n) {
			estPresent = true;
		}else if (d2.getValeur() == n) {
			estPresent = true;
		}else if (d3.getValeur() == n) {
			estPresent = true;
		}else {
			estPresent = false;
		}
		return estPresent;
				
	}

}
