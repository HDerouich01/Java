package apartadoProyectosFinales;

import java.util.Scanner;

public class VentaDeCarros {
	
	private void CalcularSalario(){
		
		// SALARIO MENSUAL, COMISION COCHE , COMISION VENTA DEL COCHE;
		int salarioMensual = 1000 ;
		int comisionCoche = 150 ;
		float comisionVentaCoche ;
		
		
		// ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de Ventas");
		System.out.println("----------------------");
		
		// RECOPILACION DE DATOS
		
		System.out.println("Cantidad de coches vendidos");
		byte cochesVendidos = sc.nextByte();
		System.out.println("Valor de los coches vendidos");
		float valorCoche = sc.nextFloat();
		
		// LOGICA DEL PROGRAMA
		
		float sueldoTotal = salarioMensual + ( cochesVendidos * comisionCoche ) + ( valorCoche * 5 ) / 100 ;
		
		// FIN PROGRAMA
		
		System.out.println("El sueldo del vendedor es de: -> " + sueldoTotal );
		
	}
	
	public static void main(String[] args) {
		
		VentaDeCarros objeto = new VentaDeCarros();
		objeto.CalcularSalario();
		
	}

}
