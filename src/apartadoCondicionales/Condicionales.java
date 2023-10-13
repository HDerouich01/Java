package apartadoCondicionales;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		//  ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio de la compra ");
		float precioCompra = sc.nextFloat();
		if ( precioCompra > 300 ) {
			float precioDescuento = (precioCompra * 0.20f) -  precioCompra ;
			System.out.println("\n Se le aplicado un descuento del 20% de sucompra ");
			System.out.println("\n Su compra final es de: -> " + precioDescuento );
		} else {
			System.out.println("No tiene descuento tienes que superar los 300$ para poder aplicarle descuento");
		}

	}

}
