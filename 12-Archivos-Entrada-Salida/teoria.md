# Archivos y Entrada/Salida (E/S) en Java

# 📌 Manejo de Archivos en Java

## 🎯 Objetivo de aprendizaje

Comprender el manejo de archivos y operaciones de entrada/salida en Java utilizando las clases `File`, `FileReader`, `FileWriter`, `BufferedReader` y `BufferedWriter` para desarrollar programas capaces de almacenar y recuperar información de forma persistente.

---

# 🧠 ¿Qué es un archivo?

Un archivo es una unidad de almacenamiento utilizada para guardar información de manera permanente en un dispositivo.

👉 Los archivos permiten conservar datos incluso después de cerrar un programa.

---

# 📦 Ejemplos de archivos

- `.txt`
- `.csv`
- `.json`
- `.xml`
- `.java`
- `.pdf`

---

# 🔥 ¿Por qué son importantes los archivos?

Los archivos permiten:

- Guardar información.
- Recuperar datos.
- Crear reportes.
- Persistir información.
- Compartir datos entre programas.
- Almacenar configuraciones.

---

# 🧩 ¿Qué es Entrada y Salida (E/S)?

La Entrada/Salida (Input/Output) hace referencia al proceso de:

| Operación | Descripción |
|---|---|
| Entrada | Leer información |
| Salida | Escribir información |

---

# 📌 Ejemplos

## Entrada
Leer:
- archivos,
- teclado,
- sensores,
- bases de datos.

---

## Salida
Escribir:
- archivos,
- pantalla,
- impresoras,
- reportes.

---

# 🔷 Paquete java.io

Java proporciona el paquete:

```java
java.io
```

Este paquete contiene clases para trabajar con archivos y flujos de datos.

---

# 🧠 Concepto de flujo (Stream)

Un flujo es una secuencia de datos que viaja desde un origen hacia un destino.

---

# 📌 Tipos de flujo

| Tipo | Función |
|---|---|
| InputStream | Lectura |
| OutputStream | Escritura |
| Reader | Lectura de caracteres |
| Writer | Escritura de caracteres |

---

# 🔥 Clase File

# 📌 ¿Qué es la clase File?

La clase `File` representa archivos y carpetas dentro del sistema operativo.

👉 No lee ni escribe directamente archivos.

👉 Su función principal es manipular rutas y propiedades de archivos.

---

# ✅ Importar File

```java
import java.io.File;
```

---

# 🔧 Crear un objeto File

## Sintaxis

```java
File archivo = new File("ruta");
```

---

# ✅ Ejemplo básico

```java
import java.io.File;

public class Main {

    public static void main(String[] args) {

        File archivo =
                new File("datos.txt");

        System.out.println(
                archivo.exists());

    }
}
```

---

# 🔍 Explicación

## `exists()`

Verifica si el archivo existe.

---

# 📌 Resultado

```text
true
```

o

```text
false
```

---

# 🔹 Métodos importantes de File

| Método | Descripción |
|---|---|
| `exists()` | Verifica existencia |
| `createNewFile()` | Crea archivo |
| `delete()` | Elimina archivo |
| `mkdir()` | Crea carpeta |
| `getName()` | Obtiene nombre |
| `getPath()` | Obtiene ruta |
| `length()` | Tamaño del archivo |

---

# ✅ Crear un archivo

```java
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws IOException {

        File archivo =
                new File("datos.txt");

        archivo.createNewFile();

    }
}
```

---

# 🔥 FileReader en Java

# 📌 ¿Qué es FileReader?

`FileReader` es una clase utilizada para leer archivos de texto carácter por carácter.

👉 Se utiliza principalmente para lectura simple de texto.

---

# ✅ Importar FileReader

```java
import java.io.FileReader;
```

---

# 🔧 Crear un FileReader

## Sintaxis

```java
FileReader lector =
        new FileReader("archivo.txt");
```

---

# ✅ Ejemplo básico

```java
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws IOException {

        FileReader lector =
                new FileReader("datos.txt");

        int caracter;

        while((caracter = lector.read()) != -1) {

            System.out.print((char) caracter);

        }

        lector.close();

    }
}
```

---

# 🔍 Explicación

## `read()`

Lee un carácter del archivo.

---

# 📌 Valor -1

Cuando `read()` retorna `-1`, significa que el archivo terminó.

---

# 🔹 close()

Cierra el flujo de lectura.

👉 Es importante liberar recursos.

---

# ⚠️ Problemas de FileReader

`FileReader` puede ser lento para archivos grandes porque:

- Lee carácter por carácter.
- Realiza muchas operaciones de acceso.

👉 Por eso existen clases bufferizadas.

---

# 🔥 FileWriter en Java

# 📌 ¿Qué es FileWriter?

`FileWriter` permite escribir texto dentro de archivos.

👉 Se utiliza para crear o modificar archivos de texto.

---

# ✅ Importar FileWriter

```java
import java.io.FileWriter;
```

---

# 🔧 Crear un FileWriter

## Sintaxis

```java
FileWriter escritor =
        new FileWriter("archivo.txt");
```

---

# ✅ Ejemplo básico

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws IOException {

        FileWriter escritor =
                new FileWriter("datos.txt");

        escritor.write("Hola mundo");

        escritor.close();

    }
}
```

---

# 🔍 Explicación

## `write()`

Escribe texto dentro del archivo.

---

# ⚠️ Sobrescritura

Por defecto:

```java
new FileWriter("archivo.txt")
```

sobrescribe el contenido anterior.

---

# ✅ Modo append

Para agregar contenido sin borrar:

```java
FileWriter escritor =
        new FileWriter("archivo.txt", true);
```

---

# 🔥 BufferedReader en Java

# 📌 ¿Qué es BufferedReader?

`BufferedReader` es una clase que permite leer texto utilizando un buffer interno.

👉 Esto mejora significativamente el rendimiento.

---

# 🧠 ¿Qué es un buffer?

Un buffer es una memoria temporal que almacena datos antes de procesarlos.

👉 Reduce accesos directos al disco.

---

# ✅ Ventajas de BufferedReader

- Mayor velocidad.
- Menor acceso al disco.
- Lectura línea por línea.
- Mejor rendimiento.

---

# ✅ Importar BufferedReader

```java
import java.io.BufferedReader;
```

---

# 🔧 Crear un BufferedReader

## Sintaxis

```java
BufferedReader br =
        new BufferedReader(
                new FileReader("archivo.txt"));
```

---

# ✅ Ejemplo básico

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new FileReader("datos.txt"));

        String linea;

        while((linea = br.readLine()) != null) {

            System.out.println(linea);

        }

        br.close();

    }
}
```

---

# 🔍 Explicación

## `readLine()`

Lee una línea completa del archivo.

---

# 📌 Valor null

Cuando `readLine()` retorna `null`, significa que el archivo terminó.

---

# 🔥 BufferedWriter en Java

# 📌 ¿Qué es BufferedWriter?

`BufferedWriter` permite escribir texto utilizando un buffer interno.

👉 Mejora el rendimiento al escribir archivos.

---

# ✅ Ventajas de BufferedWriter

- Escritura más rápida.
- Menor acceso al disco.
- Mejor rendimiento.

---

# ✅ Importar BufferedWriter

```java
import java.io.BufferedWriter;
```

---

# 🔧 Crear un BufferedWriter

## Sintaxis

```java
BufferedWriter bw =
        new BufferedWriter(
                new FileWriter("archivo.txt"));
```

---

# ✅ Ejemplo básico

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws IOException {

        BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("datos.txt"));

        bw.write("Hola mundo");
        bw.newLine();
        bw.write("Java es poderoso");

        bw.close();

    }
}
```

---

# 🔍 Explicación

## `newLine()`

Inserta un salto de línea.

---

# 🆚 FileReader vs BufferedReader

| FileReader | BufferedReader |
|---|---|
| Más simple | Más eficiente |
| Lectura carácter a carácter | Lectura por buffer |
| Más lento | Más rápido |

---

# 🆚 FileWriter vs BufferedWriter

| FileWriter | BufferedWriter |
|---|---|
| Escritura básica | Escritura optimizada |
| Más lento | Más eficiente |
| Acceso frecuente al disco | Uso de buffer |

---

# 🔥 Manejo de excepciones en archivos

Trabajar con archivos puede generar errores:

- Archivo inexistente.
- Permisos insuficientes.
- Ruta incorrecta.
- Archivo bloqueado.

👉 Por eso normalmente se usan bloques `try-catch`.

---

# ✅ Ejemplo con try-catch

```java
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try {

            FileReader lector =
                    new FileReader("datos.txt");

        } catch(Exception e) {

            System.out.println(
                    "Error al abrir archivo");

        }

    }
}
```

---

# 🎯 Buenas prácticas

## ✅ Cerrar archivos

Siempre usar:

```java
close();
```

---

## ✅ Usar BufferedReader y BufferedWriter

Especialmente en archivos grandes.

---

## ✅ Manejar excepciones

Evita que el programa falle abruptamente.

---

## ✅ Usar rutas claras

Evita rutas ambiguas o inválidas.

---

## ✅ Liberar recursos

Importante en aplicaciones reales.

---

# 🧩 Ejemplo aplicado

# Sistema simple de notas

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
            throws IOException {

        BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("notas.txt"));

        bw.write("Carlos - 4.5");
        bw.newLine();

        bw.write("Ana - 3.8");

        bw.close();

        System.out.println(
                "Archivo guardado");

    }
}
```

---

# 💡 Idea clave final

El manejo de archivos permite construir aplicaciones capaces de:

- Guardar información.
- Recuperar datos.
- Persistir información.
- Generar reportes.
- Trabajar con datos reales.

👉 Las clases `File`, `FileReader`, `FileWriter`, `BufferedReader` y `BufferedWriter` son fundamentales en el desarrollo de software profesional en Java.

---

# 📝 Ejercicios propuestos

## Ejercicio 1

Crear un programa que:
- cree un archivo,
- escriba texto,
- y lo cierre correctamente.

---

## Ejercicio 2

Leer un archivo de texto línea por línea usando `BufferedReader`.

---

## Ejercicio 3

Diseñar un sistema simple que almacene:
- nombres,
- notas,
- materias.

Usando archivos `.txt`.
