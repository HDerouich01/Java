package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		// ENTRADA DE DATOS
			Scanner sc = new Scanner(System.in) ;
			
		// DECLARACION DE VARIABLES 	
			
			float numeros[] =  new float[5],  mediaPositivos, mediaNegativos;
			int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0, contador = 0 ;
			
			for( int i = 0 ; i < 5 ; i++  ) {
				System.out.println("Introduce 5 numeros ");
				System.out.println((i + 1 ) + "ª" + "Numero");
				numeros[i] = sc.nextFloat();
				
				if (numeros[i] > 0) { 
					contadorPositivos += numeros[i] ;
					contador ++ ;
				} else if( numeros[i] < 0) {
					contadorNegativos += numeros[i];
					contador ++ ;
					
				} else if (  numeros[i] == 0 ) {
					contadorCeros ++ ;
				}
				
				
			}
			
			// Media de los positivos 
			
			if(contadorPositivos == 0) {
				System.out.println("\n No se puede realizar no has introduciod ningún dato ");
			} else  {
				System.out.println("\n La media de los numeros positivos es -> " + contadorPositivos / contador );
			}
		
			
			if(contadorNegativos == 0) {
				System.out.println("\n No se puede realizar no has introduciod ningún dato ");
			} else  {
				System.out.println("\n La media de los numeros negativo es -> " + contadorNegativos / contador );
			}
		
			System.out.println("\n EL numero de 0 que has introducido -> " + contadorCeros );
	}

}
