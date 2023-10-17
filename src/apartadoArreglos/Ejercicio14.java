package apartadoArreglos;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		/*
		 * LEER 10 NÚMEROS ENTEROS ORDENADOS CRECIENTE MENTE . LEER N Y BUSCARLO EN LA
		 * TABLA. LEER N Y BUSCARLO EN LA TABLA. SE DEBE MOSTRAR LA POSICIÓN EN QUE SE
		 * ENCUENTRA. SI NO ES´TA, INDICARLO CON UN MENSAJE
		 * 
		 */

		// ENTRADA DE DATOS

		Scanner sc = new Scanner(System.in);

		// DECLARACION DE VARIABLES

		int numeros[] = new int[10];

		int buscarN;
		

		boolean creciente = true;

		// LLENAMOS EL ARRAY DE DATOS

		while (creciente == true) {

			for (int i = 0; i < 10; i++) {
				System.out.println("DIGITE UN NÚMERO " + (i + 1) + " ");
				numeros[i] = sc.nextInt();

			}

			for (int i = 0; i < 9; i++) {

				if (numeros[i] < numeros[i + 1]) {
					creciente = false;
					System.out.println("Debes introducir los números de forma ordenada. Gracias. Vuelve a digitarlos  ");
					break;

				}

			}

		}

		System.out.println("Que números quieres buscar ");
		buscarN = sc.nextInt(); // PEDIMOS EL DATO QUE QUEREMOS BUSCAR

		if (buscarN > numeros.length) { // COMPROBAMOS QUE EL NÚMERO NO SE HA MAYOR QUE EL TAMAÑO DEL ARRAY
			System.out.println("El número no puede ser mayor que el tamaño del Array ");
			
		} 

			// CREAMOS UN BUCLE WHILE PARA BUSCAR AL NÚMERO Y COMPROBAMOS SI ESTA O NO
		
			int i = 0;
			while (i < 10 && numeros[i] < buscarN) {

				i++;

			}

			if ( i == 10) {
				
				System.out.println("El número no esta en la lista comienza de nuevo ");
				
			} else {

				if (numeros[i] == buscarN) {
					System.out.println("El número esta en la posición " + i);
				}
				
				else {
					
					System.out.println("El número no ha sido encontrado");
					
				}

		}

		} 

}

