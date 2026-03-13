# Retos en Java

## Reto 1: Clasificación de Números según la Suma de sus Divisores

### Introducción

En teoría de números, los enteros positivos pueden clasificarse según la **relación entre el número y la suma de sus divisores propios**.

Los **divisores propios** de un número son todos los números positivos que lo dividen exactamente **sin incluir el mismo número**.

Por ejemplo, los divisores propios de **12** son:

1, 2, 3, 4 y 6

La suma de estos divisores es:

1 + 2 + 3 + 4 + 6 = 16

Dependiendo de la relación entre el número y la suma de sus divisores propios, se obtienen tres clasificaciones.

---

### Número perfecto

Un número es **perfecto** cuando la suma de sus divisores propios es exactamente igual al número.

Ejemplo:

Divisores propios de **6**:

1, 2 y 3

Suma:

1 + 2 + 3 = 6

Por lo tanto, **6 es un número perfecto**.

Otros ejemplos conocidos de números perfectos son:

28, 496 y 8128.

---

### Número deficiente

Un número es **deficiente** cuando la suma de sus divisores propios es **menor que el número**.

Ejemplo:

Divisores propios de **8**:

1, 2 y 4

Suma:

1 + 2 + 4 = 7

Como **7 es menor que 8**, el número **8 es deficiente**.

---

### Número abundante

Un número es **abundante** cuando la suma de sus divisores propios es **mayor que el número**.

Ejemplo:

Divisores propios de **12**:

1, 2, 3, 4 y 6

Suma:

1 + 2 + 3 + 4 + 6 = 16

Como **16 es mayor que 12**, el número **12 es abundante**.

---

## Enunciado del Problema

Se tiene un conjunto de números enteros positivos almacenados en un arreglo. El objetivo es analizar estos números y clasificarlos según su tipo: **perfectos, deficientes o abundantes**.

A partir del conjunto dado, se debe determinar para cada categoría:

- La **cantidad** de números que pertenecen a ese tipo.
- La **suma total** de los números de esa categoría.
- El **menor número** encontrado en cada categoría.
- El **mayor número** encontrado en cada categoría.

Finalmente, se debe presentar un **resumen con la información obtenida para cada una de las tres clasificaciones**.

---

### Requisito Importante

La solución del problema debe desarrollarse utilizando **métodos o funciones**.  
Es decir, el programa debe dividir el problema en varias funciones que permitan:

- calcular la suma de divisores de un número,
- determinar si un número es **perfecto, deficiente o abundante**,
- analizar los números del arreglo,
- calcular cantidades, sumas, mínimos y máximos.

El método principal debe **utilizar estas funciones para realizar el análisis**, evitando escribir toda la lógica directamente en el programa principal.

---

## Arreglos de Prueba

Para verificar el funcionamiento del programa se pueden utilizar los siguientes arreglos de prueba.

### Arreglo de prueba 1

[6, 8, 12, 7, 28, 10, 15, 18, 20, 5]


- Perfectos: 6, 28  
- Deficientes: 7, 8, 10, 15, 5  
- Abundantes: 12, 18, 20  

---

### Arreglo de prueba 2

[12, 16, 6, 9, 28, 21, 24, 5, 14, 30]


- Perfectos: 6, 28  
- Deficientes: 16, 9, 21, 5, 14  
- Abundantes: 12, 24, 30  

---

### Arreglo de prueba 3

[496, 10, 8, 12, 18, 7, 15, 28, 20, 9]

- Perfectos: 496, 28  
- Deficientes: 10, 8, 7, 15, 9  
- Abundantes: 12, 18, 20  

---

## Solucion 1 - Reto 1

´´´java

public class Solucion1Reto {

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

´´´

---

## Solucion 2 - Reto 1

´´´java
public class Solucion2Reto {

    /*
     * Determina si un número es:
     * 0 -> Perfecto
     * 1 -> Abundante
     * 2 -> Deficiente
     */
    public static int tipoNumero(int n){

        int suma = 0;

        for(int i = 1; i < n; i++){
            suma += (n % i == 0) ? i : 0;
        }

        return (suma == n) ? 0 : (suma > n ? 1 : 2);
    }


    /*
     * Cuenta cuántos números hay de cada tipo
     */
    public static int[] contarTipos(int[] arr){

        int perfectos = 0;
        int abundantes = 0;
        int deficientes = 0;

        for(int i = 0; i < arr.length; i++){

            int tipo = tipoNumero(arr[i]);

            perfectos   += (tipo == 0) ? 1 : 0;
            abundantes  += (tipo == 1) ? 1 : 0;
            deficientes += (tipo == 2) ? 1 : 0;
        }

        return new int[]{perfectos, abundantes, deficientes};
    }


    /*
     * Clasifica los números en tres arreglos
     */
    public static void clasificarNumeros(int[] arr){

        int[] conteo = contarTipos(arr);

        int[] perfectos   = new int[conteo[0]];
        int[] abundantes  = new int[conteo[1]];
        int[] deficientes = new int[conteo[2]];

        int iP = 0;
        int iA = 0;
        int iD = 0;

        for(int i = 0; i < arr.length; i++){

            int tipo = tipoNumero(arr[i]);

            if(tipo == 0){
                perfectos[iP++] = arr[i];
            }
            else if(tipo == 1){
                abundantes[iA++] = arr[i];
            }
            else{
                deficientes[iD++] = arr[i];
            }
        }

        mostrarResultados(perfectos,"Perfectos");
        mostrarResultados(abundantes,"Abundantes");
        mostrarResultados(deficientes,"Deficientes");
    }


    /*
     * Muestra estadísticas del arreglo
     */
    public static void mostrarResultados(int[] arr, String tipo){

        if(arr.length == 0){
            System.out.println("No hay números " + tipo + "\n");
            return;
        }

        int min = arr[0];
        int max = arr[0];
        int suma = 0;

        String lista = "[ ";

        for(int i = 0; i < arr.length; i++){

            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;

            lista += (i != arr.length - 1) ? arr[i] + ", " : arr[i] + " ]";

            suma += arr[i];
        }

        System.out.println("Números " + tipo);
        System.out.println(lista);
        System.out.println("Cantidad: " + arr.length);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Suma: " + suma + "\n");
    }


    public static void main(String[] args){

        int[] datos = {6, 8, 12, 7, 28, 10, 15, 18, 20, 5};

        clasificarNumeros(datos);
    }

}


´´´

---
