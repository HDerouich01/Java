package apartadoCiclos;

import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main(String[] args) {
		
		
		
		
		// ENTRADA DE DATOS SCANNER 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES 
		
		float calificaciones ;
		int contador = 0 ;
		
		boolean aprobadosSupensos = false ;
		
		for ( int i = 1 ; i <= 5 ; i++ ) {
			System.out.println("Introduce tus ultimas 5 notas " + i+ "ª");
			calificaciones = sc.nextInt();
			if( calificaciones < 5) {
				aprobadosSupensos = true ;
				contador ++ ;
			}
			
		}
		
		if( aprobadosSupensos == true ) {
			System.out.println("Hay examenes supenseso, el numero de supensos que hay es de -->  " + contador);
		}
		
	}
	

}
