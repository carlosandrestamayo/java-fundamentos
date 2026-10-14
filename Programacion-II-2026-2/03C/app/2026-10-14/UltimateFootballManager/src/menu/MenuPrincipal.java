package menu;

import java.util.Scanner;
import services.GestorFutbol;

public class MenuPrincipal {

    private final Scanner scanner;
    private final GestorFutbol gestor;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
        gestor = new GestorFutbol(scanner);
    }

    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            

            switch (opcion) {
                case 1:
                    gestor.registrarJugador();
                    break;

                case 2:
                    gestor.registrarEntrenador();
                    break;

                case 3:
                    gestor.listarJugadores();
                    break;

                case 4:
                    gestor.entrenarEquipo();
                    break;

                case 5:
                    gestor.recuperarEnergia();
                    break;

                case 6:
                    gestor.simularPartido();
                    break;

                case 7:
                    gestor.mostrarEstadisticas();
                    break;

                case 8:
                    gestor.demostrarPolimorfismo();
                    break;

                case 0:
                    System.out.println("¡Gracias por jugar!");
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
        System.out.println("\n==================================");
        System.out.println("     ULTIMATE FOOTBALL MANAGER");
        System.out.println("==================================");
        System.out.println("1. Registrar jugador");
        System.out.println("2. Registrar entrenador");
        System.out.println("3. Consultar jugadores");
        System.out.println("4. Entrenar equipo");
        System.out.println("5. Recuperar energía");
        System.out.println("6. Simular partido");
        System.out.println("7. Mostrar estadísticas");
        System.out.println("8. Demostrar polimorfismo");
        System.out.println("0. Salir");
        System.out.println("==================================");
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