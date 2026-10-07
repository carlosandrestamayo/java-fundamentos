package models;

/**
 * Clase base de nuestra jerarquía de herencia.
 *
 * Animal representa el concepto más general.
 *
 * En este ejemplo vamos a construir una cadena de herencia:
 *
 *                  Animal
 *                     ↑
 *                  Mamifero
 *                     ↑
 *                   Perro
 *
 * Esto significa que:
 *
 * - Mamifero ES un Animal.
 * - Perro ES un Mamifero.
 * - Por lo tanto, Perro también ES un Animal.
 *
 * Esta relación se conoce como herencia "IS-A".
 */
public class Animal {

    /*
     * Este atributo pertenece a Animal.
     *
     * Lo declaramos private para aplicar ENCAPSULAMIENTO.
     *
     * Al ser private, una clase externa no puede hacer:
     *
     *     animal.nombre
     *
     * Para acceder al atributo utilizaremos métodos públicos:
     *
     *     getNombre()
     *     setNombre()
     */
    private String nombre;


    /**
     * Obtiene el nombre del animal.
     *
     * Este método se conoce como GETTER.
     *
     * Un getter normalmente se utiliza para consultar
     * el valor de un atributo privado.
     *
     * @return nombre del animal.
     */
    public String getNombre() {

        return nombre;
    }


    /**
     * Modifica el nombre del animal.
     *
     * Este método se conoce como SETTER.
     *
     * Recibe un nuevo nombre y lo almacena en el atributo
     * privado de la clase.
     *
     * @param nombre nuevo nombre del animal.
     */
    public void setNombre(String nombre) {

        /*
         * ¿Por qué escribimos this.nombre?
         *
         * Tenemos dos elementos llamados "nombre":
         *
         * 1. this.nombre -> atributo de la clase.
         * 2. nombre      -> parámetro del método.
         *
         * Por eso:
         *
         *     this.nombre = nombre;
         *
         * significa:
         *
         * "Guarda el valor recibido como parámetro
         * en el atributo nombre del objeto actual."
         */
        this.nombre = nombre;
    }


    /**
     * Solicita comida.
     *
     * Este método pertenece originalmente a Animal.
     *
     * Las clases hijas podrán HEREDAR este método
     * o SOBRESCRIBIRLO para cambiar su comportamiento.
     */
    public void pedirComida() {

        System.out.println("Quiero comida");
    }
}
