package ApartadoDos;

import java.util.Scanner;

public class CalificacionEstudiante {
	
	public static void main(String[] args) {
		
		// SCANNER ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACIÓN DE VARIABLES: [  CALIFICACIONES BASADAS EN RENDIMIENTO ACADÉMICO ]
		
		double participacion ;
		double primerExamenParcial;
		double segundoExamenParcial;
		double examenFinal;
		
		// ASIGNACION DE VARIABLES
		
		System.out.println("CALCULAR NOTAS DEL ALUMNO");
		System.out.println("---------------------------");
		
		System.out.println("Participacion del alumno");
		participacion = sc.nextDouble();
		System.out.println("Nota del primer examen parcial");
		primerExamenParcial = sc.nextDouble();
		System.out.println("Nota del segundo examen parcial");
		segundoExamenParcial = sc.nextDouble();
		System.out.println("Nota final examen parcial");
		examenFinal = sc.nextDouble();
		
		System.out.println("---------------------------");
		
		
		// LOGICA DEL PROGRAMA; 
		
			double participacioNota = ( participacion * 10 ) /100 ; // *=0.10d
			double primerExamenParcialNota = ( primerExamenParcial * 25 ) /100 ; // *=0.25d
			double segundoExamenParcialNota = ( primerExamenParcial * 25 ) /100 ; // *=0.25d
			double examenFinalNota = ( primerExamenParcial * 40 ) /100 ; // *=0.40d
			
			int notaFinalAlumno = (int)participacioNota + (int)primerExamenParcialNota + (int)segundoExamenParcialNota + (int)examenFinalNota ;
			
		// FINAL PROGRAMA
			
			System.out.println("La nota final del alumnno es: -> " + notaFinalAlumno);
		
		
		
		
		
		
	}

}
