package arrayVehiculo;

import java.util.Scanner;

public class ArrayVehiculos {

	public static void main(String[] args) {
		
        String[][] datosVehiculos = new String[2][3];

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nCONCESIONARIO VEHÍCULOS\n");
		
		int index = 0;
				 
		while (index < 2) {
	        System.out.println("Ingrese numero de DNI: ");
	        String dni = sc.nextLine();

	        System.out.println("Ingrese matricula del coche: ");
	        String matricula = sc.nextLine();

	        System.out.println("Ingrese modelo del coche: ");
	        String modelo = sc.nextLine();

            datosVehiculos[index][0] = dni;
            datosVehiculos[index][1] = matricula;
            datosVehiculos[index][2] = modelo;

            index++;
		}
        System.out.println("\nDatos de los vehículos ingresados:");
        for (int i = 0; i < index; i++) {
            System.out.println("DNI: " + datosVehiculos[i][0] +
                               ", Matricula: " + datosVehiculos[i][1] +
                               ", Modelo: " + datosVehiculos[i][2]);
        }

        sc.close();
	}
}
