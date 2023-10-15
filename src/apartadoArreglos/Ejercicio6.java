package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main( String[] args ) {
		
		// ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES 
		
		int tablaUno[] = new int[12];
		int tablaDos[] = new int [12];
		int tablaTres[] = new int[24];
		
		int j = 0 ;
		
		
		// PEDIMOS LOS 12 ELEMENTOS DE LA TABLA 1
		
		for(int i = 0 ; i < 12 ; i++ ) {
			System.out.println("Introduce un número");
			System.out.println("Numero " + ( i + 1 ) + "ª" );
			tablaUno[i] = sc.nextInt();
			
		}
		
		// PEDIMOS LOS 12 ELEMENTOS DE LA TABLA 2
		
		for(int i = 0 ; i < 12 ; i++ ) {
			System.out.println("Introduce un número");
			System.out.println("Numero " + ( i + 1 ) + "ª" );
			tablaDos[i] = sc.nextInt();
			
		}
		
		// MEZCLAMOS LAS TABLAS 
		
		
		for( int i = 0 ; i < 12 ; i += 3  ) {
			
			tablaTres[j] = tablaUno[i] ; // Copiamos en la posicion 0 la posicion 0 de tablaUno
			tablaTres[j + 1 ] = tablaUno[ i + 1 ] ; // Copiamos en la posicion 1 la posicion 1 de tablaUno
			tablaTres[j + 3] = tablaUno[ i + 2 ] ; // // Copiamos en la posicion 2 la posicion 2 de tablaUno
			j += 3 ; 
			
			tablaTres[j] = tablaUno[i] ;
			tablaTres[j + 1] = tablaDos[ i + 1 ] ; 
			tablaTres[j + 2] = tablaDos[ i + 2 ] ;
			j += 3 ;
			
		}
		
		
		for( int i = 0 ; i < 24 ; i++  ) {
			System.out.println("\n ---------------");
			System.out.println( "\n" + tablaTres[i]);
		}
		
	}

}
