# 📘 ENCAPSULAMIENTO, MODIFICADORES DE ACCESO, HERENCIA Y POLIMORFISMO

## 🧩 Ejercicio: Encapsulamiento en Java

### 🎯 Objetivo
Aplicar el concepto de **encapsulamiento** en Java mediante el uso de atributos privados y métodos públicos (getters y setters).

---

### 📋 Enunciado

Se desea crear un programa en Java que represente una **clase Persona**, la cual debe cumplir con las siguientes condiciones:

1. La clase debe tener los siguientes atributos:
   - `nombre` (tipo String)
   - `edad` (tipo int)

2. Los atributos deben ser **privados** para garantizar el encapsulamiento.

3. Se deben implementar los siguientes métodos:
   - Métodos **getter** para obtener los valores de los atributos.
   - Métodos **setter** para modificar los valores de los atributos.

4. El método `setEdad` debe incluir una validación:
   - Solo debe permitir valores de edad **mayores o iguales a 0**.
   - En caso contrario, debe mostrar un mensaje indicando que la edad no es válida.

5. Crear una clase principal (`Main`) donde:
   - Se cree un objeto de la clase `Persona`.
   - Se muestren sus datos.
   - Se modifiquen sus atributos usando los setters.
   - Se vuelvan a mostrar los datos actualizados.
   - Se intente asignar una edad inválida para verificar la validación.

---

### 🧠 Preguntas de reflexión

- ¿Por qué es importante usar atributos privados?
- ¿Qué ventajas ofrece el uso de getters y setters?
- ¿Qué podría ocurrir si no se valida la edad?

---

### 🚀 Reto adicional (opcional)

- Agregar validación para que el nombre no esté vacío.
- Implementar el método `toString()` para mostrar la información del objeto.
- Crear otra clase (por ejemplo, `Estudiante`) que también aplique encapsulamiento.

---

## ✅ Solución: Encapsulamiento en Java

### 📦 Clase Persona

```java
public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;

    //  Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //  Getter nombre
    public String getNombre() {
        return nombre;
    }

    //  Setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //  Getter edad
    public int getEdad() {
        return edad;
    }

    //  Setter edad con validación
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
```

---

### 🚀 Clase Main

```java
public class Main {
    public static void main(String[] args) {

        // Crear objeto
        Persona p1 = new Persona("Carlos", 25);

        // Mostrar datos iniciales
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());

        // Modificar datos
        p1.setNombre("Andrés");
        p1.setEdad(30);

        // Mostrar datos actualizados
        System.out.println("Nuevo nombre: " + p1.getNombre());
        System.out.println("Nueva edad: " + p1.getEdad());

        // Intentar edad inválida
        p1.setEdad(-5);
    }
}
```

---

### 🖥️ Salida esperada

```
Nombre: Carlos
Edad: 25
Nuevo nombre: Andrés
Nueva edad: 30
Edad no válida
```

---

## 🧩 Ejercicio: Herencia en Java

### 🎯 Objetivo
Aplicar el concepto de **herencia** en Java para reutilizar atributos y métodos entre clases.

---

### 📋 Enunciado

Se desea crear un programa en Java que modele una jerarquía de clases relacionada con personas en una institución.

1. Crear una clase base llamada `Persona` con los siguientes atributos:
   - `nombre` (String)
   - `edad` (int)

2. Los atributos deben ser **protegidos (`protected`)**.

3. La clase debe tener:
   - Un constructor
   - Un método `mostrarInfo()` que imprima los datos

4. Crear una clase `Estudiante` que **herede de `Persona`**, con:
   - Un atributo adicional: `carrera` (String)

5. La clase `Estudiante` debe:
   - Tener su propio constructor
   - Sobrescribir el método `mostrarInfo()` para incluir la carrera

6. Crear una clase principal (`Main`) donde:
   - Se cree un objeto de tipo `Estudiante`
   - Se muestren sus datos usando el método sobrescrito

---

### 🧠 Preguntas de reflexión

- ¿Qué ventaja tiene usar herencia en lugar de repetir código?
- ¿Qué significa sobrescribir un método?
- ¿Qué diferencia hay entre `private` y `protected`?

---

### 🚀 Reto adicional (opcional)

- Crear otra clase llamada `Profesor` que también herede de `Persona`
- Agregar un método común llamado `saludar()`
- Usar `super` en el constructor de la clase hija

---
## ✅ Solución: Herencia en Java

### 📦 Clase Persona (Clase base)

```java
public class Persona {

    // 🔐 Atributos protegidos
    protected String nombre;
    protected int edad;

    // 🏗️ Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 📢 Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
```

---

### 🎓 Clase Estudiante (Clase hija)

```java
public class Estudiante extends Persona {

    // 📚 Atributo adicional
    private String carrera;

    // 🏗️ Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llamada al constructor de la clase padre
        this.carrera = carrera;
    }

    // 🔁 Sobrescritura del método
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Reutiliza el método de la clase padre
        System.out.println("Carrera: " + carrera);
    }
}
```

---

### 🚀 Clase Main

```java
public class Main {
    public static void main(String[] args) {

        // Crear objeto de tipo Estudiante
        Estudiante e1 = new Estudiante("Carlos", 20, "Ingeniería de Sistemas");

        // Mostrar información
        e1.mostrarInfo();
    }
}
```

---

### 🖥️ Salida esperada

```
Nombre: Carlos
Edad: 20
Carrera: Ingeniería de Sistemas
```

---

## 🧩 Ejercicio: Polimorfismo en Java

### 🎯 Objetivo
Aplicar el concepto de **polimorfismo** en Java mediante el uso de herencia y sobrescritura de métodos.

---

### 📋 Enunciado

Se desea crear un programa en Java que modele diferentes tipos de empleados en una empresa.

1. Crear una clase base llamada `Empleado` con:
   - Atributo: `nombre` (String)
   - Método: `calcularSalario()` que retorne un valor genérico

2. Crear las siguientes clases que **hereden de `Empleado`**:
   - `EmpleadoTiempoCompleto`
   - `EmpleadoPorHoras`

3. Cada clase hija debe:
   - Tener sus propios atributos:
     - Tiempo completo: salario fijo mensual
     - Por horas: horas trabajadas y valor por hora
   - **Sobrescribir** el método `calcularSalario()`

4. En la clase `Main`:
   - Crear un arreglo o lista de tipo `Empleado`
   - Guardar objetos de diferentes tipos (polimorfismo)
   - Recorrer la lista y llamar al método `calcularSalario()` para cada objeto

---

### 🧠 Preguntas de reflexión

- ¿Qué es el polimorfismo?
- ¿Por qué se puede usar una lista de tipo `Empleado` con objetos diferentes?
- ¿Qué ventaja tiene sobrescribir métodos?

---

### 🚀 Reto adicional (opcional)

- Agregar un método `mostrarInfo()` en cada clase
- Usar `ArrayList` en lugar de arreglo
- Agregar un tercer tipo de empleado (por comisión)

---

## ✅ Solución: Polimorfismo en Java

### 📦 Clase base Empleado

```java
public class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSalario() {
        return 0; // Método genérico
    }
}
```

---

### 👨‍💼 EmpleadoTiempoCompleto

```java
public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
```

---

### ⏱️ EmpleadoPorHoras

```java
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
```

---

### 🚀 Clase Main

```java
public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Carlos", 2500);
        empleados[1] = new EmpleadoPorHoras("Ana", 40, 10);

        for (Empleado e : empleados) {
            System.out.println("Salario: " + e.calcularSalario());
        }
    }
}
```

---

### 🖥️ Salida esperada

```
Salario: 2500.0
Salario: 400.0
```