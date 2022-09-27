package ex2;

public class TestChien {
	public static void main(String[ ] args) {
		Chien Medor = new Chien("Medor","Labrador");
		Chien Rex = new Chien("Rex","Berger Allemand");
		System.out.println(Medor.getIdent());
		System.out.println(Rex.getIdent());
		System.out.println(Chien.getIdentMax());
	}

}
