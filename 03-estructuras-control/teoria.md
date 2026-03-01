# Unidad 3 – Estructuras de Control en Java

## ¿Qué es una estructura de control?

Una estructura de control permite **alterar el flujo normal de ejecución**
de un programa.

Por defecto, un programa en Java se ejecuta **de arriba hacia abajo**,
línea por línea.  
Las estructuras de control permiten:

- Tomar decisiones
- Repetir instrucciones
- Controlar qué partes del código se ejecutan y cuándo

---

## Tipos de estructuras de control en Java

En Java existen tres grandes grupos:

- Estructuras condicionales (decisión)
- Estructuras repetitivas (bucles)
- Estructuras de control de flujo (avance y ruptura)

En esta unidad se estudian las **condicionales y repetitivas**.

---

## Bloques de código

Antes de continuar, es importante entender qué es un bloque.

Un **bloque de código** es un conjunto de instrucciones encerradas entre llaves:

```java
{
    // instrucciones
}
```

**Características importantes:**

- Un bloque define un alcance (scope)
- Las variables declaradas dentro del bloque solo existen allí
- Muchas estructuras de control utilizan bloques

---

## Estructura condicional `if`

La estructura `if` permite ejecutar un bloque solo si una condición es verdadera.

**Sintaxis básica**

```java
if (condicion) {
    // instrucciones
}
```


La condición debe ser una **expresión booleana** (`true` o `false`).

**Ejemplo**

```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Es mayor de edad");
}

```
---

Si la condición es falsa, el bloque no se ejecuta.

---

## Estructura condicional `if - else`

Permite ejecutar un bloque cuando la condición es verdadera
y otro cuando es falsa.

**Sintaxis básica**

```java
if (condicion) {
    // si la condición es verdadera
} else {
    // si la condición es falsa
}
```

**Ejemplo**

```java
int nota = 50;

if (nota >= 60) {
    System.out.println("Aprobado");
} else {
    System.out.println("Reprobado");
}
```

---

## Estructura condicional `if`- `else if` - `else`

Se usa cuando hay varias condiciones posibles.

**Sintaxis básica**
```java
if (condicion 1) {
    // bloque 1
} else if (condicion 2) {
    // bloque 2
}else if (condicion 3) {
    // bloque 3
} else if (condicion n) {
    // bloque n
}else {
    // bloque por defecto
}
```

**Ejemplo**

```java
int calificacion = 85;

if (calificacion >= 90) {
    System.out.println("Excelente");
} else if (calificacion >= 70) {
    System.out.println("Bueno");
} else {
    System.out.println("Insuficiente");
}
```

Las condiciones se evalúan en orden y solo se ejecuta el primer bloque verdadero.

---

## Estructura `switch`

La estructura switch permite seleccionar un bloque
según el valor de una variable.

**Sintaxis básica**

```java
switch (variable) {
    case valor1:
        // instrucciones
        break;
    case valor2:
        // instrucciones
        break;
    default:
        // instrucciones
}
```

**Ejemplo**

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día no válido");
}
```

**Importancia del break**

- El break evita que el flujo continúe en los siguientes case
- Sin break, ocurre el fenómeno llamado fall-through

---

## Bucles (estructuras repetitivas)

Los bucles permiten repetir un bloque de código mientras se cumpla una condición.

Java ofrece tres tipos principales:

- `while`
- `do-while`
- `for`

---

## Bucle `while`

Ejecuta el bloque mientras la condición sea verdadera.

**Sintaxis básica**

```java
while (condicion) {
    // instrucciones
}
```

**Ejemplo:**

```java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
```

Si la condición es falsa desde el inicio, el bloque no se ejecuta.

---

## Bucle `do-while`

Similar a while, pero **garantiza al menos una ejecución.**

**Sintaxis básica**

```java
do {
    // instrucciones
} while (condicion);

```

**Ejemplo:**

```java
int numero = 1;

do {
    System.out.println(numero);
    numero++;
} while (numero <= 3);

```

---

## Diferencia entre `while` y `do-while`

| while                  | do-while                    |
| ---------------------- | --------------------------- |
| Evalúa antes de entrar | Evalúa después              |
| Puede no ejecutarse    | Se ejecuta al menos una vez |

---

## Bucle `for`

Se utiliza cuando se conoce la cantidad de repeticiones.

**Sintaxis básica**
```java
for (inicializacion; condicion; actualizacion) {
    // instrucciones
}
```
**Ejemplo:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```


Componentes:

- Inicialización: se ejecuta una sola vez
- Condición: se evalúa antes de cada iteración
- Actualización: se ejecuta al final de cada vuelta

---
### Alcance de variables en bucles

Las variables declaradas dentro del bucle
solo existen dentro de él.
```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}

// i no existe aquí
```
---

## La instrucción `break`

La instrucción break interrumpe inmediatamente la ejecución
de una estructura de control.

Puede usarse en:

- `switch`
- Bucles (`for`, `while`, do-while)

**Ejemplo en switch:**

```java
case 1:
    System.out.println("Uno");
    break;
```

**Ejemplo en bucle:**

```java
int i = 1;

while (i <= 10) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
    i++;
}
// El bucle se detiene cuando i vale 5.
```
---

## La instrucción `continue`

La instrucción continue salta la iteración actual
y pasa directamente a la siguiente.

**Ejemplo**

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

**Salida:**
```java
1
2
4
5
```

El valor 3 no se imprime.

---

## Diferencia entre `break` y `continue`

| `break`                   | `continue`                     |
| ------------------------- | ------------------------------ |
| Sale de la estructura     | Salta a la siguiente iteración |
| Finaliza el bucle         | El bucle continúa              |
| Se usa en bucles y switch | Solo en bucles                 |

---

## Anidación de estructuras de control

Las estructuras de control pueden estar dentro de otras.
Esto se conoce como anidación.

**Ejemplo:**
```java
for (int i = 1; i <= 3; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " es par");
    }
}
```

También es posible anidar bucles:
```java
for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

La anidación permite resolver problemas más complejos,
pero debe usarse con cuidado para no perder claridad.

---
## Errores comunes

- Olvidar actualizar la variable del bucle (bucle infinito)
- Confundir `=` con `==` en condiciones
- No usar `break` en switch
- Confundir `break` con continue
- Usar `if` cuando un `switch` es más claro (y viceversa)

---

## Buenas prácticas

- Usar llaves {} incluso si el bloque tiene una sola línea
- Mantener condiciones claras y simples
- Evitar anidar demasiadas estructuras
- Priorizar legibilidad sobre código compacto

---




