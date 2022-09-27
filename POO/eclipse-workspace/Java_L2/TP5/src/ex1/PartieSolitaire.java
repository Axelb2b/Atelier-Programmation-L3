package ex1;

public class PartieSolitaire {
	private int nbCoups = 0;
	private NbMystere nb;
	private Joueur j;
	
	public PartieSolitaire(Joueur j,int valeurMax) {
		Joueur j1 = new Joueur();
		this.j = j1;
		NbMystere n = new NbMystere(valeurMax);
		this.nb = n;
	}
	//
	public void afficherResultat() {
		System.out.println("Partie gagnée par "+this.j.getNom()+" en "+this.nbCoups+" coups");
	}
	
	private boolean faireJouer() {
		nbCoups ++;
		if (nb.testProp(j.nouvelleProp(nbCoups)) == true) {
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
