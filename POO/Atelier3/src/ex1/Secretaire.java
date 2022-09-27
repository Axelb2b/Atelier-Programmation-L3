package ex1;

import java.util.*;


public class Secretaire extends Employe {
	private ArrayList<Manager> managers;
	
	
	
	
	
	
	public Secretaire(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville,double salaire,Manager manager) {
		super(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville),salaire);
		this.managers = new ArrayList<Manager>();
		this.managers.add(manager);
		
	}
	
	public Secretaire(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville,double salaire) {
		super(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville),salaire);
		this.managers = new ArrayList<Manager>();
		
	}






	public ArrayList<Manager> getManagers() {
		return managers;
	}
	
	public void afficheManagers() {
		for (int i = 0;i<this.managers.size();i++) {
			System.out.println(this.managers.get(i));
		}
	}



	public void ajoutManager(Manager m) {
		if( this.managers.size()<5) {
			this.managers.add(m);
		}else {
			System.err.println("Trop de managers assignés , impossible d'en ajouter");
		}
	}

	@Override
	public String toString() {
		this.afficheManagers();
		return super.toString();
		
	}
	
	public void augmenterSalaire(double pourcentage) {
		pourcentage = pourcentage+ 0.1*this.managers.size();
		this.salaire = (this.salaire*pourcentage/100)+this.salaire;
	}
	
	

}
