package models;
import interfaces.*;

public class FreeLance extends Empleado implements Facturable, Pagable{
    private int horas;
    private double valorHoras;

    public void setHoras(int horas){
        this.horas = horas;
    }

    public int getHoras(){
        return horas;
    }
    
    public void setValorHoras(double valorHoras){
        this.valorHoras = valorHoras;
    }

    public double getValorHoras(){
        return valorHoras;
    }

    public FreeLance(String nombre, double salario, int horas){
        super(nombre, salario);
        this.horas = horas;
    }

    
    @Override
    public double calcularSalario() {
        return horas * valorHoras;
    }

    public void generarFactura() {
        System.out.println(
            "Factura generada por $" + calcularSalario()
        );
    }

    @Override
    public void pagar(){

    }

}