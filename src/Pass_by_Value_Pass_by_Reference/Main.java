package Pass_by_Value_Pass_by_Reference;

public class Main {

    public static void main(String[] args) {

        // Ejemplo con primitivo
        int numero = 100;

        System.out.println("Número antes del método: " + numero);

        Operaciones.cambiarNumero(numero);

        System.out.println("Número después del método: " + numero);

    
        System.out.println("\n-----------------------------");

        // Ejemplo con objeto
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.titular = "Juan";
        cuenta.saldo = 1000;

        System.out.println("Saldo antes del depósito: " + cuenta.saldo);

        Operaciones.depositar(cuenta);

        System.out.println("Saldo después del depósito: " + cuenta.saldo);
    }
}