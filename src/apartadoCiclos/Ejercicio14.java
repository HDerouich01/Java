package apartadoCiclos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//DECLARACION DE VARIABLES 
		
		int  contadorAprobados = 0, contadorCondiciondados = 0, contadorSupensos = 0 ;
		float nota ;
		
		// ENTRADA DE DATOS 
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 1 ; i <= 6 ; i++  ) {
			
			do {
				
			
			 nota = Integer.parseInt(JOptionPane.showInputDialog( "INTROUDUCE TU NOTA " + i  +"ª" ));
			 
			 if( nota > 5 ) {
				 contadorAprobados++;
			 } else if (  nota < 5  ) {
				 contadorSupensos++;
			 } else  {
				 contadorCondiciondados ++ ;
			 }
			 
			} while( nota > 10 || nota < 0 ); // COMPROBAMOS QUE ESTA EN EL INTERVALO 0 - 10 
			
			
		}
		
		System.out.println("\n La cantidad de alumnos que aprobado son ->  "+ contadorAprobados );
		System.out.println("\n La cantidad de alumnos que han supendido son ->  "+ contadorSupensos );
		System.out.println("\n La cantidad de alumnos condicionados son ->  "+ contadorCondiciondados );

	}

}
