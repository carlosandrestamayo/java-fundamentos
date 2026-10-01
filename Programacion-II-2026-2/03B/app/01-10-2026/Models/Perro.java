package Models;

/*
 * Clase Perro
 *
 * Perro es una clase hija de Animal.
 *
 * La palabra extends indica que Perro HEREDA
 * los atributos y métodos accesibles de Animal.
 *
 * Relación:
 *
 *              Animal
 *                 ↑
 *                 |
 *               Perro
 */
public class Perro extends Animal {

    /*
     * ATRIBUTO PROPIO DE PERRO
     *
     * Este atributo no pertenece a Animal.
     * Es una característica específica de un perro.
     */
    private String raza;


    /*
     * CONSTRUCTOR DE PERRO
     *
     * Recibe:
     * - nombre
     * - edad
     * - raza
     *
     * Los dos primeros datos pertenecen a Animal,
     * mientras que raza pertenece a Perro.
     */
    public Perro(String nombre, int edad, String raza) {

        /*
         * SUPER
         *
         * super(...) permite llamar al constructor
         * de la clase padre, en este caso Animal.
         *
         * Animal tiene este constructor:
         *
         * Animal(String nombre, int edad)
         *
         * Por eso podemos escribir:
         *
         * super(nombre, edad);
         *
         * De esta manera, la clase Animal se encarga
         * de inicializar nombre y edad.
         */
        super(nombre, edad);


        /*
         * Inicializamos el atributo propio de Perro.
         *
         * this.raza representa el atributo de la clase.
         *
         * raza representa el parámetro recibido
         * por el constructor.
         */
        this.raza = raza;
    }


    /*
     * SOBRESCRITURA DE MÉTODOS
     *
     * Animal tiene un método llamado:
     *
     * public void hacerSonido()
     *
     * Aquí estamos proporcionando una nueva
     * implementación de ese método para Perro.
     */
    @Override
    public void hacerSonido() {

        System.out.println("El perro dice: Guau");
    }
}