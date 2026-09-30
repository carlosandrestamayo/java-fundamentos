public class Main {

    public static void main(String[] args) {

        /*
         * Creamos un objeto de la clase Persona.
         *
         * Al utilizar "new Persona(...)" estamos llamando al constructor
         * de la clase Persona y enviándole dos valores:
         *
         * nombre = "Sosa"
         * edad   = -19
         *
         * Observa que la edad es negativa.
         * Esto será importante porque la clase Persona tiene una
         * validación para impedir edades menores o iguales a cero.
         */
        Persona p = new Persona("Sosa", -19);


        /*
         * Modificamos el nombre del objeto utilizando un SETTER.
         *
         * No estamos accediendo directamente al atributo "nombre".
         * Estamos solicitando a la clase Persona que cambie su nombre
         * mediante el método setNombre().
         *
         * Esto es parte del ENCAPSULAMIENTO.
         */
        p.setNombre("Oscar Sosa");


        /*
         * Intentamos modificar la edad mediante el SETTER.
         *
         * Estamos enviando -18, pero el método setEdad()
         * contiene una condición que solamente permite edades mayores
         * que cero.
         *
         * Por lo tanto, la edad NO será modificada.
         */
        p.setEdad(-18);


        /*
         * Estas instrucciones NO se pueden utilizar:
         *
         * p.nombre = "Sosa";
         * p.edad = 19;
         *
         * ¿Por qué?
         *
         * Porque los atributos nombre y edad fueron declarados
         * como PRIVATE dentro de la clase Persona.
         *
         * private significa que esos atributos solamente pueden
         * ser accedidos directamente desde la propia clase Persona.
         *
         * Desde Main debemos utilizar los métodos públicos:
         *
         * setNombre()  -> para modificar el nombre.
         * getNombre()  -> para consultar el nombre.
         * setEdad()    -> para modificar la edad.
         * getEdad()    -> para consultar la edad.
         */


        /*
         * Consultamos el nombre utilizando el GETTER.
         *
         * getNombre() devuelve el valor almacenado en el atributo
         * privado "nombre".
         */
        System.out.println(p.getNombre());


        /*
         * Consultamos la edad utilizando el GETTER.
         *
         * Como anteriormente intentamos asignar -18, el método
         * setEdad() rechazó ese valor.
         *
         * Por eso la edad conserva el valor que recibió inicialmente
         * el constructor.
         *
         * Sin embargo, como el constructor también utiliza
         * setEdad(), el valor -19 tampoco será aceptado.
         *
         * Por tanto, la edad quedará con su valor inicial:
         * 0
         */
        System.out.println(p.getEdad());


        /*
         * Tampoco podemos hacer:
         *
         * Persona o = new Persona("", -23);
         *
         * y después:
         *
         * System.out.println(o.nombre);
         *
         * porque "nombre" es PRIVATE.
         *
         * Para consultar el nombre debemos utilizar:
         *
         * System.out.println(o.getNombre());
         */
    }
}
