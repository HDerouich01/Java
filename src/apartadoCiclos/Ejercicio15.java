package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		// Declaracion de variables
		
		int  numero ;
		boolean contadorNegativos = false; ;
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println("Introduce un número");
			 numero = sc.nextInt();
			 if( numero < 0)  {
				 contadorNegativos = true ;
			 }
		}
		
		if( contadorNegativos == true ) {
			System.out.println("Has introducido Números Negativos");
		} else {
			System.out.println("No has introducido Números negativos ");
		}
		
		
		
	}

}
