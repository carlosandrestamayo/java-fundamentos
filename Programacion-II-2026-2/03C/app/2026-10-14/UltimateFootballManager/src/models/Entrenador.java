package models;

import interfaces.Entrenable;

public class Entrenador extends Participante implements Entrenable {

    private String estrategia;

    public Entrenador() {
        super();
        this.estrategia = "Equilibrada";
    }

    public Entrenador(int id, String nombre, int edad,
                      String estrategia) {
        super(id, nombre, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void entrenar() {
        System.out.println(
            "El entrenador " + getNombre()
            + " prepara la estrategia: " + estrategia
        );
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ENTRENADOR ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estrategia: " + estrategia);
    }
}