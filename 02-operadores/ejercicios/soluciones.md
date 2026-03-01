# Soluciones – Operadores y Expresiones en Java

### Ejercicio 1 – Operadores aritméticos
```java
public class Main {

    public static void main(String[] args) {
        
        int a = 15;
        int b = 4;

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);

        // Producto
        int producto = a * b;
        System.out.println("Producto: " + producto);

        // División entera
        int division = a / b;
        System.out.println("División entera: " + division);

        // Residuo
        int residuo = a % b;
        System.out.println("Residuo: " + residuo);
    }
}


```

---

### Ejercicio 2 – División real vs división entera

```java
public class Main {

    public static void main(String[] args) {

        int x = 7;
        int y = 2;

        // División entera
        int divEntera = x / y;
        System.out.println("División entera: " + divEntera);

        // División real (casting a double)
        double divReal = (double)x / y;
        System.out.println("División real: " + divReal);

        // Explicación:
        // La división entera descarta los decimales, mientras que la división real preserva 
        // los decimales al convertir al menos un operando a double.
    }
}
```

---
### Ejercicio 3 – Operadores de asignación compuesta

```java
public class Main {

    public static void main(String[] args) {
        
        int contador = 10;

        contador += 5; // 10 + 5 = 15
        System.out.println("Después de +=5: " + contador);

        contador -= 3; // 15 - 3 = 12
        System.out.println("Después de -=3: " + contador);

        contador *= 2; // 12 * 2 = 24
        System.out.println("Después de *=2: " + contador);

        contador /= 4; // 24 / 4 = 6
        System.out.println("Después de /=4: " + contador);

        contador %= 3; // 6 % 3 = 0
        System.out.println("Después de %=3: " + contador);
    }
}
```

---

### Ejercicio 4 – Operadores relacionales

```java
public class Main {

    public static void main(String[] args) {
        
        int a = 8;
        int b = 12;

        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= 8: " + (a >= 8)); // true
        System.out.println("b <= 10: " + (b <= 10)); // false
    }
}
```
---

### Ejercicio 5 – Expresiones booleanas

```java
public class Main {

    public static void main(String[] args) {
        
        boolean esMayor = true;
        boolean tieneLicencia = false;

        // Puede conducir si es mayor y tiene licencia
        boolean puedeConducir = esMayor && tieneLicencia;
        System.out.println("Puede conducir: " + puedeConducir); // false

        // Puede realizar trámite si es mayor o tiene licencia
        boolean puedeTramite = esMayor || tieneLicencia;
        System.out.println("Puede realizar trámite: " + puedeTramite); // true

        // Negación
        boolean noEsMayor = !esMayor;
        System.out.println("No es mayor: " + noEsMayor); // false
    }
}
```
---

### Ejercicio 6 – Cortocircuito lógico

```java
public class Main {

    public static void main(String[] args) {
        
        int x = 0;

        // Usando &&
        boolean resultado = (x != 0) && (10 / x > 1);
        System.out.println("Resultado con &&: " + resultado); // false, no hay error

        // Explicación:
        // No se produce error porque && evalúa cortocircuito. 
        // Como (x != 0) es false, la segunda condición no se evalúa.
        // Si usamos & en lugar de &&, se evaluaría todo y se produciría ArithmeticException (división por cero).

    }
}
```
---

### Ejercicio 7 – Operadores unarios

```java
public class Main {

    public static void main(String[] args) {
        
        int n = 5;

        // Postincremento
        int post = n++;
        System.out.println("Postincremento: " + post + ", n = " + n);

        // Preincremento
        int pre = ++n;
        System.out.println("Preincremento: " + pre + ", n = " + n);

        // Negación aritmética
        int neg = -n;
        System.out.println("Negación aritmética: " + neg + ", n = " + n);
    }
}
```
---

### Ejercicio 8 – Precedencia de operadores

```java
public class Main {

    public static void main(String[] args) {
        
        int resultado1 = 10 + 5 * 2;    // 10 + (5*2) = 20
        int resultado2 = (10 + 5) * 2;  // (10+5)*2 = 30

        System.out.println("resultado1: " + resultado1);
        System.out.println("resultado2: " + resultado2);

        // Explicación:
        // La multiplicación tiene mayor precedencia que la suma.
        // Los paréntesis cambian el orden de evaluación.
    }
}
```
---

### Ejercicio 9 – Operador ternario

```java
public class Main {

    public static void main(String[] args) {
        
        int nota = 65;

        String mensaje = (nota >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Mensaje: " + mensaje); // Aprobado
    }
}
```
---

### Ejercicio 10 – Expresión completa

```java
public class Main {

    public static void main(String[] args) {
        
        int numero = 25;

        boolean esValido = (numero > 10) && (numero < 50) && (numero != 30);
        System.out.println("Número válido: " + esValido); // true para 25
    }
}
```
---

### Ejercicio 10 – Ejercicio desafío – Par o impar con operador ternario

```java
public class Main {

    public static void main(String[] args) {
        
        int num = 17;

        String tipo = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println(num + " es " + tipo); // Impar
    }
}
```
---

