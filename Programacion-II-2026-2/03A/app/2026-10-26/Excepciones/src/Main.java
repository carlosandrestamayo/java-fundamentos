/*
 * =====================================================================
 *  EXCEPCIONES EN JAVA - DESDE LO MÁS BÁSICO
 * =====================================================================
 *
 *  ¿Qué es una excepción?
 *  ----------------------
 *  Es un "evento inesperado" que ocurre MIENTRAS el programa se ejecuta
 *  y que interrumpe su flujo normal. Ejemplos:
 *    - Dividir un número entero entre cero.
 *    - Acceder a una posición que no existe en un arreglo.
 *    - Convertir el texto "hola" a número.
 *    - Usar un objeto que vale null.
 *
 *  Si NO manejamos la excepción, el programa se detiene ("se cae") y
 *  Java imprime en consola un mensaje rojo llamado "stack trace".
 *
 *  Si SÍ la manejamos, podemos reaccionar (mostrar un mensaje amable,
 *  pedir otro dato, usar un valor por defecto...) y el programa SIGUE.
 *
 *  Jerarquía simplificada:
 *
 *                     Throwable
 *                    /         \
 *                Error          Exception
 *          (graves, no se     /          \
 *           suelen manejar)  /            \
 *                 RuntimeException      IOException, etc.
 *                 (NO verificadas)      (VERIFICADAS / checked)
 *                 - ArithmeticException
 *                 - ArrayIndexOutOfBoundsException
 *                 - NullPointerException
 *                 - NumberFormatException
 *
 *  Para compilar y ejecutar (desde la carpeta src):
 *      javac Main.java
 *      java Main
 * =====================================================================
 */
public class Main {

    public static void main(String[] args) {

        ejemplo1SinManejo();
        ejemplo2TryCatch();
        ejemplo3VariosCatch();
        ejemplo4Finally();
        ejemplo5Throw();
        ejemplo6Throws();
        ejemplo7ExcepcionPropia();

        System.out.println("\n>>> FIN: el programa llegó hasta el final sin caerse.");
    }

    // -----------------------------------------------------------------
    // EJEMPLO 1: ¿Qué pasa si NO manejamos una excepción?
    // -----------------------------------------------------------------
    static void ejemplo1SinManejo() {
        System.out.println("\n=== EJEMPLO 1: Sin manejo de excepciones ===");

        int a = 10;
        int b = 0;

        // Si quitas el comentario de la siguiente línea, el programa se
        // detiene AQUÍ con:
        //   Exception in thread "main" java.lang.ArithmeticException: / by zero
        // y NINGUNA línea posterior se ejecutaría.
        //
        // int resultado = a / b;

        System.out.println("La línea peligrosa está comentada (a / b con b = " + b + ").");
        System.out.println("Quítale el comentario para ver cómo se cae el programa.");
    }

    // -----------------------------------------------------------------
    // EJEMPLO 2: try - catch (la forma básica de manejar una excepción)
    // -----------------------------------------------------------------
    //  try   { código que PODRÍA fallar }
    //  catch (TipoDeExcepcion e) { qué hacer SI falla }
    static void ejemplo2TryCatch() {
        System.out.println("\n=== EJEMPLO 2: try - catch ===");

        int a = 10;
        int b = 0;

        try {
            System.out.println("Intentando dividir " + a + " / " + b + "...");
            int resultado = a / b;              // <- aquí se lanza la excepción
            System.out.println("Resultado: " + resultado); // esta línea NO se ejecuta
        } catch (ArithmeticException e) {
            // 'e' es un OBJETO que contiene información del error.
            System.out.println("¡Error atrapado! No se puede dividir entre cero.");
            System.out.println("Mensaje de Java: " + e.getMessage());
            System.out.println("Tipo de excepción: " + e.getClass().getSimpleName());
        }

        // Como la excepción fue atrapada, el programa continúa normalmente.
        System.out.println("El programa sigue funcionando después del catch.");
    }

    // -----------------------------------------------------------------
    // EJEMPLO 3: Varios catch (cada tipo de error se trata distinto)
    // -----------------------------------------------------------------
    static void ejemplo3VariosCatch() {
        System.out.println("\n=== EJEMPLO 3: Varios bloques catch ===");

        // Simulamos datos que "escribió un usuario".
        String[] entradas = { "25", "hola", "7" };
        int[] numeros = new int[2]; // solo tiene posiciones 0 y 1

        for (int i = 0; i < entradas.length; i++) {
            try {
                // Integer.parseInt convierte texto a número.
                // Si el texto no es un número -> NumberFormatException
                int valor = Integer.parseInt(entradas[i]);

                // Si i es 2, la posición no existe -> ArrayIndexOutOfBoundsException
                numeros[i] = valor;

                System.out.println("Guardado " + valor + " en la posición " + i);

            } catch (NumberFormatException e) {
                System.out.println("\"" + entradas[i] + "\" no es un número válido.");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("La posición " + i + " no existe en el arreglo (tamaño "
                        + numeros.length + ").");

            } catch (Exception e) {
                // Exception es la "madre" de casi todas: atrapa cualquier otra.
                // IMPORTANTE: debe ir de ÚLTIMA, de lo más específico a lo más general.
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }
    }

    // -----------------------------------------------------------------
    // EJEMPLO 4: finally (código que se ejecuta SIEMPRE)
    // -----------------------------------------------------------------
    //  Útil para "limpiar": cerrar archivos, conexiones, mostrar un cierre...
    static void ejemplo4Finally() {
        System.out.println("\n=== EJEMPLO 4: finally ===");

        String texto = null;

        try {
            // Llamar un método sobre algo que es null -> NullPointerException
            System.out.println("Longitud del texto: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("El texto es null, no tiene longitud.");
        } finally {
            // Se ejecuta haya error o no.
            System.out.println("[finally] Esto se imprime SIEMPRE.");
        }

        // Ahora sin error, para ver que finally también se ejecuta:
        texto = "Java";
        try {
            System.out.println("Longitud del texto: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Esto no se imprime porque no hubo error.");
        } finally {
            System.out.println("[finally] Y también se imprime cuando NO hay error.");
        }
    }

    // -----------------------------------------------------------------
    // EJEMPLO 5: throw (NOSOTROS lanzamos una excepción)
    // -----------------------------------------------------------------
    //  A veces el código no "falla" por sí solo, pero el dato no tiene
    //  sentido para nuestro programa (ej: una edad negativa). Entonces
    //  lanzamos nosotros la excepción con la palabra 'throw'.
    static void ejemplo5Throw() {
        System.out.println("\n=== EJEMPLO 5: throw ===");

        int[] edades = { 20, -5, 150 };

        for (int edad : edades) {
            try {
                validarEdad(edad);
                System.out.println("Edad " + edad + " es válida.");
            } catch (IllegalArgumentException e) {
                System.out.println("Edad rechazada -> " + e.getMessage());
            }
        }
    }

    static void validarEdad(int edad) {
        if (edad < 0) {
            // 'throw' + 'new' crea y lanza la excepción. El método termina aquí.
            throw new IllegalArgumentException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new IllegalArgumentException("La edad " + edad + " no es realista.");
        }
    }

    // -----------------------------------------------------------------
    // EJEMPLO 6: throws (avisar que un método PUEDE lanzar una excepción)
    // -----------------------------------------------------------------
    //  Las excepciones VERIFICADAS (checked), como Exception o IOException,
    //  obligan al programador a hacer una de dos cosas:
    //    1) Atraparlas con try-catch, o
    //    2) Declararlas en el método con 'throws' para que otro las maneje.
    //  Si no haces ninguna de las dos, el código NO COMPILA.
    static void ejemplo6Throws() {
        System.out.println("\n=== EJEMPLO 6: throws ===");

        try {
            retirarDinero(100_000, 50_000);   // funciona
            retirarDinero(100_000, 300_000);  // lanza excepción
        } catch (Exception e) {
            System.out.println("No se pudo retirar: " + e.getMessage());
        }
    }

    // 'throws Exception' le avisa a quien llame este método:
    // "ojo, esto puede fallar, tú decides qué hacer".
    static void retirarDinero(int saldo, int monto) throws Exception {
        if (monto > saldo) {
            throw new Exception("Saldo insuficiente. Saldo: " + saldo + ", monto: " + monto);
        }
        System.out.println("Retiro exitoso de " + monto + ". Nuevo saldo: " + (saldo - monto));
    }

    // -----------------------------------------------------------------
    // EJEMPLO 7: Crear NUESTRA PROPIA excepción
    // -----------------------------------------------------------------
    //  Basta con crear una clase que herede (extends) de Exception
    //  (verificada) o de RuntimeException (no verificada).
    //  Así el nombre del error describe exactamente el problema.
    //
    //  Aquí la declaramos dentro de Main (static) para tener todo en un
    //  solo archivo; normalmente iría en su propio archivo .java.
    static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensaje) {
            super(mensaje); // le pasamos el mensaje a la clase padre (Exception)
        }
    }

    static void ejemplo7ExcepcionPropia() {
        System.out.println("\n=== EJEMPLO 7: Excepción personalizada ===");

        try {
            comprar(20_000, 35_000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Compra cancelada: " + e.getMessage());
        }
    }

    static void comprar(int saldo, int precio) throws SaldoInsuficienteException {
        if (precio > saldo) {
            throw new SaldoInsuficienteException(
                    "Te faltan " + (precio - saldo) + " para comprar este producto.");
        }
        System.out.println("Compra realizada.");
    }
}
