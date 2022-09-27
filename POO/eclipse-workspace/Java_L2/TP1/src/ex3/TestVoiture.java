package ex3;

public class TestVoiture {

	public static void main(String[] args) {
        Voiture v = new Voiture("Titine", 7);
        // création d'une voiture nommée "Titine" de 7 chevaux
        System.out.println(v.donneVitesse());    
        // affiche : 0
        v.passeVitesseSuperieure();
        // passe la première vitesse  
        v.passeVitesseSuperieure();
        // passe la seconde vitesse     
        v.passeVitesseSuperieure();
        // passe la troisième vitesse 
        v.retrograde();
        // retourne en seconde     
        System.out.println(v.donneVitesse());    
        // affiche : 2 
        v.affiche();
        // affiche : Titine, 7 chevaux
        Voiture t = new Voiture("Totoche", 7, 6);
        // création d'une voiture nommée "Totoche" de 7 chevaux
        if (t.estPointMort() == true) {
        	System.out.println("OK");
        } 
        else {   
        	System.err.println("ERREUR");
        }
		t.passeVitesseSuperieure();
		// passe la première vitesse
		if (t.estPointMort() == false) {
		   System.out.println("OK");
		} 
		else {   
		   System.err.println("ERREUR");
		}
		t.retrograde();
		// devrait être au point mort
		if (v.estPointMort() == true) {
		   System.out.println("OK");
		} 
		else {   
		   System.err.println("ERREUR");
		}
    }


}
