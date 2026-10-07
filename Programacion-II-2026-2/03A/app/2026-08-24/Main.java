public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Lunes 24 de agosto de 2026 - 10:00 a. m.
        // Tema de la clase:
        // - Referencias y comparación de objetos
        // - Arrays unidimensionales
        // - Arrays bidimensionales (matrices)
        // - Recorrido de matrices
        // - Matriz transpuesta
        // =========================================================


        // =========================================================
        // 1. STRING Y REFERENCIAS
        // =========================================================

        // String a = "Hola";
        // String b = new String("Hola");

        // Aunque a y b contienen el mismo texto,
        // no necesariamente hacen referencia al mismo objeto.
        //
        // "==" en objetos NO compara su contenido.
        // Compara si ambas variables hacen referencia
        // exactamente al mismo objeto en memoria.

        // System.out.println("a: " + a);
        // System.out.println("b: " + b);

        // System.out.println("a == b " + (a == b));


        // =========================================================
        // 2. ARRAYS Y REFERENCIAS
        // =========================================================

        // int[] c = {1, 2, 3};

        // Aquí "copia" NO crea un nuevo array.
        // Simplemente copia la referencia que contiene c.
        //
        // Por lo tanto, c y copia hacen referencia
        // al mismo array en memoria.

        // int[] copia = c;

        // En cambio, aquí sí estamos creando un
        // array completamente diferente.
        //
        // Aunque contiene los mismos valores que c,
        // es otro objeto en memoria.

        // int[] d = {1, 2, 3};

        // System.out.println("c: " + c);
        // System.out.println("copia: " + copia);
        // System.out.println("d: " + d);

        // c y d contienen los mismos valores,
        // pero son arrays diferentes.
        //
        // Por eso "==" compara sus referencias,
        // no sus elementos.

        // System.out.println("c == d " + (c == d));


        // =========================================================
        // 3. CREACIÓN DE UNA MATRIZ
        // =========================================================

        // Creamos una matriz de 3 filas y 2 columnas.
        //
        // Visualmente:
        //
        //        Columna
        //        0   1
        //
        // Fila 0  0   0
        // Fila 1  0   0
        // Fila 2  0   0
        //
        // En Java, los índices comienzan en 0.

        int[][] a = new int[3][2];


        // Variable que utilizaremos para llenar
        // la matriz con los valores 1, 2, 3, 4, 5 y 6.

        int value = 1;


        // =========================================================
        // 4. RECORRER Y LLENAR LA MATRIZ
        // =========================================================

        // El primer for recorre las FILAS.
        //
        // a.length indica cuántas filas tiene la matriz.
        // En este caso:
        //
        // a.length = 3

        for (int i = 0; i < a.length; i++) {

            // El segundo for recorre las COLUMNAS
            // de la fila actual.
            //
            // a[i].length indica cuántas columnas
            // tiene la fila i.
            //
            // En este caso:
            //
            // a[i].length = 2

            for (int j = 0; j < a[i].length; j++) {

                // Guardamos el valor actual
                // en la posición [fila][columna].

                a[i][j] = value;

                // Aumentamos el valor para la siguiente posición.

                value++;
            }
        }


        // =========================================================
        // 5. MOSTRAR LA MATRIZ
        // =========================================================

        // Volvemos a recorrer la matriz para mostrar
        // cada uno de sus elementos.

        for (int i = 0; i < a.length; i++) {

            System.out.println("\nFila " + i + "\n");

            for (int j = 0; j < a[i].length; j++) {

                System.out.println(
                    "a[" + i + "][" + j + "] = " + a[i][j]
                );
            }
        }

        // La matriz que tenemos ahora es:
        //
        //     1  2
        //     3  4
        //     5  6
        //
        // Tiene 3 filas y 2 columnas.


        // =========================================================
        // 6. MATRIZ TRANSPUESTA
        // =========================================================

        // Vamos a crear una nueva matriz que será
        // la transpuesta de a.
        //
        // Una matriz transpuesta convierte:
        //
        //       filas → columnas
        //       columnas → filas
        //
        // Nuestra matriz a es de 3 x 2:
        //
        //     1  2
        //     3  4
        //     5  6
        //
        // Su transpuesta será de 2 x 3:
        //
        //     1  3  5
        //     2  4  6
        //
        // Por eso invertimos las dimensiones:
        //
        // a[0].length = 2
        // a.length    = 3

        int[][] b = new int[a[0].length][a.length];


        System.out.println(
            "\nMatriz " + a[0].length + " * " + a.length + "\n"
        );


        // =========================================================
        // 7. CONSTRUIR LA MATRIZ TRANSPUESTA
        // =========================================================

        // Aquí aparece la idea fundamental de la transpuesta:
        //
        //              b[i][j] = a[j][i]
        //
        // Observemos que i y j CAMBIAN DE POSICIÓN.
        //
        // Si tenemos:
        //
        // a[0][1]
        //
        // en la matriz transpuesta estará como:
        //
        // b[1][0]
        //
        // Es decir:
        //
        //       b[i][j] ← a[j][i]

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {

                b[i][j] = a[j][i];
            }
        }


        // =========================================================
        // 8. MOSTRAR LA MATRIZ TRANSPUESTA
        // =========================================================

        for (int i = 0; i < b.length; i++) {

            System.out.println("\nFila " + i + "\n");

            for (int j = 0; j < b[i].length; j++) {

                System.out.println(
                    "b[" + i + "][" + j + "] = " + b[i][j]
                );
            }
        }

        // Resultado:
        //
        // Matriz original:
        //
        //     1  2
        //     3  4
        //     5  6
        //
        // Matriz transpuesta:
        //
        //     1  3  5
        //     2  4  6


        // =========================================================
        // 9. CONSTRUIR UNA REPRESENTACIÓN DE LA MATRIZ COMO TEXTO
        // =========================================================

        // Ahora vamos a construir una cadena de texto
        // que represente visualmente la matriz.
        //
        // Queremos obtener algo parecido a:
        //
        // [
        //  [1,3,5],
        //  [2,4,6]
        // ]

        String cadena = "\nFormato Matriz \n[\n";


        // Recorremos nuevamente la matriz.

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {

                // Cuando estamos en la ÚLTIMA COLUMNA
                // debemos cerrar la fila con "]".

                if (j == b[i].length - 1) {

                    // Si además estamos en la ÚLTIMA FILA,
                    // cerramos la fila y posteriormente
                    // cerraremos la matriz completa.

                    if (i == b.length - 1) {

                        cadena += b[i][j] + "]\n";

                    } else {

                        // No es la última fila, por lo que
                        // después de cerrar esta fila
                        // colocamos una coma.

                        cadena += b[i][j] + "],\n";
                    }

                }

                // Si estamos en la primera columna,
                // iniciamos la fila con "[".

                else if (j == 0) {

                    cadena += " [" + b[i][j] + ",";

                }

                // Para las posiciones intermedias
                // simplemente agregamos el valor y una coma.

                else {

                    cadena += b[i][j] + ",";
                }
            }
        }


        // Cerramos finalmente la representación de la matriz.

        cadena += "]";


        // Mostramos la matriz construida como texto.

        System.out.println(cadena);
    }
}