// Clase que representa una cuenta bancaria
public class CuentaBancaria {

    // Relación: una cuenta tiene un cliente (composición)
    private Cliente cliente;

    // Atributo que almacena el saldo de la cuenta
    private double saldo;

    // Constructor: recibe un cliente y un saldo inicial
    public CuentaBancaria(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double monto) {

        // Se suma el monto al saldo actual
        saldo += monto;
    }

    // Método para retirar dinero
    public void retirar(double monto) {

        // Validación: no se puede retirar más dinero del disponible
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInfo() {

        // Se accede al nombre del cliente a través del objeto cliente
        System.out.println("Cliente: " + cliente.getNombre());

        // Se muestra el saldo actual
        System.out.println("Saldo: " + saldo);
    }
}