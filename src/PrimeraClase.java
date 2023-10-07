import java.util.Scanner;

public class PrimeraClase { 
	public static void main(String args[]) {
	
		/*
		 * Scanner es un clase que nos permite obetener la entrada de datos,
		 * podemos capturar los datos int, double, string  ... etc 
		 * Utilizamos el metodo System.in
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Scanner a = new Scanner(System.in); 
		Scanner b = new Scanner(System.in);
		System.out.println("Introduce tu edad:"); 
		int age = a.nextInt();
		System.out.println("Digite un numero:"); 
		float nombre = b.nextFloat();
		
		System.out.println("Te llamas:" + nombre );
		System.out.println("Y tines:"+ age + "años" );
		
		
		
						
	}
}	
	