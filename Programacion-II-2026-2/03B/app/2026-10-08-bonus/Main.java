import models.*;
import interfaces.*;

public class Main {

    public static void main(String[] args) {

        // Empleado fijo
        Empleado empleado1 = new EmpleadoFijo(
            "Carlos",
            3000000,
            500000
        );

        // Empleado freelance
        Empleado empleado2 = new FreeLance(
            "Ana",
            160,
            25000
        );

        // Polimorfismo
        System.out.println("Empleado 1");
        System.out.println("Salario: $" + empleado1.calcularSalario());

        System.out.println();

        System.out.println("Empleado 2");
        System.out.println("Salario: $" + empleado2.calcularSalario());

        // Uso de la interfaz
        System.out.println();

        Facturable facturable = new FreeLance(
            "Pedro",
            100,
            30000
        );

        facturable.generarFactura();
    }
}