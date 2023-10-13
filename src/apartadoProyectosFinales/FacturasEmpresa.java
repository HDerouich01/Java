package apartadoProyectosFinales;

import java.util.Scanner;

public class FacturasEmpresa {
	
	public static void main(String[] args) {
		
		// DECLARACION DEL SCANNER 
		
		Scanner sc = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES 
		int codigoArticulo  , contador_600 = 0, litrosToteles = 0 ;
		float cantidadLitros, precioLitro, facturacionTotal = 0   ;
		double importefactura;
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			
			// PEDIMOS DE DATOS -----------------
			
			System.out.println("\n--------------------");
			System.out.println("FACTURA PLUS - ARTICULO Nª " + i);
			System.out.println("--------------------");
			System.out.println("Introduce las Facturas: "); 
			System.out.println("\n Codigo Articulo: "); 
			codigoArticulo = sc.nextInt() ;
			System.out.println("\n Cantidad en litros vendidos: ");
			cantidadLitros = sc.nextFloat();
			//System.out.println("\n precioLitro: ");
			// precioLitro = sc.nextFloat();
			System.out.println("\n--------------------");

			// PEDIDAD DE DATOS ---------------------
			
			
			if( codigoArticulo == 1 ) {
				importefactura = cantidadLitros * 0.6 ; // IMPORTE FACTURA
				litrosToteles += cantidadLitros ;
			} 
			
			if( codigoArticulo == 2 ) {
				importefactura =  cantidadLitros * 3 ; // IMPORTE FACTURA
				litrosToteles += cantidadLitros ;
			} 
			
			if( codigoArticulo == 3) {
				importefactura = cantidadLitros * 1.25 ; // IMPORTE FACTURA
				litrosToteles += cantidadLitros ;
			} else {
				System.out.println("El codigo introducido no esta en la lista");
				break ;
			}
			
			
			facturacionTotal += importefactura ;
			
			
			//
			
			if( importefactura > 600 ) {
				contador_600 ++ ;
			}
			
			
		}
		
		
		System.out.println("\n--------------------");
		System.out.println("FACTURA PLUS - RESUMEN DE VENTAS ");
		System.out.println("--------------------");
		System.out.println("FACTURACIÓN TOTAL: "); 
		System.out.println("\n" + facturacionTotal); 
		System.out.println("\n Cantidad en litros vendidos del Artículo : ");
		System.out.println("\n" + litrosToteles);
		System.out.println("\n Facturas mayores de 600$: ");
		System.out.println("\n" + contador_600);
		System.out.println("\n--------------------");

		
		
	}

}
