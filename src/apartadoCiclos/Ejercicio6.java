package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		
		/* 8)
		 * Pedir un número N, y mostrar todos lus números del 1 al N. 
		 * 
		 */
		
		int num  ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero"); // PEDIMOS EL NUMERO 
		num = sc.nextInt();
		for ( int i = 1  ; num > i ; i++ ) {
			System.out.println(i);
			
		}
	

	}
}