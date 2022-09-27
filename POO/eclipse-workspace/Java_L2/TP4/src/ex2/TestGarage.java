package ex2;

public class TestGarage {
	public static void main(String[] args) {
		Garage g = new Garage("PARADISO","Corte",2);
		System.out.println(g);
		Voiture v1 = new Voiture(15,10000,17,165,100);
		Voiture v2 = new Voiture(9,5000,17,155,200);
		g.ajouter(v1);
		g.ajouter(v2);
		System.out.println(v1);
		System.out.println(v2);
		g.laPlusPuissante();
		g.valeurStock();
	}

}
