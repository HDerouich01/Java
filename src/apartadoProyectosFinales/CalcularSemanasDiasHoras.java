package apartadoProyectosFinales;

import java.util.Scanner;

public class CalcularSemanasDiasHoras {
	
	public static void main(String[] args) {
		
		// ENTRADA DE DATOS 
		
		Scanner  sc = new Scanner(System.in);
		
		// PEDIMOS LOS DATOS 
		
		System.out.println("Conversor de Horas a Semanas-Días-Horas");
		System.out.println("--------------------------------------");
		
		System.out.println("Introuduce el número de horas: ");
		int totalHoras = sc.nextInt();
		
		
		System.out.println("--------------------------------------");
		
		// CONVERSION 
		
		int totalSemanas = totalHoras / 168;
		int totalDias = totalHoras%168 / 24 ;
		int horas = totalHoras%24 ;
		
		// MOSTRAMOS EL RESULTADO POR PANTALLA
		
		System.out.println( totalHoras + " Equivale a: -> " + totalSemanas + " Semanas/ " + totalDias + " Dias /" + horas +  " horas "  );
		
		
		
		
	}

}
