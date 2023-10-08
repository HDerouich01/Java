package ApartadoDos;

import java.util.Scanner;

public class Multiplos {
	
	public static void main(String[] args) {
		
		// MULTIPLOS DE 10
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducu un numero");
		int num = sc.nextInt();
		if( num%10 == 0 ) {
			System.out.println("Es multiplo de 10");
		} else {
			System.out.println("No es multiplo de 10");
		}
		
		// ES NUMERO PAR
		
		System.out.println("Introduce un segundo numero");
		int num2 = sc.nextInt();
		if( num2%2 == 0 ) {
			System.out.println("Es un Número Par ");
		} else {
			System.out.println("No es un numero Par");
		}
		
		// NUMERO IMPAR 
		System.out.println("Introduce un segundo numero");
		int num3 = sc.nextInt();
		if( num3 != 0 ) {
			System.out.println("Es un Número Impar ");
		} else {
			System.out.println("Es un Número Par ");
		}
		
	}

}
