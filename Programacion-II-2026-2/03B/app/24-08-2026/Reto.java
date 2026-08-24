import java.util.Scanner;

public class Reto {

    public static void main(String[] args) {

        // =========================================================
        // RETO: MATRIZ DE NÚMEROS PRIMOS
        // =========================================================
        //
        // Escribe un programa en Java que solicite al usuario
        // el número de FILAS y COLUMNAS de una matriz.
        //
        // El programa debe crear una matriz con esas dimensiones
        // y llenarla únicamente con números PRIMOS.
        //
        // ---------------------------------------------------------
        // ¿QUÉ ES UN NÚMERO PRIMO?
        // ---------------------------------------------------------
        //
        // Un número primo es un número entero mayor que 1 que
        // solamente tiene dos divisores:
        //
        //     1 y el mismo número.
        //
        // Ejemplos:
        //
        //     2  -> Primo
        //     3  -> Primo
        //     5  -> Primo
        //     7  -> Primo
        //     11 -> Primo
        //     13 -> Primo
        //
        // En cambio:
        //
        //     4  -> No es primo
        //     6  -> No es primo
        //     8  -> No es primo
        //     9  -> No es primo
        //
        // ---------------------------------------------------------
        // EJEMPLO
        // ---------------------------------------------------------
        //
        // Si el usuario introduce:
        //
        // Filas: 3
        // Columnas: 4
        //
        // La matriz debe contener los primeros 12 números primos:
        //
        //     [  2   3   5   7 ]
        //     [ 11  13  17  19 ]
        //     [ 23  29  31  37 ]
        //
        // ---------------------------------------------------------
        // OBJETIVO
        // ---------------------------------------------------------
        //
        // El programa debe:
        //
        // 1. Crear un objeto Scanner para leer datos del usuario.
        //
        // 2. Solicitar el número de filas.
        //
        // 3. Solicitar el número de columnas.
        //
        // 4. Crear una matriz utilizando los valores introducidos.
        //
        // 5. Buscar números primos comenzando desde el número 2.
        //
        // 6. Verificar si cada número encontrado es primo.
        //
        // 7. Cuando encuentre un número primo, almacenarlo
        //    en la siguiente posición disponible de la matriz.
        //
        // 8. Continuar hasta llenar completamente la matriz.
        //
        // 9. Mostrar la matriz resultante.
        //
        // ---------------------------------------------------------
        // PISTAS
        // ---------------------------------------------------------
        //
        // Puedes utilizar:
        //
        //     Scanner
        //     int[][]
        //     while
        //     for
        //     if
        //     %
        //
        // Recuerda que:
        //
        //     numero % divisor == 0
        //
        // significa que "numero" es divisible entre "divisor".
        //
        // Para determinar si un número es primo puedes contar
        // cuántos divisores tiene.
        //
        // Por ejemplo, para el número 7:
        //
        //     7 % 1 == 0
        //     7 % 2 != 0
        //     7 % 3 != 0
        //     7 % 4 != 0
        //     7 % 5 != 0
        //     7 % 6 != 0
        //     7 % 7 == 0
        //
        // Tiene solamente dos divisores:
        //
        //     1 y 7
        //
        // Por lo tanto, es primo.
        //
        // ---------------------------------------------------------
        // PISTA PARA LLENAR LA MATRIZ
        // ---------------------------------------------------------
        //
        // Puedes utilizar dos variables para controlar
        // la posición actual:
        //
        //     fila
        //     columna
        //
        // Por ejemplo:
        //
        //     matriz[fila][columna]
        //
        // Cuando llegues al final de una fila, debes pasar
        // a la siguiente.
        //
        // También puedes utilizar un contador que indique
        // cuántas posiciones de la matriz has llenado.
        //
        // Recuerda que una matriz de:
        //
        //     3 x 4
        //
        // tiene:
        //
        //     3 * 4 = 12
        //
        // posiciones.
        //
        // ---------------------------------------------------------
        // RETO ADICIONAL
        // ---------------------------------------------------------
        //
        // Después de resolver el reto principal, modifica
        // el programa para que permita introducir matrices
        // sucesivamente.
        //
        // El programa debe terminar cuando el usuario introduzca:
        //
        //     0
        //
        // como número de filas o columnas.
        //
        // Ejemplo:
        //
        // Rows Number: 3
        // Cols Number: 4
        //
        // [  2   3   5   7 ]
        // [ 11  13  17  19 ]
        // [ 23  29  31  37 ]
        //
        // Rows Number: 2
        // Cols Number: 3
        //
        // [ 2  3  5 ]
        // [ 7 11 13 ]
        //
        // Rows Number: 0
        // Cols Number: 0
        //
        // El programa termina.
        //
        // =========================================================


        // Escribe aquí tu solución.


    }
}