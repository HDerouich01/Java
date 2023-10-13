package apartadoCiclos;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		/*
		 * La diferencia que hay entre el while y el dowhile es:
		 * 
		 * DOWHILE -> EJECUTA PRIMERA LA INSTRUCCIÓN Y DESPUÉS COMPRUEBA LA INSTRUCCIÓN 
		 * 
		 * WHILE -> MIENTRAS QUE EN WHILE COMPRUEBA LA INSTRUCCIÓN Y DESPUÉS LA EJECUTA 
		 * 
		 */
		
		
		int i = 11 ; 
		
		do{
			System.out.println(i);
			i++;
		} while( i <= 10 );
		
	}
}
