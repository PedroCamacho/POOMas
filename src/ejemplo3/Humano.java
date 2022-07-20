package ejemplo3;

public class Humano {
	private String nombre;
	private int edad;
	private static long poblacion;
	
	public Humano (String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		Humano.poblacion++;
	}
	
	public void crecer () {
		this.edad++;
	}

	@Override
	public String toString() {
		return "Población=" + Humano.poblacion + "[nombre=" + nombre + ", edad=" + edad + "]";
	}
}
