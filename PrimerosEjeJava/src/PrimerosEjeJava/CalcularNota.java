package PrimerosEjeJava;

import java.util.Scanner;

public class CalcularNota {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Mensaje inicial que indica el propósito del programa
        System.out.println("Saber si el alumno ha aprobado o no");
        
        // Pedimos el nombre del alumno y lo almacenamos en la variable `nombre`
        System.out.print("Introduce nombre del alumno: ");
        String nombre = sc.nextLine();
        
        // Pedimos la nota del alumno y la almacenamos en la variable `nota`
        System.out.print("Introduce nota: ");
        int nota = sc.nextInt();
        
        // Verificamos si la nota es menor o igual a 4
        if (nota <= 4) {
            // Si la nota está entre 0 y 4, el alumno tiene un INSUFICIENTE
            System.out.printf("\nEl alumno %s tiene un INSUFICIENTE como nota.", nombre);
        }
        
        // Verificamos si la nota es exactamente 5
        if (nota == 5) {
            // Si la nota es 5, el alumno tiene un SUFICIENTE
            System.out.printf("\nEl alumno %s tiene un SUFICIENTE como nota.", nombre);
        }
        
        // Verificamos si la nota es exactamente 6
        if (nota == 6) {
            // Si la nota es 6, el alumno tiene un BIEN
            System.out.printf("\nEl alumno %s tiene un BIEN como nota.", nombre);
        }
        
        // Verificamos si la nota está entre 7 y 8, ambos inclusive
        if (nota >= 7 && nota <= 8) {
            // Si la nota está entre 7 y 8, el alumno tiene un NOTABLE
            System.out.printf("\nEl alumno %s tiene un NOTABLE como nota.", nombre);
        }
        
        // Verificamos si la nota es exactamente 9
        if (nota == 9) {
            // Si la nota es 9, el alumno tiene un SOBRESALIENTE
            System.out.printf("\nEl alumno %s tiene un SOBRESALIENTE como nota.", nombre);
        }
        
        // Verificamos si la nota es exactamente 10
        if (nota == 10) {
            // Si la nota es 10, el alumno tiene una MATRICULA DE HONOR
            System.out.printf("\nEl alumno %s tiene una MATRICULA DE HONOR como nota.", nombre);
        }
        
        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}
