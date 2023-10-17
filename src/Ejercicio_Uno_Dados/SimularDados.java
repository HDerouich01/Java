package Ejercicio_Uno_Dados;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SimularDados {
	
	// ATRIBUTOS 
	
	private int  lanzamientosDados  ;
	private int DadoUno ;
	private int DadoDos ;
	private int DadoTres ;
	private int DadoCuatro ;
	private int incremento = 0 ;
	private int numeroDado ;
	
	
	// JUEGO
	 SimularDados() {
		  	
		  DadoUno = 0 ;
		  DadoDos = 0 ;
		  DadoTres = 0 ;
		  DadoCuatro = 0 ;
		
	}
	 
	 // CLASE PRIVADA 
	
	 private int lanzamientosDados() { // SIMULA EL LANZAMIENTO DE DATOS - REGISTRO DE LANZAMIENTO DE DATOS 
		  
		 numeroDado = (int) Math.floor(Math.random() * 7) ; // LÓGICA MAQUINA 
		 
		 return numeroDado; // DEVOLUCION DEL DATO
		 
		 
		 
	 }
	 
	 public void lanzarDados() {
		 
		 // ASIGNAMOS LOS NÚMEROS A LAS CARAS DE LOS DATOS 
		 
		  DadoUno = lanzamientosDados() ;
		  DadoDos = lanzamientosDados() ;
		  DadoTres = lanzamientosDados() ;
		  DadoCuatro = lanzamientosDados();
		  
		  System.out.println("\n RESULATADO DE LA  TIRADA ");
		  System.out.println("\n Dado uno -> " + DadoUno );
		  System.out.println("\n Dado uno -> " + DadoDos );
		  System.out.println("\n Dado uno -> " + DadoTres );
		  System.out.println("\n Dado uno -> " + DadoCuatro );
		  
		  
	 }  
	 
	 public void UltimaJugada() {
		 
		 if( DadoUno == 0 && DadoDos == 0 && DadoTres  == 0 && DadoCuatro == 0 ) {
			 
			 System.out.println("No se ha realizado ninguna tirada");
		 } else {
			 
			 System.out.println("\n RESULATADO DE LA ULTIMA - TIRADA ");
			  System.out.println("\n Dado uno -> " + DadoUno );
			  System.out.println("\n Dado dos -> " + DadoDos );
			  System.out.println("\n Dado tres  -> " + DadoTres );
			  System.out.println("\n Dado cuatro -> " + DadoCuatro );
			 
			 
		 }
		 
		 
	 }
	 
	 public void NumeroDeLanzamientos() {
		 
		 int contadorNuemeroLanzamiento = 0 ;
		
		for ( int i = 0 ; i < numeroDado ; i++) {
			contadorNuemeroLanzamiento ++ ;
		}
	
		  System.out.println("\n Se han realizdo " + contadorNuemeroLanzamiento + "  Lanzamientos" );
	 }
	 
	 
	 
	 
	 public void ComprobarResultado() {
		 
		 
			    if (DadoUno == DadoDos && DadoDos == DadoTres && DadoTres == DadoCuatro) {
			        System.out.println("4 : Si he conseguido un poker, los 4 dados son iguales");
			    } else if ((DadoUno == DadoDos && DadoDos == DadoTres) || (DadoUno == DadoDos && DadoDos == DadoCuatro) || (DadoUno == DadoTres && DadoTres == DadoCuatro) || (DadoDos == DadoTres && DadoTres == DadoCuatro)) {
			        System.out.println("3 : Si he conseguido un trío, 3 dados son iguales");
			    } else if (DadoUno == DadoDos || DadoDos == DadoTres || DadoTres == DadoCuatro || DadoUno == DadoTres || DadoUno == DadoCuatro || DadoDos == DadoCuatro) {
			        System.out.println("2 : Si he conseguido un doble, 2 dados son iguales");
			    } else {
			        System.out.println("1 : Si he conseguido una única pareja igual");
			    }
			

		 
		 
		 
	 }
	 
	 
	 private void estadisticaTiradas() {
		 
		 // ENTRADA DE DATOS 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 // INDICAMOS EL NÚMERO DE VECES A TIRAR EL DADO
		 
		 System.out.println("Cuantas veces quieres tirar el dado ");
		 
		 int opcion = sc.nextInt() ;
		 
		 for ( int i = 0 ; i < opcion ; i++)
			 
		 numeroDado = (int) Math.floor(Math.random() * 7) ;
		 
		  DadoUno += numeroDado ;
		  DadoDos += numeroDado ;
		  DadoTres += numeroDado ;
		  DadoCuatro += numeroDado;
		 
		  
		
		 
	 }
	 
	 
	 public void lanzarDado() {
		 
		 // ENTRADA DE DATOS 
		 
		 Scanner sc = new Scanner(System.in) ;
		 
		 // DECLARACIÓN DE VARIABLES 
		 
		 	int opcion ;
		 
		 // MENU DE DATOS 
		 
		 do {
			 
			 System.out.println("\n Bienvenido al Juego TIRADAOS - PRUEBA-TU-SUERTE");
			 
			 System.out.println("--------------------------------------------");
			 
			 System.out.println("\n 1ª Tirar Dados");
			 System.out.println("\n 2ª Ultima Jugada");
			 System.out.println("\n 3ª Mostrar Numero de lanzamientos Realizados");
			 System.out.println("\n 4ª Comprobar el Resultado del Lanzamiento");
			 System.out.println("\n 5ª SALIR ");
			 
			 System.out.println("---------------------------------------------");
			 
			 System.out.print("Cual es tu Decisión ?? : ");
			 opcion = sc.nextInt() ;
			 
			 switch( opcion ) {
			 case 1 :
				 lanzarDados();
				 break ;
			 case 2:
				 ultimaJugada();
				 break ;
			 case 3:
				 NumeroDeLanzamientos();
				 break ;
			 case 4:
				 ComprobarResultado();
			
			 }
			 
			 
			 
			 
			 
			 
		 } while( opcion != 5 );
		 
		 
	 }
	 
	 public void ultimaJugada() {
		 
		  System.out.println("\n RESULATADOS ULTIMA TIRADA ");
		  System.out.println("\n Dado uno " + DadoUno );
		  System.out.println("\n Dado uno " + DadoDos );
		  System.out.println("\n Dado uno " + DadoTres );
		  System.out.println("\n Dado uno " + DadoCuatro );
		  System.out.println(incremento);
		
	 }
	 
	
	 private int NumeroLanzamientos() {
		 
		 return (Integer) null ;
	 }
	 
	 
	
	public static void main(String [] args) {
		
		SimularDados objeto = new SimularDados() ;
		objeto.lanzarDado() ;
		
		objeto.ultimaJugada();
		
		
		
		
		
		
		
		
	}
	

}
