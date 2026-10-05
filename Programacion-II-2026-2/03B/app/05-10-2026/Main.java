import models.Persona;
import models.NombresValidos;
import models.*;
import herencia.*;

public class Main{
    public static void main(String[] args){
        // Persona p = new Persona("luisa");
        // System.out.println(p.getNombre());

        // System.out.println("Nombres del arreglo en la clase");
        // int i = 1;
        // for(String str : NombresValidos.getNombres()){
        //     System.out.printf("%d. %s%n", i++, str);
        // }

        // // Persona.nombres[0] = "gyudegfgyugfr";

        // i = 1;
        // for(String str : Persona.getNombres()){
        //     System.out.printf("%d. %s%n", i++, str);
        // }

        //Operaciones operaciones = new Operaciones();

        // System.out.println("La suma es => " + Operaciones.sumar(3,4));
        // System.out.println("El valor absoluto es => " + Operaciones.absoluto(-23));

        //Figura f = new Figura("Nombre");
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(10, 4);

        f1.mostrarNombre();
        System.out.println("Área: " + f1.calcularArea());

        System.out.println();

        f2.mostrarNombre();
        System.out.println("Área: " + f2.calcularArea());


    }
}