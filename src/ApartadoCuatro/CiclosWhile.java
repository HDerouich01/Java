package ApartadoCuatro;

public class CiclosWhile {

	private void Incrementar() {

		// Incrementamos con while

		// Inicializamos el contador a 1
		int i = 1;
		// Mientras que i se menor que 10
		while (i <= 10) {
			System.out.println(i); // Muestra en la pantalla 10 veces i
			i++; // Incrementamos el contador

		}

	}

	private void Decrementar() {

		// Decrementamos con while

		// Inicializamos el contador a 1
		int i = 10;
		// Mientras que i se menor que 10
		while (i <= 1) {
			System.out.println(i); // Muestra en la pantalla 10 veces i
			i--; // Incrementamos el contador

		}
	}

	public static void main(String[] args) {
		
		CiclosWhile objeto = new CiclosWhile();
		objeto.Incrementar();
		objeto.Decrementar();

	}

}