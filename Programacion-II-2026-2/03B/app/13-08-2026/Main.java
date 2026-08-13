public class Main {

    public static void main(String[] args) {

        // ============================================================
        // Jueves 13 de Agosto de 2026 10:00 am
        // ============================================================


        // ============================================================
        // 1. ESTRUCTURA CONDICIONAL: IF - ELSE IF - ELSE
        // ============================================================

        int edad = -20;

        if (edad < 0) {
            System.out.println("No ha nacido");
        }
        else if (edad >= 0 && edad < 12) {
            System.out.println("Es un niño");
        }
        else if (edad < 18) {
            System.out.println("Es un adolescente");
        }
        else if (edad <= 45) {
            System.out.println("Es un adulto");
        }
        else if (edad <= 70) {
            System.out.println("Es un adulto mayor");
        }
        else {
            System.out.println("Tiene orden de captura en 5 cementerios");
        }


        // ============================================================
        // 2. ESTRUCTURA SWITCH
        // ============================================================

        int numero = 2;

        switch (numero) {

            case 1:
                System.out.println("Arquero");
                break;

            case 2:
                System.out.println("Defensa central");
                break;

            case 3:
                System.out.println("Lateral");
                break;

            case 5:
                System.out.println("Volante de Contención");
                break;

            case 10:
                System.out.println("James Rodríguez");
                break;

            case 11:
                System.out.println("Delantero");
                break;
        }


        // ============================================================
        // 3. ESTRUCTURA REPETITIVA: WHILE
        // ============================================================

        int n = 1;

        while (n <= 5) {
            System.out.println("n: " + n);
            n = n + 1;
        }


        // ============================================================
        // 4. PRIMEROS 10 NÚMEROS PARES
        // ============================================================

        System.out.println("\nPrimeros 10 números pares");


        // ------------------------------------------------------------
        // FORMA 1: Recorrer todos los números y utilizar %
        // ------------------------------------------------------------

        System.out.println("\nForma 1");

        n = 1;

        while (n <= 20) {

            if (n % 2 == 0) {
                System.out.println("n: " + n);
            }

            n = n + 1;
        }


        // ------------------------------------------------------------
        // FORMA 2: Incrementar de 2 en 2
        // ------------------------------------------------------------

        System.out.println("\nForma 2");

        n = 0;

        while (n < 20) {
            n += 2;
            System.out.println("n: " + n);
        }


        // ------------------------------------------------------------
        // FORMA 3: Comenzar directamente en el primer número par
        // ------------------------------------------------------------

        System.out.println("\nForma 3");

        n = 2;

        while (n <= 20) {
            System.out.println("n: " + n);
            n += 2;
        }


        // ------------------------------------------------------------
        // FORMA 4: Utilizar una expresión matemática
        // ------------------------------------------------------------

        System.out.println("\nForma 4");

        n = 1;

        while (n <= 10) {
            System.out.println("n: " + n * 2);
            n += 1;
        }


        // ============================================================
        // 5. SERIE NUMÉRICA
        // ============================================================

        System.out.println("\nSerie numérica");

        n = 6;

        while (n < 43) {
            System.out.println("n: " + n);
            n = n + 5;
        }
    }
}