package models;


/**
 * Representa un gato.
 *
 * Gato hereda de Animal mediante extends.
 *
 * Esto significa que Gato recibe los métodos públicos
 * de Animal, como:
 *
 * - getNombre()
 * - setNombre()
 * - getColor()
 * - setColor()
 * - hacerSonido()
 */
public class Gato extends Animal {

    /*
     * Atributo específico de Gato.
     *
     * Se inicializa en true, por lo que si utilizamos
     * un constructor que no recibe el sexo del animal,
     * el valor será true.
     */
    private boolean male = true;


    /**
     * Indica si el gato es macho.
     *
     * @return true si es macho; false en caso contrario.
     */
    public boolean isMale() {

        return male;
    }


    /**
     * Constructor completo.
     *
     * @param nombre nombre del gato.
     * @param color color del gato.
     * @param male indica si es macho.
     */
    public Gato(String nombre, String color, boolean male) {

        /*
         * Llamamos al constructor de Animal.
         *
         * La clase padre se encarga de inicializar:
         *
         * nombre
         * color
         */
        super(nombre, color);

        /*
         * Inicializamos el atributo propio de Gato.
         */
        this.male = male;
    }


    /**
     * Constructor que recibe nombre y sexo.
     *
     * Como no recibimos color, se utilizará el constructor
     * Animal(String nombre), que establece "blanco" como color.
     */
    public Gato(String nombre, boolean male) {

        super(nombre);

        this.male = male;
    }


    /**
     * Constructor que recibe nombre y color.
     *
     * El atributo male conserva su valor predeterminado:
     * true.
     */
    public Gato(String nombre, String color) {

        super(nombre, color);
    }


    /**
     * Constructor que solamente recibe el nombre.
     *
     * Animal establecerá automáticamente el color como "blanco".
     */
    public Gato(String nombre) {

        super(nombre);
    }


    /**
     * Sobrescribe el método hacerSonido() heredado de Animal.
     *
     * Aunque el método tiene el mismo nombre y parámetros,
     * el comportamiento es diferente.
     *
     * Esto permite demostrar POLIMORFISMO.
     */
    @Override
    public void hacerSonido() {

        System.out.println(".....");
    }
}
