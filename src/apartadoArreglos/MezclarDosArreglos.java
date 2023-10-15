package apartadoArreglos;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MezclarDosArreglos {

	public static void main(String[] args) {
		
		// DECLARACION DE VARIABLES - ARRAYS
		int iteradorTablaC = 0 ;
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		int tabla3[] = new int[20];
		
		// ENTRADA DE DATOS 
		
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS LOS 1O PRIMEROS DATOS DE LA TABLA 1
		
		for( int i = 0 ; i < 10 ; i++) {
			System.out.println("Numeros tabla 1");
			System.out.println("Numero" + (i +1) + "º");
			tabla1[i] = sc.nextInt();
			tabla3[iteradorTablaC] = tabla1[i];
			
		}
		
		// PEDIMOS LOS 1O PRIMEROS DATOS DE LA TABLA 2
		
		for( int i = 0 ; i < 10 ; i++) {
			System.out.println("Numeros tabla 1");
			System.out.println("Numero" + (i +1) + "º");
			tabla2[i] = sc.nextInt();
			tabla3[iteradorTablaC] = tabla1[i];
		}
		
		for(int i : tabla3) {
			System.out.println(i);
		}
		
		// MEZCLAR LAS TABLAS EN UNA TERCERA 1A - 1B - 2A - 2B etc....
		// ITERADOR I PARA A - B 
		// ITERADOR J PARA C 
		
		

		for( int i = 0 ; i < 10 ; i++) {
			tabla3[iteradorTablaC] = tabla1[i] ; // COPIAS DA LA TABLA1 ELEMENTO A 
			iteradorTablaC ++ ;
			tabla3[iteradorTablaC] = tabla2[i] ; // COPIAS DA LA TABLA2 ELEMENTO A 
			iteradorTablaC ++ ;
		}
		
		for( int i = 0 ; i < 20 ; i++ ) {
			System.out.println(" * " + tabla3[i]);
		}
		
	}
}