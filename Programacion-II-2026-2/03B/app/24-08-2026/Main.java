import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Lunes 24 de agosto de 2026 - 10:00 a. m.
        //
        // TEMA DE LA CLASE:
        // - Scanner
        // - Comparación de Strings y tipos primitivos
        // - Matrices bidimensionales
        // - Recorrido de matrices
        // - Creación de matrices con dimensiones variables
        // - Ciclos while y for
        // - Operador módulo %
        // - Identificación de números primos
        // - Llenado de una matriz con números primos
        // =========================================================


        // =========================================================
        // 1. CREAR UN OBJETO SCANNER
        // =========================================================
        //
        // Scanner permite leer información introducida por el
        // usuario desde el teclado.
        //
        // En este programa lo utilizaremos para solicitar al
        // usuario el número de filas y columnas de la matriz.

        Scanner sc = new Scanner(System.in);


        // =========================================================
        // 2. COMPARACIÓN DE STRINGS
        // =========================================================
        //
        // En Java, cuando trabajamos con objetos como String,
        // debemos tener cuidado con el operador ==.
        //
        // El operador == compara referencias, mientras que
        // equals() compara el contenido de los Strings.
        //
        // Por ejemplo:
        //
        // String a = "Hola";
        // String b = "Hola";
        //
        // Para comparar el contenido debemos utilizar:
        //
        // a.equals(b)
        //
        // ---------------------------------------------------------
        // Estos ejemplos fueron utilizados durante la clase.
        // Se dejan comentados como referencia.
        // ---------------------------------------------------------

        // String a = "Hola";
        // String b = new String("Hola");

        // String b = "Hola";

        // System.out.println("a: " + a);
        // System.out.println("b: " + b);

        // System.out.println("a == b " + a.equals(b));


        // =========================================================
        // 3. COMPARACIÓN DE TIPOS PRIMITIVOS
        // =========================================================
        //
        // Con tipos primitivos como int, el operador == compara
        // directamente los valores.

        // int x = 2;
        // int y = 2;

        // System.out.println("x: " + x);
        // System.out.println("y: " + y);

        // System.out.println("x == y " + (x == y));


        // =========================================================
        // 4. CREAR UNA MATRIZ
        // =========================================================
        //
        // Una matriz bidimensional se representa mediante:
        //
        //     tipo[][] nombre;
        //
        // En este ejemplo:
        //
        //     int[][] m
        //
        // representa una matriz de números enteros.
        //
        // La matriz tiene 3 filas y 3 columnas.

        // int[][] m = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };


        // =========================================================
        // 5. RECORRER UNA MATRIZ
        // =========================================================
        //
        // Para recorrer una matriz utilizamos normalmente
        // dos ciclos for:
        //
        //     Primer for   → filas
        //     Segundo for  → columnas
        //
        // m.length indica el número de filas.
        //
        // m[i].length indica el número de columnas de la fila i.

        // System.out.println(
        //     "\nMatriz de " + m.length + " * " + m[0].length
        // );

        // for (int i = 0; i < m.length; i++) {

        //     System.out.println("\nFila " + i + "\n");

        //     for (int j = 0; j < m[i].length; j++) {

        //         System.out.println(
        //             "m[" + i + "][" + j + "] = " + m[i][j]
        //         );
        //     }
        // }


        // =========================================================
        // 6. VARIABLES PARA LAS DIMENSIONES DE LA MATRIZ
        // =========================================================
        //
        // En este ejercicio las dimensiones de la matriz serán
        // proporcionadas por el usuario.
        //
        // row → número de filas.
        // col → número de columnas.
        //
        // Inicialmente asignamos algunos valores.
        // Posteriormente estos valores serán reemplazados por
        // los valores introducidos por el usuario.

        int row = 34;
        int col = 50;

        // Variable utilizada en el ejemplo anterior para llenar
        // una matriz consecutivamente.
        //
        // Actualmente no se utiliza en la solución principal.

        int value = 1;


        // =========================================================
        // 7. CREAR UNA MATRIZ DE TAMAÑO VARIABLE
        // =========================================================
        //
        // Este bloque muestra cómo crear una matriz utilizando
        // las variables row y col.
        //
        // Como está comentado, no se ejecuta.
        //
        // La idea era observar que podemos crear una matriz
        // cuyo tamaño se determine mediante variables.

        // int[][] k = new int[row][col];


        // =========================================================
        // 8. LLENAR LA MATRIZ
        // =========================================================
        //
        // Podemos recorrer la matriz con dos ciclos for:
        //
        //     i → filas
        //     j → columnas
        //
        // En cada posición almacenamos un valor y posteriormente
        // incrementamos ese valor.

        // for (int i = 0; i < k.length; i++) {

        //     for (int j = 0; j < k[i].length; j++) {

        //         k[i][j] = value;
        //         value++;
        //     }
        // }


        // =========================================================
        // 9. MOSTRAR LA MATRIZ
        // =========================================================
        //
        // También podemos recorrer la matriz para mostrar
        // cada una de sus posiciones.

        // System.out.println(
        //     "\nMatriz de " + k.length + " * " + k[0].length
        // );

        // for (int i = 0; i < k.length; i++) {

        //     System.out.println("\nFila " + i + "\n");

        //     for (int j = 0; j < k[i].length; j++) {

        //         System.out.println(
        //             "k[" + i + "][" + j + "] = " + k[i][j]
        //         );
        //     }
        // }


        // =========================================================
        // 10. MATRIZ DE NÚMEROS PRIMOS
        // =========================================================
        //
        // Ahora comenzamos el ejercicio principal de la clase.
        //
        // El usuario podrá indicar cuántas filas y columnas
        // tendrá la matriz.
        //
        // La matriz será llenada con números primos.
        //
        // Por ejemplo, si el usuario solicita una matriz de
        // 2 x 3, necesitamos encontrar 6 números primos:
        //
        //     2   3   5
        //     7  11  13


        row = 5;
        col = 6;

        value = 1;


        // =========================================================
        // 11. CICLO PRINCIPAL
        // =========================================================
        //
        // while(true) crea un ciclo que continuará indefinidamente
        // hasta que encontremos una condición que utilice break.
        //
        // En nuestro caso, el programa terminará cuando el usuario
        // introduzca 0 como número de filas o columnas.

        while (true) {


            // -----------------------------------------------------
            // Solicitar número de filas
            // -----------------------------------------------------

            System.out.println("Rows Number: ");
            row = sc.nextInt();


            // -----------------------------------------------------
            // Solicitar número de columnas
            // -----------------------------------------------------

            System.out.println("Cols Number: ");
            col = sc.nextInt();


            // -----------------------------------------------------
            // CONDICIÓN DE SALIDA
            // -----------------------------------------------------
            //
            // Si row o col es igual a 0, terminamos el programa.
            //
            // break rompe inmediatamente el ciclo while.

            if (row == 0 || col == 0) {
                break;
            }


            // =====================================================
            // 12. CREAR LA MATRIZ
            // =====================================================
            //
            // Creamos una matriz utilizando las dimensiones
            // introducidas por el usuario.

            int[][] arr = new int[row][col];


            // =====================================================
            // 13. VARIABLES PARA CONTROLAR EL LLENADO
            // =====================================================
            //
            // contador:
            // Indica cuántas posiciones de la matriz hemos llenado.
            //
            // numero:
            // Es el número que estamos analizando para determinar
            // si es primo.
            //
            // contRows:
            // Indica la fila actual de la matriz.
            //
            // contCols:
            // Indica la columna actual de la matriz.

            int contador = 0;
            int numero = 2;

            int contRows = 0;
            int contCols = 0;


            // =====================================================
            // 14. BUSCAR NÚMEROS PRIMOS
            // =====================================================
            //
            // Una matriz de:
            //
            //     row x col
            //
            // contiene:
            //
            //     row * col
            //
            // posiciones.
            //
            // Por eso continuamos buscando números primos mientras
            // contador sea menor que row * col.

            while (contador < (row * col)) {


                // -------------------------------------------------
                // Contará cuántos divisores tiene el número actual.
                // -------------------------------------------------

                int divisores = 0;


                // =================================================
                // 15. BUSCAR LOS DIVISORES DEL NÚMERO
                // =================================================
                //
                // Para determinar si un número es primo,
                // buscamos cuántos divisores tiene.
                //
                // Un número primo solamente tiene dos divisores:
                //
                //     1
                //     el mismo número
                //
                // Por ejemplo:
                //
                //     7 % 1 = 0
                //     7 % 2 ≠ 0
                //     7 % 3 ≠ 0
                //     7 % 4 ≠ 0
                //     7 % 5 ≠ 0
                //     7 % 6 ≠ 0
                //     7 % 7 = 0
                //
                // Por lo tanto, 7 tiene dos divisores y es primo.

                for (int divisor = 1; divisor <= numero; divisor++) {

                    // El operador % devuelve el residuo de una
                    // división.
                    //
                    // Si el residuo es 0, significa que el número
                    // es divisible exactamente entre el divisor.

                    if (numero % divisor == 0) {
                        divisores++;
                    }
                }


                // =================================================
                // 16. DETERMINAR SI EL NÚMERO ES PRIMO
                // =================================================
                //
                // Si el número tiene exactamente dos divisores,
                // entonces es primo.

                if (divisores == 2) {


                    // =============================================
                    // 17. CAMBIAR DE FILA
                    // =============================================
                    //
                    // contador representa la posición consecutiva
                    // que estamos llenando.
                    //
                    // Cuando contador es múltiplo del número de
                    // columnas, significa que hemos completado
                    // una fila.
                    //
                    // Por ejemplo, si tenemos 3 columnas:
                    //
                    // contador:
                    //
                    //     0   1   2   3   4   5
                    //
                    // Al llegar a 3 debemos pasar a la siguiente
                    // fila.
                    //
                    // Por eso utilizamos:
                    //
                    //     contador % col == 0
                    //
                    // La condición contador != 0 evita cambiar de
                    // fila al comenzar con la posición 0.

                    if (contador % col == 0 && contador != 0) {

                        contRows++;

                        // Cuando cambiamos de fila, volvemos a
                        // comenzar desde la primera columna.

                        contCols = 0;
                    }


                    // =============================================
                    // 18. GUARDAR EL NÚMERO PRIMO
                    // =============================================
                    //
                    // Guardamos el número encontrado en la posición
                    // correspondiente de la matriz.
                    //
                    // arr[contRows][contCols]
                    //
                    // representa:
                    //
                    //     arr[fila][columna]

                    arr[contRows][contCols] = numero;


                    // Esta línea fue utilizada durante la
                    // depuración para observar cómo avanzaban
                    // los contadores.
                    //
                    // Se deja comentada porque no forma parte
                    // de la salida final del programa.

                    // System.out.println(
                    //     "contador: " + contador +
                    //     ", contRows: " + contRows +
                    //     " ,contCols: " + contCols
                    // );


                    // Ya encontramos un número primo y lo
                    // almacenamos en la matriz.
                    //
                    // Por lo tanto, aumentamos el contador
                    // de posiciones llenadas.

                    contador++;


                    // Avanzamos a la siguiente columna.

                    contCols++;
                }


                // Pasamos al siguiente número para comprobar
                // si es primo.

                numero++;
            }


            // =====================================================
            // 19. MOSTRAR LA MATRIZ RESULTANTE
            // =====================================================
            //
            // Una vez que la matriz está completamente llena,
            // podemos recorrerla nuevamente para mostrar
            // sus elementos.

            System.out.println(
                "\nMatriz de " + arr.length + " * " + arr[0].length
            );


            // Primer for:
            // recorre las filas.

            for (int i = 0; i < arr.length; i++) {

                System.out.println("\nFila " + i + "\n");


                // Segundo for:
                // recorre las columnas de la fila actual.

                for (int j = 0; j < arr[i].length; j++) {

                    System.out.println(
                        "arr[" + i + "][" + j + "] = " + arr[i][j]
                    );
                }
            }
        }
    }
}