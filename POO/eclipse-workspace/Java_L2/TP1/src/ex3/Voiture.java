package ex3;

public class Voiture {
		  private String nom;
		  private int chevaux;
		  private int vitesse;
		  private int maxVitesse;

		  // constructeur
		  public Voiture(String nom, int ch, int max){
		    this.nom = nom;
		    this.chevaux=ch;
		    this.maxVitesse=max;
		    this.vitesse=0;
		  }
		  // constructeur
		  public Voiture(String nom, int ch){
		    this.nom = nom;
		    this.chevaux=ch;
		    this.maxVitesse=5; 
		    this.vitesse=0;
		      // 5 vitesses par défaut
		  }
		  public void affiche(){
			  System.out.println(nom + " , " + chevaux + " chevaux " );
		  }
		  public int donneVitesse() {
		    return this.vitesse;
		  }
		  public void passeAuPointMort() {
		    this.vitesse=0;
		  }
		  public void passeVitesseSuperieure(){
		   if (this.vitesse < this.maxVitesse) {
		     this.vitesse++;
		   }
		  }
		 public void retrograde(){
		   if (this.vitesse > 0) {
		      this.vitesse--;
		   }
		  }
		public boolean estPointMort() {
		    return (this.vitesse==0);
		    /*
		    équivalent à 
		     if (this.vitesse==0) {
		        return true;
		     }
		     else {
		        return false;
		     }
		    */
		 }

}
	

