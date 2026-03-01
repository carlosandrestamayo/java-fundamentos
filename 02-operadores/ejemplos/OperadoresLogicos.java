public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean tieneEdad = true;
        boolean tieneDocumento = false;

        boolean puedeEntrar = tieneEdad && tieneDocumento;
        boolean puedeSalir = tieneEdad || tieneDocumento;
        boolean negacion = !tieneEdad;

        System.out.println("Puede entrar: " + puedeEntrar);
        System.out.println("Puede salir: " + puedeSalir);
        System.out.println("Negación: " + negacion);
    }
}
