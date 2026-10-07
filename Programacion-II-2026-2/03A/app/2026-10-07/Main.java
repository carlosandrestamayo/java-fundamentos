import models.*;

public class Main {

    public static void main(String[] args) {

        /*
         * ============================================================
         * 1. CREACIÓN DE UN OBJETO DE LA CLASE ANIMAL
         * ============================================================
         *
         * Animal es la clase base de nuestra jerarquía.
         *
         * Creamos un objeto utilizando el operador new:
         *
         *     new Animal()
         *
         * La variable "animal" almacena una REFERENCIA al objeto.
         */
        Animal animal = new Animal();


        /*
         * ============================================================
         * 2. ENCAPSULAMIENTO
         * ============================================================
         *
         * El atributo nombre de Animal está declarado como private:
         *
         *     private String nombre;
         *
         * Por lo tanto, desde Main NO podemos hacer:
         *
         *     animal.nombre = "Don Jediondo";  // ERROR
         *
         * En su lugar utilizamos el método setter:
         *
         *     setNombre()
         *
         * Esto es una aplicación del principio de
         * ENCAPSULAMIENTO.
         */
        animal.setNombre("Don Jediondo");


        /*
         * Podemos recuperar el valor mediante el getter:
         *
         *     getNombre()
         */
        System.out.println("Nombre del animal: " + animal.getNombre());


        /*
         * El método pedirComida() pertenece originalmente
         * a la clase Animal.
         */
        System.out.print("Animal: ");
        animal.pedirComida();


        /*
         * ============================================================
         * 3. CREACIÓN DE UN MAMÍFERO
         * ============================================================
         *
         * Mamifero hereda de Animal:
         *
         *     public class Mamifero extends Animal
         *
         * Por lo tanto, un objeto Mamifero puede utilizar
         * los métodos heredados de Animal.
         */
        Mamifero mamifero = new Mamifero();

        /*
         * setNombre() no está declarado dentro de Mamifero.
         *
         * Sin embargo, podemos utilizarlo porque Mamifero
         * lo HEREDA de Animal.
         */
        mamifero.setNombre("Tapia");


        /*
         * edad sí es un atributo propio de Mamifero.
         */
        mamifero.setEdad(15);


        /*
         * Podemos utilizar los métodos heredados y los métodos
         * propios de Mamifero.
         */
        System.out.println();
        System.out.println("Nombre: " + mamifero.getNombre());
        System.out.println("Edad: " + mamifero.getEdad());


        /*
         * ============================================================
         * 4. SOBRESCRITURA DE MÉTODOS
         * ============================================================
         *
         * Animal tiene:
         *
         *     pedirComida()
         *
         * Mamifero sobrescribe ese método utilizando @Override.
         *
         * Por lo tanto, cuando hacemos:
         *
         *     mamifero.pedirComida();
         *
         * se ejecuta la versión definida en Mamifero.
         */
        System.out.print("Mamífero: ");
        mamifero.pedirComida();


        /*
         * ============================================================
         * 5. CREACIÓN DE UN PERRO
         * ============================================================
         *
         * Perro hereda de Mamifero:
         *
         *     Perro extends Mamifero
         *
         * Y Mamifero hereda de Animal:
         *
         *     Mamifero extends Animal
         *
         * Tenemos entonces una HERENCIA MULTINIVEL:
         *
         *
         *              Animal
         *                 ↑
         *              Mamifero
         *                 ↑
         *               Perro
         *
         * Por esta razón Perro puede utilizar:
         *
         * - métodos de Animal
         * - métodos de Mamifero
         * - sus propios métodos
         */
        Perro perro = new Perro();


        /*
         * setNombre() viene originalmente de Animal.
         */
        perro.setNombre("Carlitos Wey");


        /*
         * setEdad() viene de Mamifero.
         *
         * Aunque Perro no declara este método,
         * lo puede utilizar porque lo hereda.
         */
        perro.setEdad(23);


        /*
         * Podemos comprobar que el Perro tiene acceso
         * tanto al nombre como a la edad.
         */
        System.out.println();
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Edad del perro: " + perro.getEdad());


        /*
         * Perro también sobrescribe pedirComida().
         *
         * Por lo tanto se ejecuta la versión de Perro.
         */
        System.out.print("Perro: ");
        perro.pedirComida();


        /*
         * ============================================================
         * 6. POLIMORFISMO
         * ============================================================
         *
         * Aquí aparece uno de los conceptos más importantes
         * de la Programación Orientada a Objetos.
         *
         * Podemos crear un arreglo cuyo tipo sea Animal:
         *
         *     Animal[]
         *
         * y almacenar objetos de diferentes clases hijas:
         *
         *     Animal
         *     Mamifero
         *     Perro
         *
         * Esto es posible porque:
         *
         * Mamifero ES un Animal
         *
         * Perro ES un Mamifero
         *
         * y, por consecuencia:
         *
         * Perro ES un Animal
         */
        Animal[] arr = {
            animal,
            mamifero,
            perro
        };


        /*
         * ============================================================
         * 7. RECORRER EL ARREGLO
         * ============================================================
         *
         * Utilizamos un for-each.
         *
         * La variable "a" será de tipo Animal.
         *
         * Sin embargo, cada posición puede contener un objeto
         * diferente:
         *
         * posición 0 -> Animal
         * posición 1 -> Mamifero
         * posición 2 -> Perro
         */
        int i = 1;

        for (Animal a : arr) {

            System.out.printf("%nAnimal %d%n", i++);


            /*
             * getNombre() está definido en Animal.
             *
             * Como todos los objetos del arreglo son animales,
             * podemos llamar directamente este método.
             */
            System.out.println("Nombre: " + a.getNombre());


            /*
             * ========================================================
             * 8. INSTANCEOF
             * ========================================================
             *
             * Aquí queremos saber si el objeto almacenado
             * en "a" pertenece a Mamifero o a alguna subclase
             * de Mamifero.
             *
             * instanceof devuelve:
             *
             * true  -> si el objeto cumple la relación.
             * false -> si no la cumple.
             *
             * Por ejemplo:
             *
             * animal instanceof Mamifero
             *
             * devuelve false.
             *
             * Mientras que:
             *
             * mamifero instanceof Mamifero
             *
             * devuelve true.
             *
             * Y también:
             *
             * perro instanceof Mamifero
             *
             * devuelve true.
             *
             * ¿Por qué?
             *
             * Porque Perro HEREDA de Mamifero.
             */
            if (a instanceof Mamifero) {


                /*
                 * ====================================================
                 * 9. CASTING
                 * ====================================================
                 *
                 * La variable "a" es declarada como Animal:
                 *
                 *     Animal a
                 *
                 * Por lo tanto, Java solamente permite utilizar
                 * los métodos conocidos por Animal.
                 *
                 * Animal NO tiene:
                 *
                 *     getEdad()
                 *
                 * Pero Mamifero sí tiene:
                 *
                 *     getEdad()
                 *
                 * Por eso realizamos un CASTING:
                 *
                 *     (Mamifero) a
                 *
                 * Estamos diciendo:
                 *
                 * "Trata esta referencia Animal como una
                 * referencia Mamifero."
                 */
                Mamifero clon = (Mamifero) a;


                /*
                 * Ahora podemos utilizar getEdad(), porque
                 * "clon" es una referencia de tipo Mamifero.
                 */
                System.out.println("Edad: " + clon.getEdad());
            }


            /*
             * ========================================================
             * 10. POLIMORFISMO EN ACCIÓN
             * ========================================================
             *
             * Esta línea es especialmente importante:
             *
             *     a.pedirComida();
             *
             * La variable "a" siempre es de tipo Animal.
             *
             * Pero Java observa el TIPO REAL DEL OBJETO.
             *
             * Si el objeto es Animal:
             *
             *     Animal -> "Quiero comida"
             *
             * Si el objeto es Mamifero:
             *
             *     Mamifero -> "Quiero leche..."
             *
             * Si el objeto es Perro:
             *
             *     Perro -> "Quien Tampico..."
             *
             * Esto es POLIMORFISMO.
             */
            System.out.print("Comida: ");
            a.pedirComida();
        }


        /*
         * ============================================================
         * 11. ARREGLO DE MAMÍFEROS
         * ============================================================
         *
         * También podemos crear un arreglo de Mamifero:
         *
         *     Mamifero[] arrMamiferos
         *
         * Aquí podemos almacenar:
         *
         * - Mamifero
         * - Perro
         *
         * porque Perro ES un Mamifero.
         *
         * Pero NO podemos almacenar directamente un Animal.
         *
         * Esto NO sería válido:
         *
         *     Mamifero[] arr = {animal};
         *
         * porque no todos los Animal son necesariamente Mamiferos.
         */
        Mamifero[] arrMamiferos = {
            mamifero,
            perro
        };


        System.out.println();
        System.out.println("===== ARREGLO DE MAMÍFEROS =====");


        for (Mamifero m : arrMamiferos) {

            /*
             * getNombre() viene de Animal.
             */
            System.out.println("Nombre: " + m.getNombre());


            /*
             * getEdad() viene de Mamifero.
             */
            System.out.println("Edad: " + m.getEdad());


            /*
             * pedirComida() puede ser la implementación de
             * Mamifero o la implementación de Perro.
             *
             * Nuevamente aparece el POLIMORFISMO.
             */
            m.pedirComida();

            System.out.println();
        }


        /*
         * ============================================================
         * 12. REFERENCIA DE TIPO ANIMAL Y OBJETO PERRO
         * ============================================================
         *
         * Esta instrucción es perfectamente válida:
         *
         *     Animal x = new Perro();
         *
         * ¿Por qué?
         *
         * Porque un Perro ES un Animal.
         *
         * Podemos representarlo así:
         *
         *     Animal x
         *          ↓
         *     ┌───────────┐
         *     │  Perro    │
         *     └───────────┘
         *
         * La referencia es Animal.
         *
         * El objeto real es Perro.
         */
        Animal x = new Perro();


        /*
         * Podemos utilizar setNombre() porque este método
         * está definido en Animal.
         */
        x.setNombre("xxx");

        System.out.println();
        System.out.println("===== REFERENCIA ANIMAL =====");
        System.out.println("Nombre: " + x.getNombre());


        /*
         * Y aquí aparece nuevamente el POLIMORFISMO.
         *
         * Aunque "x" es una referencia Animal,
         * el objeto real es Perro.
         *
         * Por lo tanto se ejecuta:
         *
         *     Perro.pedirComida()
         */
        System.out.print("Comida: ");
        x.pedirComida();


        /*
         * ============================================================
         * 13. ¿POR QUÉ NO PODEMOS HACER ESTO?
         * ============================================================
         *
         * La siguiente instrucción produciría un ERROR:
         *
         *     x.setEdad(30);
         *
         * ¿Por qué?
         *
         * Porque x fue declarado como Animal:
         *
         *     Animal x
         *
         * Animal no tiene un método llamado setEdad().
         *
         * Aunque el objeto real sea un Perro, el compilador
         * analiza los métodos disponibles según el TIPO DE
         * LA REFERENCIA.
         *
         * Para acceder a setEdad() tendríamos que hacer casting:
         *
         *     ((Mamifero) x).setEdad(30);
         *
         * porque Perro hereda de Mamifero.
         */

    }
}
