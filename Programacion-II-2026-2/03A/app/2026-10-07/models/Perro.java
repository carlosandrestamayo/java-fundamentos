package models;

/**
 * Perro es una subclase de Mamifero.
 *
 * Observemos la cadena completa:
 *
 *     Animal
 *        ↑
 *     Mamifero
 *        ↑
 *      Perro
 *
 * Perro hereda directamente de Mamifero.
 *
 * Pero como Mamifero hereda de Animal, Perro también
 * recibe la herencia proveniente de Animal.
 *
 * Por ejemplo, un objeto Perro puede utilizar:
 *
 *     getNombre()
 *     setNombre()
 *     getEdad()
 *     setEdad()
 *     pedirComida()
 *
 * aunque algunos de esos métodos fueron declarados
 * originalmente en clases superiores.
 */
public class Perro extends Mamifero {


    /**
     * Sobrescribe pedirComida().
     *
     * Es importante observar algo:
     *
     * Perro NO tiene que declarar nuevamente el método
     * para poder utilizarlo.
     *
     * Lo hereda de Mamifero.
     *
     * Sin embargo, Perro decide cambiar el comportamiento
     * y proporciona su propia implementación.
     *
     * Por eso utilizamos @Override.
     */
    @Override
    public void pedirComida() {

        System.out.println("Quien Tampico...");
    }
}
