package models;

public class Enemigo extends Personaje {

    private int peligrosidad;

    public Enemigo() {
        super();
        this.peligrosidad = 15;
    }

    public Enemigo(int id, String nombre, int peligrosidad) {
        super(id, nombre);
        setPeligrosidad(peligrosidad);
    }

    public Enemigo(int id, String nombre, int nivel,
                   int vida, int energia, int peligrosidad) {
        super(id, nombre, nivel, vida, energia);
        setPeligrosidad(peligrosidad);
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad =
            Math.max(1, Math.min(100, peligrosidad));
    }

    @Override
    public String getTipo() {
        return "Enemigo";
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (!estaVivo() || !objetivo.estaVivo()) {
            System.out.println("No se puede realizar el ataque.");
            return;
        }

        if (getEnergia() < 10) {
            System.out.println("El enemigo está agotado.");
            return;
        }

        setEnergia(getEnergia() - 10);

        int danio = peligrosidad + getNivel();

        System.out.println(
            getNombre() + " ataca con ferocidad."
        );

        objetivo.recibirDanio(danio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Peligrosidad: " + peligrosidad);
    }
}