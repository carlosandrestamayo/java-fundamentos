public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Miércoles 19 de agosto de 2026 - 10:00 a. m.
        // =========================================================


        // =========================================================
        // RECORRER UN ARREGLO
        // =========================================================

        // Creamos un arreglo y le asignamos algunos valores.
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 17, 14, 23};


        // ---------------------------------------------------------
        // FOR-EACH
        // ---------------------------------------------------------
        //
        // El for-each permite recorrer todos los elementos
        // de un arreglo sin necesidad de trabajar directamente
        // con el índice.
        //
        // En cada repetición, "a" contiene el valor actual.
        //
        // Ejemplo:
        //
        // for (int a : arr) {
        //     System.out.println(a);
        // }


        // ---------------------------------------------------------
        // RECORRER UN ARREGLO EN ORDEN NORMAL
        // ---------------------------------------------------------
        //
        // Para recorrer un arreglo normalmente comenzamos
        // en la posición 0 y avanzamos hasta la última posición.
        //
        // Recuerda que los índices de un arreglo comienzan en 0.
        //
        // Ejemplo:
        //
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(
        //         "position: " + i + " value: " + arr[i]
        //     );
        // }


        // ---------------------------------------------------------
        // RECORRER UN ARREGLO EN ORDEN INVERSO
        // ---------------------------------------------------------
        //
        // Para recorrer un arreglo desde el final hasta el inicio:
        //
        // 1. Comenzamos en arr.length - 1.
        // 2. Mientras i sea mayor o igual que 0, continuamos.
        // 3. Disminuimos i con i--.
        //
        // Ejemplo:
        //
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.println(
        //         "position: " + i + " value: " + arr[i]
        //     );
        // }


        // =========================================================
        // TAMAÑO DE UN ARREGLO
        // =========================================================

        // La variable size indica cuántos números primos
        // queremos encontrar.
        //
        // Cambia este valor para experimentar.
        //
        // Por ejemplo:
        //
        // size = 5  -> primeros 5 números primos
        // size = 10 -> primeros 10 números primos
        //
        int size = 10;


        // Creamos un arreglo con el tamaño indicado
        // en la variable size.
        int[] arr = new int[size];


        // contadorPrimos indica cuántos números primos
        // hemos encontrado hasta el momento.
        //
        // Inicialmente no hemos encontrado ninguno.
        int contadorPrimos = 0;


        // Comenzamos a buscar números primos desde el 2,
        // porque 2 es el primer número primo.
        int numero = 2;


        // =========================================================
        // BUSCAR LOS PRIMEROS NÚMEROS PRIMOS
        // =========================================================

        // El ciclo continúa hasta encontrar la cantidad
        // de números primos indicada en "size".
        while (contadorPrimos < size) {

            // Contará cuántos divisores tiene el número actual.
            int contadorDivisores = 0;


            // Recorremos todos los posibles divisores
            // desde 1 hasta el número que estamos analizando.
            for (int divisor = 1; divisor <= numero; divisor++) {

                // Si el residuo de la división es 0,
                // significa que "divisor" divide exactamente
                // a "numero".
                //
                // El operador % obtiene el residuo.
                if (numero % divisor == 0) {
                    contadorDivisores++;
                }
            }


            // Un número primo tiene exactamente dos divisores:
            //
            // 1 y el mismo número.
            //
            // Por ejemplo:
            //
            // 5 -> divisores: 1 y 5
            //
            if (contadorDivisores == 2) {

                // Guardamos el número primo en el arreglo.
                //
                // contadorPrimos también representa
                // la posición donde vamos a guardarlo.
                arr[contadorPrimos] = numero;

                // Aumentamos la cantidad de primos encontrados.
                contadorPrimos++;
            }


            // Pasamos al siguiente número.
            numero++;
        }


        // =========================================================
        // MOSTRAR LOS PRIMOS EN ORDEN INVERSO
        // =========================================================

        System.out.println(
            "\nLos " + size + " Números Primos de Forma Inversa\n"
        );


        // Comenzamos en la última posición del arreglo
        // y avanzamos hacia la posición 0.
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(
                "arr[" + i + "] = " + arr[i]
            );
        }


        // =========================================================
        // RECORRER UNA CADENA DE TEXTO
        // =========================================================

        // Creamos una cadena de texto.
        String texto = "Ivan";


        // length() devuelve la cantidad de caracteres
        // que tiene el String.
        //
        // "Ivan" tiene 4 caracteres.
        //
        // Sus posiciones son:
        //
        // 0 -> I
        // 1 -> v
        // 2 -> a
        // 3 -> n
        System.out.println(
            "\nSize of texto is " + texto.length()
        );


        // =========================================================
        // RECORRER EL STRING EN ORDEN NORMAL
        // =========================================================

        // Comenzamos en la posición 0 y avanzamos
        // hasta la última posición.
        for (int i = 0; i < texto.length(); i++) {

            // charAt(i) obtiene el carácter que se encuentra
            // en la posición indicada.
            //
            // Ejemplo:
            //
            // texto.charAt(0) -> 'I'
            // texto.charAt(1) -> 'v'
            //
            char letra = texto.charAt(i);

            System.out.println(i + " : " + letra);
        }


        // =========================================================
        // RECORRER EL STRING EN ORDEN INVERSO
        // =========================================================

        System.out.println(
            "\nCojimos a " + texto +
            " y lo recorrimos desde atras y al parecer lo disfrutó "
        );


        // Para comenzar desde el final utilizamos:
        //
        // texto.length() - 1
        //
        // En "Ivan":
        //
        // texto.length() = 4
        //
        // Última posición:
        //
        // 4 - 1 = 3
        //
        // Después vamos disminuyendo el índice hasta llegar a 0.
        for (int i = texto.length() - 1; i >= 0; i--) {

            // Obtenemos el carácter correspondiente
            // a la posición actual.
            char letra = texto.charAt(i);

            System.out.println(i + " : " + letra);
        }

    }
}