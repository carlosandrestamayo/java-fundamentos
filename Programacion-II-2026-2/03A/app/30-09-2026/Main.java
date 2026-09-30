/*
 * PROGRAMACIÓN II - Clase del día
 * Archivo: Main.java (el programa que USA la clase Persona)
 *
 * Idea central: separar responsabilidades.
 *   - Persona.java  -> DEFINE el molde (atributos y comportamientos).
 *   - Main.java     -> USA el molde: crea objetos y les pide que hagan cosas.
 *
 * Cómo compilar y ejecutar (desde la carpeta que contiene Main.java y Models/):
 *   javac Models/Persona.java Main.java
 *   java Main
 */

// Trae las clases del paquete Models para poder usar "Persona" sin escribir
// el nombre completo (Models.Persona). El asterisco significa "todas las
// clases de ese paquete".
import Models.*;

public class Main{

    // main es la PUERTA DE ENTRADA: es el método donde Java empieza a ejecutar.
    //   public -> visible para la JVM (la máquina virtual de Java)
    //   static -> se ejecuta sin crear ningún objeto de Main
    //   void   -> no devuelve nada
    //   String[] args -> argumentos que se pueden enviar desde la consola
    public static void main(String [] args){

        // ---------------------------------------------------------------
        // BLOQUE 1 (comentado): experimentos de la clase con constructores y métodos
        // ---------------------------------------------------------------
        // Estas líneas están comentadas para no ejecutarlas hoy, pero muestran
        // lo que se probó. Cada una ilustra un concepto:

        // "new" reserva memoria y llama al constructor. Este usa el de 4 parámetros.
        // Persona p = new Persona("Carlos", "Tamayo", 41, true);

        // Concatenación con "+": une texto con el valor que devuelve el getter.
        // //System.out.println("Nombre: " + p.getNombre());

        // getNombre() sin parámetros vs. getNombre("Señorita") con un parámetro:
        // es la SOBRECARGA de métodos. Java elige según los argumentos.
        // // System.out.println(p.getNombre());
        // // System.out.println(p.getNombre("Señorita"));
        // System.out.println(p.getEdad());

        // Constructor de 2 parámetros: edad y male quedan en sus valores por defecto (0 y false).
        // // Persona x = new Persona("Frederick", "Totena");
        // // System.out.println(x.getNombre());

        // Aquí se ve lo delicado de sobrecargar por ORDEN de tipos:
        // ("Puentes", 24, "Ivan") coincide con (String apellido, int edad, String nombre),
        // así que "Puentes" es el apellido e "Ivan" el nombre.
        // Persona y = new Persona("Puentes", 24, "Ivan");
        // System.out.println(y.getNombre());
        // System.out.println(y.getEdad());

        // Un método static se llama con el NOMBRE DE LA CLASE, sin crear objeto.
        // System.out.println(Persona.getClassName());

        // ---------------------------------------------------------------
        // BLOQUE 2: crear los objetos
        // ---------------------------------------------------------------
        // Cada línea crea UN objeto distinto a partir del mismo molde.
        // p1 ... p5 no contienen la persona en sí, contienen una REFERENCIA
        // (la "dirección" del objeto en memoria).
        Persona p1 = new Persona("Luis", "Ramírez", 28, true);
        Persona p2 = new Persona("Ana", "Gómez", 34, false);
        Persona p3 = new Persona("Sofía", "Herrera", 22, false);
        Persona p4 = new Persona("Carlos", "Tamayo", 41, true);
        Persona p5 = new Persona("Beatriz", "Molina", 19, false);

        // ---------------------------------------------------------------
        // BLOQUE 3: agrupar en un arreglo
        // ---------------------------------------------------------------
        // Un arreglo guarda varios elementos del MISMO tipo bajo un solo nombre.
        // Las llaves { } crean el arreglo con esos elementos directamente
        // (tamaño 5, posiciones 0 a 4). Observa el orden inicial: está DESORDENADO.
        Persona [] arr = {p1, p2 ,p3 ,p4 ,p5};

        // Versión anterior que ordenaba solo por nombre (comentada porque
        // "sort" ya hace lo mismo y más, recibiendo el atributo como parámetro).
        //Persona.sortByName(arr);

        // ---------------------------------------------------------------
        // BLOQUE 4: ordenar y mostrar
        // ---------------------------------------------------------------
        // Se llama con "Persona." porque sort es static (pertenece a la clase).
        // PUNTO CLAVE: los arreglos se pasan por REFERENCIA. El método sort no
        // trabaja con una copia: reordena el MISMO arreglo "arr". Por eso:
        //   1) la primera llamada parte del orden original y deja "arr" ordenado por nombre;
        //   2) la segunda parte de ese resultado y lo deja ordenado por apellido;
        //   3) la tercera parte del anterior y lo deja ordenado por edad.
        // Al terminar, "arr" queda en el orden de la ÚLTIMA llamada (por edad).
        // Cada llamada también imprime su tabla gracias a "mostrar".
        Persona.sort(arr, "nombre");
        Persona.sort(arr, "apellido");
        Persona.sort(arr, "edad");

        // ---------------------------------------------------------------
        // BLOQUE 5 (comentado): ¿qué devuelve compareTo?
        // ---------------------------------------------------------------
        // compareTo es lo que usa la burbuja para decidir si intercambia.
        // Compara letra por letra según su código: 'A' = 65, 'C' = 67.
        //   "Ana".compareTo("Carlos")  -> negativo (-2): "Ana" va ANTES que "Carlos"
        //   "Carlos".compareTo("Ana")  -> positivo (2):  "Carlos" va DESPUÉS que "Ana"
        //   "Ana".compareTo("Ana")     -> 0:             son iguales
        // La burbuja intercambia solo cuando el resultado es POSITIVO (> 0).
        // Prueba descomentarlas para comprobar los valores.
        // System.out.println("Ana".compareTo("Carlos"));
        // System.out.println("Carlos".compareTo("Ana"));
        // System.out.println("Ana".compareTo("Ana"));


    }
}