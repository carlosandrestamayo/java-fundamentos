import java.util.Scanner;

public class Main {


    // =========================================================
    // MÉTODO: sumar
    // =========================================================
    //
    // Este método recibe DOS parámetros de tipo int:
    //
    //     a
    //     b
    //
    // y devuelve la suma de ambos.
    //
    // Es importante diferenciar:
    //
    //     PARÁMETROS -> variables que recibe el método.
    //     RETORNO    -> valor que el método devuelve.
    //
    // En este caso:
    //
    //     Parámetros: int a, int b
    //     Retorno:    int
    //
    // =========================================================

    public static int sumar(int a, int b) {

        // Calculamos la suma.
        int suma = a + b;

        // Devolvemos el resultado.
        return suma;
    }


    // =========================================================
    // MÉTODO: saludar
    // =========================================================
    //
    // Este método NO recibe parámetros.
    //
    // Además, utiliza:
    //
    //     void
    //
    // Esto significa que el método NO devuelve ningún valor.
    //
    // Su única responsabilidad es ejecutar una acción:
    //
    //     mostrar un saludo.
    //
    // =========================================================

    public static void saludar() {

        System.out.printf("Hola Como te llames%n");
    }


    // =========================================================
    // MÉTODO: saludarConNombre
    // =========================================================
    //
    // Este método recibe un parámetro:
    //
    //     String nombre
    //
    // Por lo tanto, podemos utilizar el valor recibido
    // dentro del método.
    //
    // =========================================================

    public static void saludarConNombre(String nombre) {

        // %s representa un String.
        //
        // El valor de "nombre" reemplazará al %s.

        System.out.printf("Hola %s%n", nombre);
    }


    // =========================================================
    // MÉTODO PRINCIPAL: main
    // =========================================================
    //
    // La ejecución de un programa Java comienza normalmente
    // en el método main().
    //
    // =========================================================

    public static void main(String[] args) {


        // =========================================================
        // TEMA DE LA CLASE
        // =========================================================
        //
        // Miércoles 26 de agosto de 2026 - 6:00 a. m.
        //
        // Temas:
        //
        // - Ciclo while
        // - Ciclo for
        // - Arreglos
        // - Recorrido de arreglos
        // - Recorrido de String
        // - Índices
        // - charAt()
        // - Métodos
        //
        // =========================================================


        // =========================================================
        // EJERCICIO 1
        // =========================================================
        //
        // Encontrar los primeros números primos y almacenarlos
        // en un arreglo.
        //
        // =========================================================


        // =========================================================
        // EJEMPLOS DE MÉTODOS
        // =========================================================
        //
        // Las siguientes líneas están comentadas porque
        // fueron utilizadas para practicar métodos.
        //
        // =========================================================


        // ---------------------------------------------------------
        // Ejemplo 1: método con parámetros y retorno
        // ---------------------------------------------------------

        // Llamamos al método sumar().
        //
        // Los valores:
        //
        //     3
        //     2
        //
        // son enviados a los parámetros:
        //
        //     a
        //     b
        //
        // El método devuelve:
        //
        //     5
        //
        // Ese valor lo almacenamos en sumaDesdeMain.

        // int sumaDesdeMain = sumar(3, 2);

        // System.out.printf("suma = %d%n", sumaDesdeMain);


        // ---------------------------------------------------------
        // Ejemplo 2: método sin parámetros y sin retorno
        // ---------------------------------------------------------

        // saludar();


        // ---------------------------------------------------------
        // Ejemplo 3: método con parámetro
        // ---------------------------------------------------------

        // saludarConNombre("Santiago");


        // =========================================================
        // RECORRIDO DE UN ARREGLO CON FOR-EACH
        // =========================================================

        // Creamos un arreglo de String.
        //
        // Cada posición contiene el nombre de un estudiante.

        // String[] arr = {
        //     "Keiner",
        //     "Miguel",
        //     "Grevis",
        //     "Angel",
        //     "Aleman",
        //     "Keren",
        //     "Bremudez",
        //     "Kevin"
        // };


        // arr.length indica cuántos elementos tiene el arreglo.

        // System.out.printf(
        //     "Quería saludar a mis %d estudiantes uno por uno "
        //     + "pero gasto mucho tiempo%n",
        //     arr.length
        // );


        // ---------------------------------------------------------
        // FOR-EACH
        // ---------------------------------------------------------
        //
        // Esta estructura:
        //
        //     for (String nombre : arr)
        //
        // significa:
        //
        // "Para cada String llamado nombre que exista en arr..."
        //
        // En cada repetición, "nombre" contiene un elemento
        // diferente del arreglo.
        //
        // ---------------------------------------------------------

        // for (String nombre : arr) {
        //
        //     saludarConNombre(nombre);
        //
        // }


        // =========================================================
        // SCANNER
        // =========================================================
        //
        // Creamos un objeto Scanner para poder leer datos
        // introducidos por el usuario.
        //
        // System.in representa la entrada estándar,
        // normalmente el teclado.
        //
        // =========================================================

        Scanner sc = new Scanner(System.in);


        // =========================================================
        // DIMENSIONES DE LA MATRIZ
        // =========================================================

        System.out.println("Ingrese filas: ");

        // Normalmente podríamos leer el valor así:
        //
        // int row = sc.nextInt();
        //
        // Pero por ahora dejamos un valor fijo para concentrarnos
        // en los arreglos y ciclos.

        int row = 5;


        System.out.println("Ingrese columnas: ");

        // Nuevamente podríamos utilizar:
        //
        // int col = sc.nextInt();

        int col = 3;


        // =========================================================
        // CREACIÓN DE LA MATRIZ
        // =========================================================
        //
        // Creamos una matriz de:
        //
        //     5 filas
        //     3 columnas
        //
        // Es decir:
        //
        //     5 x 3
        //
        // La matriz tendrá:
        //
        //     5 * 3 = 15
        //
        // posiciones.
        //
        // =========================================================

        int[][] arr = new int[row][col];


        // =========================================================
        // CREACIÓN DEL ARREGLO DE PRIMOS
        // =========================================================
        //
        // Necesitamos almacenar 15 números primos porque
        // la matriz tiene 15 posiciones.
        //
        //     row * col
        //
        // determina cuántos números necesitamos.
        //
        // =========================================================

        int[] primos = new int[row * col];


        // =========================================================
        // CONTADOR
        // =========================================================
        //
        // contador representa cuántos números primos
        // hemos encontrado hasta el momento.
        //
        // Al comenzar:
        //
        //     contador = 0
        //
        // =========================================================

        int contador = 0;


        // =========================================================
        // CANTIDAD
        // =========================================================
        //
        // cantidad representa cuántos números primos
        // necesitamos encontrar.
        //
        // Para una matriz de 5 x 3:
        //
        //     cantidad = 5 * 3
        //              = 15
        //
        // =========================================================

        int cantidad = row * col;


        // =========================================================
        // NÚMERO
        // =========================================================
        //
        // Comenzamos a buscar números primos desde 2.
        //
        // 2 es el primer número primo.
        //
        // =========================================================

        int numero = 2;


        // =========================================================
        // WHILE
        // =========================================================
        //
        // Queremos seguir buscando números hasta encontrar
        // exactamente la cantidad que necesitamos.
        //
        // Mientras:
        //
        //     contador < cantidad
        //
        // seguimos trabajando.
        //
        // Cuando:
        //
        //     contador == cantidad
        //
        // la condición se vuelve falsa y el ciclo termina.
        //
        // =========================================================

        while (contador < cantidad) {


            // =====================================================
            // CONTAR DIVISORES
            // =====================================================
            //
            // Cada número comienza con cero divisores encontrados.
            //
            // Ejemplo:
            //
            //     numero = 7
            //
            // comenzamos con:
            //
            //     divisores = 0
            //
            // =====================================================

            int divisores = 0;


            // =====================================================
            // BUSCAR DIVISORES
            // =====================================================
            //
            // Probamos todos los números desde 1 hasta "numero".
            //
            // Ejemplo:
            //
            // Si numero = 7:
            //
            // divisor toma los valores:
            //
            // 1, 2, 3, 4, 5, 6, 7
            //
            // =====================================================

            for (int divisor = 1; divisor <= numero; divisor++) {


                // =================================================
                // OPERADOR %
                // =================================================
                //
                // El operador % obtiene el RESTO de una división.
                //
                // Si el resto es 0:
                //
                //     numero % divisor == 0
                //
                // entonces la división es exacta y "divisor"
                // es realmente un divisor de "numero".
                //
                // Ejemplo:
                //
                //     10 % 2 = 0
                //
                // Por lo tanto, 2 es divisor de 10.
                //
                // Pero:
                //
                //     10 % 3 = 1
                //
                // Por lo tanto, 3 NO es divisor de 10.
                //
                // =================================================

                if ((numero % divisor) == 0) {

                    // Encontramos un divisor.
                    divisores++;
                }
            }


            // =====================================================
            // ¿ES PRIMO?
            // =====================================================
            //
            // Un número primo tiene exactamente DOS divisores:
            //
            //     1
            //     el mismo número
            //
            // Por ejemplo:
            //
            //     7 -> divisores: 1 y 7
            //
            // Por lo tanto:
            //
            //     divisores == 2
            //
            // significa que el número es primo.
            //
            // =====================================================

            if (divisores == 2) {


                // =================================================
                // GUARDAR EL PRIMO
                // =================================================
                //
                // contador indica la posición disponible
                // dentro del arreglo.
                //
                // Ejemplo:
                //
                //     primos[0] = 2
                //     primos[1] = 3
                //     primos[2] = 5
                //
                // =================================================

                primos[contador] = numero;


                // Como encontramos un nuevo primo,
                // aumentamos el contador.

                contador++;
            }


            // =====================================================
            // SIGUIENTE NÚMERO
            // =====================================================
            //
            // Probamos el siguiente número.
            //
            // 2 -> 3 -> 4 -> 5 -> 6 -> ...
            //
            // =====================================================

            numero++;
        }


        // =========================================================
        // RECORRIDO DEL ARREGLO DE PRIMOS
        // =========================================================
        //
        // Utilizamos FOR-EACH.
        //
        // "Para cada entero n dentro del arreglo primos..."
        //
        // =========================================================

        for (int n : primos) {

            System.out.println("n: " + n);
        }


        // =========================================================
        // EJEMPLO DE ARREGLO INICIALIZADO MANUALMENTE
        // =========================================================

        // También podríamos crear directamente un arreglo:
        //
        // int[] primos = {2, 3, 5, 7, 11, 13};
        //
        // En este caso Java determina automáticamente
        // el tamaño del arreglo.
        //
        // =========================================================


        // =========================================================
        // COPIAR EL ARREGLO A LA MATRIZ
        // =========================================================
        //
        // Tenemos:
        //
        //     primos
        //
        // como arreglo unidimensional.
        //
        // Queremos llenar:
        //
        //     arr
        //
        // que es una matriz bidimensional.
        //
        // =========================================================


        // "index" representa la posición actual que estamos
        // leyendo del arreglo primos.

        int index = 0;


        // =========================================================
        // PRIMER FOR
        // =========================================================
        //
        // Recorremos las FILAS de la matriz.
        //
        // arr.length representa el número de filas.
        //
        // Como:
        //
        //     arr = new int[5][3]
        //
        // entonces:
        //
        //     arr.length == 5
        //
        // =========================================================

        for (int i = 0; i < arr.length; i++) {


            // =====================================================
            // SEGUNDO FOR
            // =====================================================
            //
            // Recorremos las COLUMNAS de la fila actual.
            //
            // arr[i] representa una fila.
            //
            // arr[i].length representa cuántos elementos
            // tiene esa fila.
            //
            // =====================================================

            for (int j = 0; j < arr[i].length; j++) {


                // =================================================
                // COPIAR ELEMENTO
                // =================================================
                //
                // Tomamos un elemento del arreglo:
                //
                //     primos[index]
                //
                // y lo colocamos en la matriz:
                //
                //     arr[i][j]
                //
                // =================================================

                arr[i][j] = primos[index];


                // =================================================
                // AVANZAR EN EL ARREGLO
                // =================================================
                //
                // Después de utilizar primos[index],
                // avanzamos a la siguiente posición.
                //
                // =================================================

                index++;
            }
        }


        // =========================================================
        // IMPRIMIR LA MATRIZ
        // =========================================================

        System.out.println("\n[");


        // =========================================================
        // FOR-EACH PARA RECORRER LA MATRIZ
        // =========================================================
        //
        // Como arr es:
        //
        //     int[][]
        //
        // cada elemento de arr es una fila:
        //
        //     int[]
        //
        // Por eso:
        //
        //     int[] fila
        //
        // representa una fila completa.
        //
        // =========================================================

        for (int[] fila : arr) {


            // -----------------------------------------------------
            // Ahora recorremos cada elemento de la fila.
            // -----------------------------------------------------

            for (int n : fila) {

                System.out.print(n + " ");
            }


            // Terminamos la fila y hacemos salto de línea.

            System.out.println();
        }


        // Cerramos visualmente la matriz.

        System.out.println("]");
    }
}
