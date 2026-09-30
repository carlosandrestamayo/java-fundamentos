package Models;
public class Persona{
    private String nombre;
    private int edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        if(isEdadValida(edad)){
            this.edad = edad;
        }else{
            System.out.println("Error de Rango en la Edad");
        }
    }

    public int getEdad(){
        return edad;
    }

    public static boolean isEdadValida(int edad){
        return (edad > 0 && edad <= 100);
    }

    public Persona(){

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(int edad){
        this.edad = edad;
    }

    public Persona(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    }

    public Persona(int edad, String nombre){

    }


}