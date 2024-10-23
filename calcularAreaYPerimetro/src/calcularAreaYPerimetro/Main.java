package calcularAreaYPerimetro;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		
		do {
			System.out.println("\n Selecciona una fugura: ");
			System.out.println("1. Circulo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Rectangulo");
			System.out.println("4. Triangulo");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					calcularCirculo();
					break;
				case 2:
					calcularCuadrado();
					break;
				case 3:
					calcularRectangular();
					break;
				case 4:
					calcularTriangulo();
					break;
				case 5:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida. Escoge una las opciones en pantalla.");
			
			}
		}while(opcion != 4);
		
	}
	
    private static void calcularCirculo() {
        double radio = leerNumero("Introduce el radio del círculo: ");
        double area, perimetro;
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("\nEl perímetro del círculo de radio %.2f es %.2f.", radio, perimetro);
        System.out.printf("\nEl área del círculo de radio %.2f es %.2f.%n", radio, area);
    }
    
    private static void calcularCuadrado() {
    	double lado = leerNumero("Introduce el lado del cuadrado: ");
    	double area, perimetro;
    	perimetro = 4 * lado;
    	area = lado * lado;
    	System.out.printf("\nEl perímetro del cuadrado de lado %.2f es %.2f.", lado, perimetro);
        System.out.printf("\nEl área del cuadrado de lado %.2f es %.2f.%n", lado, area);
    }
    
    private static void calcularTriangulo() {
    	double base = leerNumero("Introduce la base del triángulo: ");
    	double altura = leerNumero("Intruduce la altura del triángulo: ");
    	double lado1 = leerNumero("Intruduce el lado 1 del triangulo: ");
    	double lado2 = leerNumero("Introduce el lado 2 del triangulo: ");
    	double lado3 = leerNumero("Intruduce el lado 3 del triangulo: ");
    
    	double perimetro = lado1 + lado2 + lado3;
    	double area = (base * altura) / 2;
  
        System.out.printf("\nEl perímetro del triángulo es %.2f.", perimetro);
        System.out.printf("\nEl área del triángulo es %.2f.%n", area);
    }
    
    private static void calcularRectangular() {
    	double base = leerNumero("Introdice la base del rectángulo: ");
    	double altura = leerNumero("Introduce la altura del rectángulo: ");
    	double perimetro = 2 * (base + altura);
    	double area = base * altura;
    	System.out.printf("\nEl perímetro del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, perimetro);
        System.out.printf("\nEl área del rectángulo de base %.2f y altura %.2f es %.2f.%n", base, altura, area);
     }
    	
	private static double leerNumero(String s) {
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();	
	}
}
