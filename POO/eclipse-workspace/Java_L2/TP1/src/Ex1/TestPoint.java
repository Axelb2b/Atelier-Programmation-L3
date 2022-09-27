package Ex1;

public class TestPoint {
	public static void main(String[ ] args) {
		Point monpoint = new Point('C',2.5);
		monpoint.setNom('C');
		monpoint.setAbscisse(2.5);
		monpoint.afficher();
		monpoint.setAbscisse(3);
		monpoint.afficher();
		monpoint.translation(5);
		
	}

}
