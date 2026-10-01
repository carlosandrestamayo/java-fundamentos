package Models;

/*
 * Clase Animal
 *
 * Esta clase representa un animal y contiene información
 * básica como su nombre y su edad.
 *
 * También contiene un método que posteriormente podrá ser
 * sobrescrito por las clases hijas, por ejemplo Perro y Gato.
 */
public class Animal {

    /*
     * Atributos de la clase.
     *
     * Son private, por lo que no pueden ser modificados
     * directamente desde otras clases.
     *
     * Esto hace parte del concepto de ENCAPSULAMIENTO.
     */
    private String nombre;
    private int edad;


    /*
     * CONSTRUCTOR SIN PARÁMETROS
     *
     * Permite crear un objeto Animal sin proporcionar
     * inicialmente sus datos.
     *
     * Ejemplo:
     *
     * Animal animal = new Animal();
     */
    public Animal() {

    }


    /*
     * CONSTRUCTOR CON PARÁMETROS
     *
     * Permite crear un Animal proporcionando su nombre
     * y su edad desde el momento de la creación.
     *
     * Ejemplo:
     *
     * Animal animal = new Animal("Firulais", 5);
     *
     * Tenemos dos constructores con el mismo nombre
     * pero diferentes parámetros.
     *
     * Esto se conoce como SOBRECARGA DE CONSTRUCTORES.
     */
    public Animal(String nombre, int edad) {

        /*
         * this.nombre hace referencia al atributo de la clase.
         *
         * nombre hace referencia al parámetro recibido
         * por el constructor.
         *
         * this permite diferenciar ambos.
         */
        this.nombre = nombre;
        this.edad = edad;
    }


    /*
     * GETTER
     *
     * Permite consultar el valor del atributo nombre.
     *
     * Como nombre es private, otras clases no pueden acceder
     * directamente a él.
     *
     * Ejemplo:
     *
     * String nombreAnimal = animal.getNombre();
     */
    public String getNombre() {

        return nombre;
    }


    /*
     * SETTER
     *
     * Permite modificar el valor del atributo nombre.
     *
     * Ejemplo:
     *
     * animal.setNombre("Max");
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }


    /*
     * GETTER
     *
     * Permite consultar el valor del atributo edad.
     *
     * Ejemplo:
     *
     * int edadAnimal = animal.getEdad();
     */
    public int getEdad() {

        return edad;
    }


    /*
     * SETTER
     *
     * Permite modificar el valor del atributo edad.
     *
     * Ejemplo:
     *
     * animal.setEdad(5);
     */
    public void setEdad(int edad) {

        this.edad = edad;
    }


    /*
     * MÉTODO hacerSonido()
     *
     * Este método representa un comportamiento común
     * de los animales.
     *
     * Las clases hijas, como Perro y Gato, podrán
     * SOBRESCRIBIR este método para proporcionar
     * su propio comportamiento.
     *
     * Por ejemplo:
     *
     * Perro -> "El perro dice: Guau"
     * Gato  -> "El gato dice: Miau"
     */
    public void hacerSonido() {

        System.out.println("El animal hace un sonido");
    }
}