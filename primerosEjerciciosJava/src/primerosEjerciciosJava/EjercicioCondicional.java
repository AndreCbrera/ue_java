package primerosEjerciciosJava;

import java.util.Scanner;

public class EjercicioCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu edad: ");
		edad= sc.nextInt();
		
		if (edad>=18) {
			System.out.println("Puedes votar.");
		} else {
			System.out.println("No puedes votar.");
		}
		System.out.println("Prueba condicional simple.");
	}
}
