package models;

public class Profesor extends Persona {

    private double salario;

    public Profesor(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Salario: " + salario);
    }

    @Override
    public String noHaceNada(){
        return "Soy el método noHaceNada desde Profesor";
    }
}
