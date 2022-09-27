package ex5;

public class TestVecteur3D {
	public static void main(String[ ] args) {
		Vecteur3D u = new Vecteur3D(2,1,2);
		Vecteur3D v = new Vecteur3D(6,-1,4);
		u.afficherCoord();
		v.afficherCoord();
		System.out.println(u.norme());
		System.out.println(v.norme());
		System.out.println(u.produitScalaire(v));
		u.sommeVecteur(v);
		u.afficherCoord();
	}

}
