package models;
public class TiendaOld {

    public void realizarPago(String metodo, double valor) {

        if (metodo.equals("tarjeta")) {
            System.out.println(
                "Pagando $" + valor + " con tarjeta de crédito"
            );
        }

        if (metodo.equals("paypal")) {
            System.out.println(
                "Pagando $" + valor + " mediante PayPal"
            );
        }

        if (metodo.equals("nequi")) {
            System.out.println(
                "Pagando $" + valor + " mediante Nequi"
            );
        }

        if (metodo.equals("bitcoin")) {
            System.out.println(
                "Pagando $" + valor + " mediante Bitcoin"
            );
        }
    }
}