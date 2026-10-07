package models;


/**
 * Representa una zorra.
 *
 * Zorra hereda de Animal.
 *
 * Por lo tanto, además de su propio atributo peso,
 * también dispone de los atributos y métodos heredados
 * de Animal.
 */
public class Zorra extends Animal {

    /*
     * Atributo propio de Zorra.
     *
     * double permite almacenar números decimales.
     */
    private double peso;


    /**
     * Constructor de Zorra.
     *
     * @param nombre nombre de la zorra.
     * @param color color de la zorra.
     * @param peso peso de la zorra.
     */
    public Zorra(String nombre, String color, double peso) {

        /*
         * Inicializamos la parte heredada del objeto
         * utilizando el constructor de Animal.
         */
        super(nombre, color);

        /*
         * Inicializamos el atributo propio de Zorra.
         */
        this.peso = peso;
    }


    /**
     * Sobrescribe el método hacerSonido() de Animal.
     *
     * Cada clase hija puede proporcionar su propia
     * implementación del mismo método.
     *
     * Esto es una de las bases del POLIMORFISMO.
     */
    @Override
    public void hacerSonido() {

        System.out.println("Que ...");
    }
}