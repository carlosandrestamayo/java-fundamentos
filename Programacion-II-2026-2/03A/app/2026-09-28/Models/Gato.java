package Models;
public class Gato extends Animal{
    private boolean domestico;

    public boolean isDomestico(){
        return domestico;
    }

    public void setDomestico(boolean domestico){
        this.domestico = domestico;
    }

    public Gato(String nombre, int edad, double peso, boolean domestico){
        super(nombre, edad, peso);
        this.domestico = domestico;
    }

    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        this.domestico = true;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Maullo como un gato");
    }

    // public Gato(String nombre, int edad, double peso) {
    //     this(nombre, edad, peso, false);
    // }
}