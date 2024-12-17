package arrayDiezNum;

import java.util.Scanner;

public class ArrayDiezNum {
	public static void main(String[] args) {
		
		final int LONGITUD = 10;
		
		int arrayNum[] = new int[LONGITUD];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < arrayNum.length; i++) {
			System.out.println("Introduce un número: ");
			arrayNum[i] = sc.nextInt();		
		}
		sc.close();
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("En el indice " + i + " esta el valor " + arrayNum[i]);
		}
	}
}
