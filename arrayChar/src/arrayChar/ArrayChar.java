package arrayChar;

import java.util.Scanner;

public class ArrayChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		char[][] a;
		
		do {
			System.out.println("Introduzca un número: ");
			n = sc.nextInt();
			
			if(n  >0) {
				a = new char[n][n];
				rellenarArray(a);
				mostrarArray(a);
			}
		} while (n > 0);
		System.out.println("Saliendo del programa...");
	}
	
	public static void rellenarArray(char[][] a) {
		for (int fila = 0; fila < a.length; fila++) {
			for (int columna = 0; columna < a[fila].length; columna++) {
				if(fila == columna) {
					a[fila][columna] = 'A';
				} else {
					a[fila][columna] = '*';
				}
			}
		}
	}
	
	public static void mostrarArray(char[][] a) {
	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            System.out.print(a[i][j] + " "); // Print on the same line
	        }
	        System.out.println(); // Move to the next line after each row
	    }
	}

}
