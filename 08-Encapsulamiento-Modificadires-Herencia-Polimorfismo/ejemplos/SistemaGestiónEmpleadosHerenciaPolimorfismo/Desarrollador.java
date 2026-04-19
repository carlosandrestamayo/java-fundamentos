/**
 * Clase Desarrollador que hereda de Empleado.
 * 
 * Representa un empleado cuya remuneración incluye pago por horas extras.
 * Se aplica HERENCIA y SOBRESCRITURA del método calcularSalario().
 */
public class Desarrollador extends Empleado {

    // Atributos específicos del desarrollador
    private int horasExtras;
    private double valorHora;

    /**
     * Constructor que inicializa atributos heredados y propios.
     */
    public Desarrollador(String nombre, double salarioBase, int horasExtras, double valorHora) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHora = valorHora;
    }

    // Métodos de acceso

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Método sobrescrito que calcula el salario total del desarrollador,
     * sumando el salario base con el valor de las horas extras trabajadas.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * valorHora);
    }
}