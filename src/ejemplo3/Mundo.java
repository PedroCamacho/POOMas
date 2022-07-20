package ejemplo3;

public class Mundo {

	public static void main(String[] args) {
		Humano ser1 = new Humano ("Antonio");
		System.out.println(ser1);
		Humano ser2 = new Humano ("Esther");
		System.out.println(ser2);
		ser1.crecer();
		System.out.println(ser1);
	}
}
