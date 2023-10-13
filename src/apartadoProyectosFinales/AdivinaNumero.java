package apartadoProyectosFinales;

import javax.swing.JOptionPane;

public class AdivinaNumero {
	
	/* 
	 *  Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y 
	 *  luego ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. 
	 *  El proceso termina uando el usuario acierta y mostrar el número de intentos.
	 *     
	 */
	
	
	private void JuegoAdivinar() {
		
		int numeroSecreto ;
		int contador = 0 ;
		int NumeroAleatorio = (int) (Math.random() * 100);
		System.out.println(NumeroAleatorio);
		while(true){
			contador += 1 ;
			int numeroJugador = Integer.parseInt(JOptionPane.showInputDialog("En que numero estoy pensando"));
			if ( numeroJugador == NumeroAleatorio ) {
				JOptionPane.showMessageDialog(null, "LO ADIVINASTE !!");
				JOptionPane.showMessageDialog(null, "Lo has intentado " + contador + " Veces") ;
				break ;
				
			} else if( NumeroAleatorio > numeroJugador ) {
				JOptionPane.showMessageDialog(null, "El numero es más grande  !!");
			} else {
				JOptionPane.showMessageDialog(null, "El numero es más pequeño !!");
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		AdivinaNumero objeto = new AdivinaNumero();
		objeto.JuegoAdivinar();
		
		
	}

}
