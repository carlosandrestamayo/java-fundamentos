/*
 * ============================================================
 * RETO: BUSCADOR DE ESTUDIANTES
 * ============================================================
 *
 * Tema:
 * - Métodos
 * - Matrices de String
 * - Recorrido de matrices
 * - Manejo de cadenas
 * - contains()
 * - indexOf()
 * - toLowerCase()
 *
 * ============================================================
 *
 * Crea un programa en Java que trabaje con la siguiente matriz:
 *
 */

public class Reto {

    public static void main(String[] args) {

        String[][] estudiantes = {
            {"Carlos", "Santiago", "Miguel"},
            {"Daniela", "Andrés", "Camila"},
            {"Kevin", "Alejandro", "Karen"},
            {"Manuel", "Angela", "Katherine"}
        };

        /*
         * --------------------------------------------------------
         * REQUISITOS
         * --------------------------------------------------------
         *
         * 1. Solicita al usuario un texto para buscar dentro
         *    de los nombres de los estudiantes.
         *
         * 2. Debes utilizar MÉTODOS para organizar el programa.
         *
         * 3. Debes recorrer toda la matriz.
         *
         * 4. La búsqueda debe realizarse utilizando:
         *
         *        contains()
         *
         * 5. Cuando encuentres una coincidencia, debes utilizar:
         *
         *        indexOf()
         *
         *    para determinar en qué posición del nombre comienza
         *    el texto buscado.
         *
         * 6. Debes mostrar:
         *
         *    - Nombre encontrado
         *    - Fila
         *    - Columna
         *    - Posición donde comienza el texto buscado
         *
         * 7. La búsqueda debe funcionar independientemente de que
         *    el usuario escriba el texto en mayúsculas o minúsculas.
         *
         *
         * --------------------------------------------------------
         * EJEMPLO
         * --------------------------------------------------------
         *
         * Si el usuario escribe:
         *
         *     ale
         *
         * El programa debería encontrar:
         *
         *     Nombre: Alejandro
         *     Fila: 2
         *     Columna: 1
         *     Posición: 0
         *
         *
         * --------------------------------------------------------
         * RETO ADICIONAL
         * --------------------------------------------------------
         *
         * Si existen varias coincidencias, el programa debe
         * mostrar TODAS las coincidencias encontradas.
         *
         * Por ejemplo, si se busca:
         *
         *     an
         *
         * debe mostrar todos los nombres que contengan esa
         * secuencia de caracteres.
         *
         * --------------------------------------------------------
         *
         * RESTRICCIÓN
         * --------------------------------------------------------
         *
         * No debes realizar toda la lógica dentro de main().
         *
         * Crea métodos que permitan dividir el problema
         * en responsabilidades.
         *
         * ============================================================
         */
    }
}

