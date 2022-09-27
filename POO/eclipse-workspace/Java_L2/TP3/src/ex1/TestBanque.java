package ex1;

public class TestBanque {
	public static void main(String[ ] args) {
		Personne Titi = new Personne("Titi","Ajaccio");
		System.out.println(Titi);
		//4
		Compte compte1 = new Compte("1010 55 211 12",100,"Toto","Corte");
		Compte compte2 = new Compte("1010 22 222 2",Titi);
		System.out.println(compte1);
		compte1.deposer(1500);
		compte1.retirer(1000);
		System.out.println(compte1);
		compte1.faireUnVirement(compte1.getSolde(), compte2);
		compte1.retirer(100);
		compte2.deposer(30000);
		compte2.faireUnVirement(200, compte1);
		System.out.println(compte1);
		System.out.println(compte2);
		System.out.println(compte1.afficherMax());
		System.out.println(compte2.afficherMax());
		System.out.println(compte1.sommeDepot());
		System.out.println(compte2.sommeDepot());
		System.out.println(compte1.moyenne());
		System.out.println(compte2.moyenne());
		compte1.afiicherDepot();
		compte2.afiicherDepot();
		}

}
