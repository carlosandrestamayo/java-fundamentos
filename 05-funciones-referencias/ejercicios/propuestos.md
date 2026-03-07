# Ejercicios Propuestos – Funciones en Java

Esta guía contiene 10 ejercicios diseñados para poner a prueba los conocimientos en **Variables, Operadores, Estructuras de Control, Arreglos y Métodos**.

---

## 🟢 Nivel: Básico (Variables y Métodos)

### 1. Conversor de Temperatura
Crea un método llamado `celsiusAFahrenheit(double celsius)` que reciba una temperatura en grados Celsius y devuelva su equivalente en Fahrenheit.
* **Fórmula:** $F = (C \times 9/5) + 32$
* **Retorno:** `double`

---

### 2. Calculadora de IVA
Escribe un método llamado `aplicarIVA(double precio)` que reciba el precio bruto de un producto y devuelva el precio final con un IVA del 21% incluido.
* **Retorno:** `double`

---

### 3. Validador de Paridad
Crea un método llamado `esPar(int numero)` que determine si un número es par o impar.
* **Retorno:** `boolean` (`true` si es par, `false` si es impar).

---

### 4. Clasificador de Notas
Crea un método `obtenerEscala(int nota)` que reciba un valor de 0 a 100 y devuelva un mensaje según el rango:
* 90 - 100: "Excelente"
* 70 - 89: "Bueno"
* 0 - 69: "Insuficiente"
* **Retorno:** `String`

---

### 5. Generador de Correos Institucionales
Escribe un método que reciba un nombre y un apellido (ej: "Juan", "Perez") y devuelva un correo en minúsculas con el formato: `j.perez@empresa.com`.
* **Pista:** Usa `substring`, `toLowerCase` y concatenación.
* **Retorno:** `String`

---

### 6. Simulador de Cajero Automático
Crea un método `puedeRetirar(int saldo, int monto)` que valide una transacción. Solo debe devolver `true` si:
1. El monto es múltiplo de 10 (usa el operador `%`).
2. El monto no supera el saldo disponible.
* **Retorno:** `boolean`

---

### 7. Buscador de Valor Máximo
Crea un método llamado `encontrarMayor(int[] numeros)` que recorra un arreglo de enteros y devuelva el número más grande encontrado en la lista.
* **Retorno:** `int`

---

### 8. Contador de Vocales
Escribe un método que reciba una cadena de texto y devuelva la cantidad de vocales (`a, e, i, o, u`) que contiene, sin importar si son mayúsculas o minúsculas.
* **Retorno:** `int`

---

### 9. Promedio de una Matriz
Crea un método que reciba una matriz bidimensional de enteros (`int[][] matriz`) y devuelva el promedio aritmético de todos los valores almacenados en ella.
* **Retorno:** `double`

---

### 10. Inversor de Arreglos
Escribe un método que reciba un arreglo de Strings y devuelva un **nuevo arreglo** con los mismos elementos pero en orden inverso.
* **Ejemplo:** `{"Java", "Python", "C"}` -> `{"C", "Python", "Java"}`
* **Retorno:** `String[]`

---

## 🚀 Instrucciones para el alumno
1. Todos los métodos deben ser declarados como `public static`.
2. Prueba cada método dentro del `main` enviando diferentes valores (casos de prueba).
3. Asegúrate de manejar los tipos de datos correctos en cada `return`.

---