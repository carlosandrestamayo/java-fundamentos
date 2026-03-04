# Unidad 4 – Arreglos en Java (Arrays)

## ¿Qué es un arreglo?

Un arreglo (array) es una estructura de datos que permite almacenar múltiples valores del mismo tipo
en una sola variable.

Cada valor se almacena en una posición identificada por un índice.

Un arreglo en Java:

- Tiene tamaño fijo
- Usa índices numéricos
- Empieza siempre en la posición 0
- Almacena datos del mismo tipo

---

## ¿Por qué usar arreglos?

Los arreglos permiten:

Agrupar datos relacionados

- Evitar declarar muchas variables individuales
- Acceder rápidamente a los datos
- Trabajar eficientemente con ciclos
- Son una de las estructuras fundamentales de la programación.

---

## Concepto de índice

Cada elemento del arreglo tiene una posición llamada índice.

```java
int[] numeros = {10, 20, 30};

```

| Índice | Valor |
| ------ | ----- |
| 0      | 10    |
| 1      | 20    |
| 2      | 30    |

⚠️ El primer elemento siempre está en el índice 0.

---

## Declaración de arreglos

Un arreglo se declara indicando el tipo de dato y los corchetes [].
```java
int[] edades;
double[] precios;
String[] nombres;
```

También es válido:

```java
int edades[];
```

Sin embargo, la forma recomendada es `tipo[] nombre`

---

## Creación de arreglos

Un arreglo debe crearse indicando su tamaño.

```java
int[] edades = new int[5];
```
---

Esto crea un arreglo con 5 posiciones, numeradas de 0 a 4.

## Inicialización de arreglos
### Inicialización directa

```java
int[] edades = {18, 20, 25, 30, 40};
```

En este caso, el tamaño se asigna automáticamente.

### Inicialización manual

```java
int[] edades = new int[3];
edades[0] = 18;
edades[1] = 20;
edades[2] = 25;
```
---

### Valores por defecto en arreglos

Cuando se crea un arreglo en Java, todas sus posiciones se inicializan automáticamente
con un valor por defecto, dependiendo del tipo de dato.

Esto ocurre solo cuando el arreglo se crea con `new`.

**Valores por defecto según el tipo de dato**

| Tipo de dato | Valor por defecto          |
| ------------ | -------------------------- |
| `byte`       | `0`                        |
| `short`      | `0`                        |
| `int`        | `0`                        |
| `long`       | `0L`                       |
| `float`      | `0.0f`                     |
| `double`     | `0.0`                      |
| `char`       | `'\u0000'` (carácter nulo) |
| `boolean`    | `false`                    |
| Tipos objeto | `null`                     |


---

## Acceso y modificación de elementos

Para acceder a un elemento se usa su índice.

```java
int valor = edades[1];
```

Para modificarlo:

```java
edades[1] = 22;
```
---

## Tamaño del arreglo

El tamaño de un arreglo se obtiene con la propiedad length.

```java
int total = edades.length;
```

⚠️ `length` no lleva paréntesis, no es un método.

### Recorrido de arreglos

**Uso del bucle for**

```java
for (int i = 0; i < edades.length; i++) {
    System.out.println(edades[i]);
}
```

**Uso del bucle for-each**

```java
for (int edad : edades) {
    System.out.println(edad);
}
```
El for-each es más simple, pero no permite acceder al índice.

---

## Arreglos y memoria

- Los arreglos son objetos
- Se almacenan en el Heap
- La variable contiene una referencia
- El tamaño no puede cambiar después de creado

---

## Arreglos de tipos primitivos y objetos

### Tipos primitivos

```java
int[] numeros;
double[] notas;
```

Cada posición guarda el valor directamente.

### Objetos

```java
String[] nombres;
```

Cada posición guarda una referencia a un objeto.

---

## Arreglos multidimensionales

Un arreglo multidimensional es un arreglo cuyos elementos son otros arreglos.

El más común es el **arreglo bidimensional** (matriz).

### Declaración y creación de arreglos bidimensionales
```java
int[][] matriz = new int[3][4];
```

Esto representa:

- 3 filas
- 4 columnas

### Inicialización directa de una matriz
```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Acceso a elementos de una matriz
```java
int valor = matriz[1][2];
```

Fila 1, columna 2.

###Recorrido de arreglos multidimensionales

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

---

## Arreglos jagged (irregulares)

Un arreglo jagged es un arreglo multidimensional donde cada fila puede tener un tamaño diferente.

En Java, los arreglos multidimensionales son realmente arreglos de arreglos.

### Creación de arreglos jagged

```java
int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[1];
```

Cada fila se inicializa por separado.

### Inicialización directa de arreglos jagged

```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5, 6},
    {7}
};
```

### Recorrido de arreglos jagged

```java
for (int i = 0; i < jagged.length; i++) {
    for (int j = 0; j < jagged[i].length; j++) {
        System.out.print(jagged[i][j] + " ");
    }
    System.out.println();
}
```
---

## Diferencia entre matriz y arreglo jagged
| Característica     | Matriz | Jagged |
| ------------------ | ------ | ------ |
| Filas iguales      | Sí     | No     |
| Estructura regular | Sí     | No     |
| Flexibilidad       | Baja   | Alta   |

---

### Errores comunes con arreglos

- Acceder a índices inválidos (ArrayIndexOutOfBoundsException)
- Usar índices negativos
- Olvidar inicializar filas en arreglos jagged
- Confundir length con métodos
- Intentar cambiar el tamaño del arreglo

---

### Buenas prácticas

- Usar length en los recorridos
- Validar índices antes de acceder
- Usar for-each cuando no se necesita el índice
- Nombrar arreglos en plural
- Mantener el código legible

---


