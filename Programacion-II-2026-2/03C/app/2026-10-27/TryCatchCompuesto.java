// TRY-CATCH COMPUESTO
// Un solo bloque "try" puede tener VARIOS "catch".
// Cada catch atiende un tipo de error diferente.
// Java revisa los catch de arriba hacia abajo y entra SOLO en el primero que coincida.

public class TryCatchCompuesto {

    public static void main(String[] args) {

        // Lista de productos y cuantas unidades se vendieron de cada uno
        String[] productos = {"Arroz", "Leche", "Pan"};
        String[] textoVentas = {"10", "0", "abc"};   // vienen como texto, como si las escribiera un usuario

        // Probamos varias posiciones. La posicion 5 NO existe a proposito.
        int[] posicionesAProbar = {0, 1, 2, 5};

        for (int posicion : posicionesAProbar) {
            System.out.println("--- Probando la posicion " + posicion + " ---");
            calcularPrecioUnitario(productos, textoVentas, posicion);
            System.out.println();
        }

        // Ejemplo con MULTI-CATCH: un solo catch para dos errores distintos
        ejemploMultiCatch();

        System.out.println("\nEl programa termino sin caerse.");
    }

    // Calcula cuanto costo cada unidad: total vendido / unidades vendidas
    public static void calcularPrecioUnitario(String[] productos, String[] textoVentas, int posicion) {
        int totalVendido = 50000;

        try {
            // Aqui pueden pasar TRES errores diferentes:
            String producto = productos[posicion];                   // 1. la posicion no existe
            int unidades = Integer.parseInt(textoVentas[posicion]);  // 2. el texto no es un numero
            int precio = totalVendido / unidades;                    // 3. dividir entre cero

            System.out.println("Producto: " + producto + " | Precio por unidad: $" + precio);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: la posicion " + posicion + " no existe en la lista");

        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + textoVentas[posicion] + "\" no es un numero valido");

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero unidades");

        } catch (Exception e) {
            // Exception es la "madre" de todas las excepciones.
            // Va SIEMPRE de ultima: atrapa cualquier error que no atraparon los de arriba.
            // Si la ponemos de primera, el programa NO compila.
            System.out.println("Error inesperado: " + e.getMessage());

        } finally {
            // finally se ejecuta SIEMPRE: haya error o no
            System.out.println("(Fin del calculo para la posicion " + posicion + ")");
        }
    }

    // MULTI-CATCH (desde Java 7): se separan los tipos de error con el simbolo |
    // Sirve cuando queremos hacer LO MISMO para varios errores distintos.
    public static void ejemploMultiCatch() {
        System.out.println("--- Ejemplo de multi-catch ---");

        try {
            String edadTexto = "veinte";
            int edad = Integer.parseInt(edadTexto);   // aqui falla
            int[] edades = new int[2];
            edades[edad] = 18;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error con el dato de la edad: " + e.getClass().getSimpleName());
        }
    }
}
