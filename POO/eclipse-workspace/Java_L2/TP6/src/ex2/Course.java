package ex2;
import java.util.ArrayList;
import java.util.Arrays;


public class Course {
	private String titre;
	private int nbbateau = 0;
	private int nbgagnant = 0;
	private Bateau[] participants;
	private Bateau[] gagnants;
	
	public Course(String nom) {
		this.titre = nom;
		participants = new Bateau[20];
		gagnants = new Bateau[20];
		
	}
	
	public void inscrireBateau(Bateau b,Equipage e) {
		participants[nbbateau] = b;
		b.affecterEquipage(e);
		nbbateau += 1;
	}
	public void trouverGagnant() {
		double tmin = 0;
		for (int i = 0;i<nbbateau;i++) {
			if (tmin<participants[i].tempsPondéré()) {
				tmin = participants[i].tempsPondéré();
				nbgagnant = 0;
				gagnants = new Bateau[20];
				gagnants[nbgagnant] = participants[i];
				nbgagnant += 1;
				}
			if (tmin == participants[i].tempsPondéré()) {
				gagnants[nbgagnant] = participants[i];
			}
		}
				
	}
	//
	private String plsgg() {
		for(int i = 0;i<gagnants.length;i++) {
			return gagnants[i].getNom()+" - ";
		}
		return "";
	}
	
	
	
	
	public void afficherGagnants() {
		if (nbgagnant == 1) {
			System.out.println("Le grand gagnant est "+gagnants[0].getNom()+" de "+gagnants[0].getEquipage().getCapitaine().getNom()+
			gagnants[0].getEquipage().getCapitaine().getSpecialite()+gagnants[0].getType());
		}
		if (nbgagnant>1) {
			System.out.println("Il y a 2 gagnants ex-aequo :"+this.plsgg());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
