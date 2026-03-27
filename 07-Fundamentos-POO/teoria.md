# 📘 FUNDAMENTOS DE LA PROGRAMACIÓN ORIENTADA A OBJETOS (POO)

---

## 🧠 ¿Qué es la POO?

La **Programación Orientada a Objetos (POO)** es una forma de programar en la que organizamos el código usando **objetos**, que representan cosas del mundo real.

👉 Ejemplos:
- Producto  
- Estudiante  
- Vehículo  

Cada objeto tiene:
- **Características** → atributos  
- **Acciones** → métodos  

---

# 🧩 1. CONCEPTOS BÁSICOS DE POO

---

## 📦 Clase

Una **clase** es como un **molde o plantilla**.

👉 Define cómo será un objeto.

### 🔹 Ejemplo

```java
class Producto {
    String nombre;
    double precio;
    int cantidad;
}

```

## 🎯 Objeto

Un objeto es una **instancia** de una **clase.**

👉 Es un elemento real creado a partir del molde.

###🔹 Ejemplo
Producto p1 = new Producto();

## 🧾 Atributos

Son las características del objeto.

###     🔹 Ejemplo
```java
String nombre;
double precio;
int cantidad;
```

## ⚙️ Métodos

Son las acciones que puede realizar un objeto.

🔹 Ejemplo
```java
double calcularTotal() {
    return precio * cantidad;
}
```
### 🧪 EJEMPLO COMPLETO

```java
class Producto {
    String nombre;
    double precio;
    int cantidad;

    double calcularTotal() {
        return precio * cantidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();

        p1.nombre = "Mouse";
        p1.precio = 50;
        p1.cantidad = 3;

        System.out.println("Total: " + p1.calcularTotal());
    }
}
```
# ⚔️ 2. DIFERENCIA ENTRE PROGRAMACIÓN ESTRUCTURADA Y POO

## 🧱 Programación Estructurada
- Usa funciones separadas
- Los datos están por un lado
- El código puede volverse desordenado

### 🔹Ejemplo
```java
double calcularTotal(double precio, int cantidad) {
    return precio * cantidad;
}
```
## 🧠Programación Orientada a Objetos

- Organiza todo en clases
- Une datos + comportamiento
- Es más fácil de mantener
### 🔹Ejemplo
```java
class Producto {
    double precio;
    int cantidad;

    double calcularTotal() {
        return precio * cantidad;
    }
}
```

### 📊 Comparación
|Estructurada|	POO|
|:---|:---|
|Funciones separadas|	Clases organizadas|
|Datos independientes	|Datos + métodos juntos|
|Difícil de escalar	|Fácil mantenimiento|


## 🛠️ 3. CREACIÓN DE CLASES Y OBJETOS EN JAVA
### 🔹 Sintaxis de una clase

```java
class NombreClase {
    // atributos
    // métodos
}
```

### 🔹 Crear un objeto
```java
NombreClase objeto = new NombreClase();
```
### 🔹 Ejemplo completo
```java
class Estudiante {
    String nombre;
    int edad;

    void mostrarDatos() {
        System.out.println(nombre + " - " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();

        e1.nombre = "Carlos";
        e1.edad = 20;

        e1.mostrarDatos();
    }
}
```
## 🧠 Constructores

Es un método especial que se ejecuta cuando se crea un objeto.

👉 Tiene el mismo nombre de la clase.

### 🔹 Constructor básico
```java
class Producto {
    String nombre;
    double precio;

    Producto() {
        nombre = "Sin nombre";
        precio = 0;
    }
}
```

### 🔹 Constructor con parámetros
```java
class Producto {
    String nombre;
    double precio;

    Producto(String n, double p) {
        nombre = n;
        precio = p;
    }
}
```

### 🔹 Crear objetos con constructores

```java
Producto p1 = new Producto();  
Producto p2 = new Producto("Laptop", 2000);
```

### 🔁 Sobrecarga de constructores

Permite tener varios constructores en la misma clase.
```java
class Producto {
    String nombre;
    double precio;

    Producto() {
        nombre = "Genérico";
    }

    Producto(String nombre) {
        this.nombre = nombre;
    }

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
```

### 🧠 ¿Qué es `this` en Java?

`this` es una palabra clave que hace referencia al **objeto actual**.

👉 Es decir:
Cuando estás dentro de una clase, `this` representa **el objeto que está ejecutando el código**.

---

### 🎯 ¿Para qué sirve `this`?

Se usa principalmente para:

1. Diferenciar atributos de variables
2. Acceder a atributos del objeto
3. Llamar constructores dentro de la misma clase

---

## ⚙️ 4. MÉTODOS: DEFINICIÓN Y USO
### 🧠 ¿Qué es un método?

Un método es una función dentro de una clase.

👉 Sirve para realizar acciones.

### 🔹 Sintaxis
```java
tipoRetorno nombreMetodo(parámetros) {
    // instrucciones
}
```

### 🔹 Ejemplo sin parámetros
```java
void saludar() {
    System.out.println("Hola");
}
```

### 🔹 Ejemplo con parámetros
```java
void saludar(String nombre) {
    System.out.println("Hola " + nombre);
}
```

### 🔹 Ejemplo con retorno
```java
int sumar(int a, int b) {
    return a + b;
}
```

### 🔹 Ejemplo completo

```java
class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    int multiplicar(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(5, 3));
        System.out.println(calc.multiplicar(4, 2));
    }
}
```

## 🔁 5. SOBRECARGA DE MÉTODOS (OVERLOADING)
### 🧠 ¿Qué es?

Es cuando un método tiene el mismo nombre pero diferentes parámetros.

🔹 Ejemplo
```java
class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
```

## ⚡ 6. MÉTODOS ESTÁTICOS (STATIC)
🧠 ¿Qué es static?

Un método static pertenece a la clase y no al objeto.

👉 No necesitas crear un objeto para usarlo.

### 🔹 Ejemplo
```java
class Utilidades {

    static int sumar(int a, int b) {
        return a + b;
    }
}
```

### 🔹 Uso

```java
public class Main {
    public static void main(String[] args) {
        int resultado = Utilidades.sumar(5, 3);
        System.out.println(resultado);
    }
}
```
## 📌 Diferencia clave

|Tipo	|Necesita objeto|
|:---|:---|
|Método normal|	Sí|
|Método static|	No|

### EJEMPLO COMPLETO INTEGRADO

```java
class Producto {

    String nombre;
    double precio;
    int cantidad;

    // Constructor
    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método
    double calcularTotal() {
        return precio * cantidad;
    }

    // Sobrecarga
    double calcularTotal(double impuesto) {
        return (precio * cantidad) * impuesto;
    }

    // Método estático
    static void mensaje() {
        System.out.println("Sistema de productos");
    }
}
```
```java
public class Main {
    public static void main(String[] args) {

        Producto.mensaje();

        Producto p1 = new Producto("Teclado", 100, 2);

        System.out.println(p1.calcularTotal());
        System.out.println(p1.calcularTotal(1.19));
    }
}
```




