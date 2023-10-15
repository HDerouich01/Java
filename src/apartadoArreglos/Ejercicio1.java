package apartadoArreglos;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		String[] nombres  = new String[3]; // ARRAY DE TIPO STRING CON UN TAMAÑO DE 3 POSICIONES 0,1,2
		
		nombres[0] = "Hamza" ;			// ASIGNAMOS DE FORMA MANUAL LOS VALORES EN CADA POSICION 
		nombres[1] = "Paco" ;
		nombres[2] = "Alberto" ;
		
		for( int i = 0 ; i <= nombres.length ; i++ ) { // CON UN BUCLE FOR ITERAMOS SOBRE NOMBRES[] -> .LENGTH TAMAÑO
			System.out.println(nombres[i]);	// Y MOSTRAMOS EL VALOR DE LA POSICION DE I DENTRO DE LA VARIABLE NOMBRES	
		}
		
	}
 
}
