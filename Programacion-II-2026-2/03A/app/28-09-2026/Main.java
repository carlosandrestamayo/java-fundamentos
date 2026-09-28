import Models.*;
public class Main{
    public static void main(String [] args){

        Gato gato = new Gato("pepito",22,3.4);
        // System.out.println(gato.getNombre());
        // System.out.println(gato.isDomestico());
        // gato.hacerSonido();
        //Prueba p = new Prueba();

        Perro perro = new Perro("Firulais", 8, 1.2, "Dragon");

        Animal [] arr = {gato, perro};

        for(Animal a : arr){
            a.hacerSonido();
        }
    }
}