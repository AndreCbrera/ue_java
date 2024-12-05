package arrayVehiculo;

import java.util.Scanner;

public class ArrayVehiculos {
	
	/* La aplicación debe ofrecer un menú al usuario para poder realizar las siguientes tareas:
	 * 1.- Insertar vehículo.
	 * 2.- Eliminar el vehículo y dejar dicho hueco vacío.
	 * 3.- Modificar vehículo.
	 * 4.- Salir.
	 * El ejercicio debe de controlar que no se repiten matrículas dentro del array.
	 * Una vez terminado el ejercicio podemos añadir funcionalidades. 
	 * Por ejemplo realizar la venta de un  vehículo a un cliente con su DNI, mostrar vehículos para la venta disponibles
	 * mostrar los vehículos vendidos, mostrar los vehículos de un cliente en concreto...
	 */

    private static String[][] datosVehiculos = new String[10][3];
    private static int index = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Mostrar las opciones del menú
            System.out.println("\nCONCESIONARIO VEHÍCULOS\n");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Consultar coche");
            System.out.println("4. Vender coche");
            System.out.println("5. Mostrar todos los coches");
            System.out.println("6. Salir");

            // Obtener la opción del usuario
            String opcion = sc.nextLine();

            // Manejar las opciones del menú
            switch (opcion) {
                case "1":
                    agregarCoche(sc); // Llamar al método para agregar un coche
                    break;
                case "2":
                    eliminarCoche(sc); // Llamar al método para eliminar un coche
                    break;
                case "3":
                    buscarCoche(sc); // Llamar al método para buscar un coche
                    break;
                case "4":
                    venderCoche(sc); // Llamar al método para vender un coche
                    break;
                case "5":
                    mostrarTodosLosCoches(); // Llamar al método para mostrar todos los coches
                    break;
                case "6":
                    System.out.println("Saliendo del programa...");
                    salir = true; // Cambiar la variable para salir del bucle
                    break;
                default:
                    System.out.println("Opción no válida. Escoge una de las opciones en pantalla.");
                    break;
            }
        }

        sc.close(); // Cerrar el scanner
    }

    // Método para agregar un coche
    private static void agregarCoche(Scanner sc) {
        if (index >= datosVehiculos.length) { // Verificar si hay espacio disponible
            System.out.println("No se pueden agregar más coches. Capacidad máxima alcanzada.");
            return;
        }

        System.out.println("Matricula Coche: ");
        String matricula = sc.nextLine();

        System.out.println("Modelo de Coche: ");
        String modelo = sc.nextLine();

        System.out.println("DNI del dueño del coche: ");
        String dni = sc.nextLine();

        // Guardar los datos del coche en el array
        datosVehiculos[index][0] = matricula;
        datosVehiculos[index][1] = modelo;
        datosVehiculos[index][2] = dni;

        index++; // Incrementar el índice para la siguiente entrada

        System.out.println("Coche agregado exitosamente.");
    }

    // Método para eliminar un coche
    private static void eliminarCoche(Scanner sc) {
        System.out.println("\nIngresar matricula de coche a eliminar:");
        String matriculaAEliminar = sc.nextLine();
        boolean eliminar = false;

        // Buscar el coche por la matricula y eliminarlo si se encuentra
        for (int i = 0; i < index; i++) {
            if (datosVehiculos[i][0] != null && datosVehiculos[i][0].equalsIgnoreCase(matriculaAEliminar)) {
                datosVehiculos[i][0] = null;
                datosVehiculos[i][1] = null;
                datosVehiculos[i][2] = null;

                System.out.println("Coche con matricula " + matriculaAEliminar + " eliminado exitosamente.");
                eliminar = true;
                break;
            }
        }
        if (!eliminar) {
            System.out.println("No se encontró un coche con la matricula especificada.");
        }
    }

    // Método para buscar un coche
    private static void buscarCoche(Scanner sc) {
        System.out.println("\nIngresar matricula de coche a buscar:");
        String matriculaABuscar = sc.nextLine();
        boolean encontrar = false;

        // Buscar el coche por la matricula y mostrar los datos si se encuentra
        for (int i = 0; i < index; i++) {
            if (datosVehiculos[i][0] != null && datosVehiculos[i][0].equalsIgnoreCase(matriculaABuscar)) {
                System.out.println("El vehículo con matricula " + datosVehiculos[i][0] + " y modelo " + datosVehiculos[i][1] +
                        " está dado de alta con el DNI: " + datosVehiculos[i][2]);
                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            System.out.println("No se encontró un coche con la matricula especificada.");
        }
    }

    // Método para vender un coche
    private static void venderCoche(Scanner sc) {
        System.out.println("\nIngresar matricula de coche a vender:");
        String cocheAVender = sc.nextLine();
        boolean vendido = false;

        // Buscar el coche por la matricula y marcarlo como vendido si se encuentra
        for (int i = 0; i < index; i++) {
            if (datosVehiculos[i][0] != null && datosVehiculos[i][0].equalsIgnoreCase(cocheAVender)) {
                datosVehiculos[i][0] = null;
                datosVehiculos[i][1] = null;
                datosVehiculos[i][2] = null;

                System.out.println("Coche con matricula " + cocheAVender + " ha sido vendido exitosamente.");
                vendido = true;
                break;
            }
        }
        if (!vendido) {
            System.out.println("No se encontró un coche con la matricula especificada.");
        }
    }

    // Método para mostrar todos los vehículos
    private static void mostrarTodosLosCoches() {
        System.out.println("\nLista de todos los vehículos registrados:");
        boolean hayCoches = false;

        // Recorrer el array y mostrar todos los coches registrados
        for (int i = 0; i < index; i++) {
            if (datosVehiculos[i][0] != null) {
                System.out.println("Matricula: " + datosVehiculos[i][0] + 
                                   ", Modelo: " + datosVehiculos[i][1] + 
                                   ", DNI del dueño: " + datosVehiculos[i][2]);
                hayCoches = true;
            }
        }

        if (!hayCoches) {
            System.out.println("\nNo hay vehículos registrados actualmente.");
        }
    }
}
