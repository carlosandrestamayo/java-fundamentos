import java.util.Scanner;

public class Main {


    // =========================================================
    // MÉTODO: crearArr
    // =========================================================
    //
    // Recibe un entero "fin" y crea un arreglo de ese tamaño.
    //
    // Ejemplo:
    //
    //     crearArr(5)
    //
    // produce:
    //
    //     [1, 2, 3, 4, 5]
    //
    // Parámetro:
    //     fin -> determina el tamaño del arreglo.
    //
    // Retorno:
    //     int[] -> arreglo creado y lleno.
    //
    // =========================================================

    public static int[] crearArr(int fin) {


        // Creamos un arreglo de enteros cuyo tamaño
        // está determinado por el parámetro "fin".

        int[] arr = new int[fin];


        // Recorremos todas las posiciones del arreglo.
        //
        // Los índices comienzan en 0 y terminan en:
        //
        //     arr.length - 1

        for (int i = 0; i < arr.length; i++) {


            // Guardamos i + 1 en cada posición.
            //
            // ¿Por qué i + 1?
            //
            // Porque el índice comienza en 0, pero queremos
            // almacenar números comenzando desde 1.
            //
            // i = 0 -> arr[0] = 1
            // i = 1 -> arr[1] = 2
            // i = 2 -> arr[2] = 3

            arr[i] = i + 1;
        }


        // Devolvemos el arreglo.
        //
        // El método termina entregando una referencia al arreglo
        // que acabamos de crear.

        return arr;
    }



    // =========================================================
    // MÉTODO: sumar
    // =========================================================
    //
    // Recibe un arreglo de enteros y calcula la suma
    // de todos sus elementos.
    //
    // Ejemplo:
    //
    //     [1, 2, 3, 4]
    //
    // Resultado:
    //
    //     10
    //
    // =========================================================

    public static int sumar(int[] a) {


        // Acumulador.
        //
        // Comenzamos en 0 porque todavía no hemos sumado
        // ningún elemento.

        int suma = 0;


        // FOR-EACH
        //
        // Recorremos todos los elementos del arreglo.
        //
        // En cada iteración, "n" representa el elemento actual.

        for (int n : a) {

            // Acumulamos el valor de n.

            suma += n;
        }


        // Devolvemos el resultado de la suma.

        return suma;
    }



    // =========================================================
    // MÉTODO: cambiarValor
    // =========================================================
    //
    // Este método recibe un tipo PRIMITIVO: int.
    //
    // El objetivo de este ejemplo es observar qué sucede
    // cuando intentamos modificar un parámetro de tipo primitivo.
    //
    // =========================================================

    public static void cambiarValor(int x) {

        // Modificamos el parámetro local.
        //
        // IMPORTANTE:
        //
        // Este cambio NO modifica la variable original
        // que fue enviada desde main().
        //
        // Java pasa los argumentos por valor.
        //
        // En el caso de un primitivo, se copia el VALOR.

        x = 8;
    }



    // =========================================================
    // MÉTODO: cambiarValorArr
    // =========================================================
    //
    // Ahora recibimos un arreglo.
    //
    // Un arreglo es un objeto, por lo que la variable que
    // recibimos contiene una REFERENCIA al objeto.
    //
    // Java también pasa esta referencia por valor, es decir,
    // se copia la referencia.
    //
    // Pero ambas referencias apuntan al MISMO arreglo.
    //
    // Por eso podemos modificar el contenido del arreglo.
    //
    // =========================================================

    public static void cambiarValorArr(int[] a) {

        // Modificamos la primera posición del arreglo.

        a[0] = 8;
    }



    // =========================================================
    // MÉTODO PRINCIPAL: main
    // =========================================================
    //
    // La ejecución del programa comienza aquí.
    //
    // =========================================================

    public static void main(String[] args) {


        // =========================================================
        // Lunes 24 de agosto de 2026 - 10:00 a. m.
        //
        // TEMA DE LA CLASE:
        //
        // - Scanner
        // - Comparación de Strings y tipos primitivos
        // - Matrices bidimensionales
        // - Recorrido de matrices
        // - Creación de matrices con dimensiones variables
        // - Ciclos while y for
        // - Operador módulo %
        // - Identificación de números primos
        // - Llenado de una matriz con números primos
        // - Métodos
        // - Paso de parámetros
        // - Arreglos y referencias
        // =========================================================


        // =========================================================
        // SCANNER
        // =========================================================
        //
        // Creamos un objeto Scanner para poder leer datos
        // introducidos por el usuario.
        //
        // System.in representa la entrada estándar,
        // normalmente el teclado.
        //
        // =========================================================

        Scanner sc = new Scanner(System.in);



        // =========================================================
        // VARIABLES DE CONTROL
        // =========================================================

        int inicio = 4;
        int fin = 10;



        // =========================================================
        // EJERCICIO: CREAR UN ARREGLO Y SUMARLO
        // =========================================================
        //
        // Este bloque está comentado porque corresponde a
        // una prueba o ejercicio anterior.
        //
        // =========================================================


        // while(true){
        //
        //     System.out.print("Ingrese Fin: ");
        //     fin = sc.nextInt();
        //
        //
        //     // Si el usuario introduce un número menor
        //     // o igual a cero, terminamos el ciclo.
        //
        //     if(fin <= 0)
        //         break;
        //
        //
        //     // Calculamos el tamaño necesario.
        //
        //     int size = fin - inicio;
        //
        //
        //     // Creamos el arreglo utilizando un método.
        //
        //     int[] resultado = crearArr(size);
        //
        //
        //     // Enviamos el arreglo al método sumar().
        //
        //     int total = sumar(resultado);
        //
        //
        //     // También podríamos combinar las llamadas:
        //
        //     // System.out.println(
        //     //     "La suma del arreglo es: "
        //     //     + sumar(crearArr(fin))
        //     // );
        //
        //
        //     // O utilizar directamente la variable total:
        //
        //     // System.out.println(
        //     //     "La suma del arreglo es: " + total
        //     // );
        //
        // }



        // =========================================================
        // CREACIÓN DE UN ARREGLO ENTRE DOS LÍMITES
        // =========================================================
        //
        // Este ejercicio muestra cómo crear un arreglo que
        // contenga los números desde "inicio" hasta "fin".
        //
        // =========================================================


        // inicio = 4;
        // fin = 12;


        // El tamaño debe incluir tanto el inicio como el fin.
        //
        // Ejemplo:
        //
        //     4, 5, 6, 7, 8, 9, 10, 11, 12
        //
        // Hay 9 números.
        //
        // Por eso:
        //
        //     fin - inicio + 1
        //
        //     12 - 4 + 1 = 9
        //
        // =========================================================

        // int[] newArr = new int[fin - inicio + 1];


        // Recorremos los números desde inicio hasta fin.

        // for(int i = inicio; i <= fin; i++){


        //     // Convertimos el número real "i" en un índice
        //     // válido para el arreglo.
        //     //
        //     // Ejemplo:
        //     //
        //     // i = 4
        //     // índice = 4 - 4 = 0
        //     //
        //     // i = 5
        //     // índice = 5 - 4 = 1

        //     newArr[i - inicio] = i;
        // }


        // FOR-EACH para mostrar el arreglo.

        // for(int n : newArr){
        //     System.out.printf("n: %d%n", n);
        // }



        // =========================================================
        // PASO DE TIPOS PRIMITIVOS A MÉTODOS
        // =========================================================
        //
        // Este ejemplo es importante para comprender
        // el comportamiento de los parámetros.
        //
        // =========================================================


        // Creamos una variable primitiva.

        // int x = 7;


        // Enviamos el valor de x al método.
        //
        // El método recibe una COPIA del valor 7.

        // cambiarValor(x);


        // El valor original sigue siendo 7.
        //
        // El cambio realizado dentro de cambiarValor()
        // solamente afecta a su parámetro local.

        // System.out.println("x: " + x);



        // =========================================================
        // PASO DE UN ARREGLO A UN MÉTODO
        // =========================================================
        //
        // Ahora hacemos algo similar, pero utilizando
        // un arreglo.
        //
        // =========================================================


        // Creamos un arreglo con una sola posición.

        // int[] a = new int[1];


        // Enviamos el arreglo al método.
        //
        // El método recibe una copia de la referencia
        // que apunta al mismo objeto arreglo.

        // cambiarValorArr(a);


        // El contenido del arreglo sí fue modificado.

        // System.out.println("a[0]: " + a[0]);



        // =========================================================
        // PROMOCIÓN DE TIPOS
        // =========================================================
        //
        // Ahora tenemos dos variables de tipo byte.
        //
        // =========================================================

        byte a = 2;
        byte c = 3;


        // Aunque "a" y "c" son byte, el resultado de una
        // operación aritmética entre ellos se calcula como int.
        //
        // Por eso podemos almacenar el resultado directamente
        // en una variable int.
        //
        //     byte + byte -> int
        //
        // Esto forma parte de las reglas de promoción numérica
        // de Java.

        int p = a + c;
    }
}

