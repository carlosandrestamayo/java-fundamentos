import models.*;

public class Main {

    public static void main(String[] args) {

        /*
         * Creamos un objeto de la clase Perro.
         *
         * Perro hereda de Animal, por lo tanto también posee
         * los atributos y métodos definidos en Animal.
         *
         * En este caso utilizamos el constructor:
         *
         * Perro(String nombre, String color, int edad)
         */
        Perro perro = new Perro("", "", 2);

        /*
         * Aunque hacerSonido() está definido originalmente
         * en Animal, Perro tiene su propia implementación
         * del método.
         *
         * Esto es un ejemplo de SOBRESCRITURA (Override).
         */
        perro.hacerSonido();


        /*
         * =========================================================
         * EJEMPLO DE HERENCIA
         * =========================================================
         *
         * Animal es la clase padre o superclase.
         *
         * Perro, Gato y Zorra son clases hijas o subclases.
         *
         * Una subclase puede utilizar los atributos y métodos
         * públicos de su clase padre.
         */

        // Animal a = new Animal("fiufiu", "cafe");

        // Perro p = new Perro("Pastor Aleman", "rosadito", 13);

        // Gato g = new Gato("Milluti");

        // Zorra z = new Zorra("Esperanza", "Gomez", 60.0);


        /*
         * =========================================================
         * POLIMORFISMO
         * =========================================================
         *
         * Una variable de tipo Animal puede almacenar objetos
         * de cualquiera de sus clases hijas.
         *
         * Por ejemplo:
         *
         * Animal animal = new Perro(...);
         *
         * La referencia es de tipo Animal, pero el objeto real
         * es un Perro.
         *
         * Esto permite trabajar con diferentes tipos de objetos
         * utilizando una misma referencia.
         */

        // Animal[] arr = {p, g, z};


        /*
         * Recorremos el arreglo utilizando un for-each.
         *
         * La variable "b" es de tipo Animal.
         *
         * Sin embargo, Java ejecutará el método hacerSonido()
         * correspondiente al objeto real.
         *
         * Por ejemplo:
         *
         *     Perro -> sonido del perro
         *     Gato  -> sonido del gato
         *     Zorra -> sonido de la zorra
         *
         * Este comportamiento se conoce como POLIMORFISMO.
         */

        // for (Animal b : arr) {
        //     b.hacerSonido();
        // }


        /*
         * =========================================================
         * TEXT BLOCK
         * =========================================================
         *
         * Java permite utilizar tres comillas dobles (""")
         * para escribir cadenas de texto multilínea.
         *
         * También podemos insertar valores utilizando
         * marcadores como %s y %b.
         */

        // System.out.printf(
        //     """
        //     Gato:
        //         Nombre: %s
        //         Color: %s
        //         Macho: %b
        //     """,
        //     g.getNombre(),
        //     g.getColor(),
        //     g.isMale()
        // );
    }
}
