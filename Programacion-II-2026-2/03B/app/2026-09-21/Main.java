// Clase principal del programa.
// Desde esta clase vamos a crear objetos de tipo Person
// y utilizar sus métodos.
public class Main {

    // Método principal: punto de inicio de la ejecución del programa.
    public static void main(String[] args) {

        // Creamos un objeto de la clase Person.
        //
        // El constructor recibe tres valores:
        // "Luis"  -> nombre
        // 25      -> edad
        // true    -> indica que male es verdadero
        Person p = new Person("Luis", 25, true);

        // Invocamos el método naming() del objeto p.
        // El método determinará el saludo dependiendo
        // del valor del atributo male.
        p.naming();


        // Creamos un segundo objeto de tipo Person.
        //
        // "Mariana" -> nombre
        // 83        -> edad
        // false     -> male es falso
        Person m = new Person("Mariana", 83, false);

        // Invocamos el método naming().
        // Como male es false, se ejecutará el bloque else.
        m.naming();


        // Modificamos el atributo male del objeto m.
        //
        // No podemos hacer directamente:
        // m.male = true;
        //
        // porque male es private.
        // Por eso utilizamos el setter setMale().
        m.setMale(true);

        // Volvemos a llamar al método naming().
        // Ahora male vale true, por lo que cambiará el saludo.
        m.naming();


        // Obtenemos el valor actual de male mediante isMale()
        // y utilizamos ! para invertirlo.
        //
        // Si isMale() devuelve true:
        // !true -> false
        //
        // Si isMale() devuelve false:
        // !false -> true
        //
        // Finalmente, setMale() guarda el nuevo valor.
        m.setMale(!m.isMale());

        // Volvemos a ejecutar naming() para observar
        // el resultado después de cambiar el valor de male.
        m.naming();
    }
}