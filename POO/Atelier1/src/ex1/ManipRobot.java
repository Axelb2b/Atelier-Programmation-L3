package ex1;



public class ManipRobot {
	public static void main(String[ ] args) {
		
		Robots toto = new Robots("toto",10,20,3);
		Robots titi = new Robots("titi",0,0,1);
		titi.deplacer();
		toto.deplacer();
		System.out.println(titi.getCoord());
		System.out.println(toto.getCoord());
		System.out.println(toto.chaineOrientation());
		//toto.afficheToi();
		System.out.println(titi);
		System.out.println(toto);
	}
}