package ApartadoDos;

import java.util.Scanner;

public class CalcularHoras {
	
	public void CalcularHoras() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular salario");
		System.out.println("-----------------");
		float horasSemanales;
		float salarioHora;
		
		System.out.println("Cúal es tu salario por Hora");
		if(sc.hasNextFloat()) {
			salarioHora = sc.nextFloat();
			System.out.println("Cuantas horas semanales has trabajado");
			if(sc.hasNextFloat()) {
				horasSemanales = sc.nextFloat();
				float resulatado = salarioHora * horasSemanales ;
				System.out.println("Tu salario de este mes ha sido: -> "+resulatado);
			}
		} else {
			System.err.println("No has introducido nada / O has introducido un caracter");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		CalcularHoras objeto = new CalcularHoras();
		objeto.CalcularHoras();
		
	}

}
