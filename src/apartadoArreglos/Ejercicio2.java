package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// ENTRAD DE DATOS CON SCANNER 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES 
		int numero[] = new int[5] ;
		
		// RESOLUCION DE UN PROBLEMA +
		
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.println("Introduce un número");
			System.out.println( ( i + 1 ) +  "ª" + "Número" );
			numero[i] = sc.nextInt();
		}
		
		for( int i = 0 ; i < 5 ; i++) {
			System.out.println(numero[i]);		
			}
	}

}
