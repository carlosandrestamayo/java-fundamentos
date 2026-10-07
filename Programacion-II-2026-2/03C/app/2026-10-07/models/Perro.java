package models;

/**
 * Representa un perro.
 *
 * La palabra extends indica que Perro HEREDA de Animal.
 *
 * Por lo tanto:
 *
 * Perro IS-A Animal
 *
 * Es decir, un perro "es un" animal.
 */
public class Perro extends Animal {

    /*
     * Este atributo pertenece específicamente a Perro.
     *
     * No pertenece a Animal porque la edad es una característica
     * que decidimos manejar particularmente en esta clase.
     */
    private int edad;


    /**
     * Modifica la edad del perro.
     *
     * @param edad nueva edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


    /**
     * Obtiene la edad del perro.
     *
     * @return edad del perro.
     */
    public int getEdad() {
        return edad;
    }


    /**
     * Constructor de Perro.
     *
     * @param nombre nombre del perro.
     * @param color color del perro.
     * @param edad edad del perro.
     */
    public Perro(String nombre, String color, int edad) {

        /*
         * super() permite llamar al constructor de la
         * clase padre, en este caso Animal.
         *
         * Animal recibe:
         *
         *     nombre
         *     color
         *
         * Después de inicializar la parte heredada,
         * inicializamos el atributo propio de Perro:
         *
         *     edad
         */
        super(nombre, color);

        this.edad = edad;
    }


    /**
     * Sobrescribe el método hacerSonido() de Animal.
     *
     * @Override le indica al compilador que nuestra intención
     * es sobrescribir un método heredado.
     *
     * Si escribimos incorrectamente el nombre o los parámetros,
     * el compilador nos avisará.
     */
    @Override
    public void hacerSonido() {

        System.out.println("Soy un Perro...");
    }
}
