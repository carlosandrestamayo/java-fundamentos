# Ejercicios Propuestos - Colecciones en Java

# 📌 Introducción

Los siguientes ejercicios tienen como objetivo fortalecer el uso de colecciones en Java mediante la aplicación de:

- `List`
- `ArrayList`
- `Set`
- `Map`
- `HashMap`

👉 Los ejercicios están organizados de manera progresiva para desarrollar habilidades de análisis, manipulación y organización de datos.

---

# 🎯 Objetivos

- Comprender el uso de colecciones dinámicas.
- Aplicar `ArrayList` y `HashMap`.
- Manipular elementos en colecciones.
- Recorrer estructuras dinámicas.
- Resolver problemas usando colecciones.

---

# 🟢 Nivel Básico

# 🧩 Ejercicio 1
# Lista de frutas

## 📌 Problema

Crear un programa que:

1. Cree un `ArrayList` de frutas.
2. Agregue:
   - Manzana
   - Pera
   - Mango
   - Uva
3. Muestre todas las frutas usando `foreach`.

---

# 🎯 Conceptos reforzados

- `ArrayList`
- `add()`
- `foreach`

---

# 🧩 Ejercicio 2
# Cantidad de elementos

## 📌 Problema

Crear un `ArrayList` de nombres y mostrar:

- todos los elementos,
- y la cantidad total usando `size()`.

---

# 🎯 Conceptos reforzados

- `size()`
- almacenamiento dinámico

---

# 🧩 Ejercicio 3
# Buscar elemento

## 📌 Problema

Crear una lista de ciudades y verificar si la ciudad `"Bogotá"` existe usando:

```java
contains()
```

---

# 🎯 Conceptos reforzados

- búsqueda en colecciones
- `contains()`

---

# 🧩 Ejercicio 4
# Modificar elementos

## 📌 Problema

Crear una lista de colores y reemplazar:

```text
Azul
```

por:

```text
Verde
```

usando:

```java
set()
```

---

# 🎯 Conceptos reforzados

- modificación de datos
- índices

---

# 🧩 Ejercicio 5
# Eliminar elementos

## 📌 Problema

Crear un `ArrayList` de números y eliminar un elemento usando:

```java
remove()
```

---

# 🎯 Conceptos reforzados

- eliminación de datos
- manipulación de listas

---

# 🟡 Nivel Intermedio

# 🧩 Ejercicio 6
# Promedio de notas

## 📌 Problema

Crear un `ArrayList<Double>` con 5 notas.

Luego:

1. Mostrar todas las notas.
2. Calcular el promedio.
3. Mostrar el resultado final.

---

# 🎯 Conceptos reforzados

- recorridos
- acumuladores
- operaciones matemáticas

---

# 🧩 Ejercicio 7
# Lista de estudiantes

## 📌 Problema

Crear una lista de estudiantes y:

1. Agregar 5 estudiantes.
2. Mostrar el estudiante en la posición 2.
3. Mostrar el tamaño de la lista.
4. Recorrer todos los estudiantes.

---

# 🎯 Conceptos reforzados

- `get()`
- `size()`
- recorridos

---

# 🧩 Ejercicio 8
# Uso de HashMap

## 📌 Problema

Crear un `HashMap<Integer, String>` que almacene:

| Código | Producto |
|---|---|
| 1 | Teclado |
| 2 | Mouse |
| 3 | Monitor |

Luego:

- mostrar todos los productos,
- buscar el producto con código `2`.

---

# 🎯 Conceptos reforzados

- `put()`
- `get()`
- clave-valor

---

# 🧩 Ejercicio 9
# Agenda telefónica

## 📌 Problema

Crear una agenda usando:

```java
HashMap<String, String>
```

Donde:
- la clave será el nombre,
- y el valor será el teléfono.

Agregar al menos 4 contactos y mostrarlos.

---

# 🎯 Conceptos reforzados

- asociaciones clave-valor
- almacenamiento dinámico

---

# 🧩 Ejercicio 10
# Verificar claves

## 📌 Problema

Crear un `HashMap` de usuarios y verificar si existe el usuario:

```text
admin
```

usando:

```java
containsKey()
```

---

# 🎯 Conceptos reforzados

- búsqueda de claves
- validación de existencia

---

# 🟠 Nivel Avanzado

# 🧩 Ejercicio 11
# Sistema de notas

## 📌 Problema

Crear un sistema que almacene:

- nombre del estudiante,
- nota final.

Usar:

```java
HashMap<String, Double>
```

Luego:

1. Mostrar todas las notas.
2. Mostrar estudiantes aprobados.
3. Mostrar estudiantes reprobados.

---

# 🎯 Conceptos reforzados

- condiciones
- recorridos
- HashMap

---

# 🧩 Ejercicio 12
# Lista de números pares

## 📌 Problema

Crear un `ArrayList<Integer>` con números del 1 al 20.

Luego:
- mostrar únicamente los números pares.

---

# 🎯 Conceptos reforzados

- ciclos
- condicionales
- recorridos

---

# 🧩 Ejercicio 13
# Registro de productos

## 📌 Problema

Crear un sistema de productos usando:

```java
HashMap<Integer, String>
```

Permitir:
- agregar productos,
- modificar productos,
- eliminar productos,
- buscar productos.

---

# 🎯 Conceptos reforzados

- CRUD básico
- manipulación de colecciones

---

# 🧩 Ejercicio 14
# Lista sin duplicados

## 📌 Problema

Crear un `HashSet<String>` de nombres.

Agregar varios nombres repetidos y mostrar el resultado final.

👉 Analizar qué ocurre con los duplicados.

---

# 🎯 Conceptos reforzados

- `Set`
- elementos únicos

---

# 🔴 Desafíos

# 🧩 Desafío 1
# Sistema de inventario

## 📌 Problema

Diseñar un sistema que almacene:

- código del producto,
- nombre,
- precio.

Usando:

```java
HashMap<Integer, String>
```

y estructuras adicionales.

---

# 🧩 Desafío 2
# Sistema académico

## 📌 Problema

Crear un programa que:

- almacene estudiantes,
- almacene materias,
- almacene notas.

Usando:
- `ArrayList`
- `HashMap`

---

# 🧩 Desafío 3
# Menú interactivo

## 📌 Problema

Crear un menú que permita:

1. Agregar elementos.
2. Mostrar elementos.
3. Eliminar elementos.
4. Buscar elementos.

Usando colecciones dinámicas.

---

# 🎯 Buenas prácticas

## ✅ Usar genéricos

```java
ArrayList<String>
```

---

## ✅ Elegir la estructura correcta

| Situación | Estructura |
|---|---|
| Elementos ordenados | List |
| Elementos únicos | Set |
| Clave y valor | Map |

---

## ✅ Usar nombres descriptivos

```java
ArrayList<String> estudiantes
```

---

## ✅ Recorrer colecciones correctamente

Usar:
- `for`
- `foreach`

---

# 💡 Idea clave final

Las colecciones permiten construir programas:

- más dinámicos,
- más organizados,
- más escalables,
- y más cercanos al desarrollo profesional.

👉 El dominio de `ArrayList` y `HashMap` es fundamental en Java moderno.
