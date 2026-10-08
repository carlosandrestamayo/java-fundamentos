package models;
import interfaces.MetodoPago;

public class Store {
    public void realizarPago(MetodoPago metodoPago, double valor) {
        metodoPago.pagar(valor);
    }
}