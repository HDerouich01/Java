package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// FACTORIAL NUMERO
		
		int num, factorial = 1  ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que numero quieres factorizar");
		num = sc.nextInt();
		
		
		for( int i = 1 ; i <= num ;  i++ ) {
			factorial *= i ;
		}
		
		System.out.println("El factorial de " +  num  +  " ->  " +  factorial);
	}

}
