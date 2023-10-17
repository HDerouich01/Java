package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// ENTRADA DE DATOS 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACIÓN DE VARIABLES 
		
		int tablaUno [] = new int [10] ;
		int tablaDos [] = new int [10] ;
		int tablaTres [] = new int [20] ;
		int  j = 0 ;
		boolean creciente = true ;
		
		// RECODIDA DE DATOS 
		
		do {
			
			// RECOGIDA DE DATOS 
			
			for (  int i = 0 ; i < 10 ; i++  ) {
				System.out.println("TABLA 1 - DIGITE UN NUMERO");
				System.out.print( "Numero : " + (i + 1) + " : " );
				tablaUno[i] = sc.nextInt() ;
			}
			
			// COMPROBACIÓN SI ESTAN LOS NÚMEROS ORDENADOS TABLA 1 
			
			for (  int i = 0 ; i < 9 ; i++  ) {
				
				if( tablaUno[i] > tablaUno [ i + 1] ){
					creciente = false ;
					break ;
					
				} 
				
			}

			// RECOGIDA DE DATOS 
			
			for (  int i = 0 ; i < 10 ; i++  ) {
				System.out.println("TABLA 2 - DIGITE UN NUMERO");
				System.out.print( "Numero " + (i + 1) + " : " );
				tablaDos[i] = sc.nextInt() ;
			}
			
			// COMPROBACION SI ESTAN LOS NÚMEROS ORDENADOS TABLA 2 
				for (  int i = 0 ; i < 9 ; i++  ) {
				
				if( tablaDos[i] > tablaDos [ i + 1] ){
					creciente = false ;
					break ;
					
				} 
				
			}
			
				// INFORMÁCION USUARIO 
				
				if( creciente = false ){
					 
					System.out.println("Los números deben estar ordenados de forma creciente");
					System.out.println("Digite de nuevo los números");
					break ;
					
				} 
				
				// LLENANDO DE LOS ARREGLOS 
				
				// VARIABLE J PARA ITERAR SOBRE EL TERCER BUCLE 
				
				
				for (  int i = 0 ; i < 10 ; i++  ) {
					tablaTres[j] = tablaUno[i] ;
					j++ ;
				}
				
				for (  int i = 0 ; i < 10 ; i++  ) {
					tablaTres[j] = tablaDos[i] ;
					j++ ;
				}
				
				
			
			
		}while( creciente == true );
		
		
		
		
		
		for( int i = 0 ; i < 20 ; i ++ ) {
			System.out.println( " - "  + tablaTres);
		}
		
		
	}

}
