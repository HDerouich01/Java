package apartadoArreglos;

import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		// ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE LAS VARIABLES 
		
		int tablaUno [] = new int[10], extra = 0, sitio_numero = 0 , j = 0;
		
		boolean creciente = true ;
		
		// RECOGIDA DE DATOS 
		
		do {
			// LLenando el arreglo 
			for(int i = 0 ; i < 5 ; i++) {
				System.out.println("Introduce un número" + ( i + 1 ));
				tablaUno[i] = sc.nextInt();
				
				
			}
			
			for ( int i = 0 ; i < 4 ; i++) {
			
				if ( tablaUno[i] < tablaUno[ i + 1 ]) { // Comprobamos si esta en forma creciente 
					creciente = true ;
					
				}
				
				if( tablaUno[i] > tablaUno[ i + 1] ) { // Comprobamos si es decreciente
					creciente = false ; 
					break ;

				}
			}
			
			if ( creciente == false  ) {
				System.out.println("Los valores introducidos deben estar ordenados en forma creciente");
				System.out.println("Vuelva a digitar los números");

			}
			
			
			
		} while( creciente == false );
		
		System.out.println("Digite un numero a insertar");
		extra = sc.nextInt();
		
		// POSICION DEL NÚMERO
		
		while ( tablaUno[j] < extra && j<5 ) {
			sitio_numero++;
			j++;
		}
		
		// TRSLADAMOS UNA POSICION EN EL ARREGLO A LOS ELEMENTOS QUE VAN DETRAS DEL NÚMERO
		
		for( int i = 4 ; i >= sitio_numero ; i-- ) {
			tablaUno [ i + 1 ] = tablaUno[i] ;
		}
		
		// insertamos el numero que el usario pueso 
		
		tablaUno[sitio_numero] = extra ;
		
		
		// Mostramos el arreglo 
		
		for( int i = 0 ; i < 6 ; i++ ) {
			System.out.print( tablaUno[i] + " - " );
		}
		
	}

}
