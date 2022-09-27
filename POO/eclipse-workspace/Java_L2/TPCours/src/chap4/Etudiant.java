package chap4;

public class Etudiant extends Personne{
	private String numEtu;
	
	public Etudiant(String nom,int age,String numEtu) {
		super(nom,age);
		this.numEtu = numEtu;
	}
	
	public void setNumEtu(String numEtu) {
		this.numEtu = numEtu;
	}
	
	public String toString() {
		return "etudiant numéro "+this.numEtu+super.toString()
;	}
	
	public void afficher() {
		System.out.println("\nNuméro étudiant : "+this.numEtu);
		super.afficher();
	}

}
