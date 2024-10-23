package casosPracticosUnidad2;

import java.util.Random;

public class DatosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		// Esto no se como funciona...
		byte[] arr = new byte[7];
		random.nextBytes(arr);
		System.out.println(arr);
		
		// Numero aleatorio byte
		byte numeroByte = (byte) random.nextInt(256);
		System.out.println(numeroByte);
		// Numero aleatorio short
		short numeroShort = (short) random.nextInt(Short.MAX_VALUE + 1);
		System.out.println(numeroShort);
		// Numero aleatprio int
		int numeroInt = (int) random.nextInt();
		System.out.println(numeroInt);
		// Numero aleatprio long
		long numeroLong = (long) random.nextLong();
		System.out.println(numeroLong);

	}

}
