/**
 * Clase Gerente que hereda de la clase Empleado.
 * 
 * Representa un tipo específico de empleado que recibe un bono adicional.
 * Aquí se aplica HERENCIA y POLIMORFISMO mediante la sobrescritura del método calcularSalario().
 */
public class Gerente extends Empleado {

    // Atributo adicional específico de la clase Gerente
    private double bono;

    /**
     * Constructor que inicializa los atributos heredados y propios.
     * Se utiliza 'super' para invocar el constructor de la clase padre.
     */
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Métodos de acceso

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    /**
     * Método sobrescrito que redefine el comportamiento del cálculo de salario.
     * 
     * Implementa POLIMORFISMO en tiempo de ejecución, ya que este método
     * será invocado dependiendo del tipo real del objeto.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }
}