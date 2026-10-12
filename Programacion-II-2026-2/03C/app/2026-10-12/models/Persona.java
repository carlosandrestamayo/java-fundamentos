package models;
public abstract class Persona {

    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }

    public abstract String noHaceNada();
}
