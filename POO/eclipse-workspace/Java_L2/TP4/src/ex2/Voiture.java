package ex2;

import java.util.ArrayList;

import ex1.Personne;

public class Voiture {
	private  static int nbvoiture = 0;
	private String numid;
	private Moteur monMoteur;
	private Roue[] mesroues;
	/*comme les 4 roues sont identiques je voulais initialement me réferer dans
	la classe voiture à une seule roue(vu que les seules fois où on se sert des 4 roues est pour
	le prix et elles sont surtout identiques) mais le diagramme UML stipule qu'il en faut 4
	donc je fais le tableau*/
	
	public Voiture(int puissance, double prix,double diam,double larg,double prixRoue) {
		this.monMoteur = new Moteur(prix,puissance);
		this.mesroues = new Roue[3];
		Roue r = new Roue(diam,larg,prixRoue);
		mesroues[0]= r;mesroues[1]= r;mesroues[2]=r;mesroues[3]=r;
		nbvoiture += 1;
		this.numid = "V"+nbvoiture;	
	}
	
	public boolean estPlusPuissante(Voiture v) {
		if (this.monMoteur.getPuissance()>v.monMoteur.getPuissance()) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getNumid() {
		return numid;
	}
	
	public double prix() {
		return this.monMoteur.getPrix()+this.mesroues[0].getPrix()*4;
	}
	
	public int puissance() {
		return this.monMoteur.getPuissance();
	}
	
	public String toString() {
		return  "VOITURE Numéro :"+this.numid+" Prix : "+this.prix()+" euros  Moteur : "+this.monMoteur.getNum()+" de "+this.monMoteur.getPuissance()+" cv Roues normales :"+this.mesroues.toString();                
	}
}
