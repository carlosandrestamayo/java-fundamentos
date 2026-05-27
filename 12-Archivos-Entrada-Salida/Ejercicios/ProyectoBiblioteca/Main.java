import Models.Libro;
import Services.LibroService;

import java.util.Scanner;

/**
 * Clase principal del programa.
 *
 * Aquí se ejecuta:
 * - El menú
 * - Lectura de datos
 * - Validaciones
 * - Llamados al servicio
 */
public class Main {

    public static void main(String[] args) {

        // =====================================
        // SCANNER
        // =====================================

        Scanner sc = new Scanner(System.in);

        // =====================================
        // SERVICIO
        // =====================================

        LibroService service = new LibroService();

        // =====================================
        // VARIABLE MENÚ
        // =====================================

        int opcion;

        // =====================================
        // CICLO PRINCIPAL
        // =====================================

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

            try {

                opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un número");

                opcion = 0;
            }

            // =====================================
            // SWITCH
            // =====================================

            switch (opcion) {

                // =====================================
                // AGREGAR LIBRO
                // =====================================

                case 1:

                    int id;

                    try {

                        System.out.print("ID: ");

                        id = Integer.parseInt(sc.nextLine());

                    } catch (NumberFormatException e) {

                        System.out.println("ID inválido");

                        break;
                    }

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    // Crear objeto libro
                    Libro libro = new Libro(id, titulo, autor);

                    // Agregar libro
                    service.agregarLibro(libro);

                    break;

                // =====================================
                // LISTAR LIBROS
                // =====================================

                case 2:

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

                    System.out.print("Nuevo título: ");
                    String nuevoTitulo = sc.nextLine();

                    System.out.print("Nuevo autor: ");
                    String nuevoAutor = sc.nextLine();

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

                    service.eliminarLibro(idEliminar);

                    break;

                // =====================================
                // ORDENAR LIBROS
                // =====================================

                case 5:

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

        sc.close();
    }
}