package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		int suma = 0 ;
		for ( int i = 1 ; i <= 10 ; i++ ) {
			
			Scanner sc = new Scanner(System.in); //ENTRADA DE DATOS
			// PEDIDA DE DATOS
			System.out.println("Introduce un numero");
			int num = sc.nextInt();
			if ( i == 10 ) {
				System.out.println("La suma total de los número es " + (i += suma) );
				break ;
			}
			
			
		}
		
	}

}
