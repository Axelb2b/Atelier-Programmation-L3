package ex2;
import java.util.ArrayList;

import ex1.NbMystere;


public class Partie {
	private int nbCoups = 0;
	private int nbJoueurs;
	private NbMystere nb;
	private Joueur[] j;
	private Joueur gagnant;
	
	public Partie(int nbJoueur,int valeurMax) {
		this.nbJoueurs = nbJoueur;
		j = new Joueur[nbJoueur-1];
		this.saisieJoueur();
		NbMystere n = new NbMystere(valeurMax);
		this.nb = n;
	}
	
	//
	private void saisieJoueur() {
		for (int i = 0;i != j.length;i++) {
			j[i] = new Joueur();
		}
	}
	
	
	
	
	
	
	//
	public void afficherResultat() {
		System.out.println("Partie gagnée par "+this.gagnant.getNom()+" en "+this.nbCoups+"coups");
	}
	
	private boolean faireJouer() {
		nbCoups ++;
		while()
		if (nb.testProp(j[i].nouvelleProp(nbCoups)) == true) {
			return true;
		}else {
			return false;
		}
		
	}
	//Cette méthode est privée car elle ne sert que pour la méthode lancer
	
	public void lancer() {
		while(this.faireJouer() != true) {
			 this.faireJouer();	 
		}
	}
}

