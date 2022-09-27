package ex2;

public class Multicoque extends Bateau{
	
	
	
	public Multicoque(String nom) {
		this.nom = nom;
	}
	
	//
	public double tempsPondéré() {
		return this.temps*5;
	}
	public String getType() {
		return "(Multicoque)";
	}

}
