package models;

/**
 * Mamifero es una SUBCLASE de Animal.
 *
 * La palabra extends establece la relación de HERENCIA:
 *
 *     Mamifero extends Animal
 *
 * Podemos leerlo como:
 *
 *     "Mamifero hereda de Animal."
 *
 * Por lo tanto, Mamifero recibe los métodos accesibles
 * que fueron definidos en Animal.
 *
 * En particular, Mamifero puede utilizar:
 *
 *     getNombre()
 *     setNombre()
 *     pedirComida()
 *
 * Además, Mamifero puede agregar sus propias características,
 * como el atributo edad.
 */
public class Mamifero extends Animal {

    /*
     * Este atributo es específico de Mamifero.
     *
     * Animal no conoce este atributo.
     *
     * Sin embargo, cualquier objeto de una clase que herede
     * de Mamifero podrá tener también este atributo.
     */
    private int edad;


    /**
     * Obtiene la edad del mamífero.
     *
     * Getter para el atributo privado edad.
     *
     * @return edad del mamífero.
     */
    public int getEdad() {

        return edad;
    }


    /**
     * Modifica la edad del mamífero.
     *
     * Setter para el atributo privado edad.
     *
     * @param edad nueva edad.
     */
    public void setEdad(int edad) {

        this.edad = edad;
    }


    /**
     * Sobrescribe el método pedirComida() de Animal.
     *
     * La clase Animal ya tenía:
     *
     *     pedirComida()
     *
     * pero Mamifero proporciona un comportamiento diferente.
     *
     * En lugar de decir:
     *
     *     "Quiero comida"
     *
     * ahora dice:
     *
     *     "Quiero leche..."
     *
     * Esto se denomina SOBRESCRITURA o METHOD OVERRIDING.
     */
    @Override
    public void pedirComida() {

        System.out.println("Quiero leche...");
    }

}