package ex2;

import java.util.Arrays;

public class TabClasse {
	private final int nbmax;
	private int nbelmt;
	private int[] tab;
	
	public TabClasse(int nbmax) {
		this.nbmax = nbmax;
		this.nbelmt = 0;
		this.tab = new int[nbmax];
	}
	
	//get
	
	public int getNbmax() {
		return nbmax;
	}
	public int getNbelmt() {
		return nbelmt;
	}
	
	//
	public void remplirTableau() {
		this.nbelmt = Clavier.lireInt("Rentrer le nombre d'éléments : ");
		for (int i = 0;i < this.nbelmt;i++) {
			this.tab[i] = Clavier.lireInt("Rentrez les premier élément du tableau :");
			
		}
	}
	public void zeros(int n) {
		for (int i = 0;i<n;i++) {
			this.tab[i] = 0;
		}
	}
	public void sommeElement() {
		int somme = 0;
		for (int i = 0;i < nbelmt;i++) {
			somme += this.tab[i];	
		}
		System.out.println("Somme : "+somme);
	}
	public int minimum() {
		int min = this.tab[0];
		for (int i = 0;i < nbelmt-1;i++) {
			if (min >this.tab[i+1]) {
				min = this.tab[i+1];
			}else {
				continue;
			}
		}
		return min;
	}
	
	
	public int maximum() {
		int max = this.tab[0];
		for (int i = 0;i < nbelmt-1;i++) {
			if (max <this.tab[i+1]) {
				max = this.tab[i+1];
			}else {
				continue;
			}
		}
		return max;
	}
	public void afficherTableau() {
		System.out.println(Arrays.toString(tab));
	}
	public void trierTableau() {
		Arrays.sort(tab);
	}
	
	
	//static pour exo 1 suite 
	public  static double maximum(double[] e) {
		double max = e[0];
		for (int i = 0;i < 99;i++) {
			if (max <e[i+1]) {
				max = e[i+1];
			}else {
				continue;
			}
		}
		return max;
	}
	
	
	public static double sommeElement(double[] e) {
		double somme = 0;
		for (int i = 0;i < 100;i++) {
			somme += e[i];	
		}
		return somme;
	}

}
