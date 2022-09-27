package ex2;

public class TestCourse {
	public static void main(String[] args) {
		Monocoque m1 = new Monocoque("Java");
		Multicoque m2 = new Multicoque("Tango");
		Equipier e1 = new Equipier("Jean","Barreur");
		Equipier e2 = new Equipier("Pierre","Barreur");
		Equipier e3 = new Equipier("Marie","Mousse");
		Equipage ee1 = new Equipage("fineEquipe",e1);
		ee1.ajoutEquipier(e3);
		Equipage ee2 = new Equipage("Solitaire",e2);
		Course c1 = new Course("Course du vent");
		c1.inscrireBateau(m1, ee1);
		c1.inscrireBateau(m2, ee2);
		m1.enregistrerTemps(120);
		m2.enregistrerTemps(150);
		c1.trouverGagnant();
		c1.afficherGagnants();
		
	}

}
