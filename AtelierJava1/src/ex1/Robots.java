package ex1;

public class Robots {
	private String ref;
	private String nom;
	private int x;
	private int y;
	private int orientation;
	private static int totalR;
	
	
	public Robots(String nom,int x, int y,int orientation) {
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		totalR ++;
		this.ref = "ROB"+totalR;
	}
	
	public Robots(String nom) {
		this.nom = nom;
		this.x = 0;
		this.y = 0;
		this.orientation = 1;
		totalR ++;
		this.ref = "ROB"+totalR;
	}
	
	
	//Get Set
	public String getRef() {
		return ref;
	}
	public String getNom() {
		return nom;
	}
	public String getCoord() {
		return "coordonnées x : "+x+" et y : "+y;
	}
	public String getOrientation() {
		return "l'orientation est"+orientation;
		}
	public static int getTotalR() {
		return totalR;
	}
	
	
	// méthode de modification de l'orientation
	
	public void modifOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	public void deplacer() {
		if (orientation == 1) {
			this.y = y+1;
		}else if (orientation == 2) {
			this.x = x+1;
		}else if (orientation == 3) {
			if (y > 0) {
				this.y = y-1;
			}else {
				this.y = 0;
				System.out.println("y = 0, impossible d'aller vers le sud");
			}
		}else if (orientation == 4) {
			if (x > 0) {
				this.x = x-1;
			}else {
				this.x = 0;
				System.out.println("x = 0, impossible d'aller vers le nord");
			}
		}else {
			System.out.println("Entrez une valeur comprise en 1 et 4 pour l'orientation (méthode modifOrientation)");
		}
	}
	//
	
	public String chaineOrientation() {
		if (orientation == 1) {
			return "Nord";
		}else if (orientation == 2) {
			return "Est";
		}else if (orientation == 3) {
			return "Sud";
		}else if (orientation == 4) {
			return "Ouest";
		}else {
			return "Valeur non valide";
		}
	}
	/* 2.3 
	public void afficheToi() {
		System.out.println("nom : "+this.nom+ "  Référence : "+this.ref+ "  Abscisse : "+ this.x+
				           "  Ordonnée : "+this.y+ "  Orientation : "+this.chaineOrientation());
	}*/
	
	public String toString() {
		return "nom : "+this.nom+ "  Référence : "+this.ref+ "  Abscisse : "+ this.x+
		           "  Ordonnée : "+this.y+ "  Orientation : "+this.chaineOrientation();
	}
	
	
	
	
	
	
}

