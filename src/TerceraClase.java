import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit.Parser;

public class TerceraClase {
	
	private int sumarEnteros(int x, int y) {
	    int resultado =  x +  y;
	    return resultado;
	}
	
	private void NombreApellidos(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce tu nombre: -> ");
			String Nombre = sc.nextLine();
			System.out.println("Introduce tu edad: -> ");
			int Edad = sc.nextInt();
			

			if( Edad >= 18 ) { 
				 System.out.println("Si puedes acceder");
			} else {
				System.out.println("No puedes acceder;");
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		TerceraClase objeto = new TerceraClase();
		int resultado = objeto.sumarEnteros(5, 3);
		objeto.NombreApellidos();
		// JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
		
		
		Scanner entradaDatos = new Scanner(System.in);
		float numero1, numero2,suma,resta,mult,div,resto;
		System.out.println("Introduce dos números -> : ");
		numero1 = entradaDatos.nextFloat();
		numero2 = entradaDatos.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		mult = numero1 * numero2;
		div = numero1 / numero2;
		resto = numero1 % numero2;
		
		System.out.println("EL resultado de la suma es : -> " +suma);
		System.out.println("EL resultado de la resta es : -> " +resta);
		System.out.println("EL resultado de la multiplicación es : -> " +mult);
		System.out.println("EL resultado de la división es : -> " +div);
		System.out.println("EL resultado del Resto  es : -> " +resto);
		
		
		
	}

}
