package ex2;

public class TestEtudiants {
	public static void main(String[ ] args) {
		Etudiants e1 = new Etudiants("Alfred",10,8,12);
		System.out.println(e1.moyenne());
		System.out.println(e1.estAdmis());
		e1.aValidé(1);
	}

}
