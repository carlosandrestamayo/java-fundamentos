# Abstracción en Java

## 📌 ¿Qué es la abstracción?

La **abstracción** es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO).  
Consiste en **ocultar los detalles internos de implementación** y mostrar únicamente la funcionalidad esencial de un objeto.

👉 En otras palabras:
> Nos enfocamos en *qué hace un objeto*, no en *cómo lo hace*.

---

## 🧠 Ejemplo conceptual

Cuando conduces un carro:
- Sabes que puedes acelerar, frenar y girar.
- Pero no necesitas saber cómo funciona el motor internamente.

🚗 Eso es abstracción.

---

## 🏗️ ¿Cómo se implementa en Java?

En Java, la abstracción se logra mediante:

- Clases abstractas
- Métodos abstractos

---

## 🔹 Clase abstracta

Una **clase abstracta** es una clase que:

- No puede ser instanciada directamente.
- Sirve como base (plantilla) para otras clases.
- Puede contener métodos abstractos y métodos concretos.

### 🔧 Sintaxis:

```java
abstract class NombreClase {
    // atributos
    // métodos abstractos y/o concretos
}
```

---

### 📌 Características de una clase abstracta

- Se declara con la palabra clave `abstract`.
- Puede tener:
  - Métodos con implementación (normales).
  - Métodos sin implementación (abstractos).
- Puede tener atributos.
- Puede tener constructor.
- Se usa para modelar jerarquías.

---

### ✅ Ejemplo:

```java
abstract class Animal {
    String nombre;

    // Método abstracto
    abstract void hacerSonido();

    // Método concreto
    void dormir() {
        System.out.println("El animal está durmiendo");
    }
}
```

---

## 🔹 Método abstracto

Un **método abstracto** es un método que:

- No tiene implementación (no tiene cuerpo).
- Debe ser implementado obligatoriamente por las subclases.

### 🔧 Sintaxis:

```java
abstract void nombreMetodo();
```

---

### 📌 Características:

- Se declara con `abstract`.
- No tiene llaves `{}`.
- Termina en `;`.
- Solo puede existir dentro de una clase abstracta.

---

### ✅ Ejemplo:

```java
abstract class Figura {
    abstract double calcularArea();
}
```

---

## 🔄 Herencia e implementación

Cuando una clase hereda de una clase abstracta:

👉 Está obligada a implementar todos los métodos abstractos.

---

### ✅ Ejemplo completo:

```java
abstract class Animal {
    abstract void hacerSonido();
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido();
        a2.hacerSonido();
    }
}
```

---

## 🔑 Uso de la palabra clave `abstract`

Se utiliza en dos contextos:

### 1. Para clases

```java
abstract class Vehiculo {
}
```

### 2. Para métodos

```java
abstract void mover();
```

---

## ⚠️ Reglas importantes

- ❌ No se puede crear objetos de una clase abstracta:

```java
Animal a = new Animal(); // ERROR
```

- ✅ Sí se pueden usar referencias:

```java
Animal a = new Perro(); // Correcto
```

- Si una subclase **no implementa** los métodos abstractos:
  - También debe declararse como `abstract`.

---

## 🆚 Clase abstracta vs clase normal

| Característica        | Clase Abstracta | Clase Normal |
|---------------------|----------------|--------------|
| Se puede instanciar | ❌ No          | ✅ Sí        |
| Métodos abstractos  | ✅ Sí          | ❌ No        |
| Métodos concretos   | ✅ Sí          | ✅ Sí        |

---

## 🎯 ¿Cuándo usar abstracción?

Usa clases abstractas cuando:

- Quieres definir una estructura común.
- Varias clases comparten comportamiento.
- Necesitas obligar a implementar ciertos métodos.
- Estás diseñando sistemas escalables.

---

## 🧩 Ejemplo aplicado

```java
abstract class Empleado {
    String nombre;

    abstract double calcularSalario();
}

class EmpleadoTiempoCompleto extends Empleado {
    @Override
    double calcularSalario() {
        return 2000;
    }
}

class EmpleadoPorHoras extends Empleado {
    int horas;
    double tarifa;

    @Override
    double calcularSalario() {
        return horas * tarifa;
    }
}
```

---

## 💡 Idea clave final

La abstracción permite:

- Reducir la complejidad
- Mejorar el diseño del software
- Facilitar el mantenimiento
- Obligar buenas prácticas de programación

---

## 📝 Ejercicio propuesto

Diseña una clase abstracta llamada `Figura` que tenga:

- Un método abstracto `calcularArea()`
- Dos clases hijas:
  - `Circulo`
  - `Rectangulo`

👉 Luego, crea un programa que calcule el área de ambas figuras.

---

# Interfaces en Java

## 📌 ¿Qué es una interfaz?

Una **interfaz** en Java es un tipo de referencia que define un conjunto de métodos que una clase debe implementar.

👉 Es un contrato:
> Si una clase implementa una interfaz, está obligada a definir todos sus métodos.

---

## 🧠 Idea clave

Una interfaz define **qué se debe hacer**, pero no **cómo hacerlo**.

---

## 🔧 Definición de una interfaz

Se declara usando la palabra clave `interface`.

### Sintaxis:

```java
interface NombreInterfaz {
    void metodo1();
    void metodo2();
}
```

---

## 📌 Características de una interfaz

- Todos los métodos son **implícitamente abstractos** (en versiones clásicas).
- No se pueden instanciar.
- Las clases usan la palabra clave `implements`.
- Permite **herencia múltiple** (una clase puede implementar varias interfaces).
- Sus métodos son por defecto:
  - `public`
  - `abstract`

---

## ✅ Ejemplo básico

```java
interface Animal {
    void hacerSonido();
}
```

---

## 🔄 Implementación de una interfaz

Una clase implementa una interfaz usando `implements`.

### Ejemplo:

```java
interface Animal {
    void hacerSonido();
}

class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}
```

---

## 🧪 Uso en el programa principal

```java
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido();
        a2.hacerSonido();
    }
}
```

---

## ⚠️ Reglas importantes

- ❌ No se pueden crear objetos directamente:

```java
Animal a = new Animal(); // ERROR
```

- ✅ Se usan como tipo de referencia:

```java
Animal a = new Perro();
```

---

## 🔥 Interfaces modernas (Java 8+)

Desde Java 8, las interfaces pueden tener:

### ✔ Métodos `default`

```java
interface Animal {
    void hacerSonido();

    default void dormir() {
        System.out.println("El animal duerme");
    }
}
```

---

### ✔ Métodos `static`

```java
interface Util {
    static void saludar() {
        System.out.println("Hola");
    }
}
```

---

## 🧩 Ejemplo aplicado

```java
interface Pago {
    double calcularPago();
}

class PagoTarjeta implements Pago {
    public double calcularPago() {
        return 100;
    }
}

class PagoEfectivo implements Pago {
    public double calcularPago() {
        return 90;
    }
}
```

---

# 🆚 Comparación: Clase Abstracta vs Interfaz

## 📊 Diferencias clave

| Característica              | Clase Abstracta              | Interfaz                     |
|---------------------------|-----------------------------|------------------------------|
| Palabra clave             | `abstract`                  | `interface`                  |
| Métodos abstractos        | ✅ Sí                        | ✅ Sí                        |
| Métodos concretos         | ✅ Sí                        | ✅ (desde Java 8 con `default`) |
| Atributos                 | ✅ Sí                        | ⚠️ Solo constantes (`public static final`) |
| Herencia múltiple         | ❌ No                        | ✅ Sí                        |
| Instanciación             | ❌ No                        | ❌ No                        |
| Uso principal             | Base común con lógica       | Contrato de comportamiento   |

---

## 🧠 Diferencia conceptual clave

- **Clase abstracta** → "Es un tipo de..."
- **Interfaz** → "Puede hacer..."

👉 Ejemplo:

- `Perro` **es un** `Animal` → Clase abstracta  
- `Perro` **puede** `Correr`, `Nadar` → Interfaces  

---

## 🧩 Ejemplo combinado

```java
abstract class Animal {
    abstract void hacerSonido();
}

interface Volador {
    void volar();
}

class Pajaro extends Animal implements Volador {

    @Override
    void hacerSonido() {
        System.out.println("El pájaro canta");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro vuela");
    }
}
```

---

## 🎯 ¿Cuándo usar cada uno?

### Usa clase abstracta cuando:
- Quieres compartir código entre clases.
- Hay una relación fuerte (jerarquía).
- Necesitas atributos y lógica común.

---

### Usa interfaz cuando:
- Quieres definir capacidades.
- Necesitas herencia múltiple.
- Diseñas sistemas flexibles y desacoplados.

---

## 💡 Idea clave final

- Las **interfaces** permiten diseñar sistemas más flexibles.
- Las **clases abstractas** permiten reutilizar código.
- Juntas forman la base de un buen diseño orientado a objetos.

---

## 📝 Ejercicio propuesto

Diseña:

1. Una interfaz `Vehiculo` con el método `mover()`
2. Una interfaz `Electrico` con el método `cargarBateria()`
3. Una clase `CarroElectrico` que implemente ambas

👉 Luego crea un programa que use estas clases.

---