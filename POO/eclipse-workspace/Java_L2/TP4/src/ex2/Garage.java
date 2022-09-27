package ex2;
import java.util.ArrayList;

public class Garage {
	private String adresse;
	private ArrayList<Voiture> lstvtr;
	private final int nbmax;
	private String nom;
	
	
	public Garage(String nom, String adresse,int nbmax) {
		this.nom = nom;
		this.adresse = adresse;
		this.nbmax = nbmax;
		this.lstvtr = new ArrayList<Voiture>();
	}
	
	
	public void ajouter(Voiture v) {
		lstvtr.add(v);
	}
	
	public Voiture laPlusPuissante() {
		Voiture lapluspuissante = lstvtr.get(0);
		for(int i = 0;i< lstvtr.size();i++) {
			if(lstvtr.get(i).puissance()>lapluspuissante.puissance());
			lapluspuissante = lstvtr.get(i);
		}
		return lapluspuissante;
	}
	
	public double valeurStock() {
		int somme = 0;
		for(int i = 0;i<lstvtr.size();i++) {
			somme += lstvtr.get(i).prix();
		}
		return somme;
	}
	
	public String toString() {
		return "Garage : "+this.nom+"("+this.adresse+") Capacité  :"+this.nbmax;
	}
}
