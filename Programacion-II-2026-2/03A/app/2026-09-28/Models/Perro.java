package Models;
public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, double peso, String raza){
        super(nombre, edad, peso);
        this.raza = raza;
    }
}