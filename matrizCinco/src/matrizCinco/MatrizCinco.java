package matrizCinco;

import java.util.Random;
import java.util.Scanner;

public class MatrizCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de columnas: ");
        int nColumnas = scanner.nextInt();

        // Crear una matriz de 5 filas y n columnas
        int[][] matriz = new int[5][nColumnas];

        // Llenar la matriz con números aleatorios
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = random.nextInt(11); // Números aleatorios entre 0 y 10
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
