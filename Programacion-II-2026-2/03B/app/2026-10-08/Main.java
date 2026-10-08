import models.*;
//import models.PayPal;


public class Main{
    public static void main(String [] args){
        // Tienda tienda = new Tienda();

        // tienda.realizarPago("tarjeta", 150000);
        // tienda.realizarPago("paypal", 200000);
        // tienda.realizarPago("nequi", 80000);

        // tienda.realizarPago("bitcoin",345000);  

        Store tienda = new Store();

        tienda.realizarPago(
            new TarjetaCredito(),
            150000
        );

        tienda.realizarPago(
            new PayPal(),
            200000
        );

        tienda.realizarPago(
            new Nequi(),
            200000
        );
        
              
    }
}