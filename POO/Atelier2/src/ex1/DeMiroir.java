package ex1;

public class DeMiroir extends Des {
	private int valeur;
	
	
	
	public DeMiroir(int nbFaces,String nom) {
		super(nbFaces,nom);
		this.valeur = 0;
	}
	
	
	
	public int lancer() {
		int lancer = super.lancer();
		while(lancer == valeur) {
			 lancer = super.lancer();
		}
		return lancer;
	}

}
