package ex1;

public class TestDes {

	public static void main(String[] args) {
		Des d6 = new Des();
		Des d12 = new Des(12,"d12");
		DeMiroir d8 = new DeMiroir(4,"dFou");
		DesPip d20 = new DesPip(15,20,"d20");
		System.out.println(d6.lancer());
		System.out.println(d12.lancer());
		System.out.println(d6.getNom());
		System.out.println(d12.lancer(3));
		System.out.println(d6);
		System.out.println(d12);
		System.out.println(d20.lancer());
		System.out.println(d8.lancer());
		System.out.println(d6.equals(d12));
		

	}

}
