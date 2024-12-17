package calcularLetraDNI;

import java.util.Scanner;

public class CalcularLetraDNI {

	public static void main(String[] args) {
		
		char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero del DNI: ");
        int dni = sc.nextInt();
        
        int resto = dni % 23;
                 	
        System.out.println("El completo es: " + dni + letrasDNI[resto]);
        
        
        
	}

}
