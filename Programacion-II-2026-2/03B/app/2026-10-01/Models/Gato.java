package Models;

/*
 * Clase Gato
 *
 * Gato es una clase hija de Animal.
 *
 * La palabra extends establece una relación de HERENCIA:
 *
 *              Animal
 *              /    \
 *             /      \
 *          Perro     Gato
 *
 * Gato hereda de Animal los métodos públicos,
 * como getNombre(), setNombre(), getEdad(),
 * setEdad() y hacerSonido().
 */
public class Gato extends Animal {

    /*
     * ATRIBUTO PROPIO DE GATO
     *
     * color es una característica específica de un gato.
     *
     * No está definida en Animal porque no todos los
     * animales necesariamente tienen este atributo.
     */
    private String color;


    /*
     * CONSTRUCTOR DE GATO
     *
     * Recibe tres datos:
     *
     * nombre -> pertenece a Animal
     * edad   -> pertenece a Animal
     * color  -> pertenece a Gato
     */
    public Gato(String nombre, int edad, String color) {

        /*
         * super(nombre, edad)
         *
         * Llama al constructor de la clase padre Animal.
         *
         * Animal se encarga de inicializar:
         *
         * nombre
         * edad
         */
        super(nombre, edad);


        /*
         * Inicializamos el atributo propio de Gato.
         *
         * this.color -> atributo de la clase
         * color      -> parámetro del constructor
         */
        this.color = color;
    }


    /*
     * SOBRESCRITURA DE MÉTODOS
     *
     * Animal tiene un método llamado hacerSonido().
     *
     * Gato hereda ese método, pero proporciona
     * su propia implementación.
     *
     * Esto se conoce como SOBRESCRITURA (OVERRIDING).
     */
    @Override
    public void hacerSonido() {

        System.out.println("El gato dice: Miau");
    }
}