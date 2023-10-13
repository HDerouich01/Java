package apartadoCiclos;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// PEDIMOS NÚMEROS HASTA QUE SE TECLLE UNO NEGATIVO, Y MOSTRAR CÚANTOS NUMEROS SE HA INTRODUCIDO
		
		int num ;
		
		while(true) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			if( num < 0 ) {
				System.out.println("Es un numero Negativo");
				break;
			}
			
			System.out.println("El numero que has introducido es" + num);
		}
		
	}
	
	
}
