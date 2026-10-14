package models;

public class Portero extends Jugador {

    private int reflejos;

    public Portero() {
        super();
        this.reflejos = 50;
    }

    public Portero(int id, String nombre, int dorsal,
                   int reflejos, int edad) {
        super(id, nombre, edad,  dorsal);
        this.reflejos = reflejos;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = Math.max(0, Math.min(100, reflejos));
    }

    @Override
    public int obtenerValoracion() {
        return (getNivel() + reflejos) / 2;
    }

    @Override
    public String competir() {
        setEnergia(getEnergia() - 5);
        return getNombre() + " realiza una atajada espectacular.";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== PORTERO ===");
        super.mostrarInformacion();
        System.out.println("Reflejos: " + reflejos);
        System.out.println("Valoración: " + obtenerValoracion());
    }
}