package ex2;

public class Equipage {
	private String nom;
	private int nbEquipier;
	private Equipier[] marins;
	private Equipier capitaine;
	
	
	
	public Equipage(String nom,Equipier capitaine) {
		this.nom = nom;
		this.nbEquipier = 0;
		this.marins = new Equipier[6];
		this.capitaine = capitaine;
		
	}
	
	
	public void ajoutEquipier(Equipier e) {
		if(nbEquipier<6) {
			marins[nbEquipier] = e;
			nbEquipier += 1;
		}else {
			System.out.println("Nombre maximum d'équipiers atteint pour cet équipage");
		}
		
	}
	
	public Equipier getCapitaine() {
		return this.capitaine;
	}

}
