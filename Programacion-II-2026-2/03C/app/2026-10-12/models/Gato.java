package models;
import interfaces.*;

public class Gato extends Animal implements Volador, Caminar{
    
    @Override
    public void volar(){
        
    }

    @Override
    public String gritar(String mensaje, int h){
        return "";
    }

    @Override
    public void caminar(){
        
    }
}