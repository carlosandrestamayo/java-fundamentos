# 🧩 Ejercicios Resueltos - Recursividad en Java

Este documento contiene ejercicios resueltos paso a paso para comprender la recursividad en Java.

---

## ✅ Ejercicio 1: Factorial

### 📌 Enunciado

Calcular el factorial de un número entero positivo `n`.

👉 Ejemplo:  
5! = 120

---

### ✅ Solución

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

### 🔍 Explicación

- Caso base: `n == 0`
- Caso recursivo: `n * factorial(n - 1)`
- El problema se reduce hasta llegar a 0

---

## ✅ Ejercicio 2: Suma de números

### 📌 Enunciado

Calcular la suma de los primeros `n` números naturales.

👉 Ejemplo:  
suma(5) = 1 + 2 + 3 + 4 + 5 = 15

---

### ✅ Solución

```java
public class Suma {

    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(suma(5));
    }
}
```

---

### 🔍 Explicación

- Caso base: `n == 0`
- Caso recursivo: suma acumulativa

---

## ✅ Ejercicio 3: Potencia

### 📌 Enunciado

Calcular la potencia de un número usando recursividad.

👉 Ejemplo:  
potencia(2, 3) = 8

---

### ✅ Solución

```java
public class Potencia {

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 3));
    }
}
```

---

### 🔍 Explicación

- Caso base: cualquier número elevado a 0 es 1
- Caso recursivo: multiplicación repetida

---

## ✅ Ejercicio 4: Fibonacci

### 📌 Enunciado

Calcular el término `n` de la serie de Fibonacci.

👉 Ejemplo:
0, 1, 1, 2, 3, 5, 8...

---

### ✅ Solución

```java
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n; // casos base
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
```

---

### 🔍 Explicación

- Caso base: `n == 0` o `n == 1`
- Cada valor depende de los dos anteriores

---

## ⚠️ Nota importante

Este método no es eficiente debido a llamadas repetidas.

---

## ✅ Ejercicio 5: Contar dígitos

### 📌 Enunciado

Contar cuántos dígitos tiene un número entero positivo.

👉 Ejemplo:  
12345 → 5 dígitos

---

### ✅ Solución

```java
public class ContarDigitos {

    public static int contar(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + contar(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(contar(12345));
    }
}
```

---

### 🔍 Explicación

- Se divide el número entre 10 en cada llamada
- Se cuenta hasta llegar a un solo dígito

---

## ✅ Ejercicio 6: Invertir número

### 📌 Enunciado

Invertir un número entero.

👉 Ejemplo:  
123 → 321

---

### ✅ Solución

```java
public class InvertirNumero {

    public static int invertir(int n, int resultado) {
        if (n == 0) {
            return resultado;
        } else {
            return invertir(n / 10, resultado * 10 + n % 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(invertir(123, 0));
    }
}
```

---

### 🔍 Explicación

- Se extrae el último dígito con `% 10`
- Se construye el número invertido progresivamente

---

## 🧠 Conclusión

Estos ejercicios muestran cómo:

- Dividir problemas en subproblemas
- Aplicar casos base correctamente
- Pensar de forma recursiva

---

## 🚀 Reto final

Implementa un método recursivo que:

- Verifique si un número es palíndromo  
👉 Ejemplo: 121 → verdadero

---