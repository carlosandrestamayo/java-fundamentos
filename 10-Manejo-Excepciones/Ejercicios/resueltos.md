# Ejercicios Resueltos - Manejo de Excepciones en Java

# 📌 Introducción

Los siguientes ejercicios tienen como objetivo reforzar el manejo de excepciones en Java utilizando únicamente conceptos vistos hasta este punto del curso.

👉 Importante:
En estos ejercicios NO se utilizan:
- Colecciones
- Archivos
- Programación genérica

---

# 🎯 Objetivos

- Comprender el uso de `try-catch`.
- Manejar errores comunes.
- Utilizar `finally`.
- Aplicar `throw` y `throws`.
- Crear excepciones personalizadas.

---

# 🧩 Ejercicio 1
# División entre cero

## 📌 Problema

Crear un programa que divida dos números y controle el error de división entre cero.

---

# ✅ Solución

```java
public class Main {

    public static void main(String[] args) {

        try {

            int numero1 = 10;
            int numero2 = 0;

            int resultado = numero1 / numero2;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: no se puede dividir entre cero");

        }

    }
}
```

---

# 🔍 Explicación

## Paso 1
El bloque `try` contiene el código que puede generar una excepción.

---

## Paso 2
La división:

```java
numero1 / numero2
```

produce una excepción porque no se puede dividir entre cero.

---

## Paso 3
El bloque `catch` captura el error y evita que el programa finalice abruptamente.

---

# 📌 Resultado esperado

```text
Error: no se puede dividir entre cero
```

---

# 🧩 Ejercicio 2
# Acceso inválido a un arreglo

## 📌 Problema

Crear un programa que intente acceder a una posición inválida de un arreglo.

---

# ✅ Solución

```java
public class Main {

    public static void main(String[] args) {

        try {

            int[] numeros = {10, 20, 30};

            System.out.println(numeros[5]);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: índice fuera de rango");

        }

    }
}
```

---

# 🔍 Explicación

## `ArrayIndexOutOfBoundsException`

Ocurre cuando se intenta acceder a una posición inexistente del arreglo.

---

# 📌 Resultado esperado

```text
Error: índice fuera de rango
```

---

# 🧩 Ejercicio 3
# Uso de finally

## 📌 Problema

Crear un programa que muestre el funcionamiento del bloque `finally`.

---

# ✅ Solución

```java
public class Main {

    public static void main(String[] args) {

        try {

            int resultado = 10 / 2;

            System.out.println(resultado);

        } catch(ArithmeticException e) {

            System.out.println("Error matemático");

        } finally {

            System.out.println(
                    "Bloque finally ejecutado");

        }

    }
}
```

---

# 🔍 Explicación

## `finally`

El bloque `finally` siempre se ejecuta:
- exista o no una excepción.

---

# 📌 Resultado esperado

```text
5
Bloque finally ejecutado
```

---

# 🧩 Ejercicio 4
# Uso de throw

## 📌 Problema

Crear un programa que valide una edad y genere una excepción manualmente si la edad es negativa.

---

# ✅ Solución

```java
public class Main {

    public static void main(String[] args) {

        int edad = -10;

        if(edad < 0) {

            throw new ArithmeticException(
                    "La edad no puede ser negativa");

        }

        System.out.println("Edad válida");

    }
}
```

---

# 🔍 Explicación

## `throw`

La palabra clave `throw` permite lanzar excepciones manualmente.

---

# 📌 Resultado esperado

```text
Exception in thread "main"
java.lang.ArithmeticException:
La edad no puede ser negativa
```

---

# 🧩 Ejercicio 5
# Uso de throws

## 📌 Problema

Crear un método que pueda generar una excepción y utilizar `throws`.

---

# ✅ Solución

```java
public class Main {

    public static void validarNumero(int numero)
            throws Exception {

        if(numero < 0) {

            throw new Exception(
                    "Número negativo no permitido");

        }

    }

    public static void main(String[] args) {

        try {

            validarNumero(-5);

        } catch(Exception e) {

            System.out.println(
                    e.getMessage());

        }

    }
}
```

---

# 🔍 Explicación

## `throws`

Indica que un método puede generar excepciones.

---

## `getMessage()`

Obtiene el mensaje asociado al error.

---

# 📌 Resultado esperado

```text
Número negativo no permitido
```

---

# 🧩 Ejercicio 6
# NullPointerException

## 📌 Problema

Crear un programa que genere una excepción por referencia nula.

---

# ✅ Solución

```java
public class Main {

    public static void main(String[] args) {

        try {

            String texto = null;

            System.out.println(
                    texto.length());

        } catch(NullPointerException e) {

            System.out.println(
                    "Error: referencia nula");

        }

    }
}
```

---

# 🔍 Explicación

## `NullPointerException`

Ocurre cuando una variable no apunta a ningún objeto.

---

# 📌 Resultado esperado

```text
Error: referencia nula
```

---

# 🧩 Ejercicio 7
# Excepción personalizada

## 📌 Problema

Crear una excepción personalizada para validar notas.

---

# ✅ Solución

```java
class NotaInvalidaException
        extends Exception {

    public NotaInvalidaException(
            String mensaje) {

        super(mensaje);

    }

}

public class Main {

    public static void validarNota(double nota)
            throws NotaInvalidaException {

        if(nota < 0 || nota > 5) {

            throw new NotaInvalidaException(
                    "La nota debe estar entre 0 y 5");

        }

    }

    public static void main(String[] args) {

        try {

            validarNota(8);

        } catch(NotaInvalidaException e) {

            System.out.println(
                    e.getMessage());

        }

    }
}
```

---

# 🔍 Explicación

## Excepción personalizada

Permite representar errores específicos de la aplicación.

---

## `extends Exception`

Indica que la clase es una excepción.

---

# 📌 Resultado esperado

```text
La nota debe estar entre 0 y 5
```

---

# 🧩 Ejercicio 8
# Conversión incorrecta de números

## 📌 Problema

Controlar el error al convertir texto en número.

---

# ✅ Solución

```java
public class Main {

    public static void main(String[] args) {

        try {

            int numero =
                    Integer.parseInt("Hola");

            System.out.println(numero);

        } catch(NumberFormatException e) {

            System.out.println(
                    "Error: formato inválido");

        }

    }
}
```

---

# 🔍 Explicación

## `NumberFormatException`

Ocurre cuando se intenta convertir texto inválido a número.

---

# 📌 Resultado esperado

```text
Error: formato inválido
```

---

# 🎯 Buenas prácticas aprendidas

## ✅ Capturar excepciones específicas

Evita usar:

```java
catch(Exception e)
```

cuando no sea necesario.

---

## ✅ Mostrar mensajes claros

Facilita depuración y comprensión.

---

## ✅ Usar finally para liberar recursos

Importante en aplicaciones reales.

---

## ✅ Validar datos antes de procesarlos

Reduce errores.

---

# 💡 Idea clave final

El manejo de excepciones permite desarrollar programas:

- Más seguros.
- Más robustos.
- Más profesionales.
- Más fáciles de mantener.

👉 Un buen programador no solo escribe código que funciona, sino código capaz de manejar errores correctamente.
