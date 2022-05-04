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
