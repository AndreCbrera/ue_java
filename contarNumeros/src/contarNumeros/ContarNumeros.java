package contarNumeros;

import java.util.Scanner;

public class ContarNumeros {

	public static void main(String[] args) {
		
		final int LONGITUD = 10;
		
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		int arrayNum[] = new int[LONGITUD];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduce un numero " + i + ": ");
			arrayNum[i] = sc.nextInt();		
		}
		
		for(int numero : arrayNum) {
			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			} else {
				ceros++;
			}
		}
		
		System.out.println("\nResultados: ");
		System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        sc.close();
	}

}
