package models;
import interfaces.MetodoPago;

public class TarjetaCredito implements MetodoPago {

    @Override
    public void pagar(double valor) {
        System.out.println(
            "Pagando $" + valor + " con tarjeta de crédito"
        );
    }
}