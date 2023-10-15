package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		// Entrada de datos 
		
		try (Scanner sc = new Scanner(System.in)) {
			int numeros[] = new int[5] ;
			
			// Resolucion del problema 
			
			for( int i = 0 ; i < 5 ; i++ ) {
				System.out.println("Introduce un numero");
				System.out.println((i + 1) + "ª" + "Numero");
				numeros[i] = sc.nextInt();
				
			}
			
			
			for( int i = 4 ; i >= 0 ; i--) {
				System.out.println(numeros[i]);
			}
		}
		
		
		

		
		
		
		
	}

}
