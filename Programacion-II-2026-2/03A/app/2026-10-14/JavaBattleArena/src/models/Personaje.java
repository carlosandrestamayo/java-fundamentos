package models;

import interfaces.Atacable;
import interfaces.Curable;
import interfaces.Entrenable;

public abstract class Personaje implements Atacable, Curable, Entrenable { 

        
    private int id;
    private String nombre;
    private int nivel;
    private int vida;
    private int energia;

    public Personaje() {
        this(0, "Sin nombre");
    }

    public Personaje(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = 1;
        this.vida = 100;
        this.energia = 100;
    }

    public Personaje(int id, String nombre, int nivel,
                     int vida, int energia) {
        this.id = id;
        this.nombre = nombre;
        setNivel(nivel);
        setVida(vida);
        setEnergia(energia);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = Math.max(0, id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = Math.max(1, Math.min(100, nivel));
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, Math.min(100, vida));
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public void recibirDanio(int danio) {
        if (danio < 0) {
            return;
        }

        setVida(vida - danio);

        System.out.println(
            nombre + " recibe " + danio
            + " puntos de daño."
        );
    }

    @Override
    public void curar(int cantidad) {
        if (!estaVivo() || cantidad <= 0) {
            System.out.println("No se puede curar al personaje.");
            return;
        }

        int vidaAnterior = vida;
        setVida(vida + cantidad);

        System.out.println(
            nombre + " recupera " + (vida - vidaAnterior)
            + " puntos de vida."
        );
    }

    @Override
    public void entrenar() {
        if (!estaVivo()) {
            System.out.println("El personaje está derrotado.");
            return;
        }

        setNivel(nivel + 1);
        setEnergia(energia - 10);

        System.out.println(
            nombre + " sube al nivel " + nivel
            + ". Energía: " + energia
        );
    }

    public void recuperarEnergia() {
        if (estaVivo()) {
            setEnergia(100);
            System.out.println(nombre + " recuperó su energía.");
        }
    }

    public abstract void atacar(Personaje objetivo);

    public abstract String getTipo();

    public void mostrarInformacion() {
        System.out.println(
            "ID: " + id
            + " | Nombre: " + nombre
            + " | Tipo: " + getTipo()
            + " | Nivel: " + nivel
            + " | Vida: " + vida
            + " | Energía: " + energia
        );
    }
}