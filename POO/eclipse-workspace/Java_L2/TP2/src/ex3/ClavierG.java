package ex3;
 
import javax.swing.*; 
/** Classe fournissant des fonctions de lecture et d'affichage dans une boite de dialogue en mode Graphique
 * @author Evelyne Vittori
  * 
 */
public class ClavierG
{ 	/** M�thode d'affichage d'une cha�ne de caract�res dans une boite de dialogue
	 * @param msg cha�ne de caract�res � afficher  
	 */public static void printG (String msg)   // affichage d'une chaine dans une boite de dialogue
	{
		//Affichage message
		JOptionPane.showMessageDialog(null,msg);
	}
	/** M�thode de lecture d'une cha�ne de caract�res dans une boite de dialogue
	 * @param msg message � afficher pour demander � l'utilisateur de saisir une cha�ne 
	 * @return cha�ne de caract�res lue 
	 */
	public static String lireStringG (String msg)   // lecture d'une chaine dans une boite de dialogue
	{ String ligneLue=null;
	    ligneLue= JOptionPane.showInputDialog(msg);
		return ligneLue; 
	}
	/** M�thode de lecture d'un r�el (float) dans une boite de dialogue
	 * @param msg message � afficher pour demander � l'utilisateur de saisir un r�el 
	 * @return r�el (float) lu 
	 */
	public static float lireFloatG (String msg)   // lecture d'un float dans une boite de dialogue
  { float x=0 ;   // valeur a lire
    try
    { String ligne_lue = lireStringG(msg) ;
      x = Float.parseFloat(ligne_lue) ;
    }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return x ;
  }
	/** M�thode de lecture d'un r�el (double) dans une boite de dialogue
	 * @param msg message � afficher pour demander � l'utilisateur de saisir un r�el 
	 * @return r�el (double) lu 
	 */
	public static double lireDoubleG (String msg)   // lecture d'un double dans une boite de dialogue
  { double x=0 ;   // valeur � lire
    try
    { String ligne_lue = lireStringG(msg) ;
      x = Double.parseDouble(ligne_lue) ;
    }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de saisie ***") ;
      System.exit(0) ;
    }
    return x ;
  }
	/** M�thode de lecture d'un entier (int) dans une boite de dialogue
	 * @param msg message � afficher pour demander � l'utilisateur de saisir un entier 
	 * @return entier (double) lu 
	 */
  public static int lireIntG (String msg)         // lecture d'un int dans une boite de dialogue
  { int n=0 ;   // valeur � lire
    try
    { String ligne_lue = lireStringG(msg) ;
      n = Integer.parseInt(ligne_lue) ;
      }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de saisie ***") ;
      System.exit(0) ;
    }
    return n ;
  }
  /** Programme de test de la classe ClavierG
   */
   public static void main (String[] args)
  { 
    double x ;
    x = ClavierG.lireDoubleG("Donnez un r�el (double) : ") ;
    System.out.println ("Merci pour " + x) ;
    
    /*int n  ;
    n = ClavierG.lireIntG("Donnez un entier : ") ;
    System.out.println ("Merci pour " + n) ;
    
    String s  ;
    s = ClavierG.lireStringG("Donnez une cha�ne de carat�res : ") ;
    System.out.println ("Merci pour " + s) ;*/
 }
}

