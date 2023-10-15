package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		// Entrada de datos 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACIÓN DE LAS VARIABLES 
		
		int numeros [] = new int[10] ;
		
		boolean creciente = false, decreciente = false ;
	
		
		// PEDIMOS LOS DATOS 
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.println("INTRODUCE UN NUMERO");
			System.out.print("Numero:" + (i +1) + " --> " );
			numeros[i] = sc.nextInt();
			
		}
		
		// COMPROBAMOS SI ES CRECIENTE O DECRECIENTE 
		
		for ( int i = 0 ; i < 9 ; i++) {
			
			if(  numeros[i] < numeros[ i + 1] ){ // CRECIENTE COMPROBAMOS QUE I ES MENOR QUE EL SIGUIENTE NÚMERO  1-2-3-4-5-
				creciente = true ;
			}
			
			if( numeros[i] > numeros[ i + 1 ] ) { // DECRECIENTE COMPROBAMOS QUE I ES MENOR QUE EL SIGUIENTE NÚMERO  7-2-3-4-5-
				decreciente = true ;
			}
			
			
		}
		
			if ( creciente == true && decreciente == false ) { // 1 - 2 - 3 - 4 ....
				System.out.println("\n La serie es creciente ");
			} else if( decreciente == true && creciente == false ) { // 10 - 9 - 8 - 7 ..... 
				System.out.println("\n La serie es decreciente ");
			} else if ( creciente == true && decreciente == true ) { // 10 - 2 - 8 - 7 ... 
				System.out.println("\n La serie esta desordenada  ");
			} else if ( creciente == false && decreciente == false ) {
				System.out.println("\n Todos los numeros de la serie son iguales   "); // 2 - 2 - 2 - 2 - 2 - 2
			}
		
		
		
	}
}
