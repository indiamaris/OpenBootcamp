public class Main {
	public static void main(String[] args) {
		int resultado = 0;
		resultado = suma(10, 20, 30);
		System.out.println(resultado);
	}

	public static int suma(int param1, int param2, int param3) {
		return param1 + param2 + param3;
	}
}


public class Main {
	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.incrementarPuerta();
		System.out.println(miCoche.total_puertas);
	}
}

class Coche {
	int total_puertas = 0;

	public void incrementarPuerta() {
		this.total_puertas++;
	}
}
