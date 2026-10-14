package models;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private Entrenador entrenador;
    private final ArrayList<Jugador> jugadores;

    public Equipo() {
        this("Equipo sin nombre");
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return new ArrayList<>(jugadores);
    }

    public boolean agregarJugador(Jugador jugador) {
        for (Jugador existente : jugadores) {
            if (existente.getId() == jugador.getId()
                    || existente.getDorsal() == jugador.getDorsal()) {
                return false;
            }
        }

        jugadores.add(jugador);
        return true;
    }

    public Jugador buscarJugador(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador;
            }
        }
        return null;
    }

    public void listarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("El equipo no tiene jugadores.");
            return;
        }

        for (Jugador jugador : jugadores) {
            jugador.mostrarInformacion();
            System.out.println("-------------------------");
        }
    }

    public void entrenarEquipo() {
        if (entrenador != null) {
            entrenador.entrenar();
        }

        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores para entrenar.");
            return;
        }

        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }
    }

    public double calcularValoracionMedia() {
        if (jugadores.isEmpty()) {
            return 0;
        }

        int suma = 0;

        for (Jugador jugador : jugadores) {
            suma += jugador.obtenerValoracion();
        }

        return (double) suma / jugadores.size();
    }

    public int calcularAtaque() {
        int total = 0;

        for (Jugador jugador : jugadores) {
            if (jugador instanceof Delantero) {
                total += jugador.obtenerValoracion();
            }
        }

        return total;
    }

    public int calcularDefensa() {
        int total = 0;

        for (Jugador jugador : jugadores) {
            if (jugador instanceof Defensa
                    || jugador instanceof Portero) {
                total += jugador.obtenerValoracion();
            }
        }

        return total;
    }

    public boolean estaVacio() {
        return jugadores.isEmpty();
    }
}