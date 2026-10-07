package Models;

/*
 * Clase Zorra
 *
 * Zorra es una clase hija de Animal.
 *
 * Por medio de "extends" heredamos de Animal
 * sus métodos y características accesibles.
 *
 * En este caso, Zorra no tiene atributos propios.
 * Utiliza los atributos heredados de Animal:
 *
 * nombre
 * edad
 */
public class Zorra extends Animal {


    /*
     * CONSTRUCTOR DE ZORRA
     *
     * Recibe el nombre y la edad de la zorra.
     *
     * Estos atributos pertenecen originalmente a Animal,
     * por eso utilizamos super() para enviarlos al
     * constructor de la clase padre.
     */
    public Zorra(String nombre, int edad) {

        /*
         * Llama al constructor de Animal:
         *
         * Animal(String nombre, int edad)
         *
         * De esta manera, Animal se encarga de
         * inicializar nombre y edad.
         */
        super(nombre, edad);
    }


    /*
     * SOBRESCRITURA (OVERRIDING)
     *
     * Animal tiene un método llamado hacerSonido().
     *
     * Zorra hereda ese método, pero lo sobrescribe
     * para proporcionar su propio comportamiento.
     *
     * @Override le indica al compilador que este método
     * está sobrescribiendo un método de la clase padre.
     */
    @Override
    public void hacerSonido() {

        System.out.println("Que rica la fruta");
    }
}