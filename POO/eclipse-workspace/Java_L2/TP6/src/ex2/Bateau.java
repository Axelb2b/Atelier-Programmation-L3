package ex2;

public abstract class Bateau {
	protected String nom;
	protected double temps;
	protected Equipage equipage;
	
	
	public Bateau(String nom) {
		this.nom = nom;
	}
	public Bateau() {
		
	}
	
	//
	public String getNom() {
		return nom;
	}
	public Equipage getEquipage() {
		return this.equipage;
	}
	
	//
	public String getType(){
		return "";
	}
	abstract public double tempsPondéré();
	//
	
	public String resultat() {
		 return "Le bateau "+this.nom+" de "+this.equipage.getCapitaine().getNom()+"("+
	this.equipage.getCapitaine().getSpecialite()+") a réalisé un temps pondéré de"+this.tempsPondéré();
	}
	
	//
	public void enregistrerTemps(double t) {
		this.temps = t;
	}
	
	public void affecterEquipage(Equipage e) {
		this.equipage = e;
	}
	
	

}
