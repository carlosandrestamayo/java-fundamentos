/*
 * Importamos todas las clases que se encuentran dentro
 * del paquete Models.
 *
 * Gracias a este import podemos utilizar:
 *
 * Estudiante
 * Animal
 * Perro
 * Gato
 * Zorra
 */
import Models.*;


public class Main {

    public static void main(String[] args) {


        /*
         * CREACIÓN DE UN OBJETO ESTUDIANTE
         *
         * Utilizamos el constructor de Estudiante que
         * recibe tres parámetros:
         *
         * String nombre
         * int edad
         * double nota
         *
         * Por lo tanto, Java utiliza:
         *
         * Estudiante(String nombre, int edad, double nota)
         */
        Estudiante e = new Estudiante("Carlos", 41, 5.0);


        /*
         * También podríamos utilizar cualquiera de las
         * versiones sobrecargadas de mostrarInformacion().
         *
         * Por ejemplo:
         *
         * e.mostrarInformacion();
         *
         * e.mostrarInformacion("Datos del estudiante");
         *
         * e.mostrarInformacion(true);
         *
         * La siguiente línea está comentada, pero muestra
         * que también podemos enviar una expresión booleana.
         */
        // e.mostrarInformacion(5 == 0);


        /*
         * CREACIÓN DE UN OBJETO ANIMAL
         *
         * Se utiliza el constructor de Animal que recibe:
         *
         * String nombre
         * int edad
         */
        Animal a = new Animal("perrito", 12);


        /*
         * CREACIÓN DE UN OBJETO PERRO
         *
         * Perro hereda de Animal.
         *
         * Su constructor recibe:
         *
         * nombre
         * edad
         * raza
         *
         * Internamente, el constructor de Perro utiliza
         * super(nombre, edad) para llamar al constructor
         * de Animal.
         */
        Perro p = new Perro("cuco", 13, "salchicha");


        /*
         * Podríamos llamar directamente al método
         * sobrescrito de Perro:
         *
         * p.hacerSonido();
         *
         * El resultado sería:
         *
         * El perro dice: Guau
         */
        // p.hacerSonido();


        /*
         * CREACIÓN DE UN OBJETO GATO
         *
         * Gato también hereda de Animal.
         *
         * Su constructor recibe:
         *
         * nombre
         * edad
         * color
         */
        Gato g = new Gato("milluti", 12, "naranja");


        /*
         * CREACIÓN DE UN OBJETO ZORRA
         *
         * Zorra también hereda de Animal.
         *
         * Su constructor recibe:
         *
         * nombre
         * edad
         */
        Zorra z = new Zorra("la tuya", 11);


        /*
         * POLIMORFISMO
         *
         * Aquí aparece una de las partes más importantes
         * del ejemplo.
         *
         * Creamos un arreglo cuyo tipo es Animal:
         *
         * Animal[]
         *
         * Sin embargo, dentro del arreglo podemos almacenar
         * objetos de las clases hijas de Animal:
         *
         * Perro
         * Gato
         * Zorra
         *
         * Esto es posible porque Perro, Gato y Zorra
         * HEREDAN de Animal.
         */
        Animal[] arr = {p, g, z};


        /*
         * RECORRIDO DEL ARREGLO
         *
         * Utilizamos un for-each para recorrer todos
         * los elementos del arreglo.
         *
         * En cada iteración, la variable "animal"
         * representa uno de los objetos almacenados.
         */
        for (Animal animal : arr) {


            /*
             * POLIMORFISMO
             *
             * Aunque la variable "animal" es de tipo Animal,
             * Java determina qué versión de hacerSonido()
             * debe ejecutar según el objeto que realmente
             * se encuentra almacenado.
             *
             * Si el objeto es Perro:
             *     → El perro dice: Guau
             *
             * Si el objeto es Gato:
             *     → El gato dice: Miau
             *
             * Si el objeto es Zorra:
             *     → Que rica la fruta
             */
            animal.hacerSonido();
        }


        /*
         * También podríamos llamar directamente al método
         * de Zorra:
         *
         * z.hacerSonido();
         */
        // z.hacerSonido();
    }
}