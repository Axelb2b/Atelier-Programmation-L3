package ex1;

public class DesPip extends Des {
	private int valMin;
	
	
	//Constructeur
	public DesPip(int valMin,int nbFaces,String nom) {
		super(nbFaces,nom);
		this.valMin = valMin;
	}

	//get valMin
	public int getValMin() {
		return valMin;
	}
	
	//lancé pipé
	
	public int lancer() {
		return r.nextInt(valMin-1,nbFaces+1);
	}

	
	
	
	
	

}
