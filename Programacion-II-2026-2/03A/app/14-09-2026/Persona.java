public class Persona {

    /*
     * Estos atributos representan el estado de una Persona.
     *
     * Cada objeto Persona tendrá su propia copia
     * de estas variables.
     */
    String nombre;
    double n1;
    double n2;
    double n3;
    double promedio;


    /*
     * CONSTRUCTOR
     *
     * El constructor se ejecuta cuando utilizamos:
     *
     * new Persona(...)
     *
     * Su función es inicializar el objeto.
     */
    public Persona(String nombre, double n1, double n2, double n3) {

        /*
         * this.nombre se refiere al atributo del objeto.
         *
         * nombre se refiere al parámetro recibido por el constructor.
         *
         * Por eso:
         *
         * this.nombre = nombre;
         */
        this.nombre = nombre;

        // Guardamos las notas recibidas en los atributos.
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }


    /*
     * MÉTODO Reporte()
     *
     * Este método calcula el promedio y muestra
     * la información de la Persona.
     */
    public void Reporte() {

        // Calculamos el promedio de las tres notas.
        this.promedio = (this.n1 + this.n2 + this.n3) / 3;

        // Mostramos el nombre.
        System.out.println("Nombre: " + this.nombre);

        // Mostramos las notas con dos decimales.
        System.out.printf("Nota 1: %.2f%n", this.n1);
        System.out.printf("Nota 2: %.2f%n", this.n2);
        System.out.printf("Nota 3: %.2f%n", this.n3);

        // Mostramos el promedio.
        System.out.printf("Promedio: %.2f%n%n", this.promedio);
    }


    /*
     * Otro método de la clase Persona.
     *
     * Este método simplemente muestra un saludo
     * utilizando el nombre del objeto.
     */
    public void Saludar() {

        System.out.println("I am " + this.nombre);
    }
}