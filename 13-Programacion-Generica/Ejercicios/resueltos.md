# Ejercicios Resueltos - Programación Genérica en Java

# 📌 Introducción

Los siguientes ejercicios tienen como objetivo reforzar el uso de programación genérica en Java mediante clases y métodos reutilizables.

👉 En estos ejercicios se integran conceptos vistos anteriormente en el curso:

- Variables
- Métodos
- Arreglos
- Programación Orientada a Objetos
- Herencia
- Manejo de excepciones

---

# 🎯 Objetivos

- Comprender el uso de genéricos.
- Crear clases genéricas.
- Implementar métodos genéricos.
- Reutilizar código.
- Aplicar restricciones genéricas.
- Integrar POO y genéricos.

---

# 🧩 Ejercicio 1
# Caja genérica simple

## 📌 Problema

Crear una clase genérica capaz de almacenar cualquier tipo de dato.

---

# ✅ Solución

```java
class Caja<T> {

    private T dato;

    public void guardar(T dato) {

        this.dato = dato;

    }

    public T obtener() {

        return dato;

    }

}

public class Main {

    public static void main(String[] args) {

        Caja<String> cajaTexto =
                new Caja<>();

        cajaTexto.guardar("Hola Java");

        System.out.println(
                cajaTexto.obtener());

    }
}
```

---

# 🔍 Explicación

## `<T>`

Representa un tipo genérico.

---

## `Caja<String>`

La caja almacenará únicamente cadenas.

---

# 📌 Resultado esperado

```text
Hola Java
```

---

# 🧩 Ejercicio 2
# Caja genérica con números

## 📌 Problema

Utilizar la misma clase genérica para almacenar números enteros.

---

# ✅ Solución

```java
class Caja<T> {

    private T dato;

    public void guardar(T dato) {

        this.dato = dato;

    }

    public T obtener() {

        return dato;

    }

}

public class Main {

    public static void main(String[] args) {

        Caja<Integer> cajaNumero =
                new Caja<>();

        cajaNumero.guardar(100);

        System.out.println(
                cajaNumero.obtener());

    }
}
```

---

# 🔍 Explicación

La misma clase puede reutilizarse para distintos tipos de datos.

---

# 📌 Resultado esperado

```text
100
```

---

# 🧩 Ejercicio 3
# Clase genérica con objetos

## 📌 Problema

Crear una clase `Producto` y almacenarla en una caja genérica.

---

# ✅ Solución

```java
class Producto {

    String nombre;
    double precio;

    public Producto(
            String nombre,
            double precio) {

        this.nombre = nombre;
        this.precio = precio;

    }

}

class Caja<T> {

    private T dato;

    public void guardar(T dato) {

        this.dato = dato;

    }

    public T obtener() {

        return dato;

    }

}

public class Main {

    public static void main(String[] args) {

        Producto producto =
                new Producto(
                        "Teclado",
                        120.5);

        Caja<Producto> caja =
                new Caja<>();

        caja.guardar(producto);

        System.out.println(
                caja.obtener().nombre);

    }
}
```

---

# 🔍 Explicación

## Integración con POO

El genérico puede almacenar objetos personalizados.

---

# 📌 Resultado esperado

```text
Teclado
```

---

# 🧩 Ejercicio 4
# Método genérico simple

## 📌 Problema

Crear un método genérico que muestre cualquier tipo de dato.

---

# ✅ Solución

```java
class Utilidades {

    public static <T> void mostrar(T dato) {

        System.out.println(dato);

    }

}

public class Main {

    public static void main(String[] args) {

        Utilidades.mostrar("Hola");

        Utilidades.mostrar(100);

        Utilidades.mostrar(4.5);

    }
}
```

---

# 🔍 Explicación

## Método genérico

El método puede trabajar con:
- String,
- Integer,
- Double,
- cualquier objeto.

---

# 📌 Resultado esperado

```text
Hola
100
4.5
```

---

# 🧩 Ejercicio 5
# Método genérico para arreglos

## 📌 Problema

Crear un método capaz de imprimir arreglos de diferentes tipos.

---

# ✅ Solución

```java
class Utilidades {

    public static <T> void imprimirArreglo(
            T[] arreglo) {

        for(T elemento : arreglo) {

            System.out.println(elemento);

        }

    }

}

public class Main {

    public static void main(String[] args) {

        String[] nombres =
                {"Carlos", "Ana"};

        Integer[] numeros =
                {10, 20, 30};

        Utilidades.imprimirArreglo(
                nombres);

        Utilidades.imprimirArreglo(
                numeros);

    }
}
```

---

# 🔍 Explicación

El método reutiliza el mismo código para distintos arreglos.

---

# 📌 Resultado esperado

```text
Carlos
Ana
10
20
30
```

---

# 🧩 Ejercicio 6
# Clase genérica con dos tipos

## 📌 Problema

Crear una clase genérica que almacene:
- una clave,
- y un valor.

---

# ✅ Solución

```java
class Par<K, V> {

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

public class Main {

    public static void main(String[] args) {

        Par<Integer, String> estudiante =
                new Par<>(1, "Carlos");

        System.out.println(
                estudiante.getClave());

        System.out.println(
                estudiante.getValor());

    }
}
```

---

# 🔍 Explicación

## `<K, V>`

Permite trabajar con dos tipos diferentes.

---

# 📌 Resultado esperado

```text
1
Carlos
```

---

# 🧩 Ejercicio 7
# Restricción genérica

## 📌 Problema

Crear una clase que solo acepte números.

---

# ✅ Solución

```java
class Calculadora<T extends Number> {

    private T numero;

    public Calculadora(T numero) {

        this.numero = numero;

    }

    public double obtenerDouble() {

        return numero.doubleValue();

    }

}

public class Main {

    public static void main(String[] args) {

        Calculadora<Integer> calc =
                new Calculadora<>(100);

        System.out.println(
                calc.obtenerDouble());

    }
}
```

---

# 🔍 Explicación

## `T extends Number`

Limita el tipo genérico a:
- Integer,
- Double,
- Float,
- Long,
- etc.

---

# 📌 Resultado esperado

```text
100.0
```

---

# 🧩 Ejercicio 8
# Genéricos y herencia

## 📌 Problema

Crear una clase genérica que solo acepte objetos de tipo `Animal`.

---

# ✅ Solución

```java
class Animal {

    String nombre;

}

class Perro extends Animal {

}

class Caja<T extends Animal> {

    private T animal;

    public void guardar(T animal) {

        this.animal = animal;

    }

    public T obtener() {

        return animal;

    }

}

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro();

        perro.nombre = "Firulais";

        Caja<Perro> caja =
                new Caja<>();

        caja.guardar(perro);

        System.out.println(
                caja.obtener().nombre);

    }
}
```

---

# 🔍 Explicación

El genérico acepta únicamente:
- Animal,
- o clases hijas.

---

# 📌 Resultado esperado

```text
Firulais
```

---

# 🧩 Ejercicio 9
# Sistema genérico de almacenamiento

## 📌 Problema

Crear una clase reutilizable para almacenar cualquier objeto.

---

# ✅ Solución

```java
class Almacen<T> {

    private T elemento;

    public void guardar(T elemento) {

        this.elemento = elemento;

    }

    public T obtener() {

        return elemento;

    }

}

class Usuario {

    String nombre;

    public Usuario(String nombre) {

        this.nombre = nombre;

    }

}

public class Main {

    public static void main(String[] args) {

        Usuario usuario =
                new Usuario("Carlos");

        Almacen<Usuario> almacen =
                new Almacen<>();

        almacen.guardar(usuario);

        System.out.println(
                almacen.obtener().nombre);

    }
}
```

---

# 🔍 Explicación

El sistema puede reutilizarse para:
- usuarios,
- productos,
- clientes,
- empleados,
- etc.

---

# 📌 Resultado esperado

```text
Carlos
```

---

# 🧩 Ejercicio 10
# Método genérico con validación

## 📌 Problema

Crear un método genérico que muestre un dato y valide valores nulos.

---

# ✅ Solución

```java
class Utilidades {

    public static <T> void mostrar(T dato) {

        if(dato == null) {

            System.out.println(
                    "Dato nulo");

            return;

        }

        System.out.println(dato);

    }

}

public class Main {

    public static void main(String[] args) {

        Utilidades.mostrar("Hola");

        Utilidades.mostrar(null);

    }
}
```

---

# 🔍 Explicación

## Integración con manejo de excepciones y validación

El método controla valores inválidos.

---

# 📌 Resultado esperado

```text
Hola
Dato nulo
```

---

# 🎯 Buenas prácticas aprendidas

## ✅ Usar genéricos para reutilización

Evita duplicar código.

---

## ✅ Usar nombres estándar

- T
- K
- V
- E

---

## ✅ Aprovechar restricciones

```java
<T extends Number>
```

---

## ✅ Combinar genéricos y POO

Permite crear sistemas más flexibles.

---

# 💡 Idea clave final

La programación genérica permite construir aplicaciones:

- más reutilizables,
- más seguras,
- más flexibles,
- y más profesionales.

👉 Los genéricos son una de las bases del desarrollo moderno en Java y son ampliamente utilizados en frameworks y bibliotecas profesionales.
