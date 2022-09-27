package Ex2;

public class Vecteur3D {
	
	private double x;
	private double y;
	private double z;

	
	public Vecteur3D(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vecteur3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	//GetSet
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	//toString
	public String toString() {
		return "<"+this.x+","+this.y+","+this.z+">";
	}
	
	//retourne la norme
	
	public double norme() {
		return Math.sqrt(Math.pow(this.x, 2))+Math.pow(this.y,2)+Math.pow(this.z, 2);
	}
	
	//retourne le produit scalaire
	public double produitScalaire(Vecteur3D v) {
		return this.x*v.x+this.y+v.y+this.z*v.z;
	}
	/**Static scalaire*/
	public static double produitScalaire(Vecteur3D u,Vecteur3D v) {
		return (u.x*v.x+u.y*v.y+u.z*v.z);
	}
	//Static norme
	
	public static String norme(Vecteur3D u) {
		double norme = Math.sqrt(Math.pow(u.x, 2))+Math.pow(u.y,2)+Math.pow(u.z, 2);
		return "Norme du vecteur : "+norme;
	}
	
    //Static Somme
	public static String somme(Vecteur3D u, Vecteur3D v) {
		return "Somme de v1 + v2 = ("+u.x+u.x+","+u.y+v.y+","+u.z+v.z+")";
	}
	
	public Vecteur3D somme(Vecteur3D v) {
		Vecteur3D somme = new Vecteur3D(this.x+v.x,this.y+v.y,this.z+v.z);
		return somme;
	}

}
