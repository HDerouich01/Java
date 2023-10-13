package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		// PIDE UN NÚMERO ( QUE DEBE ESTAR ENTRE 0 Y 10) Y MOSTRAR LA TABLA DE MULTIPLICAR DE DICHO NÚMERO
		
		// Declaración de variables 
		
		int numero ;
		
		// Entrada de datos Scanner 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un núemero");
		 numero = sc.nextInt();
		
		for(int i = 1 ; i < 10 ; i ++ ) {
			if(numero > 10 ) {
				System.out.println("El número es mayor que 10");
				break ;
			} else {
				System.out.println("TABLA DE " + numero );
				System.out.println("\n" + numero + " x " + i  + " = " + numero * i );
			}
			
			
		}
		
		
		
	}

}
