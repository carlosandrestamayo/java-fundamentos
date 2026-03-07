# # Ejercicios Resueltos – Funciones y Referencias en Java

## Ejercicio 1: Conversor de Temperatura

```java
public class Ejercicio1 {
    public static void main(String[] args) {
        double celsius = 25.0;
        System.out.println(celsius + "°C equivale a " + celsiusAFahrenheit(celsius) + "°F");
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
```
---

## Ejercicio 2: Calculadora de IVA


```java
public class Ejercicio2 {
    public static void main(String[] args) {
        double precioBruto = 100.0;
        System.out.println("Precio final con IVA: $" + aplicarIVA(precioBruto));
    }

    public static double aplicarIVA(double precio) {
        return precio * 1.21;
    }
}
```

---

## Ejercicio 3: Validador de Paridad

```java
public class Ejercicio3 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("¿Es " + n + " par? " + esPar(n));
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
```

---

## Ejercicio 4: Clasificador de Notas

```java
public class Ejercicio4 {
    public static void main(String[] args) {
        int nota = 85;
        System.out.println("Resultado: " + obtenerEscala(nota));
    }

    public static String obtenerEscala(int nota) {
        if (nota >= 90) return "Excelente";
        else if (nota >= 70) return "Bueno";
        else return "Insuficiente";
    }
}
```

---

## Ejercicio 5: Generador de Correos

```java
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Correo: " + generarCorreo("Juan", "Perez"));
    }

    public static String generarCorreo(String nombre, String apellido) {
        String inicial = nombre.substring(0, 1).toLowerCase();
        String ape = apellido.toLowerCase();
        return inicial + "." + ape + "@empresa.com";
    }
}
```

---

## Ejercicio 6: Simulador de Cajero

```java
public class Ejercicio6 {
    public static void main(String[] args) {
        int saldo = 500;
        int monto = 120;
        System.out.println("¿Transacción permitida? " + puedeRetirar(saldo, monto));
    }

    public static boolean puedeRetirar(int saldo, int monto) {
        return (monto % 10 == 0) && (monto <= saldo);
    }
}
```

---

## Ejercicio 7: Buscador de Valor Máximo

```java
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] datos = {14, 55, 3, 91, 22};
        System.out.println("El valor máximo es: " + encontrarMayor(datos));
    }

    public static int encontrarMayor(int[] numeros) {
        int max = numeros[0];
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
```

---

## Ejercicio 8: Contador de Vocales

```java
public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = "Programacion en Java";
        System.out.println("Cantidad de vocales: " + contarVocales(frase));
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        String t = texto.toLowerCase();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
```

---

## Ejercicio 9: Promedio de una Matriz

```java
public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] notas = {{8, 9, 10}, {7, 6, 8}};
        System.out.println("El promedio total es: " + promedioMatriz(notas));
    }

    public static double promedioMatriz(int[][] matriz) {
        double suma = 0;
        int totalElementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                totalElementos++;
            }
        }
        return suma / totalElementos;
    }
}
```

---

## Ejercicio 10: Inversor de Arreglos

```java
public class Ejercicio10 {
    public static void main(String[] args) {
        String[] lenguajes = {"Java", "Python", "PHP", "C#"};
        String[] resultado = invertirArreglo(lenguajes);
        
        System.out.print("Invertido: ");
        for (String s : resultado) System.out.print(s + " ");
    }

    public static String[] invertirArreglo(String[] original) {
        String[] invertido = new String[original.length];
        int j = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            invertido[j] = original[i];
            j++;
        }
        return invertido;
    }
}
```

---