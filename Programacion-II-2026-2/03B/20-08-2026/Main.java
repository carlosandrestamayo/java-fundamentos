public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Jueves 20 de agosto de 2026 - 10:00 a. m.
        //
        // Tema:
        // - Ciclos while y for
        // - Arreglos
        // - Recorrido de arreglos
        // - Recorrido de String
        // - Índices
        // - charAt()
        // =========================================================


        // =========================================================
        // EJERCICIO 1
        // Encontrar los 10 primeros números primos
        // y almacenarlos en un arreglo.
        // =========================================================

        // Creamos un arreglo de 10 posiciones.
        // En este arreglo vamos a guardar los primeros
        // 10 números primos que encontremos.
        int[] arrPrimos = new int[10];

        // Esta variable nos indica cuántos números primos
        // hemos encontrado hasta el momento.
        //
        // Comienza en 0 porque todavía no hemos encontrado
        // ningún número primo.
        int contadorPrimos = 0;

        // Comenzamos a buscar números primos desde el número 2.
        //
        // El número 2 es el primer número primo.
        int numero = 2;


        // Repetimos el proceso mientras no hayamos encontrado
        // los 10 números primos que necesitamos.
        while (contadorPrimos < 10) {

            // Contará cuántos divisores tiene el número actual.
            //
            // Un número primo tiene exactamente dos divisores:
            // 1 y él mismo.
            int contadorDivisores = 0;


            // Recorremos todos los números desde 1 hasta
            // el número que estamos analizando.
            for (int divisor = 1; divisor <= numero; divisor++) {

                // El operador % obtiene el residuo de una división.
                //
                // Si el residuo es 0 significa que la división
                // es exacta y, por lo tanto, encontramos un divisor.
                if (numero % divisor == 0) {
                    contadorDivisores++;
                }
            }


            // Si encontramos exactamente 2 divisores,
            // significa que el número es primo.
            if (contadorDivisores == 2) {

                // Guardamos el número primo en el arreglo.
                //
                // contadorPrimos también representa la posición
                // donde debemos guardar el nuevo número.
                arrPrimos[contadorPrimos] = numero;

                // Aumentamos el contador porque encontramos
                // un nuevo número primo.
                contadorPrimos++;
            }


            // Pasamos al siguiente número para continuar
            // buscando números primos.
            numero++;
        }


        // =========================================================
        // RECORRER UN ARREGLO
        // =========================================================

        // Este for recorre el arreglo desde la primera posición
        // hasta la última.
        //
        // La variable i representa el índice del arreglo.
        //
        // IMPORTANTE:
        // Los índices de un arreglo comienzan en 0.
        //
        // Para un arreglo de 10 posiciones:
        //
        // índice:  0  1  2  3  4  5  6  7  8  9
        //
        // Por eso la última posición es:
        // arrPrimos.length - 1
        //
        // for (int i = 0; i < arrPrimos.length; i++) {
        //     System.out.println(arrPrimos[i]);
        // }


        // =========================================================
        // RECORRER UN ARREGLO AL REVÉS
        // =========================================================

        // Para recorrer un arreglo al revés comenzamos
        // en la última posición.
        //
        // arrPrimos.length - 1
        //
        // Después vamos disminuyendo el índice:
        //
        // 9, 8, 7, 6, ... , 1, 0
        for (int i = arrPrimos.length - 1; i >= 0; i--) {

            // Descomenta esta línea para mostrar los números.
            //
            // System.out.println("arrPrimos[" + i + "] = " + arrPrimos[i]);
        }


        // =========================================================
        // EJERCICIO 2
        // Recorrer una cadena de texto
        // =========================================================

        // Creamos una variable de tipo String.
        String str = "Carlos";


        // =========================================================
        // RECORRER UN STRING DE IZQUIERDA A DERECHA
        // =========================================================

        // length() nos indica cuántos caracteres tiene el String.
        //
        // "Carlos" tiene 6 caracteres.
        //
        // Sus posiciones son:
        //
        // índice:    0   1   2   3   4   5
        // carácter:  C   a   r   l   o   s
        //
        // Por eso comenzamos en 0 y terminamos cuando
        // i sea menor que str.length().
        for (int i = 0; i < str.length(); i++) {

            // charAt(i) obtiene el carácter que se encuentra
            // en la posición indicada por i.
            //
            // Por ejemplo:
            //
            // str.charAt(0) -> 'C'
            // str.charAt(1) -> 'a'
            // str.charAt(2) -> 'r'
            //
            char letra = str.charAt(i);

            System.out.println("Posición " + i + ": " + letra);
        }


        // =========================================================
        // RECORRER UN STRING AL REVÉS
        // =========================================================

        // Para recorrer el String al revés comenzamos
        // en la última posición.
        //
        // La última posición se obtiene con:
        //
        // str.length() - 1
        //
        // En "Carlos":
        //
        // str.length()     = 6
        // última posición  = 6 - 1 = 5
        //
        // Después vamos disminuyendo i hasta llegar a 0.
        for (int i = str.length() - 1; i >= 0; i--) {

            // Obtenemos el carácter que se encuentra
            // en la posición actual.
            char letra = str.charAt(i);

            System.out.println("Posición " + i + ": " + letra);
        }

    }
}