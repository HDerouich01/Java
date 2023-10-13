package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		// ENTRADA DE DATOS --> SCANNER
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES 

		int contador = 0, contadorMayorSueldo = 0;
		float sueldo  ;
		float sumaSueldos = 0 ;
		for (int i = 1; i <= 10; i++) {
			System.out.println("INTRODUCE TUS SUELDOS");
			sueldo =  sc.nextInt();
			if (sueldo >= 1000) { // SI EL SUELDO ES MAYOR QUE 1000 INCREMENTAMOS EL CONTADOR A 1
				contadorMayorSueldo ++ ;
			} 
			
			sumaSueldos += sueldo  ;
				
		}
		
		//  TRATAMIENTO DE LOS SUELDOS 
		
			if ( contadorMayorSueldo == 0 ) { // SI CONTADOR ES IGUAL A 0 NO HAY SUELDOS MAYORES QUE 0
				System.out.println("NO HAY SUELDOS MAYORES DE 1000");
			} else {
				System.out.println("La suma de tus sueldos ha sido de -> " + sumaSueldos );
				System.out.println("TIENES " + contadorMayorSueldo + " Sueldos  Mayores de 1000$ " );
			}
		

	}
	
	

}
