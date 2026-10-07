package models;
public class CuentaBancaria {

    // ============================
    // Atributos
    // ============================

    private String titular;
    private String numero;
    private double saldo;

    // Atributo de clase
    private static int totalCuentas = 0;


    // ============================
    // Constructores
    // ============================

    // Constructor 1
    public CuentaBancaria() {
        this("Sin titular", "0000", 0.0);
    }

    // Constructor 2
    public CuentaBancaria(String titular, String numero) {
        this(titular, numero, 0.0);
    }

    // Constructor 3
    public CuentaBancaria(String titular, String numero, double saldo) {

        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

        totalCuentas++;
    }


    // ============================
    // Getters y Setters
    // ============================

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    // ============================
    // Métodos sobrecargados
    // ============================

    // depositar() con un parámetro
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    // depositar() con dos parámetros
    public void depositar(double cantidad, String concepto) {
        saldo += cantidad;

        System.out.println(
            "Depósito: " + concepto +
            " | Cantidad: $" + cantidad
        );
    }

    // depositar() con tres parámetros
    public void depositar(double cantidad, String concepto, boolean mostrar) {

        saldo += cantidad;

        if (mostrar) {
            System.out.println(
                "Depósito: " + concepto +
                " | Cantidad: $" + cantidad +
                " | Nuevo saldo: $" + saldo
            );
        }
    }


    // ============================
    // Métodos de clase
    // ============================

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public static void mostrarTotalCuentas() {
        System.out.println(
            "Total de cuentas creadas: " + totalCuentas
        );
    }


    // ============================
    // Método de instancia
    // ============================

    public void mostrarInformacion() {

        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: $" + saldo);
    }
}