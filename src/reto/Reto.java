package reto;

import java.util.ArrayList;
import java.util.Scanner;
// La clase Humano está en el package ejemplo3
import ejemplo3.Humano;

public class Reto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList <Humano> miMundo = new ArrayList <> ();
		String nombre="";
		do {
			System.out.print("Introduce un nombre (fin para terminar): ");
			nombre=sc.nextLine();
			if (!nombre.equals("fin")) {
				miMundo.add(new Humano(nombre));
				for (Humano ser : miMundo) {
					ser.crecer();
				}
			}

		} while (!nombre.equals("fin"));
		for (Humano ser : miMundo) {
			System.out.println(ser);
		}
		sc.close();
	}
}
