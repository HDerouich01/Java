package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String [] args) {
		
		// ENTRADA DE DATOS 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACIÓN DE VARIABLES 
		
		int numeros [] = new int[10]; 
		boolean ordenados = true ;
		
		
		// RECOGIDA DE DATOS 
		
		System.out.println("Digite un número");
		
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.print("Número "  + (i + 1 ) + " : ");
			numeros[i] = sc.nextInt();
		}
		
		// DESPLAZAR LOS DATOS
		
		for ( int i = 8  ; i > 0 ; i-- ) { // AVANZAMOS UN POSICIÓN ABAJO EN EL ARREGLO 
			numeros[i + 1] = numeros [i] ;
			
		}
		
		int ultimo = numeros[9];
		
		// Mostrar el resultado 
		
		for ( int i : numeros ) {
			System.out.println(i);
		}
		
		System.out.println(ultimo);
	}

}
