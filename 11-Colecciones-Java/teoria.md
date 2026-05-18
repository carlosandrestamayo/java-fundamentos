# Colecciones en Java

# 📌 Introducción a las Colecciones: List, Set y Map

## 🎯 Objetivo de aprendizaje

Comprender el funcionamiento del framework de colecciones en Java mediante el uso de estructuras dinámicas como `List`, `Set` y `Map`, aplicando `ArrayList` y `HashMap` en el desarrollo de programas más flexibles, reutilizables y eficientes.

---

# 🧠 ¿Qué es una colección?

Una colección es una estructura que permite almacenar y manipular grupos de objetos dinámicamente.

👉 Las colecciones son utilizadas cuando necesitamos trabajar con múltiples datos de forma organizada y flexible.

---

# 🔥 Problema de los arreglos tradicionales

Antes del framework de colecciones, los programadores utilizaban arreglos (`arrays`) para almacenar datos.

## Ejemplo:

```java
String[] nombres = new String[3];
```

---

# ⚠️ Limitaciones de los arreglos

Los arreglos presentan varias limitaciones:

- Tamaño fijo.
- Difíciles de modificar.
- Inserciones limitadas.
- Eliminaciones complejas.
- Menor flexibilidad.

👉 Si el arreglo se llena, no puede crecer automáticamente.

---

# ✅ Solución: Java Collections Framework

Java proporciona un conjunto de clases e interfaces conocido como:

# Java Collections Framework

Este framework permite trabajar con estructuras dinámicas y reutilizables.

---

# 🎯 Ventajas de las colecciones

Las colecciones permiten:

- Almacenar datos dinámicamente.
- Buscar elementos fácilmente.
- Organizar información.
- Manipular grandes cantidades de datos.
- Reutilizar estructuras ya implementadas.
- Mejorar la productividad del programador.

---

# 🧩 Jerarquía básica de colecciones

```text
Collection
│
├── List
│     └── ArrayList
│
├── Set
│     └── HashSet
│
└── Map
      └── HashMap
```

---

# 📌 Interfaces y clases

## Interfaz

Una interfaz define un conjunto de comportamientos.

Ejemplo:
- `List`
- `Set`
- `Map`

---

## Clase

Una clase implementa el comportamiento definido por una interfaz.

Ejemplo:
- `ArrayList`
- `HashSet`
- `HashMap`

---

# 🔹 Interfaz List

## 📌 ¿Qué es List?

`List` es una colección ordenada que permite almacenar elementos repetidos.

---

# ✅ Características de List

- Mantiene el orden de inserción.
- Permite elementos duplicados.
- Permite acceder mediante índices.
- Muy utilizada en aplicaciones reales.

---

# ✅ Ejemplo conceptual

```text
[ Carlos, Ana, Pedro, Ana ]
```

👉 Se permiten elementos repetidos.

---

# 🔹 Interfaz Set

## 📌 ¿Qué es Set?

`Set` es una colección que almacena elementos únicos.

---

# ✅ Características de Set

- No permite duplicados.
- No garantiza orden.
- Ideal para validar datos únicos.

---

# ✅ Ejemplo conceptual

```text
[ Carlos, Ana, Pedro ]
```

👉 Si agregas nuevamente "Ana", no se repetirá.

---

# 🔹 Interfaz Map

## 📌 ¿Qué es Map?

`Map` almacena información utilizando pares:

```text
clave → valor
```

---

# ✅ Características de Map

- Usa claves y valores.
- No permite claves duplicadas.
- Permite búsquedas rápidas.
- Muy utilizado en sistemas reales.

---

# ✅ Ejemplo conceptual

```text
1 → Carlos
2 → Ana
3 → Pedro
```

---

# 🆚 Diferencia entre List, Set y Map

| Estructura | Duplicados | Índices | Clave-Valor |
|---|---|---|---|
| List | ✅ Sí | ✅ Sí | ❌ No |
| Set | ❌ No | ❌ No | ❌ No |
| Map | ❌ Claves repetidas | ❌ No | ✅ Sí |

---

# 🔥 ArrayList en Java

## 📌 ¿Qué es ArrayList?

`ArrayList` es una clase que implementa la interfaz `List`.

👉 Permite almacenar datos dinámicamente usando una estructura similar a un arreglo expandible.

---

# ✅ Importar ArrayList

```java
import java.util.ArrayList;
```

---

# 🔧 Crear un ArrayList

## Sintaxis

```java
ArrayList<TipoDato> nombreLista =
        new ArrayList<>();
```

---

# 🔍 Uso de genéricos

Los símbolos `< >` indican el tipo de dato que almacenará la colección.

## Ejemplo:

```java
ArrayList<String>
ArrayList<Integer>
ArrayList<Double>
```

---

# 🎯 Ventajas de usar genéricos

- Mayor seguridad.
- Evita errores de tipos.
- Código más limpio.
- Facilita mantenimiento.

---

# ✅ Ejemplo básico

```java
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> nombres =
                new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");

        System.out.println(nombres);

    }
}
```

---

# 🔹 Método add()

Permite agregar elementos.

## Ejemplo

```java
nombres.add("Laura");
```

---

# 🔹 Método get()

Permite obtener un elemento mediante índice.

## Ejemplo

```java
System.out.println(nombres.get(0));
```

---

# 🔹 Método set()

Permite modificar elementos.

## Ejemplo

```java
nombres.set(1, "María");
```

---

# 🔹 Método remove()

Permite eliminar elementos.

## Ejemplo

```java
nombres.remove(0);
```

---

# 🔹 Método size()

Retorna la cantidad de elementos.

## Ejemplo

```java
System.out.println(nombres.size());
```

---

# 🔹 Método contains()

Verifica si un elemento existe.

## Ejemplo

```java
System.out.println(
        nombres.contains("Ana"));
```

---

# 🔄 Recorrer un ArrayList

## Uso de foreach

```java
for(String nombre : nombres) {

    System.out.println(nombre);

}
```

---

# 🔥 HashMap en Java

## 📌 ¿Qué es HashMap?

`HashMap` es una clase que implementa la interfaz `Map`.

👉 Permite almacenar información mediante pares:

```text
clave → valor
```

---

# ✅ Importar HashMap

```java
import java.util.HashMap;
```

---

# 🔧 Crear un HashMap

## Sintaxis

```java
HashMap<TipoClave, TipoValor> nombre =
        new HashMap<>();
```

---

# ✅ Ejemplo básico

```java
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> estudiantes =
                new HashMap<>();

        estudiantes.put(1, "Carlos");
        estudiantes.put(2, "Ana");
        estudiantes.put(3, "Pedro");

        System.out.println(estudiantes);

    }
}
```

---

# 🔹 Método put()

Permite agregar elementos.

## Ejemplo

```java
estudiantes.put(4, "Laura");
```

---

# 🔹 Método get()

Permite obtener un valor mediante una clave.

## Ejemplo

```java
System.out.println(estudiantes.get(2));
```

---

# 🔹 Método remove()

Permite eliminar elementos.

## Ejemplo

```java
estudiantes.remove(1);
```

---

# 🔹 Método containsKey()

Verifica si existe una clave.

## Ejemplo

```java
System.out.println(
        estudiantes.containsKey(2));
```

---

# 🔹 Método containsValue()

Verifica si existe un valor.

## Ejemplo

```java
System.out.println(
        estudiantes.containsValue("Ana"));
```

---

# 🔹 Método keySet()

Permite obtener todas las claves.

---

# 🔄 Recorrer un HashMap

```java
for(Integer clave : estudiantes.keySet()) {

    System.out.println(
            clave + " -> " +
            estudiantes.get(clave));

}
```

---

# 🧠 ¿Cuándo usar ArrayList?

Usa `ArrayList` cuando:

- Necesites mantener orden.
- Quieras elementos repetidos.
- Requieras acceso rápido mediante índices.

---

# 🧠 ¿Cuándo usar HashMap?

Usa `HashMap` cuando:

- Necesites búsquedas rápidas.
- Manejes claves y valores.
- Quieras asociar información.

---

# 📊 Comparación: Array vs ArrayList

| Array | ArrayList |
|---|---|
| Tamaño fijo | Tamaño dinámico |
| Menos flexible | Más flexible |
| Sintaxis básica | Más métodos |
| Difícil de expandir | Crece automáticamente |

---

# 🎯 Buenas prácticas

## ✅ Usa genéricos

```java
ArrayList<String>
```

---

## ✅ Usa nombres descriptivos

```java
HashMap<Integer, String> estudiantes
```

---

## ✅ Elige la estructura correcta

Cada colección tiene un propósito diferente.

---

## ✅ Evita duplicar información

Especialmente en estructuras `Set`.

---

# 🧩 Ejemplo aplicado

# Sistema simple de estudiantes

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> estudiantes =
                new ArrayList<>();

        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");

        HashMap<String, Double> notas =
                new HashMap<>();

        notas.put("Carlos", 4.5);
        notas.put("Ana", 3.8);
        notas.put("Pedro", 4.9);

        for(String estudiante : estudiantes) {

            System.out.println(
                    estudiante + " -> " +
                    notas.get(estudiante));

        }

    }
}
```

---

# 💡 Idea clave final

Las colecciones son fundamentales en Java moderno porque permiten construir aplicaciones:

- Más dinámicas.
- Más organizadas.
- Más escalables.
- Más cercanas a sistemas reales.

👉 Dominar `ArrayList` y `HashMap` es esencial para desarrollar software profesional.

---

# 📝 Ejercicios propuestos

## Ejercicio 1

Crear un `ArrayList` con nombres de ciudades y mostrarlas usando `foreach`.

---

## Ejercicio 2

Crear un `HashMap` que almacene:
- Código del producto.
- Nombre del producto.

Luego:
- agregar,
- buscar,
- eliminar productos.

---

## Ejercicio 3

Diseñar un sistema que almacene:
- estudiantes,
- materias,
- notas.

Usando:
- `ArrayList`
- `HashMap`
