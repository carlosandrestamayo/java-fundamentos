import java.util.Scanner;

/*
 * ============================================================
 * PROGRAMA: MatrizPrimos
 * ============================================================
 *
 * Objetivo:
 * 1. Pedir al usuario el número de filas y columnas.
 * 2. Generar la cantidad necesaria de números primos.
 * 3. Almacenar inicialmente los primos en un arreglo unidimensional.
 * 4. Convertir ese arreglo en una matriz bidimensional.
 * 5. imprimir la matriz.
 *
 * El programa se repite hasta que el usuario ingrese 0
 * en las filas o en las columnas.
 *
 * Ejemplo:
 *
 * Filas:    3
 * Columnas: 4
 *
 * Se necesitan:
 * 3 * 4 = 12 números primos.
 *
 * Resultado:
 *
 * [
 *  2 3 5 7
 *  11 13 17 19
 *  23 29 31 37
 * ]
 *
 * ============================================================
 */


public class MatrizPrimos {


    /*
     * ========================================================
     * MÉTODO: isPrimo
     * ========================================================
     *
     * Determina si un número es primo.
     *
     * Un número primo es aquel que tiene exactamente
     * DOS divisores:
     *
     *     1. El número 1
     *     2. El mismo número
     *
     * Ejemplo:
     *
     * 7 tiene como divisores:
     *
     *     1 y 7
     *
     * Por lo tanto, 7 es primo.
     *
     * En cambio:
     *
     * 8 tiene como divisores:
     *
     *     1, 2, 4, 8
     *
     * Tiene 4 divisores, por lo tanto NO es primo.
     *
     * --------------------------------------------------------
     * Parámetro:
     *
     * numero -> número que queremos analizar.
     *
     * Retorno:
     *
     * true  -> si el número es primo.
     * false -> si el número no es primo.
     * ========================================================
     */

    public static boolean isPrimo(int numero) {

        // Aquí vamos a contar cuántos divisores tiene
        // el número recibido.
        int divisores = 0;


        /*
         * Recorremos todos los posibles divisores
         * desde 1 hasta el propio número.
         *
         * Ejemplo:
         *
         * Si numero = 7:
         *
         * divisor = 1
         * divisor = 2
         * divisor = 3
         * ...
         * divisor = 7
         */

        for (int divisor = 1; divisor <= numero; divisor++) {


            /*
             * El operador % obtiene el RESTO de una división.
             *
             * Si:
             *
             *     numero % divisor == 0
             *
             * significa que la división es exacta.
             *
             * Por lo tanto, divisor es un divisor de numero.
             *
             * Ejemplo:
             *
             *     8 % 2 = 0  -> 2 es divisor de 8
             *
             *     8 % 3 = 2  -> 3 NO es divisor de 8
             */

            if ((numero % divisor) == 0) {

                // Encontramos un divisor.
                // Por eso incrementamos el contador.
                divisores++;
            }
        }


        /*
         * Un número primo tiene exactamente DOS divisores.
         *
         * Por eso la expresión:
         *
         *     divisores == 2
         *
         * produce directamente un boolean:
         *
         *     true  -> divisores es igual a 2
         *     false -> divisores es diferente de 2
         */

        return (divisores == 2);


        /*
         * Otra forma de escribir exactamente la misma lógica
         * sería:
         *
         * if (divisores == 2) {
         *     return true;
         * } else {
         *     return false;
         * }
         *
         * Pero es innecesario porque la expresión:
         *
         *     divisores == 2
         *
         * ya produce un valor boolean.
         */
    }



    /*
     * ========================================================
     * MÉTODO: convertToMatrix
     * ========================================================
     *
     * Copia los elementos de un arreglo unidimensional
     * dentro de una matriz bidimensional.
     *
     * Ejemplo:
     *
     * Arreglo:
     *
     *     [2, 3, 5, 7, 11, 13]
     *
     * Matriz de 2 x 3:
     *
     *     [ 2   3   5 ]
     *     [ 7  11  13 ]
     *
     * --------------------------------------------------------
     * Parámetros:
     *
     * a -> arreglo que contiene los datos.
     *
     * m -> matriz donde se copiarán los datos.
     * ========================================================
     */

    public static void convertToMatrix(int[] a, int[][] m) {

        /*
         * index representa la posición actual
         * que estamos leyendo del arreglo.
         *
         * Comienza en 0 porque los arreglos en Java
         * comienzan a indexarse desde 0.
         */

        int index = 0;


        /*
         * m.length representa la cantidad de FILAS
         * de la matriz.
         *
         * Si tenemos:
         *
         * int[][] m = new int[3][4];
         *
         * entonces:
         *
         *     m.length == 3
         */

        for (int i = 0; i < m.length; i++) {


            /*
             * m[i] representa una fila completa.
             *
             * Por ejemplo:
             *
             * m[0] -> primera fila
             * m[1] -> segunda fila
             * m[2] -> tercera fila
             *
             * m[i].length representa la cantidad
             * de columnas de esa fila.
             */

            for (int j = 0; j < m[i].length; j++) {


                /*
                 * Copiamos el elemento actual del arreglo
                 * en la posición correspondiente de la matriz.
                 *
                 * a[index] -> elemento del arreglo
                 * m[i][j]   -> posición de la matriz
                 */

                m[i][j] = a[index];


                /*
                 * Después de copiar el elemento,
                 * avanzamos a la siguiente posición
                 * del arreglo.
                 */

                index++;
            }
        }
    }



    /*
     * ========================================================
     * MÉTODO: imprimir
     * ========================================================
     *
     * Recibe una matriz y muestra sus elementos por consola.
     *
     * Este método utiliza FOR-EACH.
     * ========================================================
     */

    public static void imprimir(int[][] arr) {


        // Imprimimos el símbolo [ para representar
        // visualmente el comienzo de la matriz.

        System.out.println("\n[");


        /*
         * FOR-EACH:
         *
         *     for (int[] fila : arr)
         *
         * Se puede leer como:
         *
         * "Para cada fila que exista dentro de arr..."
         *
         * Como arr es una matriz de int:
         *
         *     int[][]
         *
         * cada elemento de arr es un:
         *
         *     int[]
         *
         * Es decir, una fila.
         */

        for (int[] fila : arr) {


            /*
             * Ahora recorremos los elementos de esa fila.
             *
             * Cada elemento es un entero:
             *
             *     int
             */

            for (int n : fila) {

                // Imprimimos cada número de la fila.

                System.out.print(" " + n);
            }


            /*
             * Cuando terminamos una fila,
             * hacemos un salto de línea.
             */

            System.out.println();
        }


        // Cerramos visualmente la matriz.

        System.out.println("]");
    }



    /*
     * ========================================================
     * MÉTODO PRINCIPAL: main
     * ========================================================
     *
     * La ejecución del programa comienza aquí.
     * ========================================================
     */

    public static void main(String[] args) {


        /*
         * Creamos un objeto Scanner para poder leer
         * información introducida por el usuario.
         *
         * System.in representa la entrada estándar,
         * normalmente el teclado.
         */

        Scanner sc = new Scanner(System.in);



        /*
         * ====================================================
         * BUCLE PRINCIPAL
         * ====================================================
         *
         * while(true) crea un ciclo que, en principio,
         * nunca termina por sí mismo.
         *
         * Para salir utilizaremos:
         *
         *     break;
         *
         * Más adelante veremos la condición de salida.
         */

        while (true) {


            // Pedimos al usuario el número de filas.

            System.out.print("Ingrese filas: ");

            int row = sc.nextInt();


            // Pedimos al usuario el número de columnas.

            System.out.print("Ingrese columnas: ");

            int col = sc.nextInt();



            /*
             * CONDICIÓN DE SALIDA
             *
             * Si el usuario introduce 0 en las filas
             * O 0 en las columnas, terminamos el programa.
             *
             * El operador || significa OR lógico.
             *
             * La condición se interpreta como:
             *
             * "Si row es 0 O col es 0..."
             */

            if (col == 0 || row == 0) {
                break;
            }



            /*
             * =================================================
             * printf
             * =================================================
             *
             * printf permite construir una salida utilizando
             * MARCADORES DE FORMATO.
             *
             * %d representa un número entero.
             *
             * Por ejemplo:
             *
             *     System.out.printf("%d", 5);
             *
             * imprime:
             *
             *     5
             *
             * En este caso tenemos dos %d:
             *
             *     %d -> row
             *     %d -> col
             */

            System.out.printf(
                "%nMatriz de Primos %d * %d%n",
                row,
                col
            );



            /*
             * =================================================
             * CREACIÓN DE LA MATRIZ
             * =================================================
             *
             * Creamos una matriz de:
             *
             *     row filas
             *     col columnas
             *
             * Ejemplo:
             *
             * row = 3
             * col = 4
             *
             * Entonces:
             *
             *     new int[3][4]
             *
             * representa:
             *
             *     [ _ _ _ _ ]
             *     [ _ _ _ _ ]
             *     [ _ _ _ _ ]
             */

            int[][] arr = new int[row][col];



            /*
             * =================================================
             * CREACIÓN DEL ARREGLO DE PRIMOS
             * =================================================
             *
             * La matriz necesita:
             *
             *     row * col
             *
             * posiciones.
             *
             * Por eso creamos un arreglo con exactamente
             * esa cantidad de posiciones.
             *
             * Ejemplo:
             *
             *     3 * 4 = 12
             *
             * Entonces:
             *
             *     int[] primos = new int[12];
             */

            int[] primos = new int[row * col];



            /*
             * contador indica cuántos números primos
             * hemos encontrado hasta el momento.
             *
             * Inicialmente:
             *
             *     0 primos encontrados.
             */

            int contador = 0;



            /*
             * cantidad representa cuántos números primos
             * necesitamos generar.
             *
             * Si la matriz es de 3 x 4:
             *
             *     cantidad = 3 * 4
             *              = 12
             */

            int cantidad = row * col;



            /*
             * Comenzamos a buscar números primos
             * desde el número 2.
             *
             * ¿Por qué 2?
             *
             * Porque 2 es el primer número primo.
             */

            int numero = 2;



            /*
             * =================================================
             * GENERACIÓN DE NÚMEROS PRIMOS
             * =================================================
             *
             * Repetimos mientras no hayamos encontrado
             * la cantidad de primos que necesitamos.
             *
             * Ejemplo:
             *
             * cantidad = 6
             *
             * El ciclo termina cuando:
             *
             *     contador == 6
             */

            while (contador < cantidad) {


                /*
                 * Preguntamos:
                 *
                 *     ¿numero es primo?
                 *
                 * El método isPrimo devuelve:
                 *
                 *     true  -> es primo
                 *     false -> no es primo
                 */

                if (isPrimo(numero)) {


                    /*
                     * Si es primo, lo guardamos en el arreglo.
                     *
                     * contador indica la posición donde
                     * debemos almacenarlo.
                     *
                     * Ejemplo:
                     *
                     * contador = 0
                     * primos[0] = 2
                     *
                     * contador = 1
                     * primos[1] = 3
                     */

                    primos[contador] = numero;


                    /*
                     * Aumentamos el contador porque acabamos
                     * de encontrar un nuevo número primo.
                     */

                    contador++;
                }


                /*
                 * Independientemente de si el número era primo
                 * o no, avanzamos al siguiente número.
                 *
                 * Ejemplo:
                 *
                 * numero = 2
                 * numero = 3
                 * numero = 4
                 * numero = 5
                 * ...
                 */

                numero++;
            }



            /*
             * =================================================
             * CONVERSIÓN
             * =================================================
             *
             * Hasta este punto tenemos:
             *
             *     primos -> arreglo unidimensional
             *
             * Ahora copiamos sus elementos a:
             *
             *     arr -> matriz bidimensional
             */

            convertToMatrix(primos, arr);



            /*
             * Finalmente enviamos la matriz al método
             * imprimir para mostrarla en pantalla.
             */

            imprimir(arr);
        }
    }
}

