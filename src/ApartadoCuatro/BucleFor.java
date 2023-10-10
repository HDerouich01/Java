package ApartadoCuatro;

import java.util.Scanner;

public class BucleFor {
	
	public static void main(String[] args) {
		// BUCLE FOR 
		/*
		 * 		// FOR ( INICIALIZACION ; CONDICION ; AUMENTO O DECREMENTO ) {
		 * 	  			
		 * 				INTSTRUCCIÓN
		 * 		}
		 * 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("QUE TABLA QUIERES MOSTRAR ");
		int op = sc.nextInt();
		for ( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println("\n" + op + " * " + i  + " = " + op * i);
		}
		
	}
	
	
}
