// Declaramos la clase Person.
//
// Esta clase representa una persona y contiene:
// - Datos: name, age y male.
// - Comportamientos: naming(), getters y setters.
public class Person {


    // Atributo que almacena el nombre de la persona.
    //
    // private significa que solamente puede accederse
    // directamente desde dentro de esta clase.
    private String name;


    // Atributo que almacena la edad.
    //
    // También está encapsulado mediante private.
    private int age;


    // Atributo booleano que indica si male es true o false.
    //
    // También está protegido mediante private.
    private boolean male;


    // Setter para modificar el nombre.
    //
    // Recibe un nuevo nombre como parámetro.
    public void setName(String name){

        // Verificamos que el nombre tenga al menos un carácter.
        //
        // Esto representa una validación antes de modificar
        // el estado interno del objeto.
        if(name.length() > 0){

            // this.name representa el atributo de la clase.
            //
            // name representa el parámetro recibido por el método.
            //
            // En otras palabras:
            // atributo = parámetro
            this.name = name;
        }
        else{

            // Si el nombre está vacío, mostramos un mensaje
            // indicando que existe un problema con el dato.
            System.out.println("Mensaje error for name");
        }
    }


    // Getter para consultar el nombre.
    //
    // Como name es private, desde otra clase no podemos
    // acceder directamente a m.name.
    //
    // Utilizamos getName() para obtener su valor.
    public String getName(){

        // Retornamos el valor almacenado en el atributo name.
        return name;
    }


    // Setter para modificar la edad.
    public void setAge(int age){

        // Validamos que la edad sea mayor que 0
        // y menor que 100.
        //
        // Solamente si cumple la condición se modificará
        // el atributo age.
        if(age > 0 && age < 100){

            // Guardamos el valor recibido en el atributo age.
            this.age = age;
        }
        else{

            // Si la edad no cumple la condición,
            // mostramos un mensaje de error.
            System.out.println("Mensaje error for age");
        }
    }


    // Getter para consultar la edad.
    public int getAge(){

        // Retornamos el valor actual del atributo age.
        return this.age;
    }


    // Setter para modificar el atributo male.
    //
    // Recibe un valor booleano:
    // true o false.
    public void setMale(boolean male){

        // Guardamos el valor recibido en el atributo.
        this.male = male;
    }


    // Getter para un atributo booleano.
    //
    // En lugar de utilizar getMale(),
    // se utiliza convencionalmente isMale().
    public boolean isMale(){

        // Retornamos el valor actual de male.
        return this.male;
    }


    // Constructor de la clase Person.
    //
    // Se ejecuta automáticamente cuando utilizamos:
    //
    // new Person("Luis", 25, true)
    //
    // Recibe los datos iniciales de la persona.
    public Person(String name, int age, boolean male){

        // Utilizamos el setter para establecer el nombre.
        //
        // Esto permite aplicar la validación definida
        // en setName().
        setName(name);


        // Utilizamos el setter para establecer la edad.
        //
        // De esta manera también se aplica la validación
        // definida en setAge().
        setAge(age);


        // Utilizamos el setter para establecer male.
        setMale(male);
    }


    // Método que representa un comportamiento de la persona.
    //
    // Dependiendo del valor de male se mostrará
    // un mensaje diferente.
    public void naming(){

        // Comprobamos si male es true.
        if(this.male){

            // Si male es true, mostramos este mensaje.
            System.out.println("Hello, Mr. " + this.name);
        }
        else{

            // Si male es false, mostramos este mensaje.
            System.out.println("Hello, Lady. " + this.name);
        }
    }
}