# Soluciones – Variables y tipos de datos en Java

### Ejercicio 1 – Declaración y asignación de variables

```java
public class Main {

    public static void main(String[] args) {
        
        // Declaración y asignación de variables
        int edad = 18;
        double estatura = 1.75;
        char inicial = 'C';
        boolean esEstudiante = true;

        // Imprimir valores
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es estudiante: " + esEstudiante);
    }
}


```

---

### Ejercicio 2 – Copia de valores de variables primitivos

```java
public class Main {

    public static void main(String[] args) {

        // Variables primitivas
        int a = 10;
        int b = a; // copia el valor de a

        b = 20; // cambio b

        // Imprimir valores
        System.out.println("a = " + a); // a sigue siendo 10
        System.out.println("b = " + b); // b ahora es 20
    }
}
```

---

### Ejercicio 3 – Valores y tipos

```java
public class Main {

    public static void main(String[] args) {
            int cantidad = 5;
            double precio = 12.50;
            char letra = 'J';
            boolean disponible = true;

            // Imprimir valores
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio: " + precio);
            System.out.println("Letra: " + letra);
            System.out.println("Disponible: " + disponible);

            // Cambiar valores
            cantidad = 10;
            precio = 20.75;
            letra = 'K';
            disponible = false;

            // Imprimir nuevamente
            System.out.println("Cantidad (actualizada): " + cantidad);
            System.out.println("Precio (actualizado): " + precio);
            System.out.println("Letra (actualizada): " + letra);
            System.out.println("Disponible (actualizado): " + disponible);
    }
}

```
---

### Ejercicio 4 – Operaciones con variables

```java
public class Main {

    public static void main(String[] args) {
            int x = 15;
            int y = 4;

            // Operaciones aritméticas
            int suma = x + y;
            int resta = x - y;
            int producto = x * y;
            int division = x / y;
            int residuo = x % y;

            // Imprimir resultados
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("División entera: " + division);
            System.out.println("Residuo: " + residuo);

    }
}

```
---