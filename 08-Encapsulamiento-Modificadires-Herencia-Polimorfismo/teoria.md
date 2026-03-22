# 📘 ENCAPSULAMIENTO, MODIFICADORES DE ACCESO, HERENCIA Y POLIMORFISMO

---

## 🔐 1. ENCAPSULAMIENTO

### 🧠 ¿Qué es?

El **encapsulamiento** es el principio de la POO que consiste en **proteger los datos de una clase**, evitando que sean modificados directamente desde fuera.

👉 En lugar de acceder directamente a los atributos, se utilizan métodos controlados.

---

### 🎯 Beneficios

- ✔ Protege la información  
- ✔ Evita errores  
- ✔ Controla cómo se modifican los datos  
- ✔ Mejora la seguridad del programa  

---

## 🔒 2. MODIFICADORES DE ACCESO

Permiten controlar **quién puede acceder a los atributos o métodos**.

---

### 🔹 Tipos principales

| Modificador | Acceso |
|------------|--------|
| `public`   | Desde cualquier lugar |
| `private`  | Solo dentro de la clase |
| `protected`| Dentro de la clase y sus subclases |

---

### 🧪 Ejemplo

```java
class Persona {

    public String nombre;     // acceso libre
    private int edad;         // acceso restringido
    protected String ciudad;  // acceso intermedio

}
```

## 🔁  GETTERS Y SETTERS 

---

## 🧠 ¿Qué son?

Son métodos que permiten acceder y modificar atributos **privados** de una clase.

- **Getter** → obtiene el valor  
- **Setter** → modifica el valor  

---

## 📌 ¿Por qué no acceder directamente?

Porque usamos encapsulamiento:

```java
private int edad;
```

- 👉 No se puede acceder directamente desde fuera
- 👉 Necesitamos métodos controlados

### 🏷️ CONVENCIÓN DE NOMBRES (JavaBeans)

Java tiene una convención estándar para nombrar estos métodos.

### 🔹 Getter

Se forma así:
```java
get + NombreDelAtributo (Primera letra en mayúscula)
```
### 📌 Ejemplo

Atributo:
```java
private int edad;
```
Getter:
```java
public int getEdad() {
    return edad;
}
```
### 🔹 Setter

Se forma así:
```java
set + NombreDelAtributo (Primera letra en mayúscula)
```

### 📌 Ejemplo
```java
public void setEdad(int edad) {
    this.edad = edad;
}
```

### 🔥 REGLA CLAVE

👉 Si el atributo es:
```java
private String nombre;
```
Entonces:
```java
Getter → getNombre()
Setter → setNombre()
```

### ⚠️ CASO ESPECIAL: BOOLEAN

Para variables booleanas se usa:

is + Nombre
📌 Ejemplo
```java
private boolean activo;
```
Getter:
```java
public boolean isActivo() {
    return activo;
}
```

Setter:
```java
public void setActivo(boolean activo) {
    this.activo = activo;
}
```
### 🧪 EJEMPLO COMPLETO
```java
class Persona {

    private String nombre;
    private int edad;
    private boolean activo;

    // Getter nombre
    public String getNombre() {
        return nombre;
    }

    // Setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter edad
    public int getEdad() {
        return edad;
    }

    // Setter edad
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    // Getter boolean
    public boolean isActivo() {
        return activo;
    }

    // Setter boolean
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
```
---

### 💡 BUENAS PRÁCTICAS
- ✔ Usar nombres claros
- ✔ Validar datos en setters
- ✔ No crear setters si el valor no debe cambiar
- ✔ Mantener atributos como private

# 🧬 HERENCIA EN PROGRAMACIÓN ORIENTADA A OBJETOS

---

## 🧠 ¿Qué es la herencia?

La **herencia** es un mecanismo de la Programación Orientada a Objetos que permite que una clase **herede atributos y métodos de otra clase**.

👉 Permite reutilizar código y organizar mejor los programas.

---

### 💡 IDEA CLAVE

La herencia representa una relación:

> 🔹 “ES UN”

Ejemplos:
- Un **Perro ES UN Animal**  
- Un **Estudiante ES UNA Persona**  

---

### 🧩 1. TERMINOLOGÍA

| Concepto | Descripción |
|----------|------------|
| Clase base / padre | Clase que hereda (superclase) |
| Subclase / hija | Clase que recibe la herencia |
| `extends` | Palabra clave para heredar |

---

### 🛠️ 2. SINTAXIS

```java
class ClaseHija extends ClasePadre {
  ....
}
```

### 🧪 3. EJEMPLO BÁSICO

```java
class Animal {

    String nombre;

    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    void ladrar() {
        System.out.println("Guau");
    }
}
```
### 🎯 Uso
```java
public class Main {
    public static void main(String[] args) {

        Perro p = new Perro();

        p.nombre = "Firulais";   // heredado
        p.hacerSonido();         // heredado
        p.ladrar();              // propio
    }
}
```

### 🔥 4. ¿QUÉ SE HEREDA?

Una subclase hereda:

- ✔ Atributos
- ✔ Métodos
- ✔ Comportamiento

⚠️ NO se hereda:

-Constructores directamente
- Atributos private (no accesibles directamente)

### 🔑 5. USO DE `super`
🧠 ¿Qué es super?

Es una palabra clave que permite acceder a la clase padre.

#### 🔹 Llamar constructor del padre
```java
class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

class Estudiante extends Persona {

    int codigo;

    Estudiante(String nombre, int codigo) {
        super(nombre); // llama al constructor padre
        this.codigo = codigo;
    }
}
```
#### 🔹 Acceder a métodos del padre
```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Gato extends Animal {

    void hacerSonido() {
        super.hacerSonido(); // llama al padre
        System.out.println("Miau");
    }
}

```

### 🔄 6. SOBRESCRITURA (OVERRIDING)
### 🧠 ¿Qué es?

Es cuando una subclase redefine un método de la clase padre.

#### 🔹 Ejemplo
```java
class Animal {

    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}
```
#### 💡 ¿Para qué sirve?

👉 Permite adaptar el comportamiento a cada clase

#### ⚠️ REGLAS DE OVERRIDING
- Mismo nombre
- Mismos parámetros
- Mismo tipo de retorno
- Se recomienda usar @Override

### 🧠 7. HERENCIA Y ENCAPSULAMIENTO
#### 🔹 Uso de protected

Permite acceso desde subclases:
```java
class Persona {
    protected String nombre;
}
```
👉 La subclase puede acceder directamente

### 🔥 8. EJEMPLO COMPLETO
```java
class Vehiculo {

    protected String marca;

    Vehiculo(String marca) {
        this.marca = marca;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
    }
}

class Moto extends Vehiculo {

    int cilindrada;

    Moto(String marca, int cilindrada) {
        super(marca);
        this.cilindrada = cilindrada;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada);
    }
}

public class Main {
    public static void main(String[] args) {

        Moto m = new Moto("Yamaha", 115);

        m.mostrarInfo();
    }
}
```
# 🔄 POLIMORFISMO EN PROGRAMACIÓN ORIENTADA A OBJETOS

---

## 🧠 ¿Qué es el polimorfismo?

El **polimorfismo** es un principio de la Programación Orientada a Objetos que permite que un mismo método o referencia tenga **diferentes comportamientos**.

👉 Significa:
“Muchas formas”

---

## 💡 IDEA CLAVE

Un mismo objeto puede comportarse de diferentes maneras dependiendo del contexto.

---

## 🧩 1. TIPOS DE POLIMORFISMO

---

### 🔹 1. Polimorfismo en tiempo de compilación (Overloading)

También llamado:
👉 Sobrecarga de métodos

---

### 🧠 ¿Qué es?

Es cuando un método tiene el mismo nombre pero diferentes parámetros.

---

### 🧪 Ejemplo

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

### 🎯 Uso
```java
Calculadora c = new Calculadora();

c.sumar(2, 3);        // usa método int
c.sumar(2.5, 3.1);    // usa método double
c.sumar(1, 2, 3);     // usa método de 3 parámetros
```

### ⚠️ Reglas de la sobrecarga
- Mismo nombre
- Diferente número o tipo de parámetros
- Puede cambiar el tipo de retorno

### 🔹 2. Polimorfismo en tiempo de ejecución (Overriding)

También llamado:
👉 Sobrescritura de métodos

### 🧠 ¿Qué es?

Es cuando una subclase redefine un método de la clase padre.

### 🧪 Ejemplo
```java
class Animal {

    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}
```

### 🔥 POLIMORFISMO REAL
```java
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido(); // Guau
        a2.hacerSonido(); // Miau
    }
}
```

### 💡 IDEA CLAVE

👉 El tipo de referencia es `Animal`,
pero el comportamiento depende del objeto real (`Perro` o `Gato`).

### 🧠 ¿CÓMO FUNCIONA INTERNAMENTE?

Java decide qué método ejecutar en tiempo de ejecución usando:

👉 **Binding dinámico**

Esto significa:
El método se elige según el objeto real, no la referencia.

### 🧪 EJEMPLO COMPLETO
```java
class Empleado {

    double calcularSalario() {
        return 1000;
    }
}

class Gerente extends Empleado {

    @Override
    double calcularSalario() {
        return 2000;
    }
}

class Desarrollador extends Empleado {

    @Override
    double calcularSalario() {
        return 1500;
    }
}
```
###  🎯 Uso
```java
public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Gerente();
        Empleado e2 = new Desarrollador();

        System.out.println(e1.calcularSalario()); // 2000
        System.out.println(e2.calcularSalario()); // 1500
    }
}
```

### 🔥 VENTAJAS DEL POLIMORFISMO
- ✔ Código más flexible
- ✔ Facilita la reutilización
- ✔ Permite trabajar con generalizaciones
- ✔ Reduce el acoplamiento

---

### ⚠️ ERRORES COMUNES
- Confundir sobrecarga con sobrescritura
- No usar @Override
- No respetar la firma del método
