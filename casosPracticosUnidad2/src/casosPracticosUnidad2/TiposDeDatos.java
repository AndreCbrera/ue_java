package casosPracticosUnidad2;

import java.util.Scanner;

public class TiposDeDatos {

	// definimos las constantes para enumerar los meses
	public enum Mes {
		ENERO,
		FEBRERO,
		MARZO,
		ABRIL,
		MAYO,
		JUNIO,
		JULIO,
		AGOSTO,
		SEPTIEMBRE,
		OCTUBRE,
		NOVIEMBRE,
		DICIEMBRE;
		
		// Metodo que nos devuelve los dias del mes (no tenemos en cuenta años bisiestos)
		public int obtenerDias() {
			switch (this) {
            case ENERO: return 31;
            case FEBRERO: return 28;
            case MARZO: return 31;
            case ABRIL: return 30;
            case MAYO: return 31;
            case JUNIO: return 30;
            case JULIO: return 31;
            case AGOSTO: return 31;
            case SEPTIEMBRE: return 30;
            case OCTUBRE: return 31;
            case NOVIEMBRE: return 30;
            case DICIEMBRE: return 31;
            default: throw new IllegalArgumentException("Mes no valido");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
            // Mostrar el menú para seleccionar el mes
            System.out.println("\nSelecciona un mes: ");
            System.out.println("1. Enero");
            System.out.println("2. Febrero");
            System.out.println("3. Marzo");
            System.out.println("4. Abril");
            System.out.println("5. Mayo");
            System.out.println("6. Junio");
            System.out.println("7. Julio");
            System.out.println("8. Agosto");
            System.out.println("9. Septiembre");
            System.out.println("10. Octubre");
            System.out.println("11. Noviembre");
            System.out.println("12. Diciembre");
            System.out.println("13. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            // Validar la opción seleccionada
            switch(opcion) {
                case 1:
                    mostrarDiasMes(Mes.ENERO);
                    break;
                case 2:
                    mostrarDiasMes(Mes.FEBRERO);
                    break;
                case 3:
                    mostrarDiasMes(Mes.MARZO);
                    break;
                case 4:
                    mostrarDiasMes(Mes.ABRIL);
                    break;
                case 5:
                    mostrarDiasMes(Mes.MAYO);
                    break;
                case 6:
                    mostrarDiasMes(Mes.JUNIO);
                    break;
                case 7:
                    mostrarDiasMes(Mes.JULIO);
                    break;
                case 8:
                    mostrarDiasMes(Mes.AGOSTO);
                    break;
                case 9:
                    mostrarDiasMes(Mes.SEPTIEMBRE);
                    break;
                case 10:
                    mostrarDiasMes(Mes.OCTUBRE);
                    break;
                case 11:
                    mostrarDiasMes(Mes.NOVIEMBRE);
                    break;
                case 12:
                    mostrarDiasMes(Mes.DICIEMBRE);
                    break;
                case 13:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 13);
        
        sc.close();  // Cerrar el escáner
    }

	public static void mostrarDiasMes(Mes mes) {
		System.out.printf("El mes de %s tiene %d días.%n", mes.name(), mes.obtenerDias());
	}

}
