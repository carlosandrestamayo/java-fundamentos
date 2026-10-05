package models;
public class Persona{
    private String nombre;

    //private static final 
    private static final String [] nombres = {"daniel", "jose", "santiago", "olfer", "luis", "yeiner"};

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public static String []  getNombres(){
        return nombres;
    }
}