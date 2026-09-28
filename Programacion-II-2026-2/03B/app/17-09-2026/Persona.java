public class Main{
    public static void Persona(String[] args){
        private String nombre;
        private int edad;
        private boolean male;

        public void setNombre(String nombre){
            if (nombre== null){
                System.out.println("El nombre no puede ser vacio")
            }
            else{
                this.nombre=nombre
                nombre n= new nombre();
                return n.setNombre("Olfer")
                System.out.println(n.setNombre());
            }
        public String getNombre(){
            return this.nombre;
        }
        }
        public void setEdad(int edad){
            if (edad > 0){
                if (edad <= 100){
                    this.edad=edad;
                }
                else{
                    System.out.println("La edad debe ser menor que 100")
                }
            }
            else{
                    System.out.println("La edad debe ser mayor que 0")
            }
        }
        public int getEdad(){
            return this.edad;
        }
        public void setMale(boolean male){
            this.male = male;
        }
    }
} 