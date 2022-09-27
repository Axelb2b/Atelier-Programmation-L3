package Ex1;

class Point {
	private char nom;
	private double abscisse;
	
	//Constructeur
	
	Point(char nom,double abscisse){
		this.nom = nom;
		this.abscisse = abscisse;
	}
	
	
	
	public void afficher() {
		System.out.println("nom du point "+nom+"\n d'abscisse "+getAbscisse());
	}

	//GetSet nom et abcisse
	public double getAbscisse() {
		return abscisse;
	}
	
	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	
	public char getNom() {
		return nom;
	}
	
	public void setNom(char nom) {
		this.nom = nom;
	}
	//Question 4
	
	public void translation(int x) {
		this.abscisse = abscisse+x;
		System.out.println("Nouvel abscisse "+this.abscisse);
	}
}
