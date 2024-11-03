package calcularAreaYPerimetro;

import java.util.Scanner;

/* 
 * Esta aplicación permite al usuario calcular el área y el perímetro de figuras geométricas 
 * como el círculo, cuadrado, rectángulo y triángulo. El programa solicita al usuario que 
 * elija una figura, introduce los valores necesarios y muestra los resultados.
 * La aplicación se ejecuta en un bucle hasta que el usuario decide salir.
 */
public class Figuras {
    
    // Scanner global para leer la entrada del usuario
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion; // Variable para almacenar la opción elegida por el usuario
        
        // Bucle que continúa ejecutándose hasta que el usuario elige la opción de salir
        do {
            System.out.println("\nSelecciona una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Triángulo");
            System.out.println("5. Salir");
            
            opcion = sc.nextInt(); // Lee la opción seleccionada por el usuario
            
            // Ejecuta la función correspondiente según la opción elegida
            switch(opcion) {
                case 1:
                    calcularCirculo();
                    break;
                case 2:
                    calcularCuadrado();
                    break;
                case 3:
                    calcularRectangulo();
                    break;
                case 4:
                    calcularTriangulo();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Mensaje de error si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida. Escoge una de las opciones en pantalla.");
            }
        } while(opcion != 5); // Condición para terminar el bucle si se elige la opción de salir
    }
    
    // Método para calcular el área y perímetro de un círculo
    private static void calcularCirculo() {
        double radio = leerNumero("Introduce el radio del círculo: ");
        double perimetro = 2 * Math.PI * radio; // Fórmula del perímetro del círculo
        double area = Math.PI * Math.pow(radio, 2); // Fórmula del área del círculo
        
        // Muestra los resultados formateados con dos decimales
        System.out.printf("\nEl perímetro del círculo de radio %.2f es %.2f.", radio, perimetro);
        System.out.printf("\nEl área del círculo de radio %.2f es %.2f.%n", radio, area);
    }
    
    // Método para calcular el área y perímetro de un cuadrado
    private static void calcularCuadrado() {
        double lado = leerNumero("Introduce el lado del cuadrado: ");
        double perimetro = 4 * lado; // Fórmula del perímetro del cuadrado
        double area = lado * lado; // Fórmula del área del cuadrado
        
        // Muestra los resultados formateados con dos decimales
        System.out.printf("\nEl perímetro del cuadrado de lado %.2f es %.2f.", lado, perimetro);
        System.out.printf("\nEl área del cuadrado de lado %.2f es %.2f.%n", lado, area);
    }
    
    // Método para calcular el área y perímetro de un triángulo
    private static void calcularTriangulo() {
        double base = leerNumero("Introduce la base del triángulo: ");
        double altura = leerNumero("Introduce la altura del triángulo: ");
        double lado1 = leerNumero("Introduce el lado 1 del triángulo: ");
        double lado2 = leerNumero("Introduce el lado 2 del triángulo: ");
        double lado3 = leerNumero("Introduce el lado 3 del triángulo: ");
        
        double perimetro = lado1 + lado2 + lado3; // Suma de los lados para calcular el perímetro
        double area = (base * altura) / 2; // Fórmula del área de un triángulo
        
        // Muestra los resultados formateados con dos decimales
        System.out.printf("\nEl perímetro del triángulo es %.2f.", perimetro);
        System.out.printf("\nEl área del triángulo es %.2f.%n", area);
    }
    
    // Método para calcular el área y perímetro de un rectángulo
    private static void calcularRectangulo() {
        double base = leerNumero("Introduce la base del rectángulo: ");
        double altura = leerNumero("Introduce la altura del rectángulo: ");
        double perimetro = 2 * (base + altura); // Fórmula del perímetro del rectángulo
        double area = base * altura; // Fórmula del área del rectángulo
        
        // Muestra los resultados formateados con dos decimales
        System.out.printf("\nEl perímetro del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, perimetro);
        System.out.printf("\nEl área del rectángulo de base %.2f y altura %.2f es %.2f.%n", base, altura, area);
    }
    
    // Método auxiliar para leer y devolver un número ingresado por el usuario
    private static double leerNumero(String s) {
        System.out.print(s); // Imprime el mensaje solicitado al usuario
        return sc.nextDouble(); // Lee y devuelve el número ingresado
    }
}
