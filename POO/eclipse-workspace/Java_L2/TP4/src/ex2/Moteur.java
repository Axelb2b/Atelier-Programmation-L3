package ex2;

public class Moteur {
	private static int nbmoteur = 0;
	private int num = 1;
	private double prix;
	private int puissance;
	
	
	public Moteur(double prix,int puissance) {
		this.prix = prix;
		this.puissance = puissance;
		nbmoteur += 1;
		this.num = 1;
		num+= 1;
	}
	
	public int getNum() {
		return num;
	}
	public double getPrix() {
		return prix;
	}
	public int getPuissance(){
		return puissance;
	}
	
	public String toString() {
		return "numéro "+this.num+" de puissance "+this.puissance;
	}
}
