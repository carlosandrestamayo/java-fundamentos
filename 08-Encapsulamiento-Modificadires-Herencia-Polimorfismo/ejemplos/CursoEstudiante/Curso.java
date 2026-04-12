// Clase que representa un curso con varios estudiantes
public class Curso {

    private String nombreCurso;

    // Arreglo de estudiantes
    private Estudiante[] estudiantes;

    // Constructor
    public Curso(String nombreCurso, int cantidad) {
        this.nombreCurso = nombreCurso;
        this.estudiantes = new Estudiante[cantidad];
    }

    // Método para agregar un estudiante en una posición
    public void agregarEstudiante(Estudiante estudiante, int posicion) {
        estudiantes[posicion] = estudiante;
    }

    // Método para calcular el promedio del curso
    public double calcularPromedio() {
        double suma = 0;

        for (Estudiante e : estudiantes) {
            suma += e.getNota();
        }

        return suma / estudiantes.length;
    }

    // Método para mostrar los estudiantes
    public void listar() {
        int i = 1;
        for (Estudiante e : estudiantes) {
            //System.out.println(i++ + ". " + e.getNombre() + " - Nota: " + e.getNota());
            System.out.printf("%d. %s - Nota: %.2f%n", 
                  i++, 
                  e.getNombre(), 
                  e.getNota());
        }
    }
}