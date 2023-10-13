package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		// DECLARACION DE LAS VARIABLES

		int numero  , sumaPositovo = 0 , sumaNegativo = 0, contadorPositovos = 0 , contadorNegativos = 0,
			contador_ceros = 0	;

		float mediaPositivo = 0, mediaNegativos = 0  ;

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
			if( numero == 0  ) { // SI EL NUMERO ES CERO 
				contador_ceros ++ ; // AUMENTAMOS EL CONTADOR DE CEROS EN 1
			} else if  ( numero > 0 ) { // ES POSITIVO
				sumaPositovo += numero ; // SUMA ITERATIVA DE NÚMEROS
				contadorPositovos++ ;
				 mediaPositivo = (float)sumaPositovo / contadorPositovos ;
				
			} else {
				sumaNegativo += numero ;
				contadorNegativos ++ ;
				mediaNegativos = (float)sumaNegativo / contadorNegativos ;
			}
			
		}
		
		// TRATIMIENTO  DE LOS POSITIVOS 
		
		if( contadorPositovos == 0 ) {
			System.out.println("No has introducido ninguna valor positivo");
		} else {
			System.out.println("\n la media de los Positivos es -> " + mediaPositivo );
		}
		
		
		// TRATAMIENTO DE LOS NEGATIOVOS 
		
		if( contadorNegativos == 0 ) {
			System.out.println("No has introducido ninguna valor positivo");
		} else {
			System.out.println("\n la media de los Negativos es -> " + mediaNegativos );
		}
		
		//  TRATAMIENTO DE LOS CEROS
		
		System.out.println("\n El número de 0 que has introducido es de " + contador_ceros );
		
	}

}
