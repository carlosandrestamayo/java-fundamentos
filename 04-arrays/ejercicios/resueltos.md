# Ejercicios Resueltos – Arrays en Java
## Ejercicio 1 – Promedio y conteo condicionado

**Enunciado**

Dado un arreglo de enteros, calcular:

- el promedio de los valores
- cuántos valores son mayores o iguales al promedio

Arreglo:
```java
int[] numeros = {10, 20, 30, 40, 50};
```

### Solución:

```java
public class Ejercicio1 {

    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de enteros
        // El arreglo contiene 5 valores
        int[] numeros = {10, 20, 30, 40, 50};

        // Variable acumuladora para almacenar la suma de los elementos
        int suma = 0;

        // Primer recorrido del arreglo
        // Se usa for-each para sumar todos los valores
        for (int n : numeros) {
            suma += n; // suma = suma + n
        }

        // Cálculo del promedio
        // Se hace un cast a double para evitar división entera
        double promedio = (double) suma / numeros.length;

        // Variable contador para contar cuántos valores
        // son mayores o iguales al promedio
        int contador = 0;

        // Segundo recorrido del arreglo
        // Se compara cada elemento con el promedio
        for (int n : numeros) {
            if (n >= promedio) {
                contador++; // Se incrementa el contador si cumple la condición
            }
        }

        // Se muestran los resultados en consola
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de valores mayores o iguales al promedio: " + contador);
    }
}
```
---

## Ejercicio 2 – Invertir un arreglo

**Enunciado**

Dado un arreglo, invertir el orden de sus elementos
sin usar otro arreglo auxiliar.

```java
public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaración e inicialización del arreglo
        // Contiene los valores que se desean invertir
        int[] numeros = {1, 2, 3, 4, 5};

        // Variable temporal utilizada para realizar el intercambio
        int temp;

        // El bucle se ejecuta solo hasta la mitad del arreglo
        // Esto evita deshacer los intercambios realizados
        for (int i = 0; i < numeros.length / 2; i++) {

            // Se guarda el valor actual en una variable temporal
            temp = numeros[i];

            // Se asigna al elemento actual el valor del elemento opuesto
            // numeros.length - 1 - i calcula el índice simétrico desde el final
            numeros[i] = numeros[numeros.length - 1 - i];

            // Se coloca el valor guardado en la posición opuesta
            numeros[numeros.length - 1 - i] = temp;
        }

        // Se recorre el arreglo ya invertido y se imprime su contenido
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
```

---

Ejercicio 3 – Suma por filas en una matriz

**Enunciado**

Dada una matriz bidimensional, calcular la suma de cada fila
y mostrar el resultado.

```java
public class Ejercicio3 {

    public static void main(String[] args) {

        // Declaración e inicialización de una matriz bidimensional
        // La matriz tiene 3 filas y 3 columnas
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Bucle externo: recorre cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {

            // Variable acumuladora para la suma de la fila actual
            int sumaFila = 0;

            // Bucle interno: recorre cada columna de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {

                // Se suma el valor de cada elemento de la fila
                sumaFila += matriz[i][j];
            }

            // Se muestra la suma correspondiente a la fila actual
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }
    }
}

```
---

## Ejercicio 4 – Matriz con valores por defecto y asignación parcial

**Enunciado**

- Crear una matriz 3×3.
- Asignar valores solo a la diagonal principal.
- Mostrar la matriz completa.

```java
public class Ejercicio4 {

    public static void main(String[] args) {

        // Creación de una matriz bidimensional de 3x3
        // Todas las posiciones se inicializan automáticamente en 0
        int[][] matriz = new int[3][3];

        // Bucle que recorre la diagonal principal de la matriz
        // En la diagonal principal, el índice de fila y columna es el mismo
        for (int i = 0; i < matriz.length; i++) {

            // Se asigna un valor solo a la posición [i][i]
            // i + 1 se usa para evitar el valor 0 en la diagonal
            matriz[i][i] = i + 1;
        }

        // Bucle externo: recorre las filas de la matriz
        for (int i = 0; i < matriz.length; i++) {

            // Bucle interno: recorre las columnas de cada fila
            for (int j = 0; j < matriz[i].length; j++) {

                // Se imprime cada elemento de la matriz
                System.out.print(matriz[i][j] + " ");
            }

            // Salto de línea al finalizar cada fila
            System.out.println();
        }
    }
}

```

---

## Ejercicio 5 – Promedio en arreglo jagged

**Enunciado**

Dado un arreglo jagged que representa las notas de varios estudiantes,
calcular el promedio de cada estudiante.

```java
public class Ejercicio5 {

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo jagged (irregular)
        // Cada fila representa las notas de un estudiante
        // Cada estudiante puede tener una cantidad distinta de notas
        double[][] notas = {
            {4.0, 3.5, 5.0},          // Estudiante 1
            {2.5, 3.0},               // Estudiante 2
            {4.5, 4.0, 4.8, 5.0}      // Estudiante 3
        };

        // Bucle externo: recorre cada estudiante (cada fila del arreglo)
        for (int i = 0; i < notas.length; i++) {

            // Variable acumuladora para la suma de las notas del estudiante actual
            double suma = 0;

            // Bucle interno: recorre todas las notas del estudiante actual
            for (int j = 0; j < notas[i].length; j++) {

                // Se suma cada nota del estudiante
                suma += notas[i][j];
            }

            // Cálculo del promedio del estudiante actual
            // Se divide la suma entre la cantidad de notas que tiene
            double promedio = suma / notas[i].length;

            // Se muestra el promedio del estudiante
            // i + 1 se usa para numerar estudiantes desde 1 y no desde 0
            System.out.println("Promedio estudiante " + (i + 1) + ": " + promedio);
        }
    }
}

```
---
Ejercicio 6 – Búsqueda y conteo en un arreglo de Strings

**Enunciado**

Dado un arreglo de cadenas que contiene nombres de estudiantes:

```java
String[] nombres = {"Ana", "Luis", "Pedro", "Ana", "María", "Luis", "Ana"};
```

El programa debe:

- Mostrar todos los nombres del arreglo
- Contar cuántas veces aparece el nombre "Ana"
- Mostrar el resultado en pantalla

```java
public class Ejercicio6 {

    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de cadenas
        String[] nombres = {"Ana", "Luis", "Pedro", "Ana", "María", "Luis", "Ana"};

        // Variable contador para contar cuántas veces aparece "Ana"
        int contador = 0;

        // Se recorren todos los elementos del arreglo
        for (int i = 0; i < nombres.length; i++) {

            // Se imprime el nombre actual
            System.out.println(nombres[i]);

            // Comparación de cadenas usando equals()
            if (nombres[i].equals("Ana")) {
                contador++;
            }
        }

        // Se muestra el resultado final
        System.out.println("El nombre Ana aparece " + contador + " veces.");
    }
}

```
---

