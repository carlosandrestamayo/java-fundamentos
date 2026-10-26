package models;

public class Pocion {

    private String nombre;
    private int cantidad;

    public Pocion() {
        this("Poción de vida", 30);
    }

    public Pocion(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = Math.max(1, cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = Math.max(1, cantidad);
    }

    public void usarEn(Personaje personaje, int tipo) {
        if (personaje == null || !personaje.estaVivo()) {
            System.out.println("No se puede utilizar la poción.");
            return;
        }

        if (tipo == 1) {
            System.out.println("Usando " + nombre + "...");
            personaje.curar(cantidad);
        } else if (tipo == 2) {
            System.out.println("Usando poción de energía...");
            personaje.setEnergia(
                personaje.getEnergia() + cantidad
            );
            System.out.println(
                "Energía actual: " + personaje.getEnergia()
            );
        } else {
            System.out.println("Tipo de poción no válido.");
        }
    }
}