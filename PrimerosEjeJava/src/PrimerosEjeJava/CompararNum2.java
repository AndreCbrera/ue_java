package PrimerosEjeJava;

import java.util.Scanner;

public class CompararNum2 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario el primer número y lo almacenamos en la variable num1
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        // Solicitamos al usuario el segundo número y lo almacenamos en la variable num2
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // Solicitamos al usuario el tercer número y lo almacenamos en la variable num3
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        // Variables para almacenar el mayor, medio y menor número
        int mayor, medio, menor;
        
        /* Utilizamos operadores lógicos para comparar los números ingresados.
         * El operador lógico "&&" (Y) nos permite verificar varias condiciones a la vez.
         */
        
        // Primera condición: si num1 es mayor o igual a num2 y también a num3
        if (num1 >= num2 && num1 >= num3) {
            // Si num1 es el mayor, lo asignamos a la variable `mayor`
            mayor = num1;
            
            // Ahora comprobamos si num2 es mayor o igual a num3
            if (num2 >= num3) {
                // Si num2 es mayor o igual a num3, asignamos num2 como `medio` y num3 como `menor`
                medio = num2;
                menor = num3;
            } else {
                // De lo contrario, num3 es el `medio` y num2 es el `menor`
                medio = num3;
                menor = num2;
            }
            
        // Segunda condición: si num2 es mayor o igual a num1 y también a num3
        } else if (num2 >= num1 && num2 >= num3) {
            // Si num2 es el mayor, lo asignamos a la variable `mayor`
            mayor = num2;
            
            // Comprobamos si num1 es mayor o igual a num3
            if (num1 >= num3) {
                // Si num1 es mayor o igual a num3, asignamos num1 como `medio` y num3 como `menor`
                medio = num1;
                menor = num3;
            } else {
                // De lo contrario, num3 es el `medio` y num1 es el `menor`
                medio = num3;
                menor = num1;
            }
            
        // Tercera condición: si ni num1 ni num2 son el mayor, entonces num3 es el mayor
        } else {
            // Asignamos num3 a la variable `mayor`
            mayor = num3;
            
            // Comprobamos si num1 es mayor o igual a num2
            if (num1 >= num2) {
                // Si num1 es mayor o igual a num2, asignamos num1 como `medio` y num2 como `menor`
                medio = num1;
                menor = num2;
            } else {
                // De lo contrario, num2 es el `medio` y num1 es el `menor`
                medio = num2;
                menor = num1;
            }
        }

        // Mostramos los números en orden descendente: mayor, medio y menor
        System.out.println("Números en orden descendente: " + mayor + ", " + medio + ", " + menor);

        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}
