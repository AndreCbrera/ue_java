package PrimerosEjeJava;

import java.util.Hashtable;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        // Usamos try-with-resources para abrir el Scanner y cerrarlo automáticamente al final
        try (Scanner sc = new Scanner(System.in)) {
            int totalNotas = 0; // Variable para acumular las notas
            int cantidadUsuarios = 3; // Número de usuarios para los que se pedirá información

            // Creamos una Hashtable para almacenar los nombres de usuarios y sus notas
            Hashtable<String, Integer> infoUsuarios = new Hashtable<String, Integer>();

            // Recorremos la cantidad de usuarios para pedir nombre y nota
            for (int i = 1; i <= cantidadUsuarios; i++) {
                // Solicitamos el nombre del usuario número i
                System.out.print("Nombre de usuario " + i + ": ");
                String nombreUsuario = sc.nextLine();

                // Solicitamos la nota del usuario ingresado
                System.out.print("Introduce nota de " + nombreUsuario + ": ");
                int notaUsuario = sc.nextInt();

                // Consumimos la nueva línea después de leer el número para evitar problemas en la próxima entrada
                sc.nextLine();

                // Guardamos el nombre y la nota en la Hashtable, usando el nombre como clave y la nota como valor
                infoUsuarios.put(nombreUsuario, notaUsuario);

                // Sumamos la nota del usuario al total de notas para calcular el promedio después
                totalNotas += notaUsuario;
            }
            // Calculamos la media de las notas dividiendo el total entre la cantidad de usuarios
            double notaMedia = (double) totalNotas / cantidadUsuarios;
            
            // Imprimimos la media con dos decimales
            System.out.printf("\nLa media de las notas es: %.2f%n", notaMedia);
        }
    }
}
