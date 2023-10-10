package ApartadoCuatro;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio2 {
	public static void main(String[] args) {
		
		// int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero")); 
		int numero = 10 ;
		while ( numero >= 10) {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero")); 
			if ( numero > 0 ) {
				JOptionPane.showMessageDialog(null, "Es un numero POSITIVO");
			} else {
				JOptionPane.showMessageDialog(null, "Es un Negativo");
			} {
				if(  numero == 0 ) {
					JOptionPane.showMessageDialog(null, "fin");
					break ;
				}
			}
		}
	}
	
}
