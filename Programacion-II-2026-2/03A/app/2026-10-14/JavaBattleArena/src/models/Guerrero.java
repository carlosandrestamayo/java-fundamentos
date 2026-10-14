package models;

public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero() {
        super();
        this.fuerza = 20;
    }

    public Guerrero(int id, String nombre, int fuerza) {
        super(id, nombre);
        setFuerza(fuerza);
    }

    public Guerrero(int id, String nombre, int nivel,
                    int vida, int energia, int fuerza) {
        super(id, nombre, nivel, vida, energia);
        setFuerza(fuerza);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = Math.max(1, Math.min(100, fuerza));
    }

    @Override
    public String getTipo() {
        return "Guerrero";
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (!estaVivo() || !objetivo.estaVivo()) {
            System.out.println("No se puede realizar el ataque.");
            return;
        }

        if (getEnergia() < 10) {
            System.out.println("No tienes suficiente energía.");
            return;
        }

        setEnergia(getEnergia() - 10);

        int danio = fuerza + getNivel() * 2;

        System.out.println(
            getNombre() + " ejecuta un golpe poderoso."
        );

        objetivo.recibirDanio(danio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fuerza: " + fuerza);
    }
}