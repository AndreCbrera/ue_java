package sueldoTrabajador;

import java.util.Scanner;

public class SueldoTrabajador {
	
	/* Definimos las constantes de los valores fijos en este caso las
	 * clases y los porcentajes del IRPF a pagar
	 */
	private final static int CLASE_A = 25; // Tarifa por hora para la clase A
	private final static int CLASE_B = 20; // Tarifa por hora para la clase B
	private final static int CLASE_C = 15; // Tarifa por hora para la clase C
	private final static int CLASE_D = 10; // Tarifa por hora para la clase D
	private final static double IRPF_BAJO = 0.15; // Retención del 15% si el sueldo bruto <= 1200
	private final static double IRPF_ALTO = 0.20; // Retención del 20% si el sueldo bruto > 1200

	public static void main(String[] args) {
		// Declaramos el scanner para leer entradas del usuario
		Scanner sc = new Scanner(System.in);
		boolean continuar = true; // Controla el bucle principal del programa
		
		while (continuar) {
			// Solicitar datos al usuario
            System.out.println("\nCalcular Sueldo Trabajador\n");
			
            System.out.println("Ingrese el número de horas trabajadas: ");
            double horasTrabajadas = sc.nextDouble(); // Entrada para las horas trabajadas
            System.out.println("Ingrese la clase del trabajador (A, B, C, D): ");
            char claseTrabajador = sc.next().toUpperCase().charAt(0); // Entrada para la clase del trabajador, convertida a mayúscula
			
			int clase; // Variable para almacenar la tarifa según la clase del trabajador

            // Asignar la tarifa por hora según la clase
            switch (claseTrabajador) {
            case 'A':
            	clase = CLASE_A;
                break;
            case 'B':
            	clase = CLASE_B;
                break;
            case 'C':
            	clase = CLASE_C;
                break;
            case 'D':
                clase = CLASE_D;
                break;
            default:
                // Mensaje de error si el usuario ingresa una clase no válida
                System.out.println("Clase invalida por favor averigue e introduzca su clase.");
                continue; // Reinicia el bucle si la clase es inválida
            }
            
           // Calcular el sueldo bruto como horas trabajadas * tarifa
           double sueldoBruto = horasTrabajadas * clase;
           double retencion; // Variable para almacenar el monto retenido
           double irpfAplicado; // Variable para almacenar el porcentaje de retención
                      
           // Determinar la retención según el sueldo bruto
           if (sueldoBruto >= 1200) {
               retencion = sueldoBruto * IRPF_ALTO; // Retención del 20%
               irpfAplicado = IRPF_ALTO; // Asignar porcentaje de IRPF usado
           } else {
               retencion = sueldoBruto * IRPF_BAJO; // Retención del 15%
               irpfAplicado = IRPF_BAJO; // Asignar porcentaje de IRPF usado
           }
          
           // Calcular el sueldo neto después de la retención
           double sueldoNeto = sueldoBruto - retencion;
           
           // Mostrar resultados al usuario
           System.out.println("Este es tu sueldo bruto " + sueldoBruto + "€");
           System.out.println("Este es tu sueldo neto " + sueldoNeto + "€, y se te quita " + retencion + "€ con una de retención del " + (irpfAplicado * 100) + "%");
           
           // Preguntar si desea realizar otro cálculo
           System.out.print("\n¿Desea calcular otro salario? (s/n): ");
           char respuesta = sc.next().toLowerCase().charAt(0); // Leer respuesta del usuario

           if (respuesta != 's') { // Si la respuesta no es 's', terminar el programa
               continuar = false; // Salir del bucle
               System.out.println("Saliendo de la aplicación...");
           }
		}
        sc.close(); // Cerrar el scanner para liberar recursos
	}
}
