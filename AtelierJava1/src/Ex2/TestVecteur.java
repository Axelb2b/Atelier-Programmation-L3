package Ex2;


public class TestVecteur {

	public static void main(String[] args) {
		Vecteur3D u = new Vecteur3D(2,1,2);
		Vecteur3D v = new Vecteur3D(6,-1,4);
		System.out.println(u);
		System.out.println(v);
		System.out.println(u.norme());
		System.out.println(Vecteur3D.norme(v));
		System.out.println(u.produitScalaire(v));
		Vecteur3D somme = u.somme(v);
		Vecteur3D.somme(u, v);
		System.out.println(somme);

	}

}
