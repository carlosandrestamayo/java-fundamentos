# Variables y tipos de datos en Java

## ¿Qué es una variable?

Una variable es un espacio en memoria que se utiliza para almacenar información
que puede cambiar durante la ejecución de un programa.

En Java, toda variable debe declararse indicando:
- Un tipo de dato
- Un nombre (identificador)
- Un valor inicial (opcional)

Ejemplo:

```java
int edad = 18;

```

En este ejemplo:

- `int` es el tipo de dato
- `edad` es el nombre de la variable
- `18` es el valor almacenado

---

## ¿Para qué sirven las variables?

Las variables permiten que los programas:

- Almacenen información temporal
- Representen datos del mundo real
- Realicen cálculos dinámicos
- Sean reutilizables y adaptables

Sin variables, un programa solo podría trabajar con valores constantes.

---

## Tipos de datos en Java

Java es un lenguaje fuertemente tipado, lo que significa que toda variable
debe declararse con un tipo de dato específico y no puede cambiarlo.

- Los tipos de datos en Java se dividen en:
- Tipos de datos primitivos
- Tipos de datos no primitivos (tipos por referencia)

---

## Tipos de datos primitivos

Los tipos de datos primitivos almacenan valores simples directamente en memoria.
No son objetos y no poseen métodos.

| Tipo    | Tamaño  | Ejemplo                  |
| ------- | ------- | ------------------------ |
| byte    | 8 bits  | `byte b = 10;`           |
| short   | 16 bits | `short s = 200;`         |
| int     | 32 bits | `int x = 1000;`          |
| long    | 64 bits | `long l = 100000L;`      |
| float   | 32 bits | `float f = 3.14f;`       |
| double  | 64 bits | `double d = 3.1416;`     |
| char    | 16 bits | `char c = 'A';`          |
| boolean | —       | `boolean activo = true;` |

Características de los tipos primitivos:
- Se copian por valor
- No pueden ser null
- Se almacenan normalmente en el stack
- Representan un único valor

---

## Tipos de datos no primitivos (referencias)

Los tipos de datos no primitivos no almacenan directamente el valor,
sino una **referencia a un objeto** ubicado en memoria.

Ejemplos comunes:

- `String` 
- Arreglos
- Clases definidas por el programador
- Interfaces

Ejemplo:

```java
String nombre = "Carlos";

```
La variable `nombre` almacena una referencia a un objeto `String`,
no el texto directamente.

Características de los tipos por referencia:

- Pueden ser `null`
- Tienen métodos
- Apuntan a objetos almacenados en el heap

---

## Diferencia entre valor y referencia

Cuando se asigna una variable primitiva a otra, se copia el valor:
```java
int a = 5;
int b = a;
b = 10;

```
El valor de `a` permanece igual.

Cuando se asigna una variable por referencia, se copia la dirección del objeto:

```java
int[] x = {1, 2, 3};
int[] y = x;
y[0] = 99;

```
Ambas variables apuntan al mismo objeto, por lo que el cambio es visible desde
las dos referencias.

---

## Alcance (scope) de una variable

```java
if (true) {
    int x = 10;
}

```

La variable `x` solo existe dentro del bloque donde fue declarada.

Tipos de alcance en Java:

- Variables locales
- Variables de instancia
- Variables de clase (`static`)

---

## Tiempo de vida de una variable

El tiempo de vida indica cuánto tiempo una variable existe en memoria.

- Variables locales: viven mientras el método se está ejecutando
- Variables de instancia: viven mientras el objeto exista
- Variables estáticas: viven durante toda la ejecución del programa

Una variable puede salir de alcance, pero el objeto al que apuntaba puede
seguir existiendo si otras referencias lo mantienen activo.

---

## Inicialización de variables

En Java, las variables locales deben inicializarse antes de ser usadas.

```java
int x;
// System.out.println(x); // Error de compilación

```
Las variables de instancia y de clase tienen valores por defecto.

### Valores por defecto

| Tipo        | Valor por defecto |
| ----------- | ----------------- |
| numéricos   | `0`               |
| boolean     | `false`           |
| char        | `\u0000`          |
| referencias | `null`            |

---

## Errores comunes

- Usar variables locales sin inicializar
- Confundir tipos primitivos con objetos
- Pensar que Java copia objetos completos
- No comprender el alcance de las variables

## Idea clave

- En Java, los tipos primitivos almacenan valores.
- Los objetos se manejan mediante referencias.
- Comprender esta diferencia es fundamental para programar correctamente.
