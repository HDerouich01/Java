package ApartadoTres;

import java.util.Scanner;

public class CalcularRectangulo {
	
	
	public  void  calculoArea(){
		
		//ENTRADA DE DATOS
		
		Scanner sc = new Scanner(System.in);
		
		// PEDIDAD DE DATOS Y ASIGNACION
		 
		System.out.println("Calcular El area rectanguloo");
		System.out.println("----------------------------");
		
	
		
				System.out.println("Introduce el largo");
				float largoRectangulo = sc.nextFloat();
				
				System.out.println("Introduce el ancho");
				float anchoRectangulo = sc.nextFloat();
				
		
		System.out.println("----------------------------");
		
		
		// RESOLUCION DEL PROBLEMA / FORMULAR AREA RECTANGULO -> A = LARGO X ANCHO
		
			float resultado = largoRectangulo * anchoRectangulo ;
			System.out.println("\n El area del rectangulo es");
			System.out.println(" El lado del rectangulo: ->"  +  largoRectangulo );
			System.out.println(" El ancho del rectangulo: ->"  +  anchoRectangulo );
			System.out.println(" El are del rectangulo es :) -> " + resultado );
		
		
	}
	
	
	private void calculoPerimetro() {

		//ENTRADA DE DATOS
		
				Scanner sc = new Scanner(System.in); // Persona muda :(
				
				// PEDIDAD DE DATOS Y ASIGNACION
				
				 
				System.out.println("Calcular el perimitero  ");
				System.out.println("----------------------------");
				
			
				
						System.out.println("Introduce la base "); // ESCUCHO!!
						float baseRectangulo = sc.nextFloat(); // GURDAMOS Y ENTENDMOS 
						
						System.out.println("Introduce la altura");
						float alturaRectangulo = sc.nextFloat();
						
				
				System.out.println("----------------------------");
				
				
				// RESOLUCION DEL PROBLEMA / FORMULAR AREA RECTANGULO -> A = LARGO X ANCHO
				
					float resultado = 2 * (baseRectangulo + alturaRectangulo) ;
					System.out.println("\n El area del rectangulo es");
					System.out.println(" El lado del rectangulo: ->"  +  baseRectangulo ); // DICE 
					System.out.println(" El ancho del rectangulo: ->"  +  alturaRectangulo );
					System.out.println(" El are del rectangulo es :) -> " + resultado );
				
				
			}
		
	
	
	 /* 
	  * private String nombre(String nombre, String apellido ) {
		
		nombre = "Carlos";
		 apellido = "Lhiuak";
		System.out.println("Tu nombre es " + nombre +  "  " +  apellido);
		return nombre + apellido;
		
	}
	*/
	
	public static void main(String[] args) {
		
		// FORMULAR AREA RECTANGULO -> A = LARGO X ANCHO
		// PERIMETTRO DE RECTANGULO -> P 2X(LARGO X ANCHO 
		
		// LARGO -> ES LA LONGITUD DEL RECTÁNGULO 
		// ANCHO->  ES LA ANCHURA DEL RECTANGULO
		
		
		
		CalcularRectangulo objeto = new CalcularRectangulo();
		objeto.calculoArea();
		
		
		
		
		

	}

}
