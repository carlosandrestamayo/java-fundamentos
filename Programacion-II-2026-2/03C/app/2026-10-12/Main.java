import models.*;
public class Main {

    public static void main(String[] args) {

        //Persona persona = new Persona("Carlos");

        Estudiante estudiante =
                 new Estudiante("Ana", "Ingeniería de Sistemas");

        System.out.println(estudiante.noHaceNada());

        Profesor profesor =
                 new Profesor("Luis", 4500000);
        System.out.println(profesor.noHaceNada());

        // estudiante.mostrarInformacion();
        // profesor.mostrarInformacion();

        // Persona e = new Estudiante("Maria", "Comunicación Social");
        // e.mostrarInformacion();

        Animal animal = new Animal();
        Felino felino = new Felino();
        Gato gato = new Gato();
    }
}
