package matrizTres;

public class MatrizTres {

	public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int numero = 1;

        // Llenar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }

        // Mostrar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
