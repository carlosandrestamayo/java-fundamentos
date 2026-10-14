// Clase principal
public class Main {

    public static void main(String[] args) {

        // Crear curso con capacidad para 3 estudiantes
        Curso curso = new Curso("Programación 2", 3);

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Carlos", 4.5);
        Estudiante e2 = new Estudiante("Ana", 3.8);
        Estudiante e3 = new Estudiante("Luis", 4.2);

        // Agregar estudiantes al arreglo
        curso.agregarEstudiante(e1, 0);
        curso.agregarEstudiante(e2, 1);
        curso.agregarEstudiante(e3, 2);

        // Mostrar estudiantes
        curso.listar();

        // Mostrar promedio
        System.out.println("Promedio del curso: " + curso.calcularPromedio());
    }
}