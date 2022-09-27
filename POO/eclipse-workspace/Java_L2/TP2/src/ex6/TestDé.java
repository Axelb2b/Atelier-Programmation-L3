package ex6;

public class TestDé {
	public static void main(String[ ] args) {
		Dé de1 = new Dé();
		Dé de2 = new Dé();
		de1.lancer();
		de2.lancer();
		de1.somme(de2);
		System.out.println(de1.getValeur());
	}

}
