// =====================================
// ARCHIVO: Services/LibroService.java
// =====================================

package Services;

import Models.Libro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibroService {

    private List<Libro> libros = new ArrayList<>();

    private final Path ruta = Paths.get("Data/libros.txt");

    public LibroService() {
        crearCarpeta();
        cargarArchivo();
    }

    // =========================
    // CREAR CARPETA Y ARCHIVO
    // =========================
    private void crearCarpeta() {

        try {

            Files.createDirectories(Paths.get("Data"));

            if (!Files.exists(ruta)) {
                Files.createFile(ruta);
            }

        } catch (IOException e) {
            System.out.println("Error creando carpeta");
        }
    }

    // =========================
    // AGREGAR LIBRO
    // =========================
    public void agregarLibro(Libro libro) {

        libros.add(libro);

        guardarArchivo();

        System.out.println("Libro agregado correctamente");
    }

    // =========================
    // LISTAR LIBROS
    // =========================
    public void listarLibros() {

        if (libros.isEmpty()) {

            System.out.println("No hay libros");

            return;
        }

        for (Libro libro : libros) {

            System.out.println("--------------------");
            System.out.println("ID: " + libro.getId());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
        }
    }

    // =========================
    // EDITAR LIBRO
    // =========================
    public void editarLibro(int id, String nuevoTitulo, String nuevoAutor) {

        for (Libro libro : libros) {

            if (libro.getId() == id) {

                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);

                guardarArchivo();

                System.out.println("Libro editado");

                return;
            }
        }

        System.out.println("Libro no encontrado");
    }

    // =========================
    // ELIMINAR LIBRO
    // =========================
    public void eliminarLibro(int id) {

        Libro libroEliminar = null;

        for (Libro libro : libros) {

            if (libro.getId() == id) {

                libroEliminar = libro;

                break;
            }
        }

        if (libroEliminar != null) {

            libros.remove(libroEliminar);

            guardarArchivo();

            System.out.println("Libro eliminado");

        } else {

            System.out.println("Libro no encontrado");
        }
    }

    // =========================
    // ORDENAR
    // =========================
    public void ordenarPorTitulo() {

        libros.sort(
                Comparator.comparing(
                        Libro::getTitulo,
                        String.CASE_INSENSITIVE_ORDER
                )
        );

        System.out.println("Libros ordenados");
    }

    // =========================
    // GUARDAR ARCHIVO
    // =========================
    public void guardarArchivo() {

        try (BufferedWriter bw = Files.newBufferedWriter(ruta)) {
                     

            for (Libro libro : libros) {

                bw.write(libro.toString());

                bw.newLine();
            }

        } catch (IOException e) {

            System.out.println("Error al guardar");
        }
    }

    // =========================
    // CARGAR ARCHIVO
    // =========================
    public void cargarArchivo() {

        try (BufferedReader br = Files.newBufferedReader(ruta)) {
                     

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);

                String titulo = datos[1];

                String autor = datos[2];

                libros.add(
                        new Libro(id, titulo, autor)
                );
            }

        } catch (IOException e) {

            System.out.println("Error al cargar");
        }
    }
}