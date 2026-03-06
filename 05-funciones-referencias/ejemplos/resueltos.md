# Ejemplos Funciones y referencias en Java

## 1. Paso por Valor (Tipos Primitivos)
En Java, los primitivos siempre se pasan por valor. El método recibe una copia del dato; si el método cambia el valor, la variable original fuera del método no se ve afectada.

```java
public class EjemploValor {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Antes del método: " + numero); // Imprime 10
        
        modificarPrimitivo(numero);
        
        System.out.println("Después del método: " + numero); // Sigue siendo 10
    }

    public static void modificarPrimitivo(int n) {
        n = n + 50; // Solo cambia la copia local 'n'
        System.out.println("Dentro del método: " + n); // Imprime 60
    }
}
```
---

## 2. Paso por Referencia (Objetos y Arreglos)
Cuando pasas un objeto o un arreglo, Java pasa la copia de la referencia (la dirección de memoria). Si modificas el contenido del objeto dentro del método, el cambio afecta al objeto original porque ambos apuntan al mismo lugar en el Heap.

```java
public class EjemploReferencia {
    public static void main(String[] args) {
        int[] misNotas = {5, 8, 10};
        System.out.println("Nota original en índice 0: " + misNotas[0]); // 5

        modificarArreglo(misNotas);

        System.out.println("Nota final en índice 0: " + misNotas[0]); // 99
    }

    public static void modificarArreglo(int[] arreglo) {
        // 'arreglo' apunta a la misma dirección que 'misNotas'
        arreglo[0] = 99; 
        System.out.println("Dentro del método se cambió a 99");
    }
}
```
---
## 3. El caso especial de `String` (Inmutabilidad)
Aunque `String` es un objeto, se comporta de forma peculiar porque es inmutable. Al intentar "modificarlo", Java crea un nuevo objeto en memoria, por lo que la variable original no cambia.


```java
public class EjemploString {
    public static void main(String[] args) {
        String nombre = "Java";
        modificarString(nombre);
        System.out.println("Nombre en main: " + nombre); // Sigue siendo "Java"
    }

    public static void modificarString(String texto) {
        texto = texto + " Avanzado"; // Crea un NUEVO objeto, no modifica el original
    }
}
```
---

## 4. Retorno de múltiples valores (vía Arreglos)
Como un método solo puede devolver un valor con `return`, los arreglos son una técnica común para "devolver" varios datos procesados.

```java
public class CalculadoraArrays {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Llamamos al método que devuelve un array con dos resultados
        int[] resultados = calcular(a, b);

        System.out.println("Suma: " + resultados[0]);
        System.out.println("Resta: " + resultados[1]);
    }

    public static int[] calcular(int x, int y) {
        int suma = x + y;
        int resta = x - y;
        return new int[]{suma, resta}; // Retornamos el arreglo
    }
}
```
---

## 5. Métodos con Lógica Condicional (`if-else`)
Este es el ejemplo clásico para enseñar que un método puede tener múltiples puntos de salida (`return`), pero solo uno se ejecutará.

```java
public class Verificador {
    public static void main(String[] args) {
        int a = 15, b = 25;
        int elMayor = obtenerMayor(a, b);
        System.out.println("El número más grande es: " + elMayor);
    }

    /**
     * Compara dos números y retorna el de mayor valor.
     */
    public static int obtenerMayor(int n1, int n2) {
        if (n1 > n2) {
            return n1; // Sale del método devolviendo n1
        } else {
            return n2; // Sale del método devolviendo n2
        }
    }
}
```
## 6. Procesamiento de Arreglos (Acumuladores)
Un uso fundamental de los métodos con `return int` es procesar una estructura de datos (como un array) y devolver un valor calculado (suma, promedio, conteo).

```java
public class Estadisticas {
    public static void main(String[] args) {
        int[] ventas = {100, 250, 50, 300};
        
        int totalVentas = sumarVentas(ventas);
        System.out.println("El total de la jornada es: $" + totalVentas);
    }

    public static int sumarVentas(int[] arreglo) {
        int acumulador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            acumulador += arreglo[i];
        }
        return acumulador; // Retorna la suma total
    }
}
```
---

## 7. Búsqueda y Centinelas
En programación, es común devolver un número específico para indicar que algo no se encontró (normalmente -1). Esto enseña al alumno a manejar errores o ausencias de datos.

```java
public class Buscador {
    public static void main(String[] args) {
        int[] inventario = {101, 202, 303, 404, 505};
        int buscar = 303;

        int posicion = buscarProducto(inventario, buscar);

        if (posicion != -1) {
            System.out.println("Producto encontrado en el índice: " + posicion);
        } else {
            System.out.println("Error: Producto no encontrado.");
        }
    }

    public static int buscarProducto(int[] lista, int id) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == id) {
                return i; // Retorna el índice si lo encuentra y termina el método
            }
        }
        return -1; // "Centinela": indica que recorrió todo y no encontró nada
    }
}
```

---

## 8. Transformación de Datos (Lógica Matemática)
Este ejemplo muestra cómo un método puede encapsular una fórmula, haciendo el código principal (main) mucho más legible.

```java
public class Conversor {
    public static void main(String[] args) {
        int minutos = 135;
        int horasCompletas = calcularHoras(minutos);
        
        System.out.println(minutos + " minutos equivalen a " + horasCompletas + " horas completas.");
    }

    public static int calcularHoras(int totalMinutos) {
        // Aprovechamos la división entera de Java (Unit 2)
        int resultado = totalMinutos / 60;
        return resultado;
    }
}
```
---

## 9. Métodos con `return boolean` (Predicados)
En programación, los métodos que devuelven un booleano suelen usarse para validaciones y se nombran con prefijos como es, tiene o puede.

```java
public class Validador {
    public static void main(String[] args) {
        int edadUsuario = 20;
        
        if (esMayorDeEdad(edadUsuario)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }

    // Un método booleano es ideal para limpiar los "if" del main
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18; // Retorna el resultado de la comparación lógica
    }
}
```

---

## 10. Métodos con `return String` (Formateo de datos)
Estos métodos son útiles para transformar datos crudos en mensajes amigables para el usuario.

### Métodos `toUpperCase()` y `toLowerCase()`
Estos métodos se utilizan para transformar todos los caracteres de una cadena a mayúsculas o minúsculas, respectivamente. Son esenciales para normalizar datos (por ejemplo, comparar correos electrónicos sin importar cómo se escribieron).

- `toUpperCase():` Convierte toda la cadena a MAYÚSCULAS.

- `toLowerCase():` Convierte toda la cadena a minúsculas.

**Ejemplo de código:**

```java
String original = "Hola Mundo";

String grito = original.toUpperCase(); // "HOLA MUNDO"
String susurro = original.toLowerCase(); // "hola mundo"

System.out.println(original); // Sigue siendo "Hola Mundo" (Inmutabilidad)
```

### Método `substring()`
Este método se utiliza para extraer una parte (una "sub-cadena") de un String original. Existen dos formas principales de usarlo:

1. Con un solo parámetro: `substring(int inicio)`
Extrae desde el índice indicado hasta el final de la cadena.

```java
String frase = "Programación en Java";
String parte = frase.substring(13); // "en Java"
```

2. Con dos parámetros: `substring(int inicio, int fin)`Extrae desde el índice inicio hasta el índice fin sin incluir el carácter en la posición fin.Regla de oro: El índice inicial es inclusivo, el final es exclusivo.[inicio, fin)Ejemplo detallado:

```java
String canal = "YouTube";
// Queremos extraer "You"
// Y=0, o=1, u=2, T=3...
String soloYou = canal.substring(0, 3); // Extrae índices 0, 1 y 2. El 3 (T) queda fuera.

System.out.println(soloYou); // "You"
```

### Ejemplo Integrador: Capitalizar un nombre
Es muy común combinar estos métodos para corregir nombres propios (poner la primera letra en mayúscula y el resto en minúscula).

```java
public class Capitalizador {
    public static void main(String[] args) {
        String entrada = "mArTa";
        String resultado = formatearNombre(entrada);
        System.out.println(resultado); // Imprime "Marta"
    }

    public static String formatearNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) return nombre;

        // 1. Tomamos la primera letra y la hacemos mayúscula
        String primeraLetra = nombre.substring(0, 1).toUpperCase();

        // 2. Tomamos el resto de la cadena y la hacemos minúscula
        String resto = nombre.substring(1).toLowerCase();

        // 3. Unimos ambas partes
        return primeraLetra + resto;
    }
}

```

### Ejemplo Formato de Nombres de Usuario
En muchas aplicaciones, los usuarios ingresan sus datos (como nombre y apellido) de forma descuidada, utilizando solo letras minúsculas o mezclando mayúsculas y minúsculas sin orden. Para que una interfaz se vea profesional, es necesario normalizar estos datos antes de mostrarlos.

```java
public class Formateador {
    public static void main(String[] args) {
        String nombre = "ana";
        String apellido = "perez";
        
        String nombreCompleto = obtenerNombreFormateado(nombre, apellido);
        System.out.println("Bienvenida: " + nombreCompleto);
    }

    public static String obtenerNombreFormateado(String nom, String ape) {
        // Combinamos mayúsculas y concatenación
        String n = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        String a = ape.substring(0, 1).toUpperCase() + ape.substring(1);
        
        return a + ", " + n; // Retorna "Perez, Ana"
    }
}
```
---

## 11. Función llamando a otra función (Modularización)
Este es el concepto más importante para que el alumno aprenda a dividir y vencer. Un método de alto nivel coordina a métodos de bajo nivel.

```java
public class SistemaVentas {
    public static void main(String[] args) {
        double precioBase = 100.0;
        int cantidad = 3;

        // El main solo llama a la función principal
        imprimirRecibo(precioBase, cantidad);
    }

    public static void imprimirRecibo(double precio, int cant) {
        double subtotal = precio * cant;
        double impuesto = calcularImpuesto(subtotal); // Llamada a otra función
        double total = subtotal + impuesto;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (16%): $" + impuesto);
        System.out.println("Total a pagar: $" + total);
    }

    // Función especializada en una sola tarea
    public static double calcularImpuesto(double monto) {
        return monto * 0.16;
    }
}
```
---

## 12. Composición Lógica (Refactorización)
Otro ejemplo común es usar una función de validación dentro de una función de procesamiento.

```java
public class LoginSistema {
    public static void main(String[] args) {
        intentarAcceso("admin", "12345");
    }

    public static void intentarAcceso(String user, String pass) {
        // Llamamos a la función de validación
        if (validarCredenciales(user, pass)) {
            System.out.println("Cargando Panel de Control...");
        } else {
            System.out.println("Usuario o clave incorrectos.");
        }
    }

    public static boolean validarCredenciales(String u, String p) {
        // En un caso real, aquí se consultaría una base de datos
        return u.equals("admin") && p.equals("12345");
    }
}
```
---

