package ex2;



public class Entier {
	protected int borneInf;
	protected int borneSup;
	protected int valeur;
	
	//Constructeurs
	public Entier(int borneSup,int borneInf,int valeur) {
		if(borneSup > borneInf) {
			this.borneSup = borneSup;
			this.borneInf = borneInf;
			this.valeur = valeur;
		}else {
			System.out.println("Entrez des bornes correctes");
		}
		
	}
	
	public Entier(int borneSup,int borneInf) {
		if(borneSup > borneInf) {
			this.borneSup = borneSup;
			this.borneInf = borneInf;
			this.valeur = 0;
		}else {
			System.out.println("Entrez des bornes correctes");
		}
		
	}
	
	//GET SET
	public int getBorneInf() {
		return borneInf;
	}

	public int getBorneSup() {
		return borneSup;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
	//incrementer() et incrementer(int nb)
	
	public void incrementer() {
		if(this.valeur < this.borneSup) {
			valeur ++;
		}else {
			System.out.println("La borne supérieure est atteinte , impossible d'incrémenter la,valeur");
		}
	}
	
	public void incrementer(int pas) {
		if(this.valeur + pas <= this.borneSup) {
			valeur = valeur + pas;
		}else {;
			System.out.println("La borne supérieure est atteinte , impossible d'incrémenter la,valeur");
		}
	}

	// toString
	public String toString() {
		return "Entier [borneInf=" + borneInf + ", borneSup=" + borneSup + ", valeur=" + valeur + "]";
	}

	//equals
	public boolean equals(Entier b) {
		return this.valeur == b.valeur;
	}
	
	

}
