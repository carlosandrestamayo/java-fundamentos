import interfaces.MetodoPago;
package models;

public class Tienda {

    public void realizarPago(MetodoPago metodoPago, double valor) {
        metodoPago.pagar(valor);
    }
}