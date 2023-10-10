package ApartadoCuatro;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	
	
	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in);
		
		while (true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			if (num == 0) {
				JOptionPane.showMessageDialog(null, "FIN");
				break ;
			} else if (num%2 == 0) {

				JOptionPane.showMessageDialog(null, "Es un  número Par");

			} else {
				JOptionPane.showMessageDialog(null, "Es un  número Inpar");
			}

		}
	}
}
