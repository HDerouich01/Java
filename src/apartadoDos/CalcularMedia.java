package apartadoDos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalcularMedia {
	
	public static void main(String[]args) {
		
		// PROGRAMA CALCUALR MEDIA EXAMENES
		
		// VAMOS A PEDIR TRES NOTAS DE UN USUARIO Y LAS SUME .
		
		Scanner sc = new Scanner(System.in); // Scanner Entra de datos
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
		
		
		
		
		/*
		
		System.out.println("Cual ha sido tu primera Nota");
		float  numeroUno = sc.nextFloat();
		System.out.println("Cual ha sido tu primera Nota");
		float numeroDos = sc.nextFloat();
		System.out.println("Cual ha sido tu primera Nota");
		float numeroTres = sc.nextFloat();
		
		// SUMA DE LOS TRES NÚMEROS
		 
		 
		
		float resultado = (int)numeroUno + (int)numeroDos + (int)numeroTres ;
		
		int media = (int) (resultado / examenesRealizados) ;
		
		//RESULATADO POR PANTALLA DE LAS TRES SUMAS 
		
		System.out.println(" Tu nota media es  : -> " + "\n" + media );
		
		
	*/
		
	}
}