package ApartadoTres;

import java.util.Scanner;

public class CondicionalesDos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce un segundo número");
		int num2 = sc.nextInt();
		System.out.println("Introduce un tercer número");
		int num3 = sc.nextInt();
		
		if ( num1 > num2 && num2 > num3 ) {
			System.out.println("El orden de mayor a menor es: ->  " + num1 + "  " + num2 + "  " + num3 );
		} else if ( num2 > num1 && num1 > num3 ) {
			System.out.println("El orden de mayor a menor es: ->  " + num2 + "  " + num1 + "  " + num3 );

		} else if ( num3 > num2 && num2 > num1  ) {
			System.out.println("El orden de mayor a menor es: ->  " + num3 + "  " + num2 + "  " + num1 );

		}
		
		
	}

}
