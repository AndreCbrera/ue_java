package primerosEjerciciosJava;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1 = 5, op2 = 7, resta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el primer numero: ");
		op1 = sc.nextInt(); // Lectura de valor int
		System.out.print("Dime el segundo numero: ");
		op2 = sc.nextInt(); // Lectura de valor int
		
		/*
		sc.next(); // Lectura de cadena de texto, hasta que encuentre un espacio
		sc.nextLine(); // Lectura de cadena de texto entera
		sc.nextDouble(); // Lectura de valor doble
		*/
		
		System.out.println("La suma de " + op1 + " más " + op2 + " es " + (op1+op2));
		resta = op1 - op2;
		System.out.println("La resta de " + op1 + " más " + op2 + " es " + resta);
		System.out.println("La multiplicación de " + op1 + " más " + op2 + " es " + (op1*op2));
		System.out.println("La división de " + op1 + " más " + op2 + " es " + (op1/op2));
		System.out.println("El resto de " + op1 + " más " + op2 + " es " + (op1%op2));
	}
}
