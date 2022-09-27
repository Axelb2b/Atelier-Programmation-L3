package exprepacc;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Jeu {
	private int nbcalcul;
	private Joueur j;
	private Calcul[] calculs;
	
	public Jeu(int nbcalcul) {
		this.j = new Joueur();
		calculs = new Calcul[nbcalcul];
		for(int i = 0;i < calculs.length;i++) {
			calculs[i] = new Calcul(ThreadLocalRandom.current().nextInt(0, 3),ThreadLocalRandom.current().nextInt(0, 21),ThreadLocalRandom.current().nextInt(0, 21));
		}
	}
	
	public void Jouer() {
		System.out.println("Début du Jeu");
		for (int i =0;i<calculs.length;i++) {
			System.out.println(calculs[i]);
			int r = Clavier.lireInt("Entrez votre réponse : ");
			if(calculs[i].estjuste(r) == true) {
				this.j.gagnerPoint();
			}else {
				this.j.perdrePoint();
			}
				
			
			
		}
	}
	
	public void results() {
		int i = this.j.getPoints();
		System.out.println(this.j.getNom()+"a obtenu :"+this.j.getPoints()+" points");
	}

}
