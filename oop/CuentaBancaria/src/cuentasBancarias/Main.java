package cuentasBancarias;

import java.util.Scanner;

public class Main {
    
    // Array para almacenar las cuentas (máximo 2 en este ejemplo)
    private static Cuenta[] cuentas = new Cuenta[2];
    private static int totalCuentas = 0; // Lleva el control del número de cuentas creadas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            // Menú principal del programa
            System.out.println("\n=== Menú Banco ===");
            System.out.println("1. Crear cuenta"); // Crear una nueva cuenta
            System.out.println("2. Eliminar cuenta"); // Eliminar una cuenta
            System.out.println("3. Ingresar dinero"); // Ingresar dinero a una cuenta
            System.out.println("4. Retirar dinero"); // Retirar dinero de una cuenta
            System.out.println("5. Transferir dinero"); // Transferir dinero entre cuentas
            System.out.println("6. Consultar saldo"); // Consultar saldo de una cuenta
            System.out.println("7. Mostrar todas las cuentas"); // Mostrar todas las cuentas registradas
            System.out.println("0. Salir"); // Salir del programa
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
            scanner.nextLine(); // Consumir el salto de línea

            // Lógica del menú
            switch (opcion) {
                case 1:
                    crearCuenta(scanner);
                    break;
                case 2:
                    eliminarCuenta(scanner);
                    break;
                case 3:
                    ingresarDinero(scanner);
                    break;
                case 4:
                    retirarDinero(scanner);
                    break;
                case 5:
                    transferirDinero(scanner);
                    break;
                case 6:
                    consultarSaldo(scanner);
                    break;
                case 7:
                    verTodasLasCuentas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close(); // Cierra el scanner al finalizar el programa
    }
    
    // Método para crear una nueva cuenta
    private static void crearCuenta(Scanner scanner) {
        if (totalCuentas >= cuentas.length) {
            System.out.println("No se pueden crear más cuentas. El banco está lleno.");
            return;
        }
        
        System.out.print("DNI del titular: ");
        String dni = scanner.nextLine(); // Leer el DNI del titular
        
        System.out.print("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble(); // Leer el saldo inicial

        // Crear una nueva cuenta y añadirla al array
        cuentas[totalCuentas] = new Cuenta(dni, saldoInicial);
        totalCuentas++;
        System.out.println("Se ha creado la cuenta exitosamente para " + dni + " con un saldo inicial de " + saldoInicial + "€");
    }
    
    // Método para mostrar todas las cuentas
    private static void verTodasLasCuentas() {
        if (totalCuentas == 0) {
            System.out.println("No hay cuentas creadas.");
        } else {
            System.out.println("\nCuentas registradas:");
            for (int i = 0; i < totalCuentas; i++) {
                System.out.println(cuentas[i]); // Usa el método toString() de la clase Cuenta
            }
        }
    }
    
    // Método para ingresar dinero en una cuenta
    private static void ingresarDinero(Scanner scanner) {
        Cuenta cuenta = seleccionarCuentaPorDni(scanner); // Selecciona la cuenta por DNI
        if (cuenta != null) {
            System.out.print("Cantidad a ingresar: ");
            double cantidad = scanner.nextDouble(); // Leer la cantidad
            cuenta.ingresar(cantidad); // Ingresa el dinero
        }
    }

    // Método para retirar dinero de una cuenta
    private static void retirarDinero(Scanner scanner) {
        Cuenta cuenta = seleccionarCuentaPorDni(scanner); // Selecciona la cuenta por DNI
        if (cuenta != null) {
            System.out.print("Cantidad a retirar: ");
            double cantidad = scanner.nextDouble(); // Leer la cantidad
            cuenta.retirar(cantidad); // Retira el dinero
        }
    }

    // Método para transferir dinero entre dos cuentas
    private static void transferirDinero(Scanner scanner) {
        System.out.println("DNI de la cuenta de origen:");
        Cuenta cuentaOrigen = seleccionarCuentaPorDni(scanner); // Selecciona la cuenta de origen

        if (cuentaOrigen != null) {
            System.out.println("DNI de la cuenta de destino:");
            Cuenta cuentaDestino = seleccionarCuentaPorDni(scanner); // Selecciona la cuenta de destino

            if (cuentaDestino != null) {
                System.out.print("Cantidad a transferir: ");
                double cantidad = scanner.nextDouble(); // Leer la cantidad a transferir

                if (cuentaOrigen.getSaldo() >= cantidad) {
                    cuentaOrigen.retirar(cantidad); // Retira el dinero de la cuenta de origen
                    cuentaDestino.ingresar(cantidad); // Ingresa el dinero en la cuenta de destino
                    System.out.println("¡Transferencia realizada!");
                } else {
                    System.out.println("Saldo insuficiente para realizar la transferencia.");
                }
            }
        }
    }

    // Método para consultar el saldo de una cuenta
    private static void consultarSaldo(Scanner scanner) {
        Cuenta cuenta = seleccionarCuentaPorDni(scanner); // Selecciona la cuenta por DNI
        if (cuenta != null) {
            System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo() + "€");
        }
    }

    // Método para eliminar una cuenta
    private static void eliminarCuenta(Scanner scanner) {
        System.out.print("Introduce el DNI de la cuenta a eliminar: ");
        String dni = scanner.nextLine();

        for (int i = 0; i < totalCuentas; i++) {
            if (cuentas[i].getDni().equals(dni)) {
                // Mover todas las cuentas siguientes para llenar el hueco
                for (int j = i; j < totalCuentas - 1; j++) {
                    cuentas[j] = cuentas[j + 1];
                }
                cuentas[totalCuentas - 1] = null; // Borra la última cuenta
                totalCuentas--;
                System.out.println("¡Cuenta eliminada exitosamente!");
                return;
            }
        }
        System.out.println("No se encontró una cuenta con el DNI proporcionado.");
    }

    // Método para seleccionar una cuenta por su DNI
    private static Cuenta seleccionarCuentaPorDni(Scanner scanner) {
        System.out.print("Introduce el DNI de la cuenta: ");
        String dni = scanner.nextLine();

        for (int i = 0; i < totalCuentas; i++) {
            if (cuentas[i].getDni().equals(dni)) {
                return cuentas[i]; // Retorna la cuenta si el DNI coincide
            }
        }

        System.out.println("No se encontró una cuenta con el DNI proporcionado.");
        return null; // Retorna null si no se encuentra la cuenta
    }
}
