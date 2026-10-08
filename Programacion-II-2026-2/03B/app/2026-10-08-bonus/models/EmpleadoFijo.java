package models;
import interfaces.*;

public class EmpleadoFijo extends Empleado implements Pagable{
    private double bono;

    public void setBono(double bono){
        this.bono = bono;
    }

    public double getBono(){
        return bono;
    }

    public EmpleadoFijo(String nombre, double salario, double bono){
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        return getSalario() + bono;
    }

    @Override
    public void pagar(){

    }

}