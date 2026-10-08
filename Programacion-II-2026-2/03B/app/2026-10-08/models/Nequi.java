package models;
import interfaces.MetodoPago;

public class Nequi implements MetodoPago {

    @Override
    public void pagar(double valor) {
        System.out.println(
            "Pagando $" + valor + " mediante Nequi"
        );
    }
}

