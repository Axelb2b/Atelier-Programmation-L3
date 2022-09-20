package ex1;

public class DesAutre extends Des {
	private String[] valeurs;
	
	//constructeurs
	public DesAutre(int nbFaces,String nom) {
		super(nbFaces,nom);
		this.valeurs = new String[nbFaces];
	}
	
	public void setValeurs(String[] valeurs) {
		this.valeurs = valeurs;
	}
	public String[] getValeur() {
		return this.valeurs;
	}
}
