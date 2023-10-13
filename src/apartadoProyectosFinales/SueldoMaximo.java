package apartadoProyectosFinales;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class SueldoMaximo {

	public static void main(String[] args) {
		
		// DECLARACION DE VARIABLES
		int numero , maximo= 0  ;
		float sueldo = 0, contadorSueldo = 0  ;		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		for ( int i = 1 ; i <= numero ; i++   ) {
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			contadorSueldo += sueldo ;
			if ( sueldo > maximo) {
				maximo = (int) sueldo ;
			}
			
			
			
			}
			
			
			JOptionPane.showMessageDialog(null, "El sueldo Maximo es -> " + maximo );
		}
		
		
	}


