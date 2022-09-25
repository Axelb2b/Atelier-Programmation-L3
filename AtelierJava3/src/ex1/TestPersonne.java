package ex1;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne("Jean","III",02,10,1541,2,"riche","20200","Bastia");
		Personne p2 = new Personne("Jean","Barlou",02,10,2000,2,"pauvre","20200","Bastia");
		Employe e1 = new Employe("Jean","Travailleur",02,10,1980,2,"de la classe moyenne","20200","Bastia",1500);
		Secretaire s1 = new Secretaire("Jeanne","Bureaucrate",02,10,1990,2,"Jolie","20200","Bastia",1000);
		Manager m1 = new Manager("Jean","Manager",02,10,1982,2,"De la gestion","20200","Bastia",3000,s1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(e1);
		System.out.println(s1);
		System.out.println(m1);
		System.out.println(Personne.plusAgee(p1, p2));
		System.out.println(Personne.getNbPersonne());
		e1.augmenterSalaire(5);
		System.out.println(e1);
		System.out.println(e1.calculAnnuite());
		m1.augmenterSalaire(10);
		s1.augmenterSalaire(10);
		System.out.println(m1);
		System.out.println(s1);
		

	}

}
