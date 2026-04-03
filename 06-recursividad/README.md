# 🔁 Recursividad en Java

Esta sección contiene material teórico, ejercicios resueltos y ejercicios propuestos sobre **recursividad**, uno de los conceptos fundamentales en programación y estructuras de datos.

---

## 📌 ¿Qué es la recursividad?

La recursividad es una técnica en la que un método se llama a sí mismo para resolver un problema dividiéndolo en subproblemas más pequeños.

👉 Es una forma de pensar algoritmos basada en:
- Caso base (condición de parada)
- Caso recursivo (reducción del problema)

---

## 🎯 Objetivos de aprendizaje

Al finalizar esta sección, el estudiante será capaz de:

- Comprender el concepto de recursividad
- Identificar y definir casos base
- Diseñar funciones recursivas correctamente
- Analizar el comportamiento de la pila de llamadas
- Resolver problemas clásicos usando recursividad
- Comparar recursividad vs iteración

---

## 🧠 Contenidos

### 🔹 Teoría
Archivo: `teoria.md`

Incluye:

- Definición de recursividad
- Estructura de funciones recursivas
- Ejemplos clásicos:
  - Factorial
  - Fibonacci
- Pila de llamadas (call stack)
- Ventajas y desventajas

---

### 🔹 Ejercicios resueltos
Archivo: `resueltos.md`

Contiene ejercicios explicados paso a paso:

- Factorial
- Suma de números
- Potencia
- Fibonacci
- Contar dígitos
- Invertir número

---

### 🔹 Ejercicios propuestos
Archivo: `propuestos.md`

Incluye ejercicios para desarrollar pensamiento lógico:

- Invertir una cadena de texto (recursivo)
- Retos adicionales:
  - Ignorar espacios
  - Verificar palíndromos

---

## 🧪 Ejemplo rápido

```java
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}
```

---

## ⚠️ Errores comunes

- No definir un caso base
- Caso base incorrecto
- No reducir el problema
- Recursión infinita → `StackOverflowError`

---

## 🆚 Recursividad vs Iteración

| Característica   | Recursividad         | Iteración           |
|-----------------|---------------------|---------------------|
| Legibilidad     | Alta                | Media               |
| Rendimiento     | Menor               | Mayor               |
| Uso de memoria  | Alto (pila)         | Bajo                |

---

## 💡 Recomendaciones

- Traza manualmente las llamadas
- Identifica primero el caso base
- Reduce el problema paso a paso
- No memorices, entiende el patrón

---

## 🚀 Aplicaciones reales

- Árboles y estructuras jerárquicas
- Algoritmos de búsqueda (DFS)
- Divide y vencerás
- Inteligencia artificial

---

## 📚 Próximos pasos

- Recursividad avanzada
- Backtracking
- Programación dinámica
- Árboles binarios

---

## 👨‍🏫 Autor

**Carlos Tamayo**  
Ingeniero de Sistemas | Especialista en IA | Magíster en Educación STEM  

---

## ⭐ Idea final

> Si puedes definir el problema en términos de sí mismo, puedes resolverlo con recursividad.

---