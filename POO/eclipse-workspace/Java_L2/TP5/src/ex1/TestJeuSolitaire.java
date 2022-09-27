package ex1;

public class TestJeuSolitaire {
	public static void main(String[] args) {
		NbMystere nb = new NbMystere(10);
		nb.testProp(5);
		Joueur j1 = new Joueur();
		PartieSolitaire p = new PartieSolitaire(j1,10);
		p.lancer();
		p.afficherResultat();
	}

}
