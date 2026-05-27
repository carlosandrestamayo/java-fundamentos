# 📚 Guía Completa — Sistema de Gestión de Libros en Java

## 🎯 Objetivo del Proyecto

Desarrollar una aplicación de consola en Java que permita administrar una colección de libros utilizando:

- Programación Orientada a Objetos (POO)
- `ArrayList`
- `List`
- Manejo de archivos
- `Path`
- `Paths`
- `Files`
- `BufferedReader`
- `BufferedWriter`
- `try-with-resources`

Además, el sistema deberá:

- Agregar libros
- Listar libros
- Editar libros
- Eliminar libros
- Ordenar libros alfabéticamente
- Guardar información en archivos
- Recuperar información automáticamente

---

# 🧠 Contexto del Problema

Una pequeña biblioteca desea digitalizar el registro de sus libros utilizando un programa desarrollado en Java.

El sistema debe permitir:

- Registrar libros
- Consultar libros almacenados
- Editar información
- Eliminar registros
- Ordenar los libros alfabéticamente
- Guardar permanentemente la información en archivos

---

# 🏗️ Estructura del Proyecto

```plaintext
ProyectoBiblioteca/
│
│
├── Main.java
│   │
├── Models/
│    └── Libro.java
│
├── Services/
│      └── LibroService.java
│   
├── Data/
│       └── libros.txt
```

---

# 📘 Main.java

```java
import Models.Libro;
import Services.LibroService;

import java.util.Scanner;

/**
 * Clase principal del programa.
 *
 * Esta clase contiene:
 * - El menú principal
 * - La interacción con el usuario
 * - Validaciones
 * - Llamados a los métodos del servicio
 */
public class Main {

    public static void main(String[] args) {

        // =====================================
        // SCANNER
        // =====================================

        /**
         * Scanner permite leer datos
         * ingresados desde teclado.
         */
        Scanner sc = new Scanner(System.in);

        // =====================================
        // SERVICIO
        // =====================================

        /**
         * Objeto encargado de manejar:
         * - Agregar libros
         * - Editar libros
         * - Eliminar libros
         * - Leer archivos
         * - Guardar archivos
         */
        LibroService service = new LibroService();

        // =====================================
        // VARIABLE MENÚ
        // =====================================

        /**
         * Variable que almacena
         * la opción del usuario.
         */
        int opcion;

        // =====================================
        // CICLO PRINCIPAL
        // =====================================

        /**
         * El programa se ejecutará
         * hasta que el usuario
         * seleccione la opción 6.
         */
        do {

            // =====================================
            // MENÚ
            // =====================================

            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Editar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Ordenar libros");
            System.out.println("6. Salir");
            System.out.print("Seleccione: ");

            // =====================================
            // VALIDAR OPCIÓN
            // =====================================

            /**
             * Se utiliza try-catch
             * para evitar errores
             * cuando el usuario
             * escribe letras.
             */
            try {

                /**
                 * nextLine() lee texto.
                 *
                 * Integer.parseInt()
                 * convierte el texto
                 * en número entero.
                 */
                opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {

                /**
                 * Si el usuario escribe
                 * algo inválido,
                 * el programa NO se rompe.
                 */
                System.out.println("Error: debe ingresar un número");

                opcion = 0;
            }

            // =====================================
            // SWITCH
            // =====================================

            /**
             * switch permite ejecutar
             * diferentes bloques
             * dependiendo de la opción.
             */
            switch (opcion) {

                // =====================================
                // AGREGAR LIBRO
                // =====================================

                case 1:

                    int id;

                    try {

                        System.out.print("ID: ");

                        /**
                         * Validación del ID.
                         */
                        id = Integer.parseInt(sc.nextLine());

                    } catch (NumberFormatException e) {

                        System.out.println("ID inválido");

                        break;
                    }

                    // Leer título
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    // Leer autor
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    // =====================================
                    // CREAR OBJETO
                    // =====================================

                    /**
                     * Se crea un objeto
                     * de tipo Libro.
                     */
                    Libro libro = new Libro(id, titulo, autor);

                    // =====================================
                    // AGREGAR LIBRO
                    // =====================================

                    /**
                     * El libro se envía
                     * al servicio.
                     */
                    service.agregarLibro(libro);

                    break;

                // =====================================
                // LISTAR LIBROS
                // =====================================

                case 2:

                    /**
                     * Mostrar todos los libros.
                     */
                    service.listarLibros();

                    break;

                // =====================================
                // EDITAR LIBRO
                // =====================================

                case 3:

                    int idEditar;

                    try {

                        System.out.print("ID del libro: ");

                        idEditar = Integer.parseInt(sc.nextLine());

                    } catch (NumberFormatException e) {

                        System.out.println("ID inválido");

                        break;
                    }

                    // Leer nuevo título
                    System.out.print("Nuevo título: ");
                    String nuevoTitulo = sc.nextLine();

                    // Leer nuevo autor
                    System.out.print("Nuevo autor: ");
                    String nuevoAutor = sc.nextLine();

                    /**
                     * Editar información.
                     */
                    service.editarLibro(
                            idEditar,
                            nuevoTitulo,
                            nuevoAutor
                    );

                    break;

                // =====================================
                // ELIMINAR LIBRO
                // =====================================

                case 4:

                    int idEliminar;

                    try {

                        System.out.print("ID del libro: ");

                        idEliminar = Integer.parseInt(sc.nextLine());

                    } catch (NumberFormatException e) {

                        System.out.println("ID inválido");

                        break;
                    }

                    /**
                     * Eliminar libro.
                     */
                    service.eliminarLibro(idEliminar);

                    break;

                // =====================================
                // ORDENAR LIBROS
                // =====================================

                case 5:

                    /**
                     * Ordenar libros
                     * alfabéticamente.
                     */
                    service.ordenarPorTitulo();

                    System.out.println("Libros ordenados correctamente");

                    break;

                // =====================================
                // SALIR
                // =====================================

                case 6:

                    System.out.println("Programa finalizado");

                    break;

                // =====================================
                // OPCIÓN INVÁLIDA
                // =====================================

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 6);

        // =====================================
        // CERRAR SCANNER
        // =====================================

        /**
         * Siempre es buena práctica
         * cerrar recursos.
         */
        sc.close();
    }
}
```

---

# 🧠 Conceptos Aprendidos

| Tema | Explicación |
|---|---|
| `Scanner` | Leer datos desde teclado |
| `switch` | Crear menús |
| `do-while` | Repetir menú |
| `try-catch` | Manejo de errores |
| `Integer.parseInt()` | Convertir texto a número |
| Objetos | Crear libros |
| Servicios | Separar lógica |
| Validaciones | Evitar fallos |

---

# 🚀 Buenas Prácticas Aplicadas

## ✅ Leer siempre con `nextLine()`

Esto evita problemas comunes de `nextInt()`.

---

## ✅ Validar entradas

El programa nunca se rompe si el usuario escribe letras.

---

## ✅ Separar responsabilidades

- `Main` → interacción
- `LibroService` → lógica
- `Libro` → modelo de datos

---

# 📌 Resultado

Este archivo implementa un menú CRUD profesional en consola utilizando Java moderno y buenas prácticas de programación.

---

# 📘 Libro.java

## 📌 Ubicación del Archivo

```plaintext
Models/Libro.java
```

---

# 🧠 ¿Qué es esta clase?

La clase `Libro` representa un objeto de tipo libro dentro del sistema.

Esta clase es conocida como:

- Modelo
- Entidad
- Clase de datos

Su función es almacenar información relacionada con un libro.

---

# 📦 Código Completo Comentado

```java
// ===============================
// ARCHIVO: Models/Libro.java
// ===============================

package Models;

/**
 * Clase Libro
 *
 * Esta clase representa un libro
 * dentro del sistema.
 *
 * Contiene:
 * - id
 * - titulo
 * - autor
 */
public class Libro {

    // =====================================
    // ATRIBUTOS
    // =====================================

    /**
     * Identificador único del libro.
     */
    private int id;

    /**
     * Nombre o título del libro.
     */
    private String titulo;

    /**
     * Autor del libro.
     */
    private String autor;

    // =====================================
    // CONSTRUCTOR
    // =====================================

    /**
     * Constructor de la clase Libro.
     *
     * Se ejecuta automáticamente
     * al crear un objeto.
     *
     * @param id identificador del libro
     * @param titulo nombre del libro
     * @param autor autor del libro
     */
    public Libro(int id, String titulo, String autor) {

        this.id = id;

        this.titulo = titulo;

        this.autor = autor;
    }

    // =====================================
    // GETTERS
    // =====================================

    /**
     * Obtener el ID.
     */
    public int getId() {

        return id;
    }

    /**
     * Obtener el título.
     */
    public String getTitulo() {

        return titulo;
    }

    /**
     * Obtener el autor.
     */
    public String getAutor() {

        return autor;
    }

    // =====================================
    // SETTERS
    // =====================================

    /**
     * Modificar el título.
     */
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    /**
     * Modificar el autor.
     */
    public void setAutor(String autor) {

        this.autor = autor;
    }

    // =====================================
    // toString()
    // =====================================

    /**
     * Convierte el objeto en texto.
     *
     * Este método será utilizado
     * para guardar información
     * en archivos.
     */
    @Override
    public String toString() {

        return id + "," + titulo + "," + autor;
    }
}
```

---

# 🧠 Explicación Pedagógica

## 📌 ¿Qué es un atributo?

Los atributos son variables internas del objeto.

En este caso:

```java
private int id;
private String titulo;
private String autor;
```

representan las características del libro.

---

# 📌 ¿Qué significa `private`?

`private` significa:

✅ Solo la clase puede acceder directamente a esos datos.

Esto se llama:

# 🔒 Encapsulamiento

Una de las bases de la Programación Orientada a Objetos (POO).

---

# 📌 ¿Qué hace el constructor?

El constructor inicializa el objeto.

Ejemplo:

```java
Libro libro = new Libro(
        1,
        "Clean Code",
        "Robert Martin"
);
```

Cuando se ejecuta:

```java
new Libro(...)
```

el constructor asigna valores a los atributos.

---

# 📌 ¿Qué significa `this`?

`this` hace referencia al objeto actual.

Ejemplo:

```java
this.id = id;
```

Significa:

👉 El atributo `id` del objeto
recibe el valor del parámetro `id`.

---

# 📌 ¿Qué hacen los getters?

Permiten obtener información.

Ejemplo:

```java
libro.getTitulo()
```

Retorna:

```plaintext
Clean Code
```

---

# 📌 ¿Qué hacen los setters?

Permiten modificar información.

Ejemplo:

```java
libro.setTitulo("Java Básico");
```

---

# 📌 ¿Qué hace `toString()`?

Convierte el objeto en texto.

Resultado:

```plaintext
1,Clean Code,Robert Martin
```

Esto es muy útil para:

- Guardar archivos
- Mostrar información
- Exportar datos

---

# 📌 ¿Por qué sobrescribimos `toString()`?

Porque Java tiene un `toString()` por defecto.

Pero normalmente muestra algo así:

```plaintext
Libro@4f023edb
```

Eso NO es útil.

Por eso creamos nuestra propia versión.

---

# 🚀 Conceptos Aprendidos

| Tema | Explicación |
|---|---|
| Clase | Plantilla de objetos |
| Objeto | Instancia de una clase |
| Atributos | Datos internos |
| Constructor | Inicializar objetos |
| Encapsulamiento | Protección de datos |
| Getters | Obtener datos |
| Setters | Modificar datos |
| `this` | Referencia al objeto actual |
| `toString()` | Convertir objeto a texto |

---

# 📌 Resultado Final

La clase `Libro` permite:

✅ Crear libros  
✅ Guardar información  
✅ Modificar datos  
✅ Leer atributos  
✅ Convertir objetos en texto  

y funciona como la base principal del sistema.

---

# 📘 LibroService.java

## 📌 Ubicación del Archivo

```plaintext
Services/LibroService.java
```

---

# 🧠 ¿Qué hace esta clase?

La clase `LibroService` se encarga de toda la lógica del sistema.

Aquí se realizan operaciones como:

- Agregar libros
- Listar libros
- Editar libros
- Eliminar libros
- Ordenar libros
- Guardar archivos
- Leer archivos

Esta clase es conocida como:

# ⚙️ Clase de Servicio

porque contiene la lógica principal de la aplicación.

---

# 📦 Código Completo Comentado

```java
// =====================================
// ARCHIVO: Services/LibroService.java
// =====================================

package Services;

// Importar clase Libro
import Models.Libro;

// Importaciones para manejo de archivos
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

// Importaciones modernas de Java NIO
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Importaciones de colecciones
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Clase encargada de:
 *
 * - Gestionar libros
 * - Manejar archivos
 * - Ordenar información
 * - Leer datos
 * - Guardar datos
 */
public class LibroService {

    // =====================================
    // ARRAYLIST
    // =====================================

    /**
     * Lista donde se almacenan
     * los libros en memoria.
     */
    private List<Libro> libros = new ArrayList<>();

    // =====================================
    // RUTA DEL ARCHIVO
    // =====================================

    /**
     * Ruta del archivo de texto.
     */
    private final Path ruta = Paths.get("Data/libros.txt");

    // =====================================
    // CONSTRUCTOR
    // =====================================

    /**
     * El constructor se ejecuta
     * automáticamente al crear
     * el objeto.
     */
    public LibroService() {

        // Crear carpeta y archivo
        crearCarpeta();

        // Cargar información
        cargarArchivo();
    }

    // =====================================
    // CREAR CARPETA Y ARCHIVO
    // =====================================

    /**
     * Crea automáticamente:
     *
     * - Carpeta Data
     * - Archivo libros.txt
     */
    private void crearCarpeta() {

        try {

            /**
             * Crear carpeta.
             */
            Files.createDirectories(Paths.get("Data"));

            /**
             * Verificar si el archivo existe.
             */
            if (!Files.exists(ruta)) {

                /**
                 * Crear archivo.
                 */
                Files.createFile(ruta);
            }

        } catch (IOException e) {

            System.out.println("Error creando carpeta");
        }
    }

    // =====================================
    // AGREGAR LIBRO
    // =====================================

    /**
     * Agrega un libro al ArrayList.
     */
    public void agregarLibro(Libro libro) {

        /**
         * Agregar libro a la lista.
         */
        libros.add(libro);

        /**
         * Guardar cambios en archivo.
         */
        guardarArchivo();

        System.out.println("Libro agregado correctamente");
    }

    // =====================================
    // LISTAR LIBROS
    // =====================================

    /**
     * Mostrar todos los libros.
     */
    public void listarLibros() {

        /**
         * Validar si la lista está vacía.
         */
        if (libros.isEmpty()) {

            System.out.println("No hay libros");

            return;
        }

        /**
         * Recorrer ArrayList.
         */
        for (Libro libro : libros) {

            System.out.println("--------------------");
            System.out.println("ID: " + libro.getId());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
        }
    }

    // =====================================
    // EDITAR LIBRO
    // =====================================

    /**
     * Modifica un libro utilizando su ID.
     */
    public void editarLibro(
            int id,
            String nuevoTitulo,
            String nuevoAutor
    ) {

        /**
         * Recorrer libros.
         */
        for (Libro libro : libros) {

            /**
             * Buscar coincidencia.
             */
            if (libro.getId() == id) {

                /**
                 * Actualizar datos.
                 */
                libro.setTitulo(nuevoTitulo);

                libro.setAutor(nuevoAutor);

                /**
                 * Guardar cambios.
                 */
                guardarArchivo();

                System.out.println("Libro editado");

                return;
            }
        }

        System.out.println("Libro no encontrado");
    }

    // =====================================
    // ELIMINAR LIBRO
    // =====================================

    /**
     * Elimina un libro utilizando su ID.
     */
    public void eliminarLibro(int id) {

        /**
         * Variable auxiliar.
         */
        Libro libroEliminar = null;

        /**
         * Buscar libro.
         */
        for (Libro libro : libros) {

            if (libro.getId() == id) {

                libroEliminar = libro;

                break;
            }
        }

        /**
         * Validar si existe.
         */
        if (libroEliminar != null) {

            /**
             * Eliminar libro.
             */
            libros.remove(libroEliminar);

            /**
             * Guardar cambios.
             */
            guardarArchivo();

            System.out.println("Libro eliminado");

        } else {

            System.out.println("Libro no encontrado");
        }
    }

    // =====================================
    // ORDENAR LIBROS
    // =====================================

    /**
     * Ordenar libros alfabéticamente.
     */
    public void ordenarPorTitulo() {

        /**
         * Comparator permite ordenar.
         */
        libros.sort(

                Comparator.comparing(

                        /**
                         * Ordenar por título.
                         */
                        Libro::getTitulo,

                        /**
                         * Ignorar mayúsculas.
                         */
                        String.CASE_INSENSITIVE_ORDER
                )
        );

        System.out.println("Libros ordenados");
    }

    // =====================================
    // GUARDAR ARCHIVO
    // =====================================

    /**
     * Guarda todos los libros
     * en el archivo de texto.
     */
    public void guardarArchivo() {

        /**
         * try-with-resources
         *
         * Cierra automáticamente
         * el archivo.
         */
        try (BufferedWriter bw =
                     Files.newBufferedWriter(ruta)) {

            /**
             * Recorrer libros.
             */
            for (Libro libro : libros) {

                /**
                 * Escribir línea.
                 */
                bw.write(libro.toString());

                /**
                 * Salto de línea.
                 */
                bw.newLine();
            }

        } catch (IOException e) {

            System.out.println("Error al guardar");
        }
    }

    // =====================================
    // CARGAR ARCHIVO
    // =====================================

    /**
     * Lee el archivo y carga
     * la información al ArrayList.
     */
    public void cargarArchivo() {

        try (BufferedReader br =
                     Files.newBufferedReader(ruta)) {

            String linea;

            /**
             * Leer línea por línea.
             */
            while ((linea = br.readLine()) != null) {

                /**
                 * Separar datos por comas.
                 */
                String[] datos = linea.split(",");

                /**
                 * Convertir datos.
                 */
                int id = Integer.parseInt(datos[0]);

                String titulo = datos[1];

                String autor = datos[2];

                /**
                 * Crear objeto Libro.
                 */
                libros.add(
                        new Libro(id, titulo, autor)
                );
            }

        } catch (IOException e) {

            System.out.println("Error al cargar");
        }
    }
}
```

---

# 🧠 Explicación Pedagógica

# 📌 ¿Qué es un Service?

Una clase Service contiene:

✅ La lógica del sistema  
✅ Operaciones principales  
✅ Reglas del programa  

---

# 📌 ¿Por qué usamos `List` y `ArrayList`?

```java
private List<Libro> libros = new ArrayList<>();
```

## `List`

Es una interfaz.

## `ArrayList`

Es una implementación de List.

Esto permite:

- Más flexibilidad
- Buenas prácticas
- Código más profesional

---

# 📌 ¿Qué hace `ArrayList`?

Permite:

✅ Agregar elementos  
✅ Eliminar elementos  
✅ Recorrer información  
✅ Ordenar datos  

---

# 📌 ¿Qué es `Path`?

```java
Path ruta = Paths.get(...)
```

Representa una ruta de archivo moderna en Java.

---

# 📌 ¿Qué hace `Files`?

La clase `Files` permite:

- Crear carpetas
- Crear archivos
- Leer archivos
- Escribir archivos

---

# 📌 ¿Qué es `BufferedReader`?

Permite leer archivos línea por línea.

Ejemplo:

```java
br.readLine()
```

---

# 📌 ¿Qué es `BufferedWriter`?

Permite escribir archivos de forma eficiente.

---

# 📌 ¿Qué es `try-with-resources`?

```java
try (...) {

}
```

Cierra automáticamente archivos y recursos.

Es mucho más seguro.

---

# 📌 ¿Qué hace `Comparator`?

Permite ordenar objetos.

Ejemplo:

```java
Comparator.comparing(...)
```

---

# 📌 ¿Qué hace `split()`?

```java
linea.split(",")
```

Divide el texto utilizando comas.

Ejemplo:

```plaintext
1,Java,James Gosling
```

Se convierte en:

```plaintext
[1]
[Java]
[James Gosling]
```

---

# 📌 ¿Qué hace `Integer.parseInt()`?

Convierte texto a número.

Ejemplo:

```java
Integer.parseInt("10")
```

Resultado:

```plaintext
10
```

---

# 🚀 Conceptos Aprendidos

| Tema | Explicación |
|---|---|
| ArrayList | Colecciones dinámicas |
| List | Interfaz |
| CRUD | Operaciones básicas |
| Files | Manejo moderno de archivos |
| Path | Rutas |
| BufferedReader | Lectura |
| BufferedWriter | Escritura |
| Comparator | Ordenamiento |
| try-with-resources | Cierre automático |
| split() | Separar texto |
| Persistencia | Guardar información |

---

# 📌 Resultado Final

La clase `LibroService` permite:

✅ Administrar libros  
✅ Leer archivos  
✅ Guardar información  
✅ Ordenar datos  
✅ Crear carpetas automáticamente  
✅ Implementar persistencia  

y representa el núcleo lógico del sistema.

---