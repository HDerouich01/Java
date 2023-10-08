package ApartadoDos;

import java.io.CharConversionException;
import java.util.Scanner;

public class PiedaraPapelTijera {
	
	public void JuegoPiedraPapelTijera () {
		Scanner sc = new Scanner(System.in); // SCANER ENTRADA DE DATOS0
		int maquinaSelecion = (int)Math.floor(Math.random()*3); // LOGICA MAQUINA
		
		// MENU DE OPCIONES
		
		System.out.println("Bienvenido al Juego de Piedra, Papel O tijera!!!");
		System.out.println("----------------------");
		
		System.out.println("0ª Piedra");
		System.out.println("1ª Papel");
		System.out.println("2ª Tijera ");
		
		System.out.println("----------------------");
		
		// CONVERSION INT -> STRING 
		
		String maquinaSelecionConversion = String.valueOf(maquinaSelecion) ;
		String maquinaSelecionConversionResultado = maquinaSelecionConversion ;
			
		
		// ASIGNACION DE LA MAQUINA
		
		if ( maquinaSelecion == 0 ) {
			
		  maquinaSelecionConversionResultado = "Piedra";
		  
		} else if ( maquinaSelecion  == 1) {
			
			maquinaSelecionConversionResultado = "Papel";
			
		} else if(maquinaSelecion == 2) {
			
			maquinaSelecionConversionResultado = "Tijera";
		}
		
		
		// SELECCION OPCION
		
		System.out.println("Seleciona Piedra, Papel O Tijera ");
		System.out.println("----------------------");
		
				

		// VALIDACION DE DATOS Y RESULUCION DEL JUEGO
		
		if(sc.hasNextInt()) {
			int opcionFinal = sc.nextInt();
			switch (opcionFinal){
			case 0: {
				if( opcionFinal > maquinaSelecion ) {
					System.out.println("Has seleccionado" + " PIEDRA " + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Tu Ganas !!  "  );
				} else if(opcionFinal > maquinaSelecion) {
					System.out.println("Has seleccionado" + "PIEDRA" + "La maquina ha escogido " + maquinaSelecionConversionResultado + "  Gana la maquina!! "  );
				} else if( opcionFinal == maquinaSelecion  ) {
					System.out.println("Has seleccionado" + "PIEDRA" + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Empate !!"  );

				}
				break;
			} case 1:
				if( opcionFinal > maquinaSelecion  ) {
					System.out.println("Has seleccionado" + " PAPEL " + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Tu Ganas!!  "  );
				} else if(opcionFinal < maquinaSelecion) {
					System.out.println("Has seleccionado" + "  PAPEL  " + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Gana la maquina!! "  );
				} else if( opcionFinal == maquinaSelecion ) {
					System.out.println("Has seleccionado" + "  PAPEL  " + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Empate "  );

				}
				break;
			case 2:
				if( opcionFinal < maquinaSelecion ) {
					System.out.println("Has seleccionado" + " TIJERA " + "La maquina ha escogido " + maquinaSelecionConversionResultado + "  Tu Ganas!! "  );
				} else if(maquinaSelecion > opcionFinal) {
					System.out.println("Has seleccionado" + "  TIJERA  " + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Gana la maquina!! "  );
				} else if( opcionFinal == maquinaSelecion ) {
					System.out.println("Has seleccionado" + "  TIJERA  " + "La maquina ha escogido " + maquinaSelecionConversionResultado + " Empate!! "  );

				}
				break;
			default:
				System.err.println("La opcion que has selecionado es incorrecta");
			}
			
			
		} else {
			System.out.println("No has introuducio un número!!");
		}
		
		
		
		
		
	}
	
	public static void main(String[]args) {
		
		PiedaraPapelTijera objeto = new PiedaraPapelTijera() ;
		objeto.JuegoPiedraPapelTijera();
		
	}

}
