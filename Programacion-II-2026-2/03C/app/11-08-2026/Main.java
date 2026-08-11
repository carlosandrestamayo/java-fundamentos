public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Martes 11 de Agosto 2026 6:00 am 
        // =========================================================

        // =========================================================
        // 1. ASIGNACIÓN DE VALORES
        // =========================================================

        /*
         * Una variable almacena un valor.
         * Si asignamos una variable a otra, se copia su valor.
         */

        // int a = 3;
        // int b = a;

        // a = 8;

        // System.out.println("Value of a is " + a);
        // System.out.println("Value of b is " + b);

        /*
         * Resultado:
         *
         * a = 8
         * b = 3
         *
         * Al hacer b = a, se copió el valor que tenía a
         * en ese momento. Después cambiar a no modifica b.
         */


        // =========================================================
        // 2. ASIGNACIÓN CON String
        // =========================================================

        /*
         * Las variables de tipo String almacenan referencias
         * a objetos String.
         *
         * En este ejemplo, apellido recibe inicialmente
         * el mismo texto que contiene nombre.
         */

        String nombre = "Carlos";
        String apellido = nombre;

        // Cambiamos el valor de apellido.
        apellido = "Julio";

        System.out.println("Value of nombre is " + nombre);
        System.out.println("Value of apellido is " + apellido);

        /*
         * Resultado:
         *
         * nombre   = Carlos
         * apellido = Julio
         *
         * Cambiar apellido no cambia nombre.
         */


        // =========================================================
        // 3. DECLARACIÓN Y ASIGNACIÓN
        // =========================================================

        /*
         * Podemos declarar una variable primero
         * y asignarle un valor después.
         */

        int x;
        x = 2000;

        System.out.println("x: " + x);


        // =========================================================
        // 4. IMPLICIT CASTING
        //    Conversión implícita
        // =========================================================

        /*
         * Java permite convertir automáticamente un tipo
         * de menor capacidad a uno de mayor capacidad.
         *
         * short -> int -> long -> float -> double
         *
         * Esta conversión normalmente no requiere
         * escribir el tipo de destino.
         */

        short sh = 400;

        // short se convierte automáticamente en int
        int entero = sh;

        // int se convierte automáticamente en double
        double doble = entero;

        System.out.println("entero: " + entero);
        System.out.println("doble: " + doble);


        // =========================================================
        // 5. EXPLICIT CASTING
        //    Conversión explícita
        // =========================================================

        /*
         * Cuando queremos convertir un tipo de mayor capacidad
         * a uno de menor capacidad, Java requiere indicar
         * explícitamente la conversión.
         *
         * Sintaxis:
         *
         * tipoDestino variable = (tipoDestino) valor;
         */

        int e = 2;

        // Convertimos explícitamente int a short
        short s = (short) e;

        System.out.println("e: " + e);
        System.out.println("s: " + s);

        /*
         * ¡Cuidado!
         *
         * Una conversión explícita puede provocar pérdida
         * de información cuando el valor no cabe en el
         * tipo de destino.
         */


        // =========================================================
        // 6. DIVISIÓN DE NÚMEROS
        // =========================================================

        /*
         * Al utilizar valores double, la división produce
         * un resultado decimal.
         */

        double res = 8.0 / 5.0;

        System.out.println("res: " + res);

        /*
         * Resultado:
         *
         * 1.6
         *
         * En cambio:
         *
         * 8 / 5
         *
         * produciría 1 porque ambos valores son enteros.
         */


        // =========================================================
        // 7. ESTRUCTURA if - else
        // =========================================================

        /*
         * La estructura if permite ejecutar un bloque de código
         * cuando una condición es verdadera.
         *
         * Sintaxis:
         *
         * if (condición) {
         *     // código
         * }
         * else {
         *     // código
         * }
         */

        int edad = 5;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }


        // =========================================================
        // 8. ESTRUCTURA if - else if - else
        // =========================================================

        /*
         * Podemos evaluar varias condiciones utilizando
         * else if.
         */

        int nota = 5;
        String msg = "";

        if (nota >= 4) {
            msg = "Excelente";
        }
        else if (nota >= 3.5) {
            msg = "Bueno";
        }
        else if (nota >= 3) {
            msg = "Aceptable";
        }
        else {
            msg = "Yaper";
        }

        System.out.println("Mensaje: " + msg);


        // =========================================================
        // 9. OPERADOR TERNARIO
        // =========================================================

        /*
         * El operador ternario permite expresar una decisión
         * sencilla en una sola línea.
         *
         * Sintaxis:
         *
         * condición ? valorSiVerdadero : valorSiFalso;
         *
         * También podemos encadenar varios operadores ternarios,
         * aunque cuando existen muchas condiciones es más legible
         * utilizar if - else if - else.
         */

        String message =
                nota >= 4 ? "Excelente" :
                nota >= 3.5 ? "Bueno" :
                nota >= 3 ? "Aceptable" :
                "Yaper";

        System.out.println("Message: " + message);


        // =========================================================
        // 10. EJEMPLO PRÁCTICO: APROBADO / REPROBADO
        // =========================================================

        int n = 5;
        String txt = "";

        /*
         * Podemos resolver el problema utilizando if - else.
         */

        if (n >= 3) {
            txt = "Aprobó";
        }
        else {
            txt = "Reprobó";
        }

        System.out.println("El estudiante " + txt + " la asignatura");


        // =========================================================
        // 11. MISMO EJEMPLO UTILIZANDO OPERADOR TERNARIO
        // =========================================================

        /*
         * Como solamente existen dos posibilidades,
         * el operador ternario resulta bastante apropiado.
         */

        String resultado = n >= 3 ? "Aprobó" : "Reprobó";

        System.out.println("El estudiante " + resultado
                + " la asignatura");
    }
}