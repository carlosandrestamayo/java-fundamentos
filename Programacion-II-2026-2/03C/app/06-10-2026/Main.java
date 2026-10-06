// import models.CuentaBancaria;
// import models.Operaciones;

import models.*;

public class Main {

    public static void main(String[] args) {

        Prueba p = new Prueba("Carlos",23);
        Prueba q = new Prueba("Julio",34);
        Prueba z = new Prueba("Mario",52);
        
        Prueba [] arr =  {p, q, z};

        for(Prueba prueba : arr){
            System.out.printf("Prueba[nombre= %s, edad= %d, contador= %d]%n",prueba.nombre, prueba.edad, prueba.contador);
        }

        // //prueba.hacer(7,5);

        // //Operaciones o = new Operaciones();

        // Operaciones.mostrarInformacion();

        // //int n = o.sumar(3,5);



        // // Utilizando el constructor vacío
        // CuentaBancaria cuenta1 = new CuentaBancaria();

        // // Utilizando el constructor de 2 parámetros
        // CuentaBancaria cuenta2 =
        //         new CuentaBancaria("Carlos", "001");

        // // Utilizando el constructor de 3 parámetros
        // CuentaBancaria cuenta3 =
        //         new CuentaBancaria(
        //                 "Ana",
        //                 "002",
        //                 1_500_000
        //         );


        // // ============================
        // // Getters
        // // ============================

        // System.out.println(cuenta3.getTitular());
        // System.out.println(cuenta3.getSaldo());


        // // ============================
        // // Setter
        // // ============================

        // cuenta3.setTitular("Ana María");

        // System.out.println(cuenta3.getTitular());


        // // ============================
        // // Sobrecarga de métodos
        // // ============================

        // cuenta3.depositar(100_000);

        // cuenta3.depositar(
        //         200_000,
        //         "Pago de nómina"
        // );

        // cuenta3.depositar(
        //         300_000,
        //         "Transferencia",
        //         true
        // );


        // // ============================
        // // Método de instancia
        // // ============================

        // cuenta3.mostrarInformacion();


        // // ============================
        // // Método de clase
        // // ============================

        // System.out.println(
        //         "Cuentas creadas: "
        //         + CuentaBancaria.getTotalCuentas()
        // );

        // CuentaBancaria.mostrarTotalCuentas();
    }
}