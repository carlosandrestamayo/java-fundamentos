// Clase principal donde se ejecuta el programa
public class Main {

    public static void main(String[] args) {

        // Se crea un objeto Cliente
        Cliente c1 = new Cliente("Carlos", "123");

        // Se crea una cuenta bancaria asociada al cliente
        CuentaBancaria cuenta = new CuentaBancaria(c1, 1000);

        // Se realiza un depósito
        cuenta.depositar(500);

        // Se realiza un retiro
        cuenta.retirar(200);

        // Se muestra la información final
        cuenta.mostrarInfo();
    }
}