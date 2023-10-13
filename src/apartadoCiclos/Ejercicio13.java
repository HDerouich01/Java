package apartadoCiclos;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio13 {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES 
		int edadAlumnos , contadorEdad = 0,  contadormayorAltura = 0   ;
		float alturaAlumnos, mediaEdad = 0 , SumaAltura = 0, sumaEdad = 0 ;
		
		// SCANNER ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		
		// PEDIDAD DE DATOS CON UN BUCLE FOR 
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			
			// PEDIMOS LOS DATOS
			
			System.out.println("Edad alumno " + i );
			edadAlumnos = sc.nextInt();
			System.out.println("Altura alumno " + i );
			alturaAlumnos = sc.nextFloat();
			
			
			// SUMA ITERATIVA DE LA ALTURA Y EDAD 
			
			sumaEdad  += edadAlumnos ;
			SumaAltura += edadAlumnos ; 
			
		
			// Cantidad de mayores de 18 / alumnos que miden más de 1.75
			
			if( edadAlumnos >= 18 ) {
				contadorEdad ++ ;
			}
			
			if( alturaAlumnos >= 1.75 ) {
				contadormayorAltura ++ ;
			}
			
			
			
		}
		
		// SI HAY ALUMNOS MAYORES DE 18 O MAYORES DE 1.75
			
		if(contadorEdad == 0) {
			System.out.println("No hay alumnos mayores de 18 años");
		} else if ( contadormayorAltura == 0 ) {
			System.out.println("No hay alumnos que midan mas de 1.75");
		}
			
		
		System.out.println("\n La edad media de los alumnos es de " + sumaEdad / 5 );
		System.out.println("\n La edad altura media  de los alumnos es de " + SumaAltura / 5 );
		System.out.println("\n Hay  " + contadorEdad +  " Alumnos son mayores de 18 años " );
		System.out.println("\n Hay  " + contadormayorAltura +  " Alumnos que miden más de 1.70 centimetros " );


		
		
		
		

	}

}
