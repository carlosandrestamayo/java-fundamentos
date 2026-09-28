public class Circulo{
    private double radio;
    private final double pi = 3.14159;

    public void setRadio(double radio){
        if(radio >= 0){
            this.radio = radio;
        }
        else{
            System.out.println("El radio debe ser mayor o igual a cero");
        }
    }

    public double getRadio(){
        return this.radio;
    }
    
    public Circulo(double radio){
        this.setRadio(radio);
    }

    public double getArea(){
        return this.pi * Math.pow(this.radio,2);
    }

    public double getLong(){
        this.pi = 3.1416;
        return this.pi * 2 * this.radio;
    }

}