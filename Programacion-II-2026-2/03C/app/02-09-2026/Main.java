/*

* Fecha: 2 de septiembre de 2026
* Descripción:
* Ejemplo de métodos recursivos en Java.
* Se implementan dos ejemplos:
* 1. Una operación recursiva basada en el tamaño de un arreglo.
* 2. El cálculo del factorial de un número.
     */

import java.util.Scanner;

public class Main {
    /*
    * Método recursivo que realiza una operación utilizando
    * el tamaño recibido como parámetro.
    *
    * Caso base:
    * Cuando s es igual a 0, la recursión termina.
    *
    * Caso recursivo:
    * Se suma s - 1 con el resultado de llamar nuevamente
    * al método utilizando s - 1.
    *
    * @param s Tamaño o cantidad de elementos.
    * @return Resultado de la suma recursiva.
    */
    public static int complejidadArreglos(int s) {

        // Caso base: detiene la recursión.
        if (s == 0) {
            return 0;
        }

        // Muestra en pantalla la expresión que se está evaluando.
        System.out.printf(
            "%d - 1 + complejidadArreglos(%d - 1)%n",
            s, s
        );

        // Caso recursivo:
        // s - 1 + llamada del método con un valor menor.
        return s - 1 + complejidadArreglos(s - 1);
    }


    /*
    * Método recursivo para calcular el factorial de un número.
    *
    * Fórmula matemática:
    *
    * n! = n × (n - 1)!
    *
    * Caso base:
    *
    * 1! = 1
    *
    * @param n Número del cual se calculará el factorial.
    * @return El factorial de n.
    */
    public static int factorial(int n) {

        // Caso base:
        // Cuando n llega a 1, la recursión termina.
        if (n == 1) {

            // Se muestra el último paso de la recursión.
            System.out.printf("factorial(%d) = 1%n", n);

            return 1;
        }

        // Muestra la expresión que será evaluada.
        System.out.printf(
            "factorial(%d) = %d * factorial(%d - 1)%n",
            n, n, n
        );

        /*
        * Caso recursivo:
        *
        * Por ejemplo:
        *
        * factorial(4)
        * = 4 × factorial(3)
        *
        * La llamada continúa hasta llegar al caso base.
        */
        return n * factorial(n - 1);
    }


    /*
    * Método principal del programa.
    *
    * Aquí comienza la ejecución de la aplicación.
    */
    public static void main(String[] args) {

        // Objeto Scanner utilizado para capturar datos del usuario.
        Scanner sc = new Scanner(System.in);

        // Declaración e inicialización de un arreglo de números enteros.
        int[] numeros = {5, 2, 8, 1, 3};

        // Otro ejemplo de arreglo, actualmente comentado.
        // int[] numeros = {8, 5, 3, 2, 1};


        /*
        * Ejemplo de llamada al método complejidadArreglos.
        * numeros.length obtiene la cantidad de elementos
        * almacenados en el arreglo.
        */

        // int complejidad = complejidadArreglos(numeros.length);
        // System.out.println("Complejidad: " + complejidad);


        /*
        * Ejemplo para solicitar al usuario el tamaño
        * de un arreglo.
        */

        // System.out.print("Ingrese el Tamaño: ");
        // int size = sc.nextInt();


        /*
        * Llamada al método factorial.
        *
        * Se calcula:
        *
        * 6! = 6 × 5 × 4 × 3 × 2 × 1
        */
        factorial(6);

        // Cerramos el objeto Scanner.
        sc.close();
    }


}
