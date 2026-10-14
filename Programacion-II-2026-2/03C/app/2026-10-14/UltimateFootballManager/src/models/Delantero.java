package models;

public class Delantero extends Jugador {

    private int precision;

    public Delantero() {
        super();
        this.precision = 50;
    }

    public Delantero(int id, String nombre, int dorsal,
                     int precision) {
        super(id, nombre, dorsal);
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = Math.max(0, Math.min(100, precision));
    }

    @Override
    public int obtenerValoracion() {
        return (getNivel() + precision) / 2;
    }

    @Override
    public String competir() {
        setEnergia(getEnergia() - 5);
        return getNombre() + " dispara a portería buscando el gol.";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== DELANTERO ===");
        super.mostrarInformacion();
        System.out.println("Precisión: " + precision);
        System.out.println("Valoración: " + obtenerValoracion());
    }
}