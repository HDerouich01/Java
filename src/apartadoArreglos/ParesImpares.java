package apartadoArreglos;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ParesImpares {
	
	public static void main(String args[]) {
		
		// ENTRADA DE DATOS
		
		Scanner entrada = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES
		
		
		int tabla[] = new int[10] ;
		int numero, contadorPares = 0, ContadorImpares = 0 ;
		
		// RECOGIDA DE DATOS 
		
		for( int i = 0 ; i < 10 ; i++ ) {
			System.out.println("Numero : " + ( i + 1 ));
			tabla[i] = entrada.nextInt() ;
		}
		
		// COMPROBACION DE PARES - IMPARES 
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			
			if( tabla[i] % 2 == 0 ) { // SI ES PAR AUMENTA EL CONTADOR Y SE LO PASAMOS COMO TAMAÑO AL ARRAY 
									  // PARA OCUPAR MENOS ESPACION DE MEMORIA 	
				contadorPares ++ ;
				
			} else {
				 
				ContadorImpares ++ ;
			}
			
			
		}
		
		// DECLARAMOS EL ESPACIO DE LOS ARRYS 
		 int tablaPares [] = new int [contadorPares] ;
		 int tablaImpares [] = new int [ContadorImpares] ;
		 
		 
		 // CREAMOS NUEVOS ITERADORES PARA RECORRER LOS NÚMEROS PARES - IMPARES 
		 
		 contadorPares = 0;
		 ContadorImpares = 0 ;
		 
		 // COMPROBAMOS SI SON PARES O IMPARES Y LOS PEGAMOS EN LAS TABLAS CORRESPONDIENTES 
			
			for ( int i = 0 ; i < 10 ; i++) {
				
				if( tabla[i] % 2 == 0 ) { // PARES
					  tablaPares[contadorPares] = tabla[i] ; 
					  contadorPares++ ;
					
					
				} else { // IMPARES
					tablaImpares[ContadorImpares] =  tabla[i] ; ;
					ContadorImpares++;
					
				}
								
			}
		
		
		
		
		for ( int i = 0 ; i < contadorPares ; i++) {
			System.out.println(  "\n Tabla Pares " +   " - " + tablaPares[i] );

			
		}
		
		for ( int i = 0 ; i < ContadorImpares ; i++) {
			System.out.println( "\n Tabla Impares"  + " - " + tablaImpares[i]);
			
		}
		
		
		
	}

}
