public class Reto {

    public static void main(String[] args) {

        // =========================================================
        // RETO: MATRIZ ESPEJO
        // =========================================================
        //
        // Escribe un programa en Java que reciba una matriz
        // bidimensional y construya una nueva matriz que sea
        // el REFLEJO HORIZONTAL de la matriz original.
        //
        // ---------------------------------------------------------
        // ¿QUÉ ES UN REFLEJO HORIZONTAL?
        // ---------------------------------------------------------
        //
        // El reflejo horizontal consiste en invertir el orden
        // de las columnas de cada fila.
        //
        // Por ejemplo, si tenemos:
        //
        //     1  2  3
        //     4  5  6
        //     7  8  9
        //
        // El reflejo debe ser:
        //
        //     3  2  1
        //     6  5  4
        //     9  8  7
        //
        // Observa que las filas permanecen en el mismo orden,
        // pero las columnas se invierten.
        //
        // ---------------------------------------------------------
        // OBJETIVO
        // ---------------------------------------------------------
        //
        // El programa debe:
        //
        // 1. Crear una matriz bidimensional de 3 x 3.
        //
        // 2. Llenar la matriz con los valores del 1 al 9.
        //
        // 3. Crear una segunda matriz del mismo tamaño.
        //
        // 4. Recorrer la matriz utilizando ciclos for anidados.
        //
        // 5. Copiar los elementos de la primera matriz en la
        //    segunda matriz, pero invirtiendo el orden de las
        //    columnas.
        //
        // 6. Mostrar la matriz original.
        //
        // 7. Mostrar la matriz reflejada.
        //
        // ---------------------------------------------------------
        // EJEMPLO
        // ---------------------------------------------------------
        //
        // Matriz original:
        //
        //     [1, 2, 3]
        //     [4, 5, 6]
        //     [7, 8, 9]
        //
        // Matriz reflejada:
        //
        //     [3, 2, 1]
        //     [6, 5, 4]
        //     [9, 8, 7]
        //
        // ---------------------------------------------------------
        // PISTA PRINCIPAL
        // ---------------------------------------------------------
        //
        // En una matriz:
        //
        //     a[i][j]
        //
        // "i" representa la fila.
        //
        // "j" representa la columna.
        //
        // Para obtener la columna correspondiente desde
        // el extremo contrario puedes utilizar:
        //
        //     a[i].length - 1 - j
        //
        // Por ejemplo, para una fila de 3 columnas:
        //
        // j = 0  →  3 - 1 - 0 = 2
        // j = 1  →  3 - 1 - 1 = 1
        // j = 2  →  3 - 1 - 2 = 0
        //
        // Por lo tanto:
        //
        //     original:  [1, 2, 3]
        //     índices:    0  1  2
        //
        // se convierte en:
        //
        //     reflejo:   [3, 2, 1]
        //
        // ---------------------------------------------------------
        // RESTRICCIONES
        // ---------------------------------------------------------
        //
        // Debes utilizar:
        //
        // - int[][]
        // - for
        // - if (si lo consideras necesario)
        // - índices de filas y columnas
        //
        // No utilices métodos que inviertan automáticamente
        // la matriz.
        //
        // La idea es que tú mismo construyas la solución
        // utilizando los índices.
        //
        // ---------------------------------------------------------
        // RETO ADICIONAL
        // ---------------------------------------------------------
        //
        // Después de resolver el reto anterior, intenta hacer
        // que el programa también pueda trabajar con una matriz
        // rectangular.
        //
        // Por ejemplo:
        //
        //     [1, 2, 3, 4]
        //     [5, 6, 7, 8]
        //     [9,10,11,12]
        //
        // Debe producir:
        //
        //     [4, 3, 2, 1]
        //     [8, 7, 6, 5]
        //     [12,11,10,9]
        //
        // La solución debe funcionar sin importar el número
        // de filas o columnas que tenga la matriz.
        //
        // =========================================================


        // Escribe aquí tu solución.


    }
}