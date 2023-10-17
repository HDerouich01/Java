package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		// ENTRADA DE DATOS 
		
		Scanner entrada = new Scanner(System.in);
		
		
		// DECLARACIÓN DE VARIABLES 
		
		int arreglo [] = new int[10], numero, sitio_numero = 0 , j = 0 ;
		
		boolean entre_0_9 = true ;
		
		// LLENAMOS EL BUCLE Y COMPROBAOS QUE ESTA ENTRE LOS 10 ELEMENTOS
		do {
			
			for ( int i = 0 ; i < 10 ; i++) { // LLENAMOS EL BUCLE 
				
				System.out.println("Digite un Numero");
				System.out.print("Numero: " + ( i + 1) + " : " );
				arreglo[i] = entrada.nextInt() ;
			}
			
			for ( int i = 0 ; i < 9 ; i++) { // COMPROBAMOS QUE ESTA ENTRE 0 - 9 
				
				if( arreglo[ i ] > 9 ) {
					entre_0_9 = false ;
					break ;
				}	
			}
			
			if ( entre_0_9 == false) {
				System.out.println("El rango de números es entre 0 - 9");
				System.out.println("Vuelve a introducir los números");
			}
			
			System.out.println("Indica el número que quieres eliminar");
			numero = entrada.nextInt() ;
			
			if( numero > 9 ) {
				System.out.println("Vuelve introducir el numero");
				numero = entrada.nextInt() ;
			
			} else {
				
				while( arreglo[j] < numero && j<9 ) {
					sitio_numero ++ ;
					j ++ ;
				}
				
				for ( int i = 8 ; i > sitio_numero ; i-- ) {
					arreglo[ i + 1 ] = arreglo[i] ;
				}
				
				
				for( int i = 0 ; i < 9 ; i++ ) {
					System.out.print( i + " - " );
				}
			}
			
		}while( entre_0_9 = false );
		
			
		

	}

}
