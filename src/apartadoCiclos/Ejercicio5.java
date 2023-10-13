package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		int numero, contador = 0, contadorMedia = 0, suma ; 
		float media = 0 ;
		
		/*
		 * Pedir números hasta que se introduzca uno negativo, y calcular media
		 * 
		 */
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un Numero");
			numero = sc.nextInt() ;
			 
			// COMPROBACION POSIVO - NEGATIVO
			
			if( numero < 0) { 
				System.out.println("ES NEGATIVO");
				if( contadorMedia > 0 ) {
					System.out.println("LA MEDIA DE LOS NUMEROS INTRODUCIDOS ES " + media   );
				} else {
					System.out.println("No se introdujo ningun valor");
				}
				
				break ;
				
			}
			
			
			suma = contador += numero ; //  SUMAR ITERATIVA ES DECIR NUM + NUM2 + NUM3
			media = (float) suma / contadorMedia++ ; // CALCULAMOS LA MEDIA 
			contadorMedia ++; // SUMA ITERATIVA POR CADA VALOR INTRODUCIDO ES 1 + 1 + + 1 -> CONCATENAR
			
			
			
		} 
		
	}
	

}
