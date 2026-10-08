package models;

public abstract class Empleado{
    private String  nombre;
    private double salario;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
    
    public Empleado(String nombre, double salario){
        setNombre(nombre);
        setSalario(salario);
    }

    public abstract double calcularSalario();

    public void mostrarInfo(){
        System.out.println("Soy " + getNombre() + " y mi salario es " + getSalario());
    }
}