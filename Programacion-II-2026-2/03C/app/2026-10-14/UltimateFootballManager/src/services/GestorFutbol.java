package services;

import java.util.Scanner;

import models.Equipo;
import models.Jugador;
import models.Portero;
import models.Defensa;
import models.Delantero;
import models.Entrenador;
import models.Partido;

public class GestorFutbol {

    private final Scanner scanner; 
    private final Equipo equipo;
    private int siguienteId;

    public GestorFutbol(Scanner scanner) {
        this.scanner = scanner;
        this.equipo = new Equipo("Los Campeones FC");
        this.siguienteId = 1;
    }

    public void registrarJugador() {
        System.out.println("\n--- REGISTRAR JUGADOR ---");
        System.out.println("1. Portero");
        System.out.println("2. Defensa");
        System.out.println("3. Delantero");

        int tipo = leerEntero("Posición: ");

        if (tipo < 1 || tipo > 3) {
            System.out.println("Posición no válida.");
            return;
        }

        String nombre = leerTexto("Nombre: ");
        int edad = leerEntero("Edad: ");
        int dorsal = leerEntero("Número de dorsal: ");

        if (edad < 16 || edad > 60 || dorsal < 1 || dorsal > 99) {
            System.out.println("Edad o dorsal fuera de rango.");
            return;
        }

        Jugador jugador;

        switch (tipo) {
            case 1:
                int reflejos = leerAtributo("Nivel de reflejos (0-100): ");
                jugador = new Portero(
                    siguienteId++, nombre, dorsal, reflejos, edad
                );
                break; 

            case 2:
                int marcaje = leerAtributo("Nivel de marcaje (0-100): ");
                jugador = new Defensa(
                    siguienteId++, nombre, dorsal, marcaje, edad
                );
                break;

            default:
                int precision = leerAtributo("Precisión de tiro (0-100): ");
                jugador = new Delantero(
                    siguienteId++, nombre, dorsal, precision
                );
                break;
        }

        if (equipo.agregarJugador(jugador)) {
            System.out.println("Jugador registrado correctamente.");
        } else {
            siguienteId--;
            System.out.println(
                "Ya existe un jugador con ese ID o dorsal."
            );
        }
    }

    public void registrarEntrenador() {
        System.out.println("\n--- REGISTRAR ENTRENADOR ---");

        String nombre = leerTexto("Nombre: ");
        int edad = leerEntero("Edad: ");
        String estrategia = leerTexto(
            "Estrategia (Ofensiva, Defensiva o Equilibrada): "
        );

        Entrenador entrenador = new Entrenador(
            1000, nombre, edad, estrategia
        );

        equipo.setEntrenador(entrenador);

        System.out.println("Entrenador registrado correctamente.");
    }

    public void listarJugadores() {
        System.out.println("\nEquipo: " + equipo.getNombre());
        equipo.listarJugadores();
    }

    public void entrenarEquipo() {
        System.out.println("\n--- ENTRENAMIENTO ---");
        equipo.entrenarEquipo();
    }

    public void recuperarEnergia() {
        int id = leerEntero("ID del jugador: ");
        Jugador jugador = equipo.buscarJugador(id);

        if (jugador == null) {
            System.out.println("Jugador no encontrado.");
            return;
        }

        jugador.recuperarEnergia();
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- ESTADÍSTICAS DEL EQUIPO ---");
        System.out.println("Equipo: " + equipo.getNombre());
        System.out.println("Jugadores: " + equipo.getJugadores().size());
        System.out.printf(
            "Valoración media: %.2f%n",
            equipo.calcularValoracionMedia()
        );
        System.out.println("Ataque: " + equipo.calcularAtaque());
        System.out.println("Defensa: " + equipo.calcularDefensa());

        if (equipo.getEntrenador() != null) {
            System.out.println(
                "Entrenador: " + equipo.getEntrenador().getNombre()
            );
        } else {
            System.out.println("Entrenador: Sin asignar");
        }
    }

    public void simularPartido() {
        if (equipo.estaVacio()) {
            System.out.println("Registra jugadores antes del partido.");
            return;
        }

        for (Jugador jugador : equipo.getJugadores()) {
            if (jugador.getEnergia() < 10) {
                System.out.println(
                    "No se puede jugar: " + jugador.getNombre()
                    + " tiene poca energía."
                );
                return;
            }
        }

        String rival = leerTexto("Nombre del equipo rival: ");

        Partido partido = new Partido(equipo, rival);
        partido.simular();

        for (Jugador jugador : equipo.getJugadores()) {
            jugador.setEnergia(jugador.getEnergia() - 10);
        }
    }

    public void demostrarPolimorfismo() {
        System.out.println("\n--- DEMOSTRACIÓN DE POLIMORFISMO ---");

        if (equipo.estaVacio()) {
            System.out.println("Primero registra jugadores.");
            return;
        }

        for (Jugador jugador : equipo.getJugadores()) {
            System.out.println(jugador.competir());
        }
    }

    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número entero válido.");
            }
        }
    }

    private int leerAtributo(String mensaje) {
        while (true) {
            int valor = leerEntero(mensaje);

            if (valor >= 0 && valor <= 100) {
                return valor;
            }

            System.out.println("El valor debe estar entre 0 y 100.");
        }
    }

    private String leerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println("El texto no puede estar vacío.");
        }
    }
}