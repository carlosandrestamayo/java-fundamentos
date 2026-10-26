package menu;

import java.util.Scanner; 
import services.GestorJuego;

public class MenuPrincipal {

    private final Scanner scanner;
    private final GestorJuego gestor;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
        gestor = new GestorJuego(scanner); 
    }

    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    gestor.crearPersonaje();
                    break;

                case 2:
                    gestor.listarPersonajes();
                    break;

                case 3:
                    gestor.entrenarPersonaje();
                    break;

                case 4:
                    gestor.combatir();
                    break;

                case 5:
                    gestor.usarPocion();
                    break;

                case 6:
                    gestor.recuperarEnergia();
                    break;

                case 7:
                    gestor.mostrarEstadisticas();
                    break;

                case 8:
                    gestor.demostrarPolimorfismo();
                    break;

                case 0:
                    System.out.println(
                        "Gracias por jugar Java Battle Arena."
                    );
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            if (opcion != 0) {
                System.out.println("\nPresiona ENTER para continuar...");
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n====================================");
        System.out.println("        JAVA BATTLE ARENA");
        System.out.println("====================================");
        System.out.println("1. Crear personaje");
        System.out.println("2. Listar personajes");
        System.out.println("3. Entrenar personaje");
        System.out.println("4. Combatir contra un enemigo");
        System.out.println("5. Usar poción");
        System.out.println("6. Recuperar energía");
        System.out.println("7. Mostrar estadísticas");
        System.out.println("8. Demostrar polimorfismo");
        System.out.println("0. Salir");
        System.out.println("====================================");
    }

    private int leerOpcion() {
        System.out.print("Selecciona una opción: ");

        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}