public class Solucion1Reto1 {

    /*
     * Este método recorre el arreglo de números y cuenta cuántos son:
     * - Perfectos
     * - Abundantes
     * - Deficientes
     * 
     * Retorna un arreglo con tres posiciones:
     * [0] -> cantidad de números perfectos
     * [1] -> cantidad de números abundantes
     * [2] -> cantidad de números deficientes
     */
    public static int[] contarTiposNumeros(int[] arreglo) {

        int suma = 0;      // almacenará la suma de los divisores
        int numero = 0;    // número que se está analizando

        int contadorPerfectos = 0;
        int contadorAbundantes = 0;
        int contadorDeficientes = 0;

        // recorrer todo el arreglo
        for (int i = 0; i < arreglo.length; i++) {

            numero = arreglo[i];
            suma = 0;

            // calcular la suma de los divisores propios del número
            for (int j = 1; j < numero; j++) {

                if (numero % j == 0) {   // si j es divisor de numero
                    suma = suma + j;
                }
            }

            /*
             * Clasificación del número:
             * perfecto: suma de divisores = número
             * abundante: suma de divisores > número
             * deficiente: suma de divisores < número
             */

            if (suma == numero) {
                contadorPerfectos++;
            }

            if (suma > numero) {
                contadorAbundantes++;
            }

            if (suma < numero) {
                contadorDeficientes++;
            }
        }

        // crear un arreglo con los resultados
        int[] resultado = {contadorPerfectos, contadorAbundantes, contadorDeficientes};

        return resultado;
    }


    /*
     * Este método clasifica los números del arreglo original
     * y los guarda en tres arreglos diferentes:
     * - uno para números perfectos
     * - uno para números abundantes
     * - uno para números deficientes
     */
    public static void clasificarNumeros(int[] arreglo) {

        // primero calculamos cuántos números hay de cada tipo
        int[] conteo = contarTiposNumeros(arreglo);

        int contadorPerfectos = 0;
        int contadorAbundantes = 0;
        int contadorDeficientes = 0;

        // crear arreglos con el tamaño exacto
        int[] numerosPerfectos = new int[conteo[0]];
        int[] numerosAbundantes = new int[conteo[1]];
        int[] numerosDeficientes = new int[conteo[2]];

        int numero = 0;
        int suma = 0;

        // recorrer nuevamente el arreglo original
        for (int i = 0; i < arreglo.length; i++) {

            numero = arreglo[i];
            suma = 0;

            // calcular divisores del número
            for (int j = 1; j < numero; j++) {

                if (numero % j == 0) {
                    suma = suma + j;
                }
            }

            // clasificar el número en el arreglo correspondiente
            if (suma == numero) {

                numerosPerfectos[contadorPerfectos] = numero;
                contadorPerfectos++;

            }

            else if (suma > numero) {

                numerosAbundantes[contadorAbundantes] = numero;
                contadorAbundantes++;

            }

            else {

                numerosDeficientes[contadorDeficientes] = numero;
                contadorDeficientes++;

            }
        }

        // mostrar resultados
        mostrarResultados(numerosPerfectos, "Perfectos");
        mostrarResultados(numerosAbundantes, "Abundantes");
        mostrarResultados(numerosDeficientes, "Deficientes");
    }


    /*
     * Este método muestra estadísticas de un arreglo:
     * - lista de números
     * - cantidad
     * - mínimo
     * - máximo
     * - suma total
     */
    public static void mostrarResultados(int[] arreglo, String tipo) {

        // si el arreglo está vacío se evita un error
        if (arreglo.length == 0) {
            System.out.println("No hay números " + tipo + "\n");
            return;
        }

        int minimo = arreglo[0];
        int maximo = arreglo[0];
        int suma = 0;

        String lista = "[ ";

        // recorrer el arreglo
        for (int i = 0; i < arreglo.length; i++) {

            // calcular mínimo
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }

            // calcular máximo
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }

            // construir lista de números
            if (i != arreglo.length - 1) {
                lista = lista + arreglo[i] + ", ";
            } else {
                lista = lista + arreglo[i] + " ]";
            }

            // sumar elementos
            suma = suma + arreglo[i];
        }

        // mostrar resultados
        System.out.println("Números " + tipo);
        System.out.println(lista);
        System.out.println("Cantidad de números " + tipo + ": " + arreglo.length);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Suma: " + suma + "\n");
    }


    /*
     * Método principal del programa.
     * Aquí inicia la ejecución.
     */
    public static void main(String[] args) {

        // arreglo de prueba
        int[] datos = {6, 8, 12, 7, 28, 10, 15, 18, 20, 5};

        // llamar al método que realiza todo el proceso
        clasificarNumeros(datos);
    }

}