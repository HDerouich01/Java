package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		// LEER UN NÚMERO Y MOSTRAR SU CUADRADO , REPETIR EL PROCESO HASTA QUE SE INTRODUZCA EL UN NÚMERO NEGATIVO
		
		
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int numero, cuadrado ;
			
			System.out.println("Introduce un número");
			 numero = sc.nextInt();
			while ( numero >= 0 ) {
				
				cuadrado = (int)Math.pow(numero, 2);
				System.out.println("El cuadrado de ese numero es" + cuadrado );
				
				System.out.println("Introduce un número");
				numero = sc.nextInt();
				
				} {
					System.out.println("El numero es menor que 0");
				}
			}
		}

}
