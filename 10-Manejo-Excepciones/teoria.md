# Manejo de Excepciones en Java

## 📌 ¿Qué es una excepción?

Una **excepción** es un evento que ocurre durante la ejecución de un programa y que interrumpe el flujo normal del mismo.

👉 Las excepciones permiten detectar y manejar errores de forma controlada para evitar que el programa finalice inesperadamente.

---

## 🧠 Ejemplo conceptual

Imagina que un usuario intenta dividir un número entre cero.

Sin manejo de excepciones:
- El programa se detiene abruptamente.

Con manejo de excepciones:
- El programa detecta el error.
- Muestra un mensaje amigable.
- Continúa ejecutándose correctamente.

---

# 🔥 ¿Por qué son importantes las excepciones?

El manejo de excepciones permite:

- Evitar que el programa se bloquee.
- Detectar errores en tiempo de ejecución.
- Mejorar la experiencia del usuario.
- Crear aplicaciones más robustas.
- Facilitar el mantenimiento del software.

---

# ⚠️ Tipos de errores en Java

## 1. Errores de compilación

Son errores detectados antes de ejecutar el programa.

### Ejemplo:

```java
System.out.println("Hola")
```

❌ Falta el punto y coma `;`

---

## 2. Errores lógicos

El programa funciona, pero produce resultados incorrectos.

### Ejemplo:

```java
int resultado = 10 - 5; // Se quería multiplicar
```

---

## 3. Excepciones (Runtime Errors)

Ocurren durante la ejecución del programa.

### Ejemplo:

```java
int resultado = 10 / 0;
```

❌ División por cero.

---

# 🔧 Bloque try-catch

Se utiliza para capturar y manejar excepciones.

## Sintaxis

```java
try {
    // código que puede generar excepción
} catch (TipoExcepcion e) {
    // manejo del error
}
```

---

# ✅ Ejemplo básico

```java
public class Main {

    public static void main(String[] args) {

        try {

            int resultado = 10 / 0;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: no se puede dividir entre cero");

        }

    }
}
```

---

# 🔹 Bloque finally

El bloque `finally` siempre se ejecuta, ocurra o no una excepción.

## Ejemplo

```java
public class Main {

    public static void main(String[] args) {

        try {

            int resultado = 10 / 2;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error");

        } finally {

            System.out.println("Bloque finally ejecutado");

        }

    }
}
```

---

# 🔹 Uso de throw

La palabra clave `throw` permite lanzar excepciones manualmente.

## Ejemplo

```java
public class Main {

    public static void main(String[] args) {

        int edad = -5;

        if (edad < 0) {

            throw new ArithmeticException("La edad no puede ser negativa");

        }

    }
}
```

---

# 🔹 Uso de throws

La palabra clave `throws` indica que un método puede generar excepciones.

## Ejemplo

```java
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void leerArchivo() throws IOException {

        FileReader archivo = new FileReader("datos.txt");

    }

    public static void main(String[] args) {

        try {

            leerArchivo();

        } catch (IOException e) {

            System.out.println("Error al leer archivo");

        }

    }
}
```

---

# 🔹 Excepciones personalizadas

Java permite crear excepciones propias.

## Ejemplo

```java
class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {

        super(mensaje);

    }

}
```

---

# 🧩 Excepciones más comunes en Java

| Excepción | Descripción |
|---|---|
| ArithmeticException | Error matemático |
| NullPointerException | Referencia nula |
| ArrayIndexOutOfBoundsException | Índice inválido |
| NumberFormatException | Conversión incorrecta |
| IOException | Error de entrada/salida |

---

# 🎯 Buenas prácticas

- Captura solo excepciones necesarias.
- Usa mensajes claros.
- No ignores excepciones.
- Usa excepciones personalizadas.
- Usa finally para liberar recursos.

---

# 💡 Idea clave final

El manejo de excepciones permite construir programas:

- Más seguros.
- Más robustos.
- Más profesionales.
- Más fáciles de mantener.

👉 Un buen manejo de errores es esencial en aplicaciones reales.

---

# 📝 Ejercicio propuesto

Diseña un programa que:

1. Solicite dos números al usuario.
2. Realice una división.
3. Maneje:
   - División por cero.
   - Entrada inválida.
4. Cree una excepción personalizada llamada:
   - `NumeroNegativoException`

👉 Luego muestra mensajes adecuados para cada caso.
