import java.util.Scanner;

public class Main {

    // =========================================================
    // Miércoles 26 de agosto de 2026 - 10:00 a. m.
    //
    // Tema de la clase:
    // - Referencias y comparación de objetos
    // - Arrays unidimensionales
    // - Arrays bidimensionales (matrices)
    // - Recorrido de matrices
    // - Matriz transpuesta
    // - Métodos
    // =========================================================


    // =========================================================
    // MÉTODO: isPrimo
    // =========================================================
    //
    // Determina si un número es primo.
    //
    // Un número primo tiene exactamente DOS divisores:
    //
    //     1. El número 1
    //     2. El mismo número
    //
    // Parámetro:
    //     n -> número que queremos analizar.
    //
    // Retorno:
    //     true  -> si n es primo.
    //     false -> si n no es primo.
    //
    // =========================================================

    public static boolean isPrimo(int n) {

        // Contador que almacenará la cantidad
        // de divisores encontrados.

        int divisores = 0;


        // Recorremos todos los números desde 1 hasta n
        // para determinar cuáles son divisores de n.

        for (int divisor = 1; divisor <= n; divisor++) {


            // El operador % obtiene el resto de una división.
            //
            // Si el resto es 0, significa que la división
            // es exacta y, por lo tanto, divisor es realmente
            // un divisor de n.

            if ((n % divisor) == 0) {

                divisores++;
            }
        }


        // Un número es primo si tiene exactamente
        // dos divisores.

        return (divisores == 2);
    }



    // =========================================================
    // MÉTODO: imprimir
    // =========================================================
    //
    // Recibe un arreglo de enteros y muestra cada elemento
    // junto con su índice.
    //
    // Parámetro:
    //     arr -> arreglo que queremos recorrer.
    //
    // =========================================================

    public static void imprimir(int[] arr) {


        // index representa la posición actual
        // dentro del arreglo.
        //
        // Los índices de un arreglo en Java comienzan en 0.

        int index = 0;


        // FOR-EACH
        //
        // Esta estructura recorre todos los elementos
        // del arreglo sin necesidad de escribir:
        //
        //     arr[index]
        //
        // directamente.
        //
        // En cada repetición, x contiene el elemento actual.

        for (int x : arr) {

            System.out.printf(
                "arr[%d]= %d%n",
                index++,
                x
            );
        }
    }



    // =========================================================
    // MÉTODO: sumar
    // =========================================================
    //
    // Recibe dos enteros y devuelve su suma.
    //
    // Parámetros:
    //     a, b
    //
    // Retorno:
    //     int
    //
    // =========================================================

    public static int sumar(int a, int b) {

        return a + b;
    }



    // =========================================================
    // MÉTODO: restar
    // =========================================================
    //
    // Recibe dos enteros y devuelve su resta.
    //
    // =========================================================

    public static int restar(int a, int b) {

        return a - b;
    }



    // =========================================================
    // MÉTODO: multiplicar
    // =========================================================
    //
    // Recibe dos enteros y devuelve su multiplicación.
    //
    // =========================================================

    public static int multiplicar(int a, int b) {

        return a * b;
    }



    // =========================================================
    // MÉTODO: dividir
    // =========================================================
    //
    // Recibe dos enteros pero devuelve un double.
    //
    // Esto permite obtener un resultado decimal.
    //
    // Por ejemplo:
    //
    //     2 / 3
    //
    // Si ambos fueran tratados como int:
    //
    //     2 / 3 = 0
    //
    // Pero necesitamos:
    //
    //     2 / 3 = 0.666...
    //
    // Por eso convertimos uno de los operandos
    // a double mediante:
    //
    //     a * 1.0
    //
    // =========================================================

    public static double dividir(int a, int b) {

        return (a * 1.0) / b;
    }



    // =========================================================
    // MÉTODO PRINCIPAL
    // =========================================================
    //
    // La ejecución del programa comienza en main().
    //
    // =========================================================

    public static void main(String[] args) {


        // =========================================================
        // TEMA DE LA CLASE
        // =========================================================
        //
        // Miércoles 26 de agosto de 2026 - 10:00 a. m.
        //
        // Temas:
        //
        // - Referencias y comparación de objetos
        // - Arrays unidimensionales
        // - Arrays bidimensionales (matrices)
        // - Recorrido de matrices
        // - Matriz transpuesta
        // - Métodos
        //
        // =========================================================



        // =========================================================
        // EJERCICIO: NÚMEROS PRIMOS
        // =========================================================
        //
        // Este bloque muestra cómo podemos utilizar el método
        // isPrimo() para construir un arreglo dinámicamente.
        //
        // Actualmente está comentado porque el ejercicio no forma
        // parte de la ejecución principal del programa.
        //
        // =========================================================


        // int fin = 100;
        // int n = 2;
        // int totalPrimos = 0;


        // ---------------------------------------------------------
        // PRIMER RECORRIDO
        // ---------------------------------------------------------
        //
        // Primero contamos cuántos números primos existen
        // entre 2 y 100.
        //
        // Esto es necesario porque posteriormente queremos
        // crear un arreglo exactamente del tamaño necesario.
        //
        // ---------------------------------------------------------

        // for(n = 2; n <= fin; n++){
        //     totalPrimos += isPrimo(n) ? 1 : 0;
        // }


        // ---------------------------------------------------------
        // CREACIÓN DEL ARREGLO
        // ---------------------------------------------------------
        //
        // Ahora conocemos la cantidad de números primos,
        // por lo que podemos crear el arreglo.
        //
        // ---------------------------------------------------------

        // int[] arr = new int[totalPrimos];


        // ---------------------------------------------------------
        // SEGUNDO RECORRIDO
        // ---------------------------------------------------------
        //
        // Reiniciamos totalPrimos para utilizarlo nuevamente
        // como índice del arreglo.
        //
        // ---------------------------------------------------------

        // totalPrimos = 0;


        // for(n = 2; n <= fin; n++){

        //     if(isPrimo(n)){

        //         arr[totalPrimos] = n;
        //         totalPrimos++;
        //     }
        // }


        // ---------------------------------------------------------
        // MOSTRAR EL ARREGLO
        // ---------------------------------------------------------

        // imprimir(arr);



        // =========================================================
        // FORMATO DE NÚMEROS DECIMALES CON printf
        // =========================================================
        //
        // También podemos controlar cuántas posiciones decimales
        // queremos mostrar utilizando printf().
        //
        // %f -> número de punto flotante.
        //
        // %.2f -> mostrar exactamente 2 posiciones decimales.
        //
        // =========================================================

        // double z = 2.3457;

        // System.out.printf("z: %.0f%n", z);
        // System.out.printf("z: %.1f%n", z);
        // System.out.printf("z: %.2f%n", z);
        // System.out.printf("z: %.3f%n", z);
        // System.out.printf("z: %.4f%n", z);
        // System.out.printf("z: %.5f%n", z);


        // También podemos imprimir directamente el valor
        // utilizando concatenación.

        // System.out.println("z normal = " + z);



        // =========================================================
        // SCANNER
        // =========================================================
        //
        // Creamos un Scanner para leer información
        // introducida por el usuario.
        //
        // System.in representa la entrada estándar,
        // normalmente el teclado.
        //
        // =========================================================

        Scanner sc = new Scanner(System.in);



        // =========================================================
        // MENÚ PRINCIPAL
        // =========================================================
        //
        // Utilizamos while(true) porque queremos que el menú
        // aparezca repetidamente.
        //
        // El ciclo terminará cuando el usuario seleccione
        // la opción 0.
        //
        // =========================================================

        while (true) {


            // -----------------------------------------------------
            // MOSTRAR MENÚ
            // -----------------------------------------------------

            System.out.println("-----Menu-----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");


            // -----------------------------------------------------
            // LEER OPCIÓN
            // -----------------------------------------------------
            //
            // nextInt() permite leer un número entero.
            //
            // -----------------------------------------------------

            System.out.print("Ingrese su opción: ");

            int opcion = sc.nextInt();

            System.out.println("");



            // =====================================================
            // SALIR DEL PROGRAMA
            // =====================================================
            //
            // Si el usuario selecciona 0:
            //
            //     break
            //
            // termina inmediatamente el while.
            //
            // =====================================================

            if (opcion == 0) {

                System.out.println("Suerte...");

                break;
            }



            // =====================================================
            // DATOS PARA LAS OPERACIONES
            // =====================================================
            //
            // Por ahora utilizamos valores fijos.
            //
            // Posteriormente podemos pedir estos valores
            // al usuario utilizando Scanner.
            //
            // =====================================================

            int a = 2;
            int b = 3;



            // =====================================================
            // SWITCH
            // =====================================================
            //
            // switch permite seleccionar una acción dependiendo
            // del valor de una variable.
            //
            // En este caso:
            //
            //     opcion == 1 -> sumar
            //     opcion == 2 -> restar
            //     opcion == 3 -> multiplicar
            //     opcion == 4 -> dividir
            //
            // =====================================================

            switch (opcion) {


                // -------------------------------------------------
                // OPCIÓN 1: SUMAR
                // -------------------------------------------------

                case 1:

                    // Llamamos al método sumar().
                    //
                    // sumar(a, b) devuelve un int.

                    System.out.printf(
                        "%d + %d = %d%n",
                        a,
                        b,
                        sumar(a, b)
                    );

                    break;



                // -------------------------------------------------
                // OPCIÓN 2: RESTAR
                // -------------------------------------------------

                case 2:

                    System.out.printf(
                        "%d - %d = %d%n",
                        a,
                        b,
                        restar(a, b)
                    );

                    break;



                // -------------------------------------------------
                // OPCIÓN 3: MULTIPLICAR
                // -------------------------------------------------

                case 3:

                    System.out.printf(
                        "%d * %d = %d%n",
                        a,
                        b,
                        multiplicar(a, b)
                    );

                    break;



                // -------------------------------------------------
                // OPCIÓN 4: DIVIDIR
                // -------------------------------------------------

                case 4:

                    // dividir() devuelve un double.
                    //
                    // %f permite mostrar el resultado
                    // como número de punto flotante.

                    System.out.printf(
                        "%d / %d = %f%n",
                        a,
                        b,
                        dividir(a, b)
                    );

                    break;



                // -------------------------------------------------
                // OPCIÓN NO VÁLIDA
                // -------------------------------------------------
                //
                // default se ejecuta cuando opcion no coincide
                // con ninguno de los case anteriores.
                //
                // -------------------------------------------------

                default:

                    System.out.println(
                        "Ingresa una opción válida"
                    );
            }
        }
    }
}

