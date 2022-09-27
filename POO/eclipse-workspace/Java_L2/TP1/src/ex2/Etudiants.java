package ex2;

public class Etudiants {
	private String nom;
	private double noteUE1;
	private double noteUE2;
	private double noteUE3;
	
	Etudiants(String nom,double noteUE1,double noteUE2,double noteUE3){
		this.nom = nom;
		this.noteUE1 = noteUE1;
		this.noteUE2 = noteUE2;
		this.noteUE3 = noteUE3;
	}
	
	//getset
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getUE1() {
		return noteUE1;
	}
	
    public void setUE1(double noteUE1) {
    	this.noteUE1 = noteUE1;
    }
	
    public double getUE2() {
		return noteUE2;
	}
	
    public void setUE2(double noteUE2) {
    	this.noteUE2 = noteUE2;
    }
    
    public double getUE3() {
		return noteUE3;
	}
	
    public void setUE3(double noteUE3) {
    	this.noteUE3 = noteUE3;
    }
	
    
	//moyenne
    
	public double moyenne() {
		return (noteUE2+noteUE1+noteUE3)/3;
	}
	
	//estAdmis
	
	public Boolean estAdmis() {
		return (moyenne()>=10);
	}
	
	//aValidé
	
	public void aValidé(double numUE) {
		if (numUE == 1) {
			if (noteUE1 >= 10) {
			System.out.println("UE1 validée");
			}else {
				System.out.println("UE1 non validée");
			}
			
		}
	}
	

}
