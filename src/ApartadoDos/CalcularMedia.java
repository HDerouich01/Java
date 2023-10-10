package ApartadoDos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcularMedia {
	
	public static void main(String[]args) {
		
		// PROGRAMA CALCUALR MEDIA EXAMENES
		
		// VAMOS A PEDIR TRES NOTAS DE UN USUARIO Y LAS SUME .
		
		try (Scanner sc = new Scanner(System.in)) {
			
			// ARRAY LIST ALMACENA LOS NOTAS DE LOS ALUMNOS 
			List<Float> notasAlumno = new ArrayList<Float>();  // ALMACNAMOS LAS NOTAS EN EL ARRAY PARA MAS TARDE TRABAJAR CON ELLAS 
			
			// MENU NOTAS
			System.out.println("Calcular la media de tus Notas: ");
			System.err.println("!!No se pueden añadir mas de 10 EXAMENES!!");
			System.out.println("--------------------------------");
			
			System.out.println("Cuantos Examens habeis Realizado: ");
			
			int examenesRealizados = sc.nextInt();
			
			
			
			// BUCLE PARA PEDIR TANTAS NOTAS COMO EXAMENS SE HAYAN HECHO. !! NO SE PUEDEN INGRESAR MAS DE 10 EXAMENS
			int  i = 0;
			while( i < examenesRealizados ) {
				if ( examenesRealizados > 10 ) {
					System.err.println("No puedes ingresar mas de 10 examenes");
					break;
					
				} else {
					System.out.println("Introduce tus notas ");
					float notasExamenes = sc.nextFloat();
					notasAlumno.add(notasExamenes);
					i++;
				} 
				
				
			}
				
			// REALIZAMOS LA MEDEMIA USANDO FORECH RECORRIENDO LOS ELEMENTOS PARA MÁS TARDE SUMARLOS Y HACER LA MEDIA 
			
			float suma = 0 ;
			for( float a : notasAlumno ) {
				suma = suma + a ;
			}
			
			System.out.println("Tu nota media es: -> " + suma/notasAlumno.size());
		}
		
		
	}
}