package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// ENTRADA DE DATOS 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE LAS VARIABLES 
		
		int numeros [] = new int[10], numero = 0, posicion ;
		
		// PEDIMOS LOS DATOS Y LOS ALMACENAMOS EN NUMEROS
		for ( int i = 0 ; i < 7 ; i++) {
			System.out.print( "Digite un número" + ( i +1 ) + " : " );
			numeros[i] = sc.nextInt();
		}
		
		// INDICAMOS LA POSICION Y EL NUMERO
		
		System.out.print("Indica una posicion -  NO PUEDE SER MAYOR QUE 10" + " :  " );
		posicion = sc.nextInt();
		System.out.print("Introduce un numero");
		numero = sc.nextInt();
	
		// RESOLUCION DEL EJERCICIO 
		
		//numeros[posicion] = numero ; 
		
		for( int i = 9 ; i > posicion  ; i-- ) { // Sé hara el desplazamiento hasta llegar a la posicion del usuario 
													// llegada a esa posicion habrá un valor nulo o 0
			numeros[i] = numeros [ i - 1 ] ; 
		}
		
		numeros[posicion] = numero ; // Y asignamos en la posición deseada el número que queremos 
		
		// COMPROBACION 
		
		for( int i : numeros ) {
			System.out.println(i);
		}
		
		

	}

}
