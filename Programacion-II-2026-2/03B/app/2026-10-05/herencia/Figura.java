package herencia;
public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada figura debe implementarlo
    public abstract double calcularArea();

    // Método concreto: lo heredan las clases hijas
    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }
}