package alturaMedia;

import java.util.Scanner;

public class AlturaMedia {

	public static void main(String[] args) {
		
		final int LONGITUD = 10;
		
		int mediaSup = 0;
		int mediaInf = 0;
		
		int suma = 0;
		
		int arrayNum[] = new int[LONGITUD];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i  < arrayNum.length; i++) {
			System.out.println("Introduce la altura de la persona n " + i + " : ");
			arrayNum[i] = sc.nextInt();		
		}
		
		for (int numero : arrayNum) {
			suma += numero;	
		}
		
		double media = (double) suma / arrayNum.length;
		
		for (int numero : arrayNum) {
			
			if (numero < media) {
				mediaInf++;
			}else {
				mediaSup++;
			}
		}
		
		System.out.println("La media es " + media);
		System.out.println("Número de personas con altura superior a la media " + mediaSup);
		System.out.println("Número de personas con altura inferior a la media " + mediaInf);
		
        sc.close();
		
	}

}
