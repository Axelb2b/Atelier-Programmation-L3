package ex2;

public class Monocoque extends Bateau {
	
	
	public Monocoque(String nom) {
		this.nom = nom;
	}
	//
	public double tempsPondéré() {
		return this.temps*2;
	}
	public String getType() {
		return "(Monocoque)";
	}
	

}
