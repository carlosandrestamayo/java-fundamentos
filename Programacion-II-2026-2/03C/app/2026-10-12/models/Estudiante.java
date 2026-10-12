package models;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Carrera: " + carrera);
    }

    @Override
    public String noHaceNada(){
        return "Soy el método noHaceNada desde Estudiante";
    }
}
