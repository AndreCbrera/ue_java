package casosPracticosUnidad2;

public class PalabrasReservadas {
	
	// Constantes con tipos de iba en España
	
	public static final double IVA_GENERAL = 0.21;
	public static final double IVA_REDUCIDO = 0.10;
	public static final double IVA_SUPERREDUCIDO = 0.04;
	public static final double IVA_ISLAS_CANARIAS = 0.07;
	public static final double SIN_IVA = 0.0;

	public static void main(String[] args) {
		/*
		 * Elige un identificador
		 * Vamos a necesitar crear una variable final para saber el tipo de IVA que
		 * debemos aplicar en nuestros programas. 
		 */
		
		// Declaramos la base inicial del producto
		double precioProducto = 100.0;
		
		// Calculo del producto por tipo de iva
		double precioConIvaGeneral = precioProducto + (precioProducto * IVA_GENERAL);
		double precioConIvaReducido = precioProducto + (precioProducto * IVA_REDUCIDO);
		double precioConIvaSuperReducido = precioProducto + (precioProducto * IVA_SUPERREDUCIDO);
		double precioConIvaIslasCanarias = precioProducto + (precioProducto * IVA_ISLAS_CANARIAS);
		double precioSinIva = precioProducto + (precioProducto * SIN_IVA);

		// output
		System.out.println("Precio con IVA General (21%): " + precioConIvaGeneral);
		System.out.println("Precio con IVA Reducido (10%): " + precioConIvaReducido);
		System.out.println("Precio con IVA Super Reducido (7%): " + precioConIvaSuperReducido);
		System.out.println("Precio con IVA Islas Canarias (7%): " + precioConIvaIslasCanarias);
		System.out.println("Precio sin IVA (0%): " + precioSinIva);
	}

}
