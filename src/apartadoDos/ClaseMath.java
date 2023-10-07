package apartadoDos;

import java.util.Scanner;

public class ClaseMath {
	public static void main(String[]args){
		
		/* Clase Math:
		 * Con ella podemos utilizar metodos o acciones matematicas por ejmplo:
		 * Raiz cuadra de un número
		 * Elevar un numero
		 * Sacar un numero aleatorio 
		 */
		
		// RAIZ CUADRA
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Indica el número el cual quieres sacar la raiz cuadrada: -> ");
			double NumeroRaizCuadrad = sc.nextInt(); //Para utilizar int debemos hacer la conversion a double
			
			double raiz1 = Math.sqrt(9); // TIPO DOUBLE
		//	int raiz2 = Math.sqrt(10); // Nos da error por que espera un double, para hacerlo tendriamos que hacer una converison
			int raiz3 = (int)Math.sqrt(10); // CONVERSION
			
			System.out.println(Math.sqrt(NumeroRaizCuadrad)); 
			
			/*
			 * Para utilizar el metodo de la raiz cuadrad el numero al cual que queramos 
			 * sacar la raiz cuadra debe ser de tipo dooble. El sqrt de la clase math debe ser de tipo 
			 * double
			 */
			
			
			// ELEVAR UN NUMERO
			// PASA LO MISMO QUE CON LA RAIZ CUADRADA LA BASE Y EL EXPONENTE DEBEN DE SER DE TIPO DOUBLE
			double base = 5, exponente = 2 ; // PODEMOS ELEVAR EL EXPONENTE A LA BASE QUE DESEEMOS
			double resultado = Math.pow(base, exponente);
			System.out.println(resultado);
			
			//REDONDEAR UN NUMERO
			
			double RedondearNumero = 4.56;
			long NumeroRedondeado = Math.round(RedondearNumero);
			System.out.println(NumeroRedondeado);
			
			/*
			 * SI QUEREMOS REDONDEAR UN NUMERO DOBLE LO DEBEMOS GUARDAN EN UN LONG 
			 * Y SI PASAMOS UN FLOAT DEBEMOS GUARDALO EN UN INT
			 * 
			 */
			
			// NUMERO ALEATORIO
			
			double numeroAleatorio = Math.random() * 3;
			System.out.println( (int)Math.floor(numeroAleatorio) );
			
		
	}
}
