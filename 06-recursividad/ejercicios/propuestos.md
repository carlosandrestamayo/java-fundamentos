# 🧩 Ejercicios Propuestos - Recursividad en Java

---

## 🚀 Ejercicio 1: Invertir una cadena de texto

### 📌 Enunciado

Desarrolla un método recursivo que permita **invertir una cadena de texto**.

👉 Ejemplo:

Entrada:
```
"hola"
```

Salida:
```
"aloh"
```

---

## 🎯 Requisitos

1. Crear un método recursivo que:
   - Reciba una cadena (`String`)
   - Retorne la cadena invertida

2. No usar:
   - Ciclos (`for`, `while`)
   - Métodos predefinidos como `reverse()`

---

## 🧠 Pistas (muy importantes)

- Piensa en:
  - ¿Cuál sería el **caso base**?
  - ¿Cómo reducirías la cadena en cada llamada?

👉 Idea clave:
- Puedes tomar el primer carácter y moverlo al final

---

## 💡 Ejemplo conceptual

```
invertir("hola")

→ "a" + invertir("hol")
→ "a" + "l" + invertir("ho")
→ "a" + "l" + "o" + invertir("h")
→ "a" + "l" + "o" + "h"
```

---

## ⚠️ Restricciones

- No usar estructuras iterativas
- No usar librerías externas
- Solo recursividad pura

---

## 🧪 Casos de prueba sugeridos

- "java" → "avaj"
- "recursividad" → "dadivsrucer"
- "a" → "a"
- "" (cadena vacía) → ""

---

## 🧠 Lo que se evalúa

- Correcto uso del caso base
- Reducción del problema
- Manejo de cadenas
- Pensamiento recursivo

---

## 🔥 Reto adicional (nivel pro)

1. Modifica el método para que:
   - Ignore espacios

👉 Ejemplo:
```
"hola mundo" → "odnumaloh"
```

2. Nivel aún más alto:
   - Verifica si una cadena es palíndromo usando recursividad

---

## ✍️ Espacio para solución del estudiante

```java

```

---