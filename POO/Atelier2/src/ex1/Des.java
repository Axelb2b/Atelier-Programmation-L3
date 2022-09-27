package ex1;
import java.util.*;

public class Des {
	protected String nom;
	protected int nbFaces;
	protected static Random r = new Random();
	protected static int nbDes = 0;
	
	
	//Constructeur
	
	public Des(int nbFaces,String nom) {
		this.nom = nom;
		this.nbFaces = nbFaces;
		nbDes ++;
	}
	
	public Des(String nom) {
		this.nom = nom;
		this.nbFaces = 6;
		nbDes ++;
	}
	public Des() {
		this.nbFaces = 6;
		this.nom = "Dé no "+nbDes+1;
		nbDes ++;
	}
	
	
	
	
	
	
	
	
	
	//Get Set
	public String getNom() {
		return nom;
	}
	public int getNbDes() {
		return nbDes;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbFaces() {
		if (3 >= this.nbFaces && this.nbFaces <= 120) {
			return this.nbFaces;
		}else {
			System.out.println("Nombre de face non valide , changez le avec setNbFaces()");
			return 0;
		}
	}
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	//
	
	
	//Lancers de Dé
	public int lancer() {
		return r.nextInt(nbFaces+1);
	}
	
	public int lancer(int nbLancer) {
		int meilleur = 0;
		for(int i = 0;i < nbLancer;i++) {
			int l = this.lancer();
			if (l == nbFaces) {
				return l;
			}else if(l > meilleur) {
				meilleur = l;
			}
		}
		return meilleur;
		

	}

	//toString
	public String toString() {
		return "Des [nom=" + nom + ", nbFaces=" + nbFaces + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Des other = (Des) obj;
		return nbFaces == other.nbFaces && Objects.equals(nom, other.nom);
	}
	
}
