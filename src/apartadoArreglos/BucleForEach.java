package apartadoArreglos;

public class BucleForEach {
	
	public static void main(String[] args) {
		
		String[] nombres = { "Alvaro", "Alejandro", "Maria", "Juan", "Narcisa", "Luis" };
		
		// MOSTRAMOS LOS VALORES CON UN BUCLE NORMAL
		
		for (int i = 0 ; i < nombres.length ; i++) {
			System.out.println((i +1) + ":" +nombres[i]);
		}
		
		// MOSTRAMOS LOS VALORES CON UN BUCLE FOR EACH -> MAS FACIL, Y NOS PERMITE RECORRER ESTRUCTURA QUE CONTIENE VARIOS ELEMENTOS 
		
		for (String i : nombres) {
			System.out.println( "*" + i);
		}
		
	}

}
