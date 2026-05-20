package Pass_by_Value_Pass_by_Reference;

public class Operaciones {

    // Método con variable primitiva
    public static void cambiarNumero(int numero) {

        numero = 1000;

        System.out.println("Dentro del método (primitivo): " + numero);
    }

    // Método con objeto
    public static void depositar(CuentaBancaria cuenta) {

        cuenta.saldo += 500;

        System.out.println("Saldo dentro del método: " + cuenta.saldo);
    }
}