public class Prueba{

    public String nombre;
    public int edad;

    public int contador;

    public Prueba(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        contador = contador + 1;
    }
    
    
    
    public void hacer(int a, int b){
        if(a >= b){
            return;
        }
        System.out.println(a + " es menor que " + b);
    }

}