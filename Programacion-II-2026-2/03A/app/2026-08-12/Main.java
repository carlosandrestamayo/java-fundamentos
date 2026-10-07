public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Miércoles 12 de agosto de 2026 - 10:00 a. m.
        // CICLOS, CONTINUE Y ALGORITMOS CON CICLOS ANIDADOS
        // =========================================================


        // =========================================================
        // 1. WHILE EN PYTHON
        // =========================================================

        /*
         * La estructura while existe en diferentes lenguajes.
         *
         * La lógica es la misma:
         *
         * 1. Inicializar la variable.
         * 2. Evaluar la condición.
         * 3. Ejecutar el bloque.
         * 4. Modificar la variable.
         */

        /*
        # Python

        n = 1

        while n <= 5:
            print("n: ", n)
            n = n + 1
        */


        // =========================================================
        // 2. WHILE EN JAVA
        // =========================================================

        /*
         * En Java las instrucciones deben estar dentro de bloques
         * delimitados por { }.
         *
         * El incremento también puede escribirse de forma
         * abreviada utilizando ++.
         */

        /*
        System.out.println("While in Java\n");

        int n = 1;

        while (n <= 5) {

            System.out.println("n: " + n);

            n++;
        }
        */


        // =========================================================
        // 3. FOR EN PYTHON
        // =========================================================

        /*
         * En Python podemos utilizar range() para generar
         * una secuencia de valores.
         *
         * range(1, 11, 1)
         *
         * 1 -> inicio
         * 11 -> límite superior (no se incluye)
         * 1 -> paso
         */

        /*
        # Python

        for i in range(1, 11, 1):
            print("i: ", i)
        */


        // =========================================================
        // 4. FOR EN JAVA
        // =========================================================

        /*
         * En Java el for permite controlar directamente:
         *
         * inicialización
         * condición
         * actualización
         *
         * En este ejemplo aparece continue.
         */

        /*
        System.out.println("\nFor in Java\n");

        for (int i = 1; i < 11; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println("i: " + i);
        }
        */


        // =========================================================
        // 5. CONTINUE
        // =========================================================

        /*
         * continue interrumpe la iteración actual y pasa
         * directamente a la siguiente iteración del ciclo.
         *
         * En el ejemplo anterior:
         *
         * cuando i == 3
         *
         * continue evita ejecutar:
         *
         * System.out.println("i: " + i);
         *
         * Por eso el número 3 no aparece.
         *
         * IMPORTANTE:
         *
         * continue NO termina el ciclo.
         *
         * Para terminar completamente un ciclo utilizamos break.
         */


        // =========================================================
        // 6. GENERAR NÚMEROS PARES
        // =========================================================

        /*
         * Una forma sencilla de generar números pares
         * es comenzar en 2 y avanzar de 2 en 2.
         *
         * 2, 4, 6, 8, 10, ...
         */

        /*
        for (int i = 2; i <= 20; i = i + 2) {

            System.out.println("par: " + i);
        }
        */


        // =========================================================
        // 7. IDENTIFICAR NÚMEROS PARES UTILIZANDO %
        // =========================================================

        /*
         * El operador % obtiene el residuo de una división.
         *
         * Si un número dividido entre 2 tiene residuo 0,
         * entonces es par.
         *
         * Ejemplo:
         *
         * 10 % 2 = 0  -> par
         * 11 % 2 = 1  -> impar
         */

        /*
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                System.out.println("par: " + i);
            }
        }
        */


        // =========================================================
        // 8. OTRA FORMA DE GENERAR NÚMEROS PARES
        // =========================================================

        /*
         * Si i toma los valores:
         *
         * 1, 2, 3, 4, 5
         *
         * entonces i * 2 produce:
         *
         * 2, 4, 6, 8, 10
         */

        /*
        for (int i = 1; i <= 10; i++) {

            System.out.println("par: " + i * 2);
        }
        */


        // =========================================================
        // 9. MÚLTIPLES INSTRUCCIONES DENTRO DEL FOR
        // =========================================================

        /*
         * Un ciclo puede ejecutar varias instrucciones
         * en cada iteración.
         */

        /*
        for (int i = 1; i <= 5; i++) {

            System.out.println("par: " + i * 2);

            System.out.println("par: " + i * 4);
        }
        */


        // =========================================================
        // 10. NÚMEROS PRIMOS
        // =========================================================

        /*
         * Un número primo tiene exactamente dos divisores:
         *
         * 1. El número 1.
         * 2. El propio número.
         *
         * Ejemplos:
         *
         * 2 -> 1 y 2
         * 3 -> 1 y 3
         * 5 -> 1 y 5
         * 7 -> 1 y 7
         *
         * Para determinar si un número es primo podemos contar
         * cuántos divisores tiene.
         *
         * Aquí aparece un FOR ANIDADO:
         *
         * FOR externo:
         *     recorre los números que queremos analizar.
         *
         * FOR interno:
         *     busca los divisores de cada número.
         */

        for (int numero = 2; numero <= 100; numero++) {

            int contador = 0;

            for (int divisor = 1; divisor <= numero; divisor++) {

                /*
                 * Si el residuo es 0, significa que divisor
                 * divide exactamente a numero.
                 */

                if (numero % divisor == 0) {

                    contador++;
                }
            }

            /*
             * Un número primo tiene exactamente dos divisores.
             */

            if (contador == 2) {

                // System.out.println(
                //     "El número " + numero + " es primo"
                // );

            }
            else {

                // System.out.println(
                //     "El número " + numero + " no es primo"
                // );
            }
        }


        // =========================================================
        // 11. ++x
        // =========================================================

        /*
         * ++x es un incremento PRE-incremental.
         *
         * Primero incrementa x y después utiliza su valor.
         *
         * En este caso:
         *
         * x = 0
         *
         * ++x -> 1
         * ++x -> 2
         * ++x -> 3
         * ...
         */

        int x = 0;

        while (x < 5) {

            System.out.println("x: " + ++x);
        }


        // =========================================================
        // 12. CONTAR MÚLTIPLOS DE 7
        // =========================================================

        /*
         * Queremos determinar cuántos números entre 15 y 72
         * son múltiplos de 7.
         *
         * Utilizamos nuevamente el operador %.
         *
         * Si:
         *
         * i % 7 == 0
         *
         * entonces i es múltiplo de 7.
         *
         * Cada vez que encontramos uno incrementamos contador.
         */

        int contador = 0;

        for (int i = 15; i <= 72; i++) {

            if (i % 7 == 0) {

                contador++;
            }
        }

        System.out.println(
            "Hay " + contador +
            " múltiplos de 7 entre 15 y 72"
        );


        // =========================================================
        // IDEA CENTRAL
        // =========================================================

        /*
         * En esta clase aparecen varias ideas importantes:
         *
         * 1. Los ciclos se encuentran en diferentes lenguajes.
         *
         * 2. La sintaxis cambia, pero el algoritmo permanece.
         *
         * 3. continue permite saltar una iteración.
         *
         * 4. % permite trabajar con residuos y determinar
         *    divisibilidad.
         *
         * 5. Los ciclos pueden combinarse.
         *
         * 6. Un ciclo dentro de otro se denomina ciclo anidado.
         *
         * 7. Los ciclos anidados permiten construir algoritmos
         *    más interesantes, como la búsqueda de divisores
         *    y la identificación de números primos.
         *
         * 8. Un contador permite registrar cuántas veces
         *    ocurre una determinada condición.
         */

    }
}