package ApartadoDos;

import java.util.Scanner;

public class CalcularRaizCuadrada {
	
	
	public static void main(String[]args) {
		
		
		// SCANNER ENTRADA DE DATOS

		Scanner sc = new Scanner(System.in);

		// FORMULA ECUACION SEGUNDO GRADO -> ax^2 + bx + c = 0

		// int a ; // COEFICIENTE TÉRMINO CUADRATICO
		// int b ; // COEFICIENTE TÉRMINO LINEAL
		// int c ; // TERMINO CONSTANTE

		// ASIGNACION DE VARIABLES

		System.out.println("Calcular Raiz Cuadrada de Segundo Grado");
		System.out.println("----------------------------------------");

		System.out.println("Introduce A: COEFICIENTE TÉRMINO CUADRATICO");
		double a = sc.nextDouble();

		System.out.println("Introduce A: COEFICIENTE  TÉRMINO LINEAL");
		double b = sc.nextDouble();

		System.out.println("Introduce A: TERMINO CONSTANTE");
		double c = sc.nextDouble();

		System.out.println("----------------------------------------");

		// RESOLUCION DE LA ECUACION

		double valorRaiz = b * b - 4 * a * c;

		if (valorRaiz >= 0) {
			double raiz1 = (-b + Math.sqrt(valorRaiz)) / (2 * a);
			double raiz2 = (-b - Math.sqrt(valorRaiz)) / (2 * a);

			System.out.println("\n Las raizes son");
			System.out.println((raiz1));
			System.out.println((raiz2));

		} else {
			System.out.println("No hay raizes Reales");
		}

	}
}
