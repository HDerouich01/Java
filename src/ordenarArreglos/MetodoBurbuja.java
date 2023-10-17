package ordenarArreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		// ENTRADA DE DATOS 
		
		Scanner sc = new Scanner(System.in);
		
		// RECOGIDA DE DATOS 
		
		int  arreglo[] ;
		int nElementos , aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero")) ;
		
		arreglo = new int[nElementos] ;
		
		for( int i = 0 ; i < nElementos; i++) {
			
			System.out.println("Digite los números : " + ( i +1 ));
			arreglo[i] = sc.nextInt() ;
			
		}

		// ORDENAMOS EL ARREGLO UTILIZANDO EL MÉTODO BURBUJA 
		
		for ( int i = 0 ; i < (nElementos -1 ); i ++  ) {	// EL PRIMER FOR NOS SIRVER PARA SABER EL PROGRAMA CUANTAS VUELTAS TIENE QUE DAR 
															// Tenemos que utilizar dos iteradores 
			
			for ( int j = 0 ; j < (nElementos - 1); j++) {
				if ( arreglo[j] > arreglo[ j + 1] ) // SI EL NÚMERO ACTUAL > NUMERO SIGUIENTE  INTERCAMBIAMOS LOS VALORES 
				{
					aux = arreglo[j]; // GURDAMOS EL VALOR INCIAL 
					arreglo[j] = arreglo[ j + 1 ] ; // GUARDAMOS EL VALOR SIGUIENTE 
					arreglo[ j + 1 ] = aux ; // GURDAMOS EL VALOR ANTERIOR 
				}
			}
			
			
		}
	
		// Mostramos el arreglo de forma creciente 
		
					for( int i = 0 ; i < nElementos ; i++ ) {
						System.out.println( "\n " + arreglo[i] + " - ");
					}
					
					
		
					
		// Mostramos el arreglo de forma decreciente 
					
					for( int i =( nElementos - 1 ) ; i >= 0 ; i-- ) {
						System.out.println( "\n" + arreglo[i] + " - ");
					}
	}

}
