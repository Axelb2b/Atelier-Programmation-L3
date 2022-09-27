package ex2;
import java.util.concurrent.*;

public class NbMystere {
	private int valeur;
	private int valeurMax;
	
	
	public NbMystere(int valeurMax) {
		this.valeurMax = valeurMax;
		this.generer();
	}
	//
	
	
	//
	
	private void generer() {
		this.valeur = ThreadLocalRandom.current().nextInt(0, valeurMax + 1);
		
	}
	
	public boolean testProp(int prop) {
		if (prop == valeur) {
			return true;
		}else {
			if(prop<valeur) {
				System.out.println("le nombre Mystère est plus grand");
				return false;
			}else {
				System.out.println("le nombre Mystère est plus petit");
				return false;
			}
		}
	}

}
