package Models;
public class Animal{
    private String nombre;
    private int edad;
    private double peso;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
        }
    }

    public Animal(String nombre, int edad, double peso){
        //setNombre(nombre);
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void hacerSonido(){
        System.out.println("Hago ruido como un animal");
    }
}