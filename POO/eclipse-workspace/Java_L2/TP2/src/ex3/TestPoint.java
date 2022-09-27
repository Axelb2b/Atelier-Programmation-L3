package ex3;

public class TestPoint {

	
	public static void main(String[] args) {
		//question 2
		/*Point monPoint = new Point () ; 
		monPoint.nom='C';
		monPoint.abs=2.5;
		monPoint.affiche() ;
		monPoint.abs=3;
		monPoint.affiche() ; 
		//fin question 2*/

		/// question 3
		/*Point monPoint = new Point () ; 
		monPoint.setNom('C');
	    monPoint.setAbs(2.5);
		monPoint.affiche() ;
	    monPoint.setAbs(3);
		monPoint.affiche() ; //
		System.out.println("Mon point a pour nom :" + monPoint.nom);
		System.out.println("Mon point a pour nom :" + monPoint.getNom());*/ 
		//fin question 3

		// question 5
		//Point monPoint = new Point ('C', 2.5); // Cette ligne remplace la ligne Point monPoint = new Point () ; 

		/* question 4
	    monPoint.translate(4) ;
		monPoint.affiche(); 
		monPoint.lireAbcisseGraphique();
		monPoint.affiche();*/
		
		Point p1 = new Point("p",9);
		/*p1.lireAbscisseConsole();
		p1.affiche();
		p1.lireAbcisseGraphique();
		p1.affiche();*/
		p1.setAbs(Double.parseDouble(args[0]));
		p1.affiche();
	}

}
