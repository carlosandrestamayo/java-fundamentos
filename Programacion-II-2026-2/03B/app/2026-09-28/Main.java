import Models.Persona;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // Persona p = new Persona();
        // p.setEdad(10);
        // p.setEdad(-30);
        // p.setNombre("pepito");

        //System.out.println("Me llamo " + p.getNombre()  + " y tengo " + p.getEdad() + " años");
    
        Persona [] arr = new Persona[3];
        String nombre = "";
        int edad = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("__Persona " + (i + 1) + "__");
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            while(true){
                System.out.println("Edad: ");
                edad = sc.nextInt();
                if(Persona.isEdadValida(edad)){
                    break;
                }
            }
            

            Persona persona = new Persona(nombre, edad);
            arr[i] = persona;

            nombre = sc.nextLine();
        }

        for(Persona p1 : arr){
              System.out.println("Me llamo " + p1.getNombre()  + " y tengo " + p1.getEdad() + " años");
        }
    
    
    }
}