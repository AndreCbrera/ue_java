package PrimerosEjeJava;

import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese el primer número y lo guardamos en num1
        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();
        
        // Solicitamos al usuario que ingrese el segundo número y lo guardamos en num2
        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();
        
        // Comparamos si num1 es mayor que num2
        if (num1 > num2) {
            // Si num1 es mayor, lo imprimimos como el mayor y num2 como el menor
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        } 
        
        // Comparamos si num2 es mayor que num1
        if (num2 > num1) {
            // Si num2 es mayor, lo imprimimos como el mayor y num1 como el menor
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);
        } 
        
        // Comprobamos si ambos números son iguales
        if (num1 == num2) {
            // Si son iguales, mostramos un mensaje indicando que ambos números son iguales
            System.out.println("Ambos números son iguales: " + num1);
        }
        
        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}
