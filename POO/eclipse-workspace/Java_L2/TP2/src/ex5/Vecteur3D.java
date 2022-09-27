package ex5;

/** Classe de définition de vecteurs 
 * @version 1.0
 * @author Axel
 *
 */

public class Vecteur3D {
	/** Définitions de la composante x d'un vecteur  
	   */
	private double x;
	/** Définitions de la composante y d'un vecteur  
	   */
	private double y;
	/** Définitions de la composante z d'un vecteur  
	   */
	private double z;
	

	  /** Constructeur d'un vecteur 
	   * @param x Indique l'abscisse x
	     @param y Indique l'ordonnée y
	     @param z Indique la côte z*/
	public Vecteur3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vecteur3D() {
		
	}
	/**Affiche les coordonnées du vecteur */
	public void afficherCoord() {
		System.out.println("x = "+this.x+"  y = "+this.y+"  z = "+this.z);
	}
	/**Affiche la norme du vecteur*/
	public double norme() {
		return Math.sqrt(Math.pow(this.x, 2))+Math.pow(this.y,2)+Math.pow(this.z, 2);
	}
	/**Affiche le produit scalaire de deux vecteurs*/
	public double produitScalaire(Vecteur3D v) {
		return (this.x*v.x+this.y*v.y+this.z*v.z);
	}
	/**Static scalaire*/
	public static double produitScalaire(Vecteur3D u,Vecteur3D v) {
		return (u.x*v.x+u.y*v.y+u.z*v.z);
	}
	/**Affiche la somme de deux vecteurs */
	public void sommeVecteur(Vecteur3D v) {
		System.out.println("Somme : x = "+(this.x+v.x)+"  y = "+(this.y+v.y)+"  z = "+(this.z+v.z));
	}

}
