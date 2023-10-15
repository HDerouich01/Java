package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// ENTRADA DE DATOS 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES 
		
		int numeros[] = new int[10];
		
		// RESOLUCION DE LOS EJERCICIO 
		
		for( int i = 0 ; i < 10 ; i++) {
			
			System.out.println("Introuduce un numero");
			System.out.println("Numero" + (i + 1) + "ª" );
			numeros[i] = sc.nextInt();

		}
		
		// MOSTRAMOS LOS DATOS 
		
		System.out.println("\n El primer valor es --> " + numeros[0]);
		System.out.println("\n El segundo valor es --> " + numeros[1]);
		System.out.println("\n El tercero valor es --> " + numeros[2]);
		System.out.println("\n El penúltimo valor es --> " + numeros[8]);
		System.out.println("\n El último valor es --> " + numeros[9]);
		

	}

}
