import javax.swing.JOptionPane;

public class SegundaClase {
	
	public static void main(String[]args) {
		
		//Entrada y salida de datos con JoptionPane
		
		String user=  JOptionPane.showInputDialog("Introudce tu usuario");
		int password = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu contraseña"));
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		char genero = JOptionPane.showInputDialog("Introduce tu genero m(masuclino)-f(femenino)").charAt(0);
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura"));
		
		JOptionPane.showMessageDialog(null, "Tu usuarios es:"+user);
		JOptionPane.showMessageDialog(null, "Tu contraseña es:"+ password );
		JOptionPane.showMessageDialog(null, "Tu numero es:"+ numero );
		JOptionPane.showMessageDialog(null, "Tu genero es "+genero);
		JOptionPane.showMessageDialog(null, "Tu altura es:" + altura);
		
		}

	}
