# 🧩 Ejercicio 1: Clases Abstractas

## 📌 Enunciado

Diseña un sistema para calcular el área de diferentes figuras geométricas.

### Requisitos:
1. Crear una clase abstracta `Figura`
2. Definir un método abstracto `calcularArea()`
3. Crear dos clases hijas:
   - `Circulo`
   - `Rectangulo`
4. En el `main`, calcular el área de ambas figuras

---

## ✅ Solución

### 🔹 Clase abstracta

```java
abstract class Figura {
    abstract double calcularArea();
}
```

---

### 🔹 Clase Circulo

```java
class Circulo extends Figura {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

---

### 🔹 Clase Rectangulo

```java
class Rectangulo extends Figura {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}
```

---

### 🔹 Clase principal

```java
public class Main {
    public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + f1.calcularArea());
        System.out.println("Área del rectángulo: " + f2.calcularArea());
    }
}
```

---

## 🎯 Conceptos aplicados

- Uso de `abstract`
- Herencia
- Polimorfismo
- Reutilización de código

---

# 🧩 Ejercicio 2: Interfaces (2 interfaces en una clase)

## 📌 Enunciado

Diseña un sistema de vehículos eléctricos inteligentes.

### Requisitos:
1. Crear una interfaz `Vehiculo` con el método `mover()`
2. Crear una interfaz `Electrico` con el método `cargarBateria()`
3. Crear una clase `CarroElectrico` que implemente ambas interfaces
4. En el `main`, probar ambos comportamientos

---

## ✅ Solución

### 🔹 Interfaz Vehiculo

```java
interface Vehiculo {
    void mover();
}
```

---

### 🔹 Interfaz Electrico

```java
interface Electrico {
    void cargarBateria();
}
```

---

### 🔹 Clase que implementa dos interfaces

```java
class CarroElectrico implements Vehiculo, Electrico {

    @Override
    public void mover() {
        System.out.println("El carro eléctrico se está moviendo");
    }

    @Override
    public void cargarBateria() {
        System.out.println("El carro eléctrico está cargando batería");
    }
}
```

---

### 🔹 Clase principal

```java
public class Main {
    public static void main(String[] args) {
        CarroElectrico carro = new CarroElectrico();

        carro.mover();
        carro.cargarBateria();
    }
}
```

---

## 🎯 Conceptos aplicados

- Uso de `interface`
- Implementación múltiple
- Diseño basado en capacidades
- Separación de responsabilidades

---