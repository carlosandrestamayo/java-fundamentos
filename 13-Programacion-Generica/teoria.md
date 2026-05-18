# Programación Genérica en Java

# 📌 Introducción a los Genéricos en Java

## 🎯 Objetivo de aprendizaje

Comprender el concepto de programación genérica en Java mediante el uso de genéricos en clases y métodos para desarrollar código reutilizable, flexible y seguro.

---

# 🧠 ¿Qué es la programación genérica?

La programación genérica permite crear clases, métodos y estructuras capaces de trabajar con diferentes tipos de datos sin duplicar código.

👉 Los genéricos permiten escribir código más reutilizable y más seguro.

---

# 🔥 Problema sin genéricos

Antes de los genéricos, los programadores debían trabajar con tipos muy generales como `Object`.

Esto generaba:

- Conversión manual de tipos.
- Mayor posibilidad de errores.
- Código menos claro.
- Problemas en tiempo de ejecución.

---

# ⚠️ Ejemplo sin genéricos

```java
public class Caja {

    private Object dato;

    public void guardar(Object dato) {

        this.dato = dato;

    }

    public Object obtener() {

        return dato;

    }

}
```

---

# ❌ Problema

```java
Caja caja = new Caja();

caja.guardar("Hola");

String texto = (String) caja.obtener();
```

👉 Es necesario realizar casting.

👉 Si el tipo es incorrecto, ocurrirá un error en tiempo de ejecución.

---

# ✅ Solución: Genéricos

Los genéricos permiten indicar el tipo de dato que manejará una clase o método.

---

# 🔧 Sintaxis básica

```java
<T>
```

---

# 📌 ¿Qué significa T?

La letra `T` representa un tipo de dato genérico.

👉 Puede reemplazarse por cualquier tipo:

- String
- Integer
- Double
- Usuario
- Cliente
- etc.

---

# 🧠 Letras comunes en genéricos

| Letra | Significado |
|---|---|
| T | Type |
| E | Element |
| K | Key |
| V | Value |
| N | Number |

---

# 🔥 Ventajas de los genéricos

Los genéricos permiten:

- Reutilizar código.
- Evitar duplicación.
- Mejorar seguridad de tipos.
- Reducir errores.
- Facilitar mantenimiento.
- Crear estructuras flexibles.

---

# 📌 Seguridad de tipos

Los genéricos ayudan al compilador a detectar errores antes de ejecutar el programa.

---

# ❌ Ejemplo incorrecto

```java
ArrayList lista = new ArrayList();

lista.add("Hola");
lista.add(10);
```

👉 La lista mezcla tipos diferentes.

---

# ✅ Ejemplo correcto

```java
ArrayList<String> lista =
        new ArrayList<>();
```

👉 Solo se permiten cadenas de texto.

---

# 🔥 Genéricos en colecciones

Las colecciones utilizan ampliamente genéricos.

---

# ✅ Ejemplo

```java
ArrayList<String> nombres =
        new ArrayList<>();
```

---

# 🔍 Explicación

## `<String>`

Indica que la colección almacenará únicamente cadenas de texto.

---

# 🔥 Clases genéricas

# 📌 ¿Qué es una clase genérica?

Una clase genérica es una clase que puede trabajar con diferentes tipos de datos.

---

# 🔧 Sintaxis

```java
class Nombre<T> {

}
```

---

# ✅ Ejemplo básico

```java
public class Caja<T> {

    private T dato;

    public void guardar(T dato) {

        this.dato = dato;

    }

    public T obtener() {

        return dato;

    }

}
```

---

# 🔍 Explicación

## `T dato`

El atributo puede almacenar cualquier tipo.

---

## `guardar(T dato)`

Permite almacenar el tipo especificado.

---

## `obtener()`

Retorna el mismo tipo genérico.

---

# 🔥 Uso de una clase genérica

---

# ✅ Ejemplo con String

```java
Caja<String> cajaTexto =
        new Caja<>();

cajaTexto.guardar("Hola Java");

String texto =
        cajaTexto.obtener();

System.out.println(texto);
```

---

# ✅ Ejemplo con Integer

```java
Caja<Integer> cajaNumero =
        new Caja<>();

cajaNumero.guardar(100);

Integer numero =
        cajaNumero.obtener();

System.out.println(numero);
```

---

# 🧠 Ventaja principal

La misma clase puede reutilizarse para múltiples tipos de datos.

---

# 🔥 Múltiples tipos genéricos

Una clase puede manejar más de un tipo genérico.

---

# 🔧 Sintaxis

```java
class Nombre<K, V> {

}
```

---

# ✅ Ejemplo

```java
public class Par<K, V> {

    private K clave;
    private V valor;

    public Par(K clave, V valor) {

        this.clave = clave;
        this.valor = valor;

    }

    public K getClave() {

        return clave;

    }

    public V getValor() {

        return valor;

    }

}
```

---

# ✅ Uso

```java
Par<Integer, String> estudiante =
        new Par<>(1, "Carlos");

System.out.println(
        estudiante.getClave());

System.out.println(
        estudiante.getValor());
```

---

# 🔥 Métodos genéricos

# 📌 ¿Qué es un método genérico?

Un método genérico es un método capaz de trabajar con diferentes tipos de datos independientemente de la clase.

---

# 🔧 Sintaxis

```java
public <T> void metodo(T dato) {

}
```

---

# ✅ Ejemplo básico

```java
public class Utilidades {

    public static <T> void mostrar(T dato) {

        System.out.println(dato);

    }

}
```

---

# ✅ Uso del método genérico

```java
Utilidades.mostrar("Hola");

Utilidades.mostrar(100);

Utilidades.mostrar(4.5);
```

---

# 🔍 Explicación

El método puede trabajar con:
- String
- Integer
- Double
- cualquier objeto.

---

# 🔥 Métodos genéricos con arreglos

---

# ✅ Ejemplo

```java
public class Utilidades {

    public static <T> void imprimirArreglo(
            T[] arreglo) {

        for(T elemento : arreglo) {

            System.out.println(elemento);

        }

    }

}
```

---

# ✅ Uso

```java
String[] nombres =
        {"Carlos", "Ana"};

Integer[] numeros =
        {10, 20, 30};

Utilidades.imprimirArreglo(nombres);

Utilidades.imprimirArreglo(numeros);
```

---

# 🔥 Restricciones de genéricos

Los genéricos tienen algunas limitaciones.

---

# ⚠️ No funcionan con tipos primitivos

❌ Incorrecto

```java
Caja<int> caja;
```

---

# ✅ Correcto

```java
Caja<Integer> caja;
```

---

# 📌 Wrapper Classes

Los tipos primitivos tienen clases envoltorio:

| Primitivo | Wrapper |
|---|---|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# 🔥 Restricciones con objetos

Los genéricos funcionan únicamente con objetos.

---

# 🔥 Bounded Types

# 📌 ¿Qué son?

Permiten limitar el tipo genérico a ciertas clases.

---

# 🔧 Sintaxis

```java
<T extends Clase>
```

---

# ✅ Ejemplo

```java
public class Calculadora<T extends Number> {

    private T numero;

    public Calculadora(T numero) {

        this.numero = numero;

    }

    public double obtenerDouble() {

        return numero.doubleValue();

    }

}
```

---

# 🔍 Explicación

`T extends Number`

👉 Solo permite:
- Integer
- Double
- Float
- Long
- etc.

---

# 🔥 Genéricos y herencia

Los genéricos también pueden combinarse con herencia.

---

# ✅ Ejemplo

```java
class Animal {

}

class Perro extends Animal {

}

class Caja<T extends Animal> {

}
```

---

# 🔥 Uso de diamond operator

Desde Java 7:

```java
<>
```

---

# ✅ Ejemplo

```java
ArrayList<String> nombres =
        new ArrayList<>();
```

👉 Java infiere automáticamente el tipo.

---

# 📊 Comparación: Código sin genéricos vs con genéricos

| Sin genéricos | Con genéricos |
|---|---|
| Requiere casting | No requiere casting |
| Más errores | Más seguro |
| Menos reutilizable | Más reutilizable |
| Código menos claro | Código más limpio |

---

# 🎯 Buenas prácticas

## ✅ Usa nombres genéricos estándar

- T
- E
- K
- V

---

## ✅ Usa genéricos en colecciones

```java
ArrayList<String>
```

---

## ✅ Evita mezclar tipos

Mantiene el código seguro.

---

## ✅ Aprovecha reutilización

Los genéricos reducen duplicación.

---

# 🧩 Ejemplo aplicado

# Sistema genérico de almacenamiento

```java
public class Almacen<T> {

    private T elemento;

    public void guardar(T elemento) {

        this.elemento = elemento;

    }

    public T obtener() {

        return elemento;

    }

}
```

---

# ✅ Uso

```java
Almacen<String> mensaje =
        new Almacen<>();

mensaje.guardar("Hola");

System.out.println(
        mensaje.obtener());

Almacen<Integer> numero =
        new Almacen<>();

numero.guardar(100);

System.out.println(
        numero.obtener());
```

---

# 💡 Idea clave final

La programación genérica permite desarrollar aplicaciones:

- Más reutilizables.
- Más seguras.
- Más flexibles.
- Más profesionales.

👉 Los genéricos son fundamentales en el desarrollo moderno con Java y son ampliamente utilizados en colecciones, frameworks y bibliotecas profesionales.

---

# 📝 Ejercicios propuestos

## Ejercicio 1

Crear una clase genérica llamada `Caja<T>` que almacene cualquier tipo de dato.

---

## Ejercicio 2

Crear un método genérico que imprima arreglos de diferentes tipos.

---

## Ejercicio 3

Diseñar una clase genérica llamada `Par<K, V>` que almacene:
- una clave,
- y un valor.

---

## Ejercicio 4

Crear una clase genérica restringida que solo acepte números usando:

```java
<T extends Number>
```
