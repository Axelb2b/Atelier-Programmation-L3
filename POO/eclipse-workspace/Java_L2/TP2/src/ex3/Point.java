package ex3;



public class Point {
	//ATTRIBUTS
	 private String nom ;     // nom du point
	 private double abs ;   // abscisse du point

	//CONSTRUCTEUR
	public Point (String nom, double abs)   // constructeur
	  { this.nom = nom ;
	    this.abs = abs ;
	  }
	

	//METHODES
	/***************************************************************/
	public void affiche ()//question 1
	  { System.out.println ("Point de nom " + nom + "  d'abscisse " + abs) ;
	  }
	/***************************************************************/
	public void setNom (String nom)
	  { this.nom=nom ;
	  }
	/***************************************************************/
	public void setAbs (double abs)
	  { this.abs=abs ;
	  }
	/***************************************************************/
	public String getNom ()
	  { return nom ;
	  }
	public double getAbs() {
		return abs;
	}
	/***************************************************************/
	  public void translate (double dx)//question 4
	  { abs += dx ; //abs=abs+dx
	  }
	/***************************************************************/
	public void lireAbscisseConsole() {
		this.abs = Clavier.lireDouble("Donnez un réel");
	}
	
	public void lireAbcisseGraphique() {
		this.abs = ClavierG.lireDoubleG("Entrez un réel:");
	}

}
