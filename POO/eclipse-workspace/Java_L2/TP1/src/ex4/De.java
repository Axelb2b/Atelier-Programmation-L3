package ex4;
import java.util.*;

public class De {
	private int nbFaces;
	private String Nom;
	private static Random r = new Random();
	//Question
	public De(String nom){
		nbFaces = 6;
	}
	public De(int nbFaces, String Nom){
		if (nbFaces>3 && nbFaces<120) {
			this.nbFaces = nbFaces;
			}
			else {
				this.nbFaces = 6;
			}
		this.Nom = Nom;
	}
	
	public int getnbFaces() {
		if (nbFaces>3 && nbFaces<120) {
		return nbFaces;
		}
		else {
			return 6;
		}
	}

	public void setnbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
	
	public int lancer() {
		return r.nextInt(nbFaces+1);
		
	}

}