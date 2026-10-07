public class Home {

    public static void main(String[] args) {

        // ============================================================
        // 1. CONTADOR DE NÚMEROS PRIMOS
        // ============================================================

        int total = 0;


        // ============================================================
        // 2. RECORRER LOS NÚMEROS DEL 2 AL 50
        // ============================================================

        for (int numero = 2; numero <= 50; numero++) {

            // --------------------------------------------------------
            // Contar cuántos divisores tiene el número
            // --------------------------------------------------------

            int contador = 0;


            // ========================================================
            // 3. BUSCAR LOS DIVISORES DEL NÚMERO
            // ========================================================

            for (int divisor = 1; divisor <= numero; divisor++) {

                if (numero % divisor == 0) {
                    contador++;
                }
            }


            // ========================================================
            // 4. DETERMINAR SI EL NÚMERO ES PRIMO
            // ========================================================

            /*
             * Un número primo tiene exactamente dos divisores:
             *
             * 1. El número 1
             * 2. El mismo número
             */

            if (contador == 2) {

                total++;

                System.out.println(numero + " es primo");
            }
        }


        // ============================================================
        // 5. MOSTRAR EL TOTAL DE NÚMEROS PRIMOS
        // ============================================================

        System.out.println("Total de Primos: " + total);
    }
}