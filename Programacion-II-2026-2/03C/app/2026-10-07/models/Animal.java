package models;

/**
 * Clase base que representa un animal.
 *
 * Esta clase será utilizada como superclase de otras clases
 * como Perro, Gato y Zorra.
 *
 * El objetivo es demostrar conceptos fundamentales de
 * Programación Orientada a Objetos:
 *
 * - Encapsulamiento
 * - Constructores
 * - Herencia
 * - Sobrescritura de métodos
 * - Polimorfismo
 */
public class Animal {

    /*
     * Los atributos son private.
     *
     * Esto significa que no pueden ser modificados directamente
     * desde otras clases.
     *
     * Esta característica se conoce como ENCAPSULAMIENTO.
     */
    private String nombre;
    private String color;


    /**
     * Modifica el nombre del animal.
     *
     * @param nombre nuevo nombre del animal.
     */
    public void setNombre(String nombre) {

        /*
         * "this.nombre" hace referencia al atributo de la clase.
         *
         * "nombre" hace referencia al parámetro recibido por
         * el método.
         *
         * Por eso podemos escribir:
         *
         * this.nombre = nombre;
         */
        this.nombre = nombre;
    }


    /**
     * Obtiene el nombre del animal.
     *
     * @return nombre almacenado en el objeto.
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Modifica el color del animal.
     *
     * @param color nuevo color.
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * Obtiene el color del animal.
     *
     * @return color almacenado.
     */
    public String getColor() {
        return color;
    }


    /**
     * Constructor que permite crear un Animal indicando
     * su nombre y color.
     *
     * @param nombre nombre del animal.
     * @param color color del animal.
     */
    public Animal(String nombre, String color) {

        this.nombre = nombre;
        this.color = color;
    }


    /**
     * Constructor sobrecargado.
     *
     * En este caso solamente recibimos el nombre.
     *
     * Como no se proporciona un color, establecemos
     * "blanco" como valor predeterminado.
     *
     * @param nombre nombre del animal.
     */
    public Animal(String nombre) {

        this.nombre = nombre;
        this.color = "blanco";
    }


    /**
     * Representa el sonido genérico de un animal.
     *
     * Las clases hijas pueden sobrescribir este método
     * para proporcionar un comportamiento específico.
     *
     * Por ejemplo:
     *
     * Perro -> sonido del perro
     * Gato  -> sonido del gato
     * Zorra -> sonido de la zorra
     */
    public void hacerSonido() {

        System.out.println("Soy un Animal...");
    }
}