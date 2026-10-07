public class Persona {

    /*
     * Los atributos son PRIVATE.
     *
     * Esto significa que no pueden ser modificados ni consultados
     * directamente desde otras clases.
     *
     * Esta decisión hace parte del ENCAPSULAMIENTO.
     *
     * La clase Persona controla cómo se puede acceder a sus datos.
     */
    private String nombre;
    private int edad;


    /*
     * SETTER DEL NOMBRE
     *
     * Un setter es un método utilizado normalmente para MODIFICAR
     * el valor de un atributo.
     *
     * Recibimos un parámetro llamado "nombre".
     */
    public void setNombre(String nombre) {

        /*
         * "this.nombre" representa el atributo de la clase.
         *
         * "nombre" representa el parámetro recibido por el método.
         *
         * Por lo tanto:
         *
         * this.nombre = nombre;
         *
         * significa:
         *
         * "Guarda en el atributo nombre de ESTE objeto
         * el valor recibido como parámetro".
         */
        this.nombre = nombre;
    }


    /*
     * GETTER DEL NOMBRE
     *
     * Un getter es un método utilizado para CONSULTAR
     * el valor de un atributo.
     */
    public String getNombre() {

        /*
         * Devolvemos el valor almacenado en el atributo privado
         * "nombre".
         */
        return this.nombre;
    }


    /*
     * SETTER DE LA EDAD
     *
     * Aquí podemos observar una de las grandes ventajas
     * del encapsulamiento.
     *
     * No simplemente cambiamos el valor de edad.
     *
     * Primero verificamos si el dato es válido.
     */
    public void setEdad(int edad) {

        /*
         * Solamente aceptamos edades mayores que cero.
         *
         * Si el usuario intenta enviar:
         *
         * -18
         * -5
         * 0
         *
         * esos valores serán rechazados.
         */
        if (edad > 0) {

            /*
             * Si la edad es válida, almacenamos el valor
             * en el atributo privado.
             */
            this.edad = edad;
        }

        else {

            /*
             * Si la edad no es válida, informamos al usuario
             * que el valor no cumple la regla establecida.
             *
             * Observa que el atributo "edad" NO se modifica.
             */
            System.out.println("La edad debe ser mayor a cero");
        }
    }


    /*
     * GETTER DE LA EDAD
     *
     * Permite consultar el valor de edad desde otra clase.
     */
    public int getEdad() {

        /*
         * Retornamos el valor almacenado en el atributo privado.
         */
        return this.edad;
    }


    /*
     * CONSTRUCTOR
     *
     * El constructor se ejecuta automáticamente cuando hacemos:
     *
     * new Persona("Sosa", -19);
     *
     * Su función es permitir inicializar el objeto.
     */
    public Persona(String nombre, int edad) {

        /*
         * Una forma directa de inicializar los atributos sería:
         *
         * this.nombre = nombre;
         * this.edad = edad;
         *
         * Sin embargo, en este ejemplo NO utilizamos esa forma.
         *
         * En su lugar utilizamos los SETTERS.
         */


        /*
         * Llamamos al setter del nombre.
         *
         * Esto permite que la asignación pase por el método
         * encargado de controlar el atributo.
         */
        setNombre(nombre);


        /*
         * Llamamos al setter de edad.
         *
         * Esto es especialmente importante porque setEdad()
         * contiene una validación.
         *
         * Si recibimos -19:
         *
         * setEdad(-19)
         *
         * la condición:
         *
         * edad > 0
         *
         * será falsa.
         *
         * Por eso se mostrará:
         *
         * "La edad debe ser mayor a cero"
         *
         * y la edad conservará su valor inicial, que es 0.
         */
        setEdad(edad);
    }
}
