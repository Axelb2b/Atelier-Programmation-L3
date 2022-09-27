package exprepacc;

public class Calcul {
	private int type;
	private double op1;
	private double op2;
	
	
	public Calcul(int type,double op1,double op2) {
		this.type = type;
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public boolean estjuste(int r) {
		switch(type){
		   
	       case 0: 
	           if(r == op1+op2) {
	        	   return true;
	           }else {
	        	   return false;
	           }
	   
	       case 1:
	           if(r == op1-op2) {
	        	   return true;
	           }else {
	        	   return false;
	           }
	   
	       case 2:
	           if(r == op1*op2) {
	        	   return true;
	           }else {
	        	   return false;
	           }
	       default:
	           System.out.println("Choisissez un type entre 0 et 2");
	           return false;
		
	}

    }
	public String toString() {
		switch(type){
		   
	       case 0: 
	        	   return this.op1 +" + "+this.op2+" = ?";
	       case 1:
	           return this.op1+" - "+this.op2+" = ?";
	   
	       case 2:
	    	   return this.op1+" * "+this.op2+" = ?";
	       default:
	           System.out.println("Choisissez un type entre 0 et 2");
	           return null;
	}
	
    }
	
	
}
