public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Miércoles 12 de agosto de 2026 - 6:00 a. m.
        // ESTRUCTURAS DE CONTROL
        // =========================================================


        // =========================================================
        // 1. SWITCH
        // =========================================================

        /*
         * switch permite seleccionar una alternativa a partir
         * del valor de una expresión.
         *
         * El break evita continuar ejecutando los siguientes casos.
         *
         * Pregunta para la clase:
         * ¿Qué sucede si eliminamos un break?
         */

        /*
        int numero = 10;

        switch (numero) {

            case 1:
                System.out.println("Arquero");
                break;

            case 2:
                System.out.println("Defensa");
                break;

            case 3:
                System.out.println("Defensa");
                break;

            case 4:
                System.out.println("Defensa");
                break;

            case 6:
                System.out.println("Medio Campo Defensivo");
                break;

            case 10:
                System.out.println("MCO");
                break;

            case 11:
                System.out.println("Delantero");
                break;

            default:
                System.out.println(
                    "No se registra posición para ese número"
                );
        }
        */


        // =========================================================
        // 2. SWITCH CON String
        // =========================================================

        /*
         * switch no está limitado a valores numéricos.
         * También podemos utilizar String.
         */

        /*
        String letra = "I";

        switch (letra) {

            case "E":
                System.out.println("Excelente");
                break;

            case "B":
                System.out.println("Bueno");
                break;

            case "A":
                System.out.println("Aceptable");
                break;

            case "I":
                System.out.println("Hincha del Verde Loca");
                break;
        }
        */


        // =========================================================
        // 3. WHILE
        // =========================================================

        /*
         * La condición se evalúa ANTES de ejecutar el bloque.
         *
         * Por esta razón, un while puede ejecutarse cero veces.
         *
         * Es importante modificar la variable de control
         * para evitar un ciclo infinito.
         */

        int n = 1;
        int fin = 100;

        while (n <= fin) {

            // System.out.println("n: " + n);

            /*
             * Las siguientes instrucciones producen
             * el mismo incremento:
             *
             * n = n + 1;
             * n += 1;
             * n++;
             */

            n++;
        }


        // =========================================================
        // 4. WHILE + SWITCH
        // =========================================================

        /*
         * Las estructuras de control pueden combinarse.
         *
         * while controla la repetición.
         * switch decide qué hacer en cada iteración.
         *
         * En este ejemplo recorremos los números del 1 al 22
         * y determinamos qué posición corresponde a algunos
         * números de camiseta.
         */

        int m = 1;

        while (m <= 22) {

            switch (m) {

                case 1:
                    System.out.println(m + ": Arquero");
                    break;

                case 2:
                    System.out.println(m + ": Defensa");
                    break;

                case 3:
                    System.out.println(m + ": Defensa");
                    break;

                case 4:
                    System.out.println(m + ": Defensa");
                    break;

                case 6:
                    System.out.println(
                        m + ": Medio Campo Defensivo"
                    );
                    break;

                case 10:
                    System.out.println(m + ": MCO");
                    break;

                case 11:
                    System.out.println(m + ": Delantero");
                    break;

                default:
                    System.out.println(
                        m + ": No se registra posición"
                    );
            }

            m++;
        }


        // =========================================================
        // 5. DO-WHILE
        // =========================================================

        /*
         * Diferencia fundamental:
         *
         * while:
         *     primero evalúa -> después ejecuta.
         *
         * do-while:
         *     primero ejecuta -> después evalúa.
         *
         * Por esta razón, do-while siempre ejecuta
         * el bloque al menos una vez.
         */

        int x = 1;

        do {

            System.out.println("x: " + x);

            x++;

        } while (x <= 10);


        // =========================================================
        // 6. ++x VS x++
        // =========================================================

        /*
         * Cuando el incremento forma parte de una expresión,
         * debemos distinguir:
         *
         * ++x -> incrementa y después utiliza el valor.
         *
         * x++ -> utiliza el valor y después incrementa.
         */

        x = 0;

        do {

            System.out.println("x: " + ++x);

        } while (x <= 9);


        // =========================================================
        // 7. FOR
        // =========================================================

        /*
         * for concentra en una sola línea los tres elementos
         * fundamentales del ciclo:
         *
         * 1. Inicialización
         * 2. Condición
         * 3. Actualización
         *
         * En este ejemplo el incremento es de 2 en 2.
         */

        for (int i = 1; i <= 10; i += 2) {

            System.out.println("i: " + i);
        }


        // =========================================================
        // 8. TABLA DE MULTIPLICAR
        // =========================================================

        /*
         * Un ciclo for permite repetir la misma operación
         * utilizando diferentes valores.
         */

        int numero = 7;

        System.out.println("Tabla del " + numero);

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                numero + " * " + i + " = " + (numero * i)
            );
        }


        // =========================================================
        // 9. FOR ANIDADO
        // =========================================================

        /*
         * Un ciclo puede estar dentro de otro ciclo.
         *
         * Esto se conoce como FOR ANIDADO.
         *
         * El ciclo externo controla la tabla.
         *
         * El ciclo interno controla las multiplicaciones
         * que pertenecen a cada tabla.
         *
         * Por ejemplo:
         *
         * num = 1
         *     i = 1
         *     i = 2
         *     ...
         *     i = 10
         *
         * num = 2
         *     i = 1
         *     i = 2
         *     ...
         *     i = 10
         */

        for (int num = 1; num <= 10; num++) {

            System.out.println("\nTabla del " + num);

            for (int i = 1; i <= 10; i++) {

                System.out.println(
                    num + " * " + i + " = " + (num * i)
                );
            }
        }


        // =========================================================
        // 10. EL MISMO ALGORITMO EN PSeInt
        // =========================================================

        /*
         * Antes de escribir el código Java, podemos expresar
         * el algoritmo utilizando pseudocódigo en PSeInt.
         *
         * El algoritmo es exactamente el mismo:
         *
         *
         * Para num Desde 1 Hasta 10 Hacer
         *
         *     Escribir "Tabla del " num
         *
         *     Para i Desde 1 Hasta 10 Hacer
         *
         *         Escribir num , " * " , i ,
         *                  " = " , (num * i)
         *
         *     FinPara
         *
         * FinPara
         *
         *
         * Luego transformamos ese algoritmo a Java.
         */


        // =========================================================
        // 11. PSeInt -> Java
        // =========================================================

        /*
         * PSeInt:
         *
         * Para num Desde 1 Hasta 10 Hacer
         *
         *     Escribir "Tabla del " num
         *
         *     Para i Desde 1 Hasta 10 Hacer
         *
         *         Escribir num , " * " , i ,
         *                  " = " , (num * i)
         *
         *     FinPara
         *
         * FinPara
         *
         *
         * Java:
         */

        /*
        for (int num = 1; num <= 10; num++) {

            System.out.println("\nTabla del " + num);

            for (int i = 1; i <= 10; i++) {

                System.out.println(
                    num + " * " + i + " = " + (num * i)
                );
            }
        }
        */


        // =========================================================
        // 12. EQUIVALENCIAS PSeInt -> Java
        // =========================================================

        /*
         *
         * PSeInt                         Java
         * --------------------------------------------------
         *
         * Para                          -> for
         *
         * Desde                         -> inicialización
         *
         * Hasta                         -> condición
         *
         * Hacer                         -> {
         *
         * FinPara                       -> }
         *
         * Escribir                      -> System.out.println()
         *
         *
         * Ejemplo:
         *
         * PSeInt:
         *
         * Para i Desde 1 Hasta 10 Hacer
         *
         *
         * Java:
         *
         * for (int i = 1; i <= 10; i++)
         *
         *
         * La lógica algorítmica es la misma.
         * Lo que cambia principalmente es la sintaxis.
         */


        // =========================================================
        // 13. MISMA IDEA EN OTROS LENGUAJES
        // =========================================================

        /*
         * El concepto de ciclo existe independientemente
         * del lenguaje de programación.
         *
         * El algoritmo puede ser el mismo y cambiar solamente
         * la forma de escribirlo.
         */


        // ---------------------------------------------------------
        // JavaScript
        // ---------------------------------------------------------

        /*
        for (let num = 1; num <= 10; num++) {

            console.log("\nTabla del " + num);

            for (let i = 1; i <= 10; i++) {

                console.log(
                    num + " * " + i + " = " + (num * i)
                );
            }
        }
        */


        // ---------------------------------------------------------
        // C#
        // ---------------------------------------------------------

        /*
        for (int num = 1; num <= 10; num++) {

            Console.WriteLine("\nTabla del " + num);

            for (int i = 1; i <= 10; i++) {

                Console.WriteLine(
                    num + " * " + i + " = " + (num * i)
                );
            }
        }
        */


        // ---------------------------------------------------------
        // Python
        // ---------------------------------------------------------

        /*
        for num in range(1, 11):

            print("Tabla del ", num)

            for i in range(1, 11):

                print(
                    num, "*", i, "=", num * i
                )
        */


        // =========================================================
        // IDEA CENTRAL DE LA CLASE
        // =========================================================

        /*
         * El lenguaje cambia.
         *
         * La sintaxis cambia.
         *
         * Pero el algoritmo permanece.
         *
         * PSeInt -> Java -> C# -> JavaScript -> Python
         *
         * El objetivo no es memorizar la sintaxis de un lenguaje,
         * sino aprender a resolver problemas mediante algoritmos.
         */

    }
}