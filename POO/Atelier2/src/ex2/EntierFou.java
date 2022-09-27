package ex2;
import java.util.*;




public class EntierFou extends Entier{
	private int niveauDeFolie;
	protected static Random r = new Random();
	
	
	public EntierFou(int borneSup,int borneInf,int valeur,int niveauDeFolie) {
		super(borneSup,borneInf,valeur);
		this.niveauDeFolie = niveauDeFolie;
	}
	
	//Overide des incrementer
	public void incrementer() {
		super.incrementer(r.nextInt(this.niveauDeFolie+1));
	}
	
	public void incrementer(int pas) {
		System.out.println("Hahahahhaha je suis fou");
		this.incrementer();
	}
}
