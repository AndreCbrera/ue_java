package salarioTrabajador;

public class SalarioTrabajador {
	
	// Atributos privados
	private String nombreTrabajador;
	private String apellidoTrabajador;
	private char claseTrabajador;
	private double sueldoMensual;
	
	// Constructor para inciiarlizar los atributos
	public SalarioTrabajador(String nombreTrabajador, String apellidoTrabajador, char claseTrabajador, double sueldoMensual) {
		this.apellidoTrabajador = apellidoTrabajador;
		this.nombreTrabajador = nombreTrabajador;
		this.claseTrabajador = claseTrabajador;
		this.sueldoMensual = Math.max(sueldoMensual, 0.0);
	}

}
