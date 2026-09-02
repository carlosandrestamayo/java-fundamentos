
public class Main {

    /*
     * MÉTODO RECURSIVO PARA CALCULAR EL FACTORIAL
     *
     * El factorial de un número se define como:
     *
     * factorial(n) = n × factorial(n - 1)
     *
     * Por ejemplo:
     *
     * factorial(5) = 5 × factorial(4)
     * factorial(4) = 4 × factorial(3)
     * factorial(3) = 3 × factorial(2)
     * factorial(2) = 2 × factorial(1)
     * factorial(1) = 1
     *
     * Caso base:
     * Cuando n es igual a 1, la recursión termina.
     */
    public static int factorial(int n) {

        // CASO BASE
        // Evita que el método continúe llamándose indefinidamente.
        if (n == 1) {

            // Muestra la última llamada recursiva.
            System.out.printf(
                "factorial(%d) = %d%n",
                n,
                n
            );

            // El factorial de 1 es 1.
            return 1;
        }

        // Muestra cómo se descompone el cálculo del factorial.
        //
        // Por ejemplo:
        // factorial(5) = 5 * factorial(5 - 1)
        System.out.printf(
            "factorial(%d) = %d * factorial(%d - 1)%n",
            n,
            n,
            n
        );

        // LLAMADA RECURSIVA
        //
        // El método se llama nuevamente utilizando n - 1.
        //
        // Por ejemplo:
        // 5 * factorial(4)
        return n * factorial(n - 1);
    }


    /*
     * MÉTODO RECURSIVO PARA CALCULAR UNA SUMATORIA
     *
     * La sumatoria de un número se define como:
     *
     * sumatoria(n) = n + sumatoria(n - 1)
     *
     * Por ejemplo:
     *
     * sumatoria(5) = 5 + sumatoria(4)
     * sumatoria(4) = 4 + sumatoria(3)
     * sumatoria(3) = 3 + sumatoria(2)
     * sumatoria(2) = 2 + sumatoria(1)
     * sumatoria(1) = 1
     *
     * Caso base:
     * Cuando n es igual a 1, la recursión termina.
     */
    public static int sumatoria(int n) {

        // CASO BASE
        if (n == 1) {

            // Muestra la última llamada de la recursión.
            System.out.printf(
                "sumatoria(%d) = %d%n",
                n,
                n
            );

            // La sumatoria termina devolviendo 1.
            return 1;
        }

        // Muestra la expresión recursiva.
        //
        // Por ejemplo:
        // sumatoria(5) = 5 + sumatoria(5 - 1)
        System.out.printf(
            "sumatoria(%d) = %d + sumatoria(%d - 1)%n",
            n,
            n,
            n
        );

        // LLAMADA RECURSIVA
        //
        // El método suma el número actual con el resultado
        // de la llamada utilizando n - 1.
        return n + sumatoria(n - 1);
    }


    /*
     * MÉTODO RECURSIVO PARA INVERTIR UNA CADENA
     *
     * Ejemplo:
     *
     * reverse("hola")
     *
     * La palabra se divide en:
     *
     * Primera letra: h
     * Resto: ola
     *
     * Entonces:
     *
     * reverse("hola") = reverse("ola") + "h"
     *
     * El proceso continúa hasta que solo queda
     * un carácter.
     */
    public static String reverse(String str) {

        // CASO BASE
        //
        // Cuando la cadena tiene solamente un carácter,
        // ya no es necesario dividirla.
        if (str.length() == 1) {

            // Muestra el último paso de la recursión.
            System.out.printf(
                "reverse(%s) = %s%n",
                str,
                str
            );

            // Se devuelve el único carácter restante.
            return str;
        }


        /*
         * OBTENER EL PRIMER CARÁCTER
         *
         * charAt(0) obtiene el carácter ubicado
         * en la posición 0 de la cadena.
         *
         * Ejemplo:
         *
         * str = "hola"
         *
         * letra = "h"
         */
        String letra = String.valueOf(str.charAt(0));


        /*
         * OBTENER EL RESTO DE LA CADENA
         *
         * substring(1, str.length()) extrae los caracteres
         * desde la posición 1 hasta el final.
         *
         * Ejemplo:
         *
         * "hola"
         *
         * Posiciones:
         *
         * h  o  l  a
         * 0  1  2  3
         *
         * substring(1, 4) devuelve:
         *
         * "ola"
         */
        String resto = str.substring(1, str.length());


        /*
         * Muestra cómo se realiza la llamada recursiva.
         *
         * Por ejemplo:
         *
         * reverse(hola) = reverse(ola) + h
         */
        System.out.printf(
            "reverse(%s) = reverse(%s) + %s%n",
            str,
            resto,
            letra
        );


        /*
         * LLAMADA RECURSIVA
         *
         * Primero se invierte el resto de la cadena.
         * Posteriormente se agrega la primera letra al final.
         *
         * Ejemplo:
         *
         * reverse("hola")
         *
         * = reverse("ola") + "h"
         *
         * = reverse("la") + "o" + "h"
         *
         * = reverse("a") + "l" + "o" + "h"
         *
         * = "a" + "l" + "o" + "h"
         *
         * = "aloh"
         */
        return reverse(resto) + letra;
    }


    /*
     * MÉTODO PRINCIPAL DEL PROGRAMA
     *
     * La ejecución del programa comienza aquí.
     */
    public static void main(String[] args) {

        // Se declara una variable de tipo entero.
        int numero = 5;


        // Llamada al método factorial.
        //
        // Descomentar para ejecutar:
        //
        // factorial(numero);


        // Llamada al método sumatoria.
        //
        // Calcula:
        //
        // 10 + 9 + 8 + ... + 1
        //
        // System.out.println(
        //     "Sumatoria: " + sumatoria(10)
        // );


        /*
         * EJEMPLO DEL MANEJO DE CARACTERES
         * Y SUBCADENAS.
         */

        // String texto = "hola";

        // Obtiene el primer carácter de la cadena.
        //
        // charAt(0) devuelve 'h'.
        //
        // char letra = texto.charAt(0);


        // Obtiene una subcadena desde la posición 1
        // hasta el final.
        //
        // "hola" → "ola"
        //
        // String resto = texto.substring(
        //     1,
        //     texto.length()
        // );


        // Muestra cómo se dividió la cadena.
        //
        // System.out.printf(
        //     "%s = %c + %s",
        //     texto,
        //     letra,
        //     resto
        // );


        /*
         * LLAMADA AL MÉTODO RECURSIVO REVERSE
         *
         * La cadena:
         *
         * "hola"
         *
         * Será invertida y el resultado será:
         *
         * "aloh"
         */
        System.out.println(reverse("hola"));


        // Ejemplo del resultado esperado del factorial:
        //
        // factorial(5) = 120
    }
}

