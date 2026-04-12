// Clase que representa a un cliente del banco
public class Cliente {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private String cedula;

    // Constructor: inicializa los datos del cliente
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener la cédula
    public String getCedula() {
        return cedula;
    }
}