package models;

public class Defensa extends Jugador {

    private int marcaje;

    public Defensa() {
        super();
        this.marcaje = 50;
    }

    public Defensa(int id, String nombre, int dorsal, int marcaje, int edad) {
        super(id, nombre, dorsal);
        this.marcaje = marcaje;
    }

    public int getMarcaje() {
        return marcaje;
    }

    public void setMarcaje(int marcaje) {
        this.marcaje = Math.max(0, Math.min(100, marcaje));
    }

    @Override
    public int obtenerValoracion() {
        return (getNivel() + marcaje) / 2;
    }

    @Override
    public String competir() {
        setEnergia(getEnergia() - 5);
        return getNombre() + " recupera el balón con un gran marcaje.";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== DEFENSA ===");
        super.mostrarInformacion();
        System.out.println("Marcaje: " + marcaje);
        System.out.println("Valoración: " + obtenerValoracion());
    }
}