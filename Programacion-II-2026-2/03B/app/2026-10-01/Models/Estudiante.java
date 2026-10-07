package Models;

/*
 * Clase Estudiante
 *
 * Representa a un estudiante y almacena tres datos:
 * nombre, edad y nota.
 *
 * En esta clase estudiaremos principalmente:
 *
 * 1. Encapsulamiento
 * 2. Constructores
 * 3. Sobrecarga de constructores
 * 4. Getters y setters
 * 5. Sobrecarga de métodos
 */
public class Estudiante {

    /*
     * ATRIBUTOS
     *
     * Los atributos son private para aplicar
     * ENCAPSULAMIENTO.
     *
     * Esto significa que no podemos acceder directamente
     * a ellos desde otra clase.
     *
     * Para consultar o modificar estos valores utilizaremos
     * getters y setters.
     */
    private String nombre;
    private int edad;
    private double nota;


    /*
     * CONSTRUCTOR SIN PARÁMETROS
     *
     * Este constructor permite crear un estudiante
     * sin proporcionar información.
     *
     * Ejemplo:
     *
     * Estudiante estudiante = new Estudiante();
     *
     * En este caso asignamos valores iniciales
     * a los atributos.
     */
    public Estudiante() {

        nombre = "Sin nombre";
        edad = 0;
        nota = 0.0;
    }


    /*
     * CONSTRUCTOR CON UN PARÁMETRO
     *
     * Recibe únicamente el nombre del estudiante.
     *
     * Ejemplo:
     *
     * Estudiante estudiante = new Estudiante("Carlos");
     *
     * Como solamente recibimos el nombre, los otros
     * atributos conservan los valores que establecemos
     * aquí.
     */
    public Estudiante(String nombre) {

        /*
         * this.nombre representa el atributo de la clase.
         *
         * nombre representa el parámetro recibido.
         */
        this.nombre = nombre;

        edad = 0;
        nota = 0.0;
    }


    /*
     * CONSTRUCTOR CON DOS PARÁMETROS
     *
     * Recibe el nombre y la edad.
     *
     * Ejemplo:
     *
     * Estudiante estudiante = new Estudiante("Carlos", 20);
     *
     * Observa que nuevamente tenemos un constructor llamado
     * Estudiante, pero ahora recibe dos parámetros.
     *
     * Esto es SOBRECARGA DE CONSTRUCTORES.
     */
    public Estudiante(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }


    /*
     * CONSTRUCTOR CON TRES PARÁMETROS
     *
     * Recibe todos los datos del estudiante.
     *
     * Ejemplo:
     *
     * Estudiante estudiante =
     *     new Estudiante("Carlos", 20, 4.5);
     *
     * Este constructor también forma parte de la
     * SOBRECARGA DE CONSTRUCTORES.
     */
    public Estudiante(String nombre, int edad, double nota) {

        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }


    /*
     * GETTERS
     *
     * Los getters permiten CONSULTAR los valores
     * de los atributos privados.
     *
     * Por ejemplo:
     *
     * estudiante.getNombre();
     *
     * devuelve el nombre del estudiante.
     */

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {

        return edad;
    }

    public double getNota() {

        return nota;
    }


    /*
     * SETTERS
     *
     * Los setters permiten MODIFICAR los valores
     * de los atributos privados.
     *
     * Por ejemplo:
     *
     * estudiante.setNombre("Pedro");
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void setNota(double nota) {

        this.nota = nota;
    }


    /*
     * MÉTODO mostrarInformacion()
     *
     * Este es un método que no recibe parámetros.
     *
     * Muestra todos los datos del estudiante.
     */
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }


    /*
     * SOBRECARGA DE MÉTODOS
     *
     * Tenemos otro método llamado mostrarInformacion(),
     * pero esta vez recibe un String.
     *
     * Aunque el nombre del método es el mismo, Java
     * puede diferenciarlos porque tienen diferentes
     * parámetros.
     *
     * Ejemplo:
     *
     * estudiante.mostrarInformacion("Datos del estudiante");
     */
    public void mostrarInformacion(String mensaje) {

        System.out.println(mensaje);

        /*
         * Aquí llamamos al método mostrarInformacion()
         * que NO recibe parámetros.
         *
         * Java sabe cuál método ejecutar porque estamos
         * utilizando una versión diferente del método.
         */
        mostrarInformacion();
    }


    /*
     * SOBRECARGA DE MÉTODOS
     *
     * Esta es una tercera versión de
     * mostrarInformacion().
     *
     * Ahora recibe un boolean.
     *
     * Ejemplo:
     *
     * estudiante.mostrarInformacion(true);
     *
     * Si mostrarNota es true, se muestra la nota.
     * Si es false, no se muestra.
     */
    public void mostrarInformacion(boolean mostrarNota) {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        /*
         * Si el valor de mostrarNota es true,
         * mostramos también la nota.
         */
        if (mostrarNota) {

            System.out.println("Nota: " + nota);
        }
    }
}