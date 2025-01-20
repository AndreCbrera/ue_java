package cuentasBancarias;

public class Cuenta {
    // Atributos de la clase
    protected String dni; // DNI del titular de la cuenta
    protected double saldo; // Saldo disponible en la cuenta

    // Constructor: requiere el DNI del titular
    public Cuenta(String dni) {
        this.dni = dni; // Asigna el DNI proporcionado
        this.saldo = 0; // El saldo predeterminado es 0 si no se especifica
    }

    // Constructor: requiere el DNI y el saldo inicial
    public Cuenta(String dni, double saldoInicial) {
        this.dni = dni; // Asigna el DNI proporcionado
        this.saldo = Math.max(saldoInicial, 0); // Asegura que el saldo no sea negativo
    }

    // Método para ingresar dinero en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            // Si la cantidad es positiva, se suma al saldo actual
            saldo += cantidad;
            System.out.println("Se ingresaron " + cantidad + "€ en la cuenta del titular " + dni);
        } else {
            // Si la cantidad es negativa o 0, no se realiza la operación
            System.out.println("La cantidad a ingresar siempre debe ser positiva");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                // Si hay suficiente saldo, se descuenta la cantidad
                saldo -= cantidad;
                System.out.println("Se han retirado " + cantidad + "€ de la cuenta del titular " + dni);
            } else {
                // Si no hay suficiente saldo, el saldo pasa a ser 0
                System.out.println("Saldo insuficiente. La cuenta pasará a un saldo de 0€.");
                saldo = 0;
            }
        } else {
            // Si la cantidad es negativa o 0, no se realiza la operación
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Métodos Getters y Setters

    // Obtiene el DNI del titular de la cuenta
    public String getDni() {
        return dni;
    }

    // Establece el DNI del titular de la cuenta
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Obtiene el saldo disponible en la cuenta
    public double getSaldo() {
        return saldo;
    }

    // Establece un nuevo saldo para la cuenta (siempre no negativo)
    public void setSaldo(double saldo) {
        this.saldo = Math.max(saldo, 0); // Asegura que el saldo no sea negativo
    }

    // Sobrescribe el método toString para mostrar información útil de la cuenta
    @Override
    public String toString() {
        return "DNI: " + dni + ", Saldo: " + saldo + "€";
    }
}
