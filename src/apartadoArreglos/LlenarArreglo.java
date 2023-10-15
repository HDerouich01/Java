package apartadoArreglos;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LlenarArreglo {

	public static void main(String[] args) {
		
		// DECLARACIÓN DE VARIABLES
		
			int numeroElementos = 0, numero ;
		
		// ENTRADA DE DATOS 
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS AL USUARIO EL NÚMERO DE ELEMENTOS
		
		System.out.println("Cuantos Elementos vas introducir ");
		numeroElementos = sc.nextInt();
		
		int[] numeros = new int[numeroElementos]; // ARRAY DE NUMEROS CON EL TAMAÑO QUE INTRODUZCA EL USUARIO
		
		
		for( int i = 0 ; i < numeroElementos ; i++ ) { // BUCLE ME VA PEDIR TANTOS DATOS COMO TAMAÑO TENGA EL ARRAY
			System.out.println( (i + 1) +"ª" +" Introduce un numero" ); // PEDIMOS TANTOS DATOS COMO INDICA EL USARIO
			numeros[i] = sc.nextInt(); // ASIGNAMOS EL VALOR DE  I QUE ES EL VALOR QUE ITERA O PIDE LOS VALORES 
										// Y ACCEDMOS AL METODO SCANER PARA GUARDAR DENTRO DE NUMEROS TODOS LOS VALORES
										// QUE ESUCHE POR TECLADO . 
			
		}
		
		// MOSTRAMOS EL VALOR DEL ARRAY POR PANTALLA .
		
		System.out.println("\n los valores del array son");
		for( int i = 0 ; i < numeros.length ; i++ ) {
			System.out.println("\n -> " + numeros[i]);
		}
	}

}
