package ex2;

public class TestEntier {

	public static void main(String[] args) {
		Entier e1 = new Entier(10,0,9);
		Entier e2  = new Entier(10,-10);
		Entier fou = new EntierFou(100,0,50,25);
		Entier err = new Entier(0,10,5);
		e1.incrementer();
		e2.incrementer(10);
		fou.incrementer();
		System.out.println(fou);
		fou.incrementer(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(fou);
		System.out.println(err);
		

	}

}
