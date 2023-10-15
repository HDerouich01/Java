package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args ) {
		
		// ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACIÓN DE VARIABLES 
		
		int numeros [] = new int[10], posicion, ultimo, tamaño  ;
		
		// RECODIGA DE DATOS 
		
		System.out.println("Indicas las posiciones");
		posicion = sc.nextInt() ;
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			System.out.println("Digite un número");
			System.out.print((i + 1) + "ª :");
			numeros[i] = sc.nextInt();
		}
		
		
		
		
		for( int i = 0 ; i <= posicion ; i++ ) {
			ultimo = numeros[9];
			for( int j = 8 ; j >= 0 ; j-- ) {
				numeros [ i + 1 ] = numeros[i];
			
			}
			

			
			
		}
		
		for ( int i : numeros) {
			System.out.println(i);
		}
		
		
	}

}
