package models;

public class Arquero extends Personaje {

    private int precision;

    public Arquero() {
        super();
        this.precision = 25;
    }

    public Arquero(int id, String nombre, int precision) {
        super(id, nombre);
        setPrecision(precision);
    }

    public Arquero(int id, String nombre, int nivel,
                   int vida, int energia, int precision) {
        super(id, nombre, nivel, vida, energia);
        setPrecision(precision);
    }

    public int getPrecision() {
        return precision; 
    }

    public void setPrecision(int precision) {
        this.precision =
            Math.max(1, Math.min(100, precision));
    }

    @Override
    public String getTipo() {
        return "Arquero";
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

        int danio = precision / 2 + getNivel() * 2;

        System.out.println(
            getNombre() + " dispara una flecha."
        );

        objetivo.recibirDanio(danio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Precisión: " + precision);
    }
}