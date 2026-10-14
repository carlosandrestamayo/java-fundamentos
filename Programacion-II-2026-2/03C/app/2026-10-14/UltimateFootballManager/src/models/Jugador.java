package models;

import interfaces.Entrenable;
import interfaces.Competidor;

public abstract class Jugador extends Participante
        implements Entrenable, Competidor {

    private int dorsal;
    private int nivel;
    private int energia; 

    public Jugador() {
        super();
        this.energia = 100;
        this.nivel = 1;
    }

    public Jugador(int id, String nombre, int edad, int dorsal) {
        super(id, nombre, edad);
        this.dorsal = dorsal;
        this.nivel = 1;
        this.energia = 100;
    }

    public Jugador(int id, String nombre, int edad,
                   int dorsal, int nivel, int energia) {
        super(id, nombre, edad);
        this.dorsal = dorsal;
        this.nivel = nivel;
        setEnergia(energia);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = Math.max(1, Math.min(100, nivel));
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }

    @Override
    public void entrenar() {
        setNivel(getNivel() + 2);
        setEnergia(getEnergia() - 10);

        System.out.println(
            getNombre() + " entrenó. Nivel: " + getNivel()
            + " | Energía: " + getEnergia()
        );
    }

    public void recuperarEnergia() {
        setEnergia(100);
        System.out.println(getNombre() + " recuperó su energía.");
    }

    public abstract int obtenerValoracion();

    @Override
    public void mostrarInformacion() {
        System.out.println(
            "ID: " + getId()
            + " | Nombre: " + getNombre()
            + " | Edad: " + getEdad()
            + " | Dorsal: " + dorsal
            + " | Nivel: " + nivel
            + " | Energía: " + energia
        );
    }
}