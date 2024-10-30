package PrimerosEjeJava;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Inicializamos el Scanner para poder introducir los valores
        Scanner sc = new Scanner(System.in);
        
        /* Inicializamos una variable que contenga true para
         * mantener el bucle while ejecutándose mientras el 
         * usuario decida continuar realizando operaciones.
         */
        boolean continuar = true;
        
        System.out.println("Calculadora Básica en Java");

        // Inicializamos el bucle while para permitir múltiples operaciones
        while (continuar) {
            // Pedimos al usuario que ingrese el primer número
            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();
            
            // Pedimos al usuario que ingrese el segundo número
            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();
            
            // Solicitamos al usuario que elija una operación
            System.out.print("Elige una operación (+, -, *, /): ");
            char operacion = sc.next().charAt(0); // Lee el primer carácter de la entrada
            
            // Inicializamos una variable para almacenar el resultado
            double resultado = 0;
            // Variable booleana para verificar si la operación es válida
            boolean operacionValida = true;
            
            // Estructura switch para determinar la operación seleccionada
            switch (operacion) {
                case '+':
                    // Realiza la suma si se seleccionó '+'
                    resultado = num1 + num2;
                    break;
                case '-':
                    // Verifica que el número mayor reste el menor para evitar resultados negativos
                    if (num1 > num2) {
                        resultado = num1 - num2;
                    }
                    if (num1 < num2) {
                        resultado = num2 - num1;
                    }
                    break;
                case '*':
                    // Realiza la multiplicación si se seleccionó '*'
                    resultado = num1 * num2;
                    break;
                case '/':
                    // Verifica que el divisor no sea cero antes de realizar la división
                    if (num2 != 0) {
                        resultado = num1 / num2;    
                    }
                    if (num2 == 0) {
                        // Mensaje de error si el divisor es cero y marca la operación como inválida
                        System.out.println("Error: División por cero no permitida.");
                        operacionValida = false;
                    }
                    break;
                default:
                    // Muestra un mensaje de error si la operación ingresada no es válida
                    System.out.println("Operación no válida. Por favor elige +, -, *, o /.");
                    operacionValida = false;
                    break;
            }
            
            // Muestra el resultado si la operación fue válida
            if (operacionValida) {
                System.out.println("\nResultado " + resultado + "\n");
            }
        }
        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}
