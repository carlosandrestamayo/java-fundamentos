# Soluciones – Estructuras de Control en Java

### Ejercicio 1 – Condicionales con rangos de valores
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        int temperatura = scanner.nextInt();

        if (temperatura < 10) {
            System.out.println("Hace frío 🥶");
        } else if (temperatura <= 25) {
            System.out.println("Clima agradable 🌤️");
        } else {
            System.out.println("Hace calor 🔥");
        }

        scanner.close();
    }
}


```

### Explicación lógica 

- Se utiliza `Scanner` para leer un valor ingresado por el usuario.
- Se usa if para evaluar la primera condición (`< 10`)
- Se usa else if para el rango intermedio (`10 a 25`)
- El else cubre automáticamente los valores mayores a `25`
- El orden importa: las condiciones se evalúan de arriba hacia abajo

---

## Ejercicio 2: Calcular el precio final con descuento

### Código en Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = entrada.nextDouble();

        double descuento = 0.0;
        double precioFinal;

        if (precioOriginal < 500) {
            descuento = 0;
        } else if (precioOriginal >= 500 && precioOriginal <= 1000) {
            descuento = precioOriginal * 0.10;
        } else {
            descuento = precioOriginal * 0.20;
        }

        precioFinal = precioOriginal - descuento;

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);

        entrada.close();
    }
}
```

### Explicación lógica 

- El programa solicita al usuario el precio inicial del producto.
- Se usa una estructura `if` / `else if` / `else` para evaluar rangos de valores.
- El descuento se calcula como un porcentaje del precio original.
- El precio final se obtiene restando el descuento al precio original.
- Las condiciones son excluyentes: solo una se ejecuta.

---

### Conceptos reforzados

- Entrada de datos con Scanner
- Condicionales con rangos
- Operadores relacionales (`<`, `>=`, `<=`)
- Operadores lógicos (`&&`)
- Uso de variables acumuladoras (`descuento`, `precioFinal`)

---

## Ejercicio 3 – Días de la Semana con `switch`

```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = entrada.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Día: Lunes");
                System.out.println("Tipo: Día laboral");
                break;

            case 2:
                System.out.println("Día: Martes");
                System.out.println("Tipo: Día laboral");
                break;

            case 3:
                System.out.println("Día: Miércoles");
                System.out.println("Tipo: Día laboral");
                break;

            case 4:
                System.out.println("Día: Jueves");
                System.out.println("Tipo: Día laboral");
                break;

            case 5:
                System.out.println("Día: Viernes");
                System.out.println("Tipo: Día laboral");
                break;

            case 6:
                System.out.println("Día: Sábado");
                System.out.println("Tipo: Fin de semana");
                System.out.println("Mensaje: ¡Tiempo para descansar! 😎");
                break;

            case 7:
                System.out.println("Día: Domingo");
                System.out.println("Tipo: Fin de semana");
                System.out.println("Mensaje: ¡Disfruta tu día! ☀️");
                break;

            default:
                System.out.println("Error: número inválido. Debe estar entre 1 y 7.");
        }

        entrada.close();
    }
}
```
---

## Ejercicio 4 – Sumar los números del 1 al 100 con `for`

A continuación se muestra una posible solución utilizando una estructura repetitiva `for` y una variable acumuladora.

```java
public class Main {

    public static void main(String[] args) {

        // Variable acumuladora para almacenar la suma total
        int suma = 0;

        // Ciclo for que recorre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            suma += i; // Se acumula el valor actual de i
        }

        // Se imprime el resultado final
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
```
---

## Ejercicio 5 – Determinar si un número es primo


```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        boolean esPrimo = true;

        // Validación inicial
        if (numero <= 1) {
            esPrimo = false;
        } else {

            // Se buscan divisores distintos de 1 y del propio número
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // Se detiene al encontrar un divisor
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        scanner.close();
    }
}
```
---

## Ejercicio 6 – Determinar si un número es perfecto (usando `while`)

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int sumaDivisores = 0;
        int i = 1;

        // Solo tiene sentido evaluar números mayores que 1
        if (numero > 1) {

            // Se recorren los posibles divisores propios
            while (i < numero) {
                if (numero % i == 0) {
                    sumaDivisores += i; // Se acumula el divisor
                }
                i++;
            }
        }

        if (sumaDivisores == numero) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto.");
        }

        scanner.close();
    }
}
```
---

## Ejercicio 7 – Validación de contraseña con `while`


```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contrasena = "";
        String contrasenaCorrecta = "admin";

        // El ciclo se repite mientras la contraseña sea incorrecta
        while (!contrasena.equals(contrasenaCorrecta)) {

            System.out.print("Ingrese la contraseña: ");
            contrasena = scanner.nextLine();

            if (!contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña incorrecta. Intente nuevamente.\n");
            }
        }

        System.out.println("Acceso concedido.");

        scanner.close();
    }
}
```

---

## Ejercicio 8 - Menú de opciones con `do-while`

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        // El menú se ejecuta al menos una vez
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar un mensaje motivacional");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n¡Hola! Bienvenido al programa.\n");
                    break;

                case 2:
                    System.out.println("\n¡Sigue aprendiendo, vas por muy buen camino! 🚀\n");
                    break;

                case 3:
                    System.out.println("\nPrograma finalizado.\n");
                    break;

                default:
                    System.out.println("\nOpción inválida. Intente nuevamente.\n");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
```
---
