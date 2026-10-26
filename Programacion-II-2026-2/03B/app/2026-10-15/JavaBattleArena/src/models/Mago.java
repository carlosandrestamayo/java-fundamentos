package models;

public class Mago extends Personaje {

    private int poderMagico;

    public Mago() {
        super();
        this.poderMagico = 30;
    }

    public Mago(int id, String nombre, int poderMagico) {
        super(id, nombre);
        setPoderMagico(poderMagico);
    }

    public Mago(int id, String nombre, int nivel,
                int vida, int energia, int poderMagico) {
        super(id, nombre, nivel, vida, energia);
        setPoderMagico(poderMagico);
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico =
            Math.max(1, Math.min(100, poderMagico));
    }

    @Override
    public String getTipo() {
        return "Mago";
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (!estaVivo() || !objetivo.estaVivo()) {
            System.out.println("No se puede realizar el ataque.");
            return;
        }

        if (getEnergia() < 20) {
            System.out.println("No tienes suficiente energía mágica.");
            return;
        }

        setEnergia(getEnergia() - 20);

        int danio = poderMagico + getNivel() * 3;

        System.out.println(
            getNombre() + " lanza una bola de fuego."
        );

        objetivo.recibirDanio(danio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Poder mágico: " + poderMagico);
    }
}