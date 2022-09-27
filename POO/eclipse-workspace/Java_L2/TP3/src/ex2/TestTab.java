package ex2;

public class TestTab {
	public static void main (String[] args) {
		TabClasse t = new TabClasse(5);
		t.remplirTableau();
		t.trierTableau();
		t.sommeElement();
		System.out.println(t.maximum());
		System.out.println(t.minimum());
		t.afficherTableau();
	}

}
