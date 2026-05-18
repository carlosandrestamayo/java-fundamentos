# Ejercicios Resueltos - Archivos y Entrada/Salida en Java

# 📌 Introducción

Los siguientes ejercicios tienen como objetivo reforzar el manejo de archivos en Java integrando conocimientos vistos anteriormente en el curso:

- Variables
- Condicionales
- Ciclos
- Funciones
- Arreglos
- Programación Orientada a Objetos
- Manejo de excepciones

👉 En esta sección aún NO se utilizan:
- Colecciones
- Programación genérica

---

# 🎯 Objetivos

- Crear y manipular archivos.
- Leer y escribir información.
- Aplicar manejo de excepciones.
- Integrar POO con persistencia básica.
- Comprender el flujo de Entrada/Salida (E/S).

---

# 🧩 Ejercicio 1
# Crear un archivo de texto

## 📌 Problema

Crear un programa que genere un archivo llamado:

```text
datos.txt
```

y muestre si el archivo fue creado correctamente.

---

# ✅ Solución

```java
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            File archivo =
                    new File("datos.txt");

            if(archivo.createNewFile()) {

                System.out.println(
                        "Archivo creado correctamente");

            } else {

                System.out.println(
                        "El archivo ya existe");

            }

        } catch(IOException e) {

            System.out.println(
                    "Error al crear archivo");

        }

    }
}
```

---

# 🔍 Explicación

## `File`

Representa un archivo dentro del sistema.

---

## `createNewFile()`

Crea físicamente el archivo.

---

## `IOException`

Captura errores relacionados con archivos.

---

# 📌 Resultado esperado

```text
Archivo creado correctamente
```

---

# 🧩 Ejercicio 2
# Escribir texto en un archivo

## 📌 Problema

Crear un programa que escriba información dentro de un archivo de texto.

---

# ✅ Solución

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter escritor =
                    new FileWriter("mensaje.txt");

            escritor.write(
                    "Bienvenidos al curso de Java");

            escritor.close();

            System.out.println(
                    "Información guardada");

        } catch(IOException e) {

            System.out.println(
                    "Error al escribir archivo");

        }

    }
}
```

---

# 🔍 Explicación

## `FileWriter`

Permite escribir información dentro de archivos.

---

## `write()`

Escribe texto.

---

## `close()`

Libera recursos y cierra el archivo.

---

# 📌 Resultado esperado

```text
Información guardada
```

---

# 🧩 Ejercicio 3
# Leer un archivo de texto

## 📌 Problema

Leer el contenido de un archivo usando `BufferedReader`.

---

# ✅ Solución

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader lector =
                    new BufferedReader(
                            new FileReader("mensaje.txt"));

            String linea;

            while((linea = lector.readLine()) != null) {

                System.out.println(linea);

            }

            lector.close();

        } catch(IOException e) {

            System.out.println(
                    "Error al leer archivo");

        }

    }
}
```

---

# 🔍 Explicación

## `BufferedReader`

Permite leer texto eficientemente.

---

## `readLine()`

Lee una línea completa.

---

# 📌 Resultado esperado

```text
Bienvenidos al curso de Java
```

---

# 🧩 Ejercicio 4
# Guardar notas de estudiantes

## 📌 Problema

Crear un programa que almacene nombres y notas de estudiantes en un archivo.

👉 Integrar:
- arreglos,
- ciclos,
- archivos.

---

# ✅ Solución

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] estudiantes =
                {"Carlos", "Ana", "Pedro"};

        double[] notas =
                {4.5, 3.8, 4.9};

        try {

            BufferedWriter escritor =
                    new BufferedWriter(
                            new FileWriter("notas.txt"));

            for(int i = 0; i < estudiantes.length; i++) {

                escritor.write(
                        estudiantes[i] +
                        " - " +
                        notas[i]);

                escritor.newLine();

            }

            escritor.close();

            System.out.println(
                    "Notas almacenadas");

        } catch(IOException e) {

            System.out.println(
                    "Error al guardar notas");

        }

    }
}
```

---

# 🔍 Explicación

## `BufferedWriter`

Escribe información usando buffer.

---

## `newLine()`

Agrega salto de línea.

---

## Integración de conceptos

Este ejercicio utiliza:
- arreglos,
- ciclos,
- archivos,
- excepciones.

---

# 📌 Resultado esperado

```text
Carlos - 4.5
Ana - 3.8
Pedro - 4.9
```

---

# 🧩 Ejercicio 5
# Sistema simple de usuarios

## 📌 Problema

Crear una clase `Usuario` y guardar la información de varios usuarios en un archivo.

👉 Integrar:
- clases,
- objetos,
- arreglos,
- archivos.

---

# ✅ Solución

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Usuario {

    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

}

public class Main {

    public static void main(String[] args) {

        Usuario[] usuarios = {

                new Usuario("Carlos", 28),
                new Usuario("Ana", 22),
                new Usuario("Pedro", 30)

        };

        try {

            BufferedWriter escritor =
                    new BufferedWriter(
                            new FileWriter("usuarios.txt"));

            for(int i = 0; i < usuarios.length; i++) {

                escritor.write(
                        usuarios[i].nombre +
                        " - " +
                        usuarios[i].edad);

                escritor.newLine();

            }

            escritor.close();

            System.out.println(
                    "Usuarios guardados");

        } catch(IOException e) {

            System.out.println(
                    "Error al guardar usuarios");

        }

    }
}
```

---

# 🔍 Explicación

## Integración con POO

El ejercicio utiliza:
- clases,
- objetos,
- constructores.

---

## Persistencia simple

Los datos quedan almacenados en:
```text
usuarios.txt
```

---

# 📌 Resultado esperado

```text
Carlos - 28
Ana - 22
Pedro - 30
```

---

# 🧩 Ejercicio 6
# Validar archivo existente

## 📌 Problema

Verificar si un archivo existe antes de leerlo.

👉 Integrar:
- condicionales,
- archivos.

---

# ✅ Solución

```java
import java.io.File;

public class Main {

    public static void main(String[] args) {

        File archivo =
                new File("datos.txt");

        if(archivo.exists()) {

            System.out.println(
                    "El archivo existe");

        } else {

            System.out.println(
                    "El archivo no existe");

        }

    }
}
```

---

# 🔍 Explicación

## `exists()`

Verifica la existencia del archivo.

---

# 📌 Resultado esperado

```text
El archivo existe
```

---

# 🧩 Ejercicio 7
# Contador de líneas

## 📌 Problema

Contar cuántas líneas tiene un archivo de texto.

👉 Integrar:
- ciclos,
- acumuladores,
- lectura de archivos.

---

# ✅ Solución

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int contador = 0;

        try {

            BufferedReader lector =
                    new BufferedReader(
                            new FileReader("notas.txt"));

            while(lector.readLine() != null) {

                contador++;

            }

            lector.close();

            System.out.println(
                    "Total líneas: " + contador);

        } catch(IOException e) {

            System.out.println(
                    "Error al leer archivo");

        }

    }
}
```

---

# 🔍 Explicación

## Acumulador

La variable `contador` almacena el número de líneas.

---

## Ciclo while

Recorre completamente el archivo.

---

# 📌 Resultado esperado

```text
Total líneas: 3
```

---

# 🧩 Ejercicio 8
# Registro de productos

## 📌 Problema

Crear una clase `Producto` y almacenar productos en un archivo.

👉 Integrar:
- POO,
- arreglos,
- archivos,
- excepciones.

---

# ✅ Solución

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;

    }

}

public class Main {

    public static void main(String[] args) {

        Producto[] productos = {

                new Producto("Teclado", 120.5),
                new Producto("Mouse", 80.0),
                new Producto("Monitor", 950.0)

        };

        try {

            BufferedWriter escritor =
                    new BufferedWriter(
                            new FileWriter("productos.txt"));

            for(int i = 0; i < productos.length; i++) {

                escritor.write(
                        productos[i].nombre +
                        " - $" +
                        productos[i].precio);

                escritor.newLine();

            }

            escritor.close();

            System.out.println(
                    "Productos guardados");

        } catch(IOException e) {

            System.out.println(
                    "Error al guardar productos");

        }

    }
}
```

---

# 🔍 Explicación

## Integración de temas anteriores

Este ejercicio combina:
- POO,
- arreglos,
- ciclos,
- archivos,
- manejo de excepciones.

---

# 📌 Resultado esperado

```text
Teclado - $120.5
Mouse - $80.0
Monitor - $950.0
```

---

# 🎯 Buenas prácticas aprendidas

## ✅ Cerrar archivos

Siempre utilizar:

```java
close();
```

---

## ✅ Manejar excepciones

Usar:
```java
try-catch
```

---

## ✅ Validar archivos

Antes de leer información.

---

## ✅ Usar BufferedReader y BufferedWriter

Mejor rendimiento.

---

# 💡 Idea clave final

El manejo de archivos permite crear programas capaces de:

- almacenar información,
- generar reportes,
- recuperar datos,
- y construir persistencia básica.

👉 Integrar archivos con POO y manejo de excepciones es un paso fundamental hacia el desarrollo de aplicaciones reales.
