## 🧪 EJERCICIO 1: Sistema de Producto
### 🎯 Enunciado

Crear una clase Producto que permita:

- Guardar nombre, precio y cantidad
- Calcular el total
- Usar constructores sobrecargados
- Usar this
- Tener un método estático

### ✅ SOLUCIÓN

```java
class Producto {

    // Atributos
    String nombre;
    double precio;
    int cantidad;

    // Constructor vacío
    Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0;
        this.cantidad = 0;
    }

    // Constructor con parámetros
    Producto(String nombre, double precio, int cantidad) {
        // Uso de this para diferenciar atributos
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para calcular total
    double calcularTotal() {
        return this.precio * this.cantidad;
    }

    //  Sobrecarga de método (con impuesto)
    double calcularTotal(double impuesto) {
        return (this.precio * this.cantidad) * impuesto;
    }

    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
    }

    // Método estático (no necesita objeto)
    static void mensajeSistema() {
        System.out.println("=== SISTEMA DE PRODUCTOS ===");
    }
}
```
### 🚀 Clase principal
```java
public class Main {
    public static void main(String[] args) {

        // Llamar método estático
        Producto.mensajeSistema();

        // Crear objeto con constructor vacío
        Producto p1 = new Producto();

        // Crear objeto con constructor con parámetros
        Producto p2 = new Producto("Laptop", 2000, 2);

        // Mostrar información
        p2.mostrarInfo();

        // Calcular total
        System.out.println("Total: " + p2.calcularTotal());

        // Calcular total con impuesto
        System.out.println("Total con impuesto: " + p2.calcularTotal(1.19));
    }
}
```

## 🧪 EJERCICIO 2: GESTIÓN DE NOTAS DE UN ESTUDIANTE

### 🎯 Descripción

Se desea desarrollar un programa en Java utilizando Programación Orientada a Objetos (POO) que permita gestionar la información académica de un estudiante.

Cada estudiante tendrá un nombre y un conjunto de notas almacenadas en un arreglo. El sistema debe permitir calcular el promedio de las notas, mostrar la información del estudiante y aplicar un bono adicional al promedio.

---

### 📋 Requerimientos

1. Crear una clase llamada `Estudiante` con los siguientes atributos:
   - `nombre` (tipo String)
   - `notas` (arreglo de tipo double)

2. Implementar un constructor que permita inicializar el nombre del estudiante y sus notas.

3. Crear un método que calcule el promedio de las notas.

4. Implementar una sobrecarga del método de promedio que permita agregar un bono adicional.

5. Crear un método que muestre todas las notas del estudiante.

6. Definir un método estático que muestre un mensaje del sistema.

7. En la clase principal (`Main`):
   - Crear un arreglo de notas
   - Crear un objeto de tipo `Estudiante`
   - Mostrar las notas
   - Mostrar el promedio
   - Mostrar el promedio con bono

---

## 🧠 Temas que se evalúan

- Clases y objetos  
- Constructores  
- Uso de `this`  
- Arreglos como atributos  
- Métodos  
- Sobrecarga de métodos  
- Métodos estáticos  

---

## 🎯 Objetivo de aprendizaje

Aplicar los fundamentos de la Programación Orientada a Objetos para modelar un problema real utilizando estructuras de datos (arreglos) y técnicas como la sobrecarga de métodos.

Si quieres, te hago también:

👉 El encabezado tipo examen (más formal estilo universidad)
👉 O una rúbrica de evaluación para este ejercicio (eso te sirve mucho para tu maestría 🔥)

```java
// Clase Estudiante
class Estudiante {

    //  Atributos
    String nombre;
    double[] notas; // 🔥 arreglo como propiedad

    //  Constructor
    Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    //  Método para calcular promedio
    double calcularPromedio() {
        double suma = 0;

        //  Recorrer el arreglo
        for (int i = 0; i < this.notas.length; i++) {
            suma += this.notas[i];
        }

        return suma / this.notas.length;
    }

    //  Sobrecarga: promedio con bono
    double calcularPromedio(double bono) {
        return calcularPromedio() + bono;
    }

    //  Método para mostrar notas
    void mostrarNotas() {
        System.out.println("Notas de " + this.nombre + ":");

        for (int i = 0; i < this.notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + this.notas[i]);
        }
    }

    //  Método estático
    static void mensaje() {
        System.out.println("=== SISTEMA DE ESTUDIANTES ===");
    }
}

```
```java

// Clase principal
public class Main {
    public static void main(String[] args) {

        // Mensaje inicial
        Estudiante.mensaje();

        //  Crear arreglo de notas
        double[] notas1 = {4.0, 3.5, 4.5};

        //  Crear objeto
        Estudiante e1 = new Estudiante("Carlos", notas1);

        // Mostrar información
        e1.mostrarNotas();

        System.out.println("Promedio: " + e1.calcularPromedio());
        System.out.println("Promedio con bono: " + e1.calcularPromedio(0.5));
    }
}
```