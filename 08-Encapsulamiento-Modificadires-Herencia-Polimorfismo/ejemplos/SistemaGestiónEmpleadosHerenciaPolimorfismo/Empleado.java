/**
 * Clase base que representa un empleado genérico dentro de la organización.
 * 
 * Esta clase implementa el principio de ENCAPSULAMIENTO al definir sus atributos como privados
 * y permitir el acceso controlado mediante métodos públicos (getters y setters).
 * 
 * Además, sirve como clase padre para aplicar HERENCIA en clases derivadas
 * como Gerente y Desarrollador.
 */
public class Empleado {

    // Atributos encapsulados
    private String nombre;
    private double salarioBase;

    /**
     * Constructor parametrizado que inicializa los atributos del empleado.
     * Se utiliza el método setter para garantizar validación del salario.
     */
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        setSalarioBase(salarioBase);
    }

    // Métodos de acceso (Getters y Setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Setter con validación que evita asignar salarios negativos.
     * En caso de valor inválido, se asigna 0 como valor por defecto.
     */
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("El salario no puede ser negativo.");
            this.salarioBase = 0;
        }
    }

    /**
     * Método que calcula el salario del empleado.
     * 
     * Este método está diseñado para ser sobrescrito (polimorfismo)
     * en las clases hijas, donde se implementarán cálculos específicos.
     */
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Método que muestra la información básica del empleado.
     * Puede ser reutilizado o extendido por clases derivadas.
     */
    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
    }
}