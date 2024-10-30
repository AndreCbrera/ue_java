package PrimerosEjeJava;

import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario desde el teclado
        Scanner sc = new Scanner(System.in);
        
        // Mensaje inicial para indicar al usuario el propósito del programa
        System.out.println("Comprobar si un número es par o impar");
        
        // Pedimos al usuario que ingrese un número y lo almacenamos en la variable `num`
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        
        // Condicional para verificar si el número es par o impar
        // Usamos el operador módulo (%) para ver si el residuo de `num` dividido por 2 es cero
        if (num % 2 == 0) {
            // Si el residuo es cero, el número es par
            System.out.println("El número " + num + " es par.");
        } 
        if (num % 2 != 0){
            // Si el residuo no es cero, el número es impar
            System.out.println("El número " + num + " es impar.");
        }
        
        // Cerramos el objeto Scanner para liberar los recursos
        sc.close();
    }
}
