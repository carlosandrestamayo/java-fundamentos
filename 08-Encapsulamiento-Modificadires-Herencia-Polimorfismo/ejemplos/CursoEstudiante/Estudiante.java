// Clase que representa un estudiante
public class Estudiante {

    private String nombre;
    private double nota;

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de la nota
    public double getNota() {
        return nota;
    }
}