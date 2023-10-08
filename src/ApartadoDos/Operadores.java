package ApartadoDos;

import java.util.Scanner;

public class Operadores {
	
	public static void main (String[] args) {
		
		/* GUILLERMO TINE  x -> (100)
		 * 
		 * LUIS(50) LA MITAD  QUE  GUILLERMO (100) 
		 * 
		 * JUAN (75) TIENE LA MITAD DE LUIS (50) Y GUILLERMO JUNTOS (100) -> MITAD DE JUAN  150 / 2 -> 75
		 * 
		 * 
		 */
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Cuanto dinero tine Guillermo");
			float dineroGuilleromo = sc.nextFloat();
			float dineroLuis = dineroGuilleromo / 2;
			float dineroJuan = ( dineroGuilleromo + dineroLuis ) /2 ;
			
			int total = (int)dineroGuilleromo + (int)dineroLuis+ (int)dineroJuan; 
			
			System.out.println("Guillermo tine: -> " + dineroGuilleromo);
			System.out.println("Luis tiene tiene: -> " + dineroLuis  );
			System.out.println("Juant tine: -> " + dineroJuan );
			
			System.out.println("\nLa cantidad que tiene de dinero los tres es de: -> " + total + "$" );
		
		
		
		
	}

}
