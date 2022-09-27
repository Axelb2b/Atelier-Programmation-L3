package tpcours31;

public class TestClub {
	public static void main(String[ ] args) {
		Personne p1 = new Personne("Axel","Bastia",18);
		Personne p2 = new Personne("Axel2","Bastia",12);
		Club club = new Club("Club","Bastia");
		club.ajouterMembre(p1);
		club.ajouterMembre(p2);
		club.afficherMembre();
		System.out.println(club.moyenneAge());
		System.out.println(club.moyenneAgeMoinsVite());
	}
	

}
