package apartadoProyectosFinales;

import java.util.Scanner;

public class BuclesFor {

	public void TablasDeMultiplicar() {
		Scanner sc = new Scanner(System.in); // Entrada de datos 
		System.out.println("Introduce el número de la tabla de multiplicar: -> "); // Seleccion del dato 
		int NumeroMultpicar = sc.nextInt();
		for (int i = 1; i <= 10; i++) { //  Crear variable i si es mayor o igual que 10 para mostra 1*i etc....
			System.out.println("Tabla del " + NumeroMultpicar);
			System.out.println(NumeroMultpicar + " * " + i + " = " + NumeroMultpicar * i + "\n");
		}
	}

	public static void main(String[] args) {
		
		BuclesFor objeto = new BuclesFor(); // Objeto para llamar a la funcion 
		objeto.TablasDeMultiplicar(); // Invocamos la funcio 
		

	}
}