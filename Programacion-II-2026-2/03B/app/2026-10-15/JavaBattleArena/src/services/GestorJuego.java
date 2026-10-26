package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import models.Personaje;
import models.Guerrero;
import models.Mago;
import models.Arquero;
import models.Enemigo;
import models.Pocion;
import models.Arena;

public class GestorJuego {

    private final Scanner scanner;
    private final ArrayList<Personaje> personajes;
    private int siguienteId;

    public GestorJuego(Scanner scanner) {
        this.scanner = scanner;
        this.personajes = new ArrayList<>();
        this.siguienteId = 1;
    }

    public void crearPersonaje() {
        System.out.println("\n--- CREAR PERSONAJE ---");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");

        int tipo = leerEntero("Selecciona la clase: ");

        if (tipo < 1 || tipo > 3) {
            System.out.println("Clase no válida.");
            return;
        }

        String nombre = leerTexto("Nombre del personaje: ");

        // String mensajeAtributo = "";

        // if(tipo == 1){
        //     mensajeAtributo = "Fuerza (1-100): ";
        // }
        // else if(tipo == 2){
        //     mensajeAtributo = "Poder mágico (1-100): ";
        // }
        // else{
        //     mensajeAtributo = "Precisión (1-100): ";
        // }

        //int atributo = leerEntero(mensajeAtributo);
        
        int atributo = leerEntero(
            tipo == 1 ? "Fuerza (1-100): "
            : tipo == 2 ? "Poder mágico (1-100): "
            : "Precisión (1-100): "
        );

        if (atributo < 1 || atributo > 100) {
            System.out.println("El atributo debe estar entre 1 y 100.");
            return;
        }

        Personaje personaje;

        switch (tipo) {
            case 1:
                personaje = new Guerrero(
                    siguienteId, nombre, atributo
                );
                break;

            case 2:
                personaje = new Mago(
                    siguienteId, nombre, atributo
                );
                break;

            default:
                personaje = new Arquero(
                    siguienteId, nombre, atributo
                );
                break;
        }

        personajes.add(personaje);
        siguienteId++;

        System.out.println(
            "Personaje creado con ID: " + personaje.getId()
        );
    }

    public void listarPersonajes() {
        System.out.println("\n--- PERSONAJES REGISTRADOS ---");

        if (personajes.isEmpty()) {
            System.out.println("Todavía no hay personajes.");
            return;
        }

        for (Personaje personaje : personajes) {
            personaje.mostrarInformacion();
            System.out.println("----------------------------");
        }
    }

    public void entrenarPersonaje() {
        Personaje personaje = seleccionarPersonaje();

        if (personaje != null) {
            personaje.entrenar();
        }
    }

    public void recuperarEnergia() {
        Personaje personaje = seleccionarPersonaje();

        if (personaje != null) {
            personaje.recuperarEnergia();
        }
    }

    public void usarPocion() {
        Personaje personaje = seleccionarPersonaje();

        if (personaje == null) {
            return;
        }

        System.out.println("1. Recuperar vida");
        System.out.println("2. Recuperar energía");

        int tipo = leerEntero("Tipo de poción: ");

        if (tipo != 1 && tipo != 2) {
            System.out.println("Opción no válida.");
            return;
        }

        String nombre = tipo == 1
            ? "Poción de vida"
            : "Poción de energía";

        Pocion pocion = new Pocion(nombre, 30);
        pocion.usarEn(personaje, tipo);
    }

    public void combatir() {
        Personaje personaje = seleccionarPersonaje();

        if (personaje == null) {
            return;
        }

        if (!personaje.estaVivo()) {
            System.out.println(
                "El personaje está derrotado. No puede combatir."
            );
            return;
        }

        Enemigo enemigo = crearEnemigoAleatorio();

        System.out.println(
            "\n¡Ha aparecido un enemigo: "
            + enemigo.getNombre() + "!"
        );

        Arena arena = new Arena(personaje, enemigo);
        arena.iniciarCombate();
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- ESTADÍSTICAS GENERALES ---");
        System.out.println("Total de personajes: " + personajes.size());

        int vivos = 0;
        int derrotados = 0;

        for (Personaje personaje : personajes) {
            if (personaje.estaVivo()) {
                vivos++;
            } else {
                derrotados++;
            }
        }

        System.out.println("Personajes vivos: " + vivos);
        System.out.println("Personajes derrotados: " + derrotados);
    }

    public void demostrarPolimorfismo() {
        System.out.println("\n--- POLIMORFISMO ---");

        if (personajes.isEmpty()) {
            System.out.println("Primero crea algunos personajes.");
            return;
        }

        for (Personaje personaje : personajes) {
            System.out.println(
                "\nTipo de objeto: " + personaje.getTipo()
            );

            personaje.mostrarInformacion();
        }
    }

    private Personaje seleccionarPersonaje() {
        if (personajes.isEmpty()) {
            System.out.println("No hay personajes registrados.");
            return null;
        }

        listarPersonajes();

        int id = leerEntero("Introduce el ID del personaje: ");

        for (Personaje personaje : personajes) {
            if (personaje.getId() == id) {
                return personaje;
            }
        }

        System.out.println("No existe un personaje con ese ID.");
        return null;
    }

    private Enemigo crearEnemigoAleatorio() {
        Random random = new Random();

        String[] nombres = {
            "Goblin", "Orco", "Dragón oscuro", "Esqueleto"
        };

        int nivel = random.nextInt(5) + 1;
        int peligrosidad = random.nextInt(15) + 10;
        int vida = 70 + nivel * 5;

        return new Enemigo(
            1000,
            nombres[random.nextInt(nombres.length)],
            nivel,
            vida,
            100,
            peligrosidad
        );
    }

    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(
                    "Introduce un número entero válido."
                );
            }
        }
    }

    private String leerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println("El nombre no puede estar vacío.");
        }
    }
}