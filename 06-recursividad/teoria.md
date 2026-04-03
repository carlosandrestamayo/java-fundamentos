# 🔁 Recursividad en Java

## 📌 ¿Qué es la recursividad?

La **recursividad** es una técnica de programación en la cual un método se llama a sí mismo para resolver un problema.

👉 En lugar de usar ciclos (`for`, `while`), el problema se divide en versiones más pequeñas de sí mismo.

---

## 🧠 Idea clave

> Un problema recursivo se resuelve reduciéndolo a un problema más pequeño del mismo tipo.

---

## 🧩 Estructura de una función recursiva

Toda función recursiva debe tener dos partes fundamentales:

### 1. Caso base (condición de parada)

Es la condición que detiene la recursión.

👉 Sin esto, el programa entra en un ciclo infinito.

---

### 2. Caso recursivo

Es donde la función se llama a sí misma con un problema más pequeño.

---

## 🔧 Estructura general

```java
tipo metodo(parametros) {
    if (condicion_base) {
        return valor;
    } else {
        return metodo(problema_mas_pequeno);
    }
}
```

---

## 📊 Ejemplo clásico: Factorial

### Definición matemática:

- 5! = 5 × 4 × 3 × 2 × 1
- 0! = 1

---

### Implementación:

```java
public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // caso base
        } else {
            return n * factorial(n - 1); // caso recursivo
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
```

---

## 🔍 ¿Cómo funciona internamente?

Llamada:

```
factorial(5)
= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)
= 5 * 4 * 3 * 2 * 1 * factorial(0)
= 5 * 4 * 3 * 2 * 1 * 1
= 120
```

---

## 📚 Concepto clave: Pila de llamadas (Call Stack)

Cada llamada recursiva se almacena en memoria en una estructura llamada **pila**.

👉 Cuando se alcanza el caso base:
- La pila comienza a resolverse en orden inverso.

---

## ⚠️ Errores comunes

### ❌ No definir caso base

Provoca:
- Recursión infinita
- Error: `StackOverflowError`

---

### ❌ Caso base incorrecto

Puede generar resultados erróneos.

---

### ❌ No reducir el problema

Si el problema no se hace más pequeño, nunca termina.

---

## 🆚 Recursividad vs Iteración

| Característica   | Recursividad         | Iteración           |
|-----------------|---------------------|---------------------|
| Uso             | Problemas complejos | Problemas simples   |
| Legibilidad     | Alta                | Media               |
| Rendimiento     | Menor (más memoria) | Mayor               |
| Control         | Implícito (pila)    | Explícito (ciclos)  |

---

## 🎯 ¿Cuándo usar recursividad?

Usa recursividad cuando:

- El problema se puede dividir en subproblemas similares
- Trabajas con estructuras como:
  - Árboles
  - Grafos
  - Búsquedas profundas (DFS)
- El código iterativo sería muy complejo

---

## 🧩 Ejemplo adicional: Suma de números

```java
public static int suma(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n + suma(n - 1);
    }
}
```

---

## 🚀 Ejemplo: Fibonacci

```java
public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```

---

## ⚠️ Nota importante sobre Fibonacci

Aunque es un ejemplo clásico:

- No es eficiente (muchas llamadas repetidas)
- Se recomienda usar:
  - Programación dinámica
  - Memoización

---

## 💡 Ventajas

- Código más limpio y elegante
- Ideal para problemas matemáticos
- Facilita el diseño de algoritmos complejos

---

## ⚠️ Desventajas

- Mayor consumo de memoria
- Puede ser más lento
- Riesgo de desbordamiento de pila

---

## 🧠 Idea clave final

> La recursividad no es solo una técnica, es una forma de pensar los problemas.

---

## 📝 Ejercicio propuesto

Crea un método recursivo que:

1. Calcule la potencia de un número:
   - `potencia(base, exponente)`
2. Ejemplo:
   - `potencia(2, 3) = 8`

---

## 🔥 Reto adicional

Implementa:

- Factorial sin recursividad (con ciclo)
- Compara ambos enfoques

---