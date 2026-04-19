/**
 * Clase principal del sistema.
 * 
 * Aquí se implementa el POLIMORFISMO mediante el uso de un arreglo
 * de tipo Empleado, que almacena objetos de diferentes subclases.
 * 
 * También se realiza el recorrido del arreglo para ejecutar métodos
 * comunes que presentan comportamientos distintos según el tipo de objeto.
 */
public class Main {

    public static void main(String[] args) {

        // Llamado a método estático de bienvenida
        bienvenida();

        /**
         * Arreglo polimórfico:
         * Permite almacenar diferentes tipos de empleados bajo una misma referencia.
         */
        Empleado[] empleados = new Empleado[3];

        // Inicialización de objetos
        empleados[0] = new Gerente("Carlos", 2000, 500);
        empleados[1] = new Desarrollador("Ana", 1500, 10, 30);
        empleados[2] = new Desarrollador("Luis", 1800, 5, 40);

        double mayorSalario = 0;
        Empleado mejorPagado = null;

        /**
         * Recorrido del arreglo:
         * Se evidencia el polimorfismo en la llamada a calcularSalario(),
         * donde cada objeto responde según su implementación específica.
         */
        for (Empleado emp : empleados) {

            emp.mostrarDatos();

            double salario = emp.calcularSalario();

            System.out.println("Salario: " + salario);
            System.out.println("------------------------");

            // Lógica para determinar el empleado con mayor salario
            if (salario > mayorSalario) {
                mayorSalario = salario;
                mejorPagado = emp;
            }
        }

        // Resultado final
        if (mejorPagado != null) {
            System.out.println("Empleado con mayor salario: " + mejorPagado.getNombre());
            System.out.println("Salario: " + mayorSalario);
        }

        // Conteo de empleados
        System.out.println("Total empleados: " + empleados.length);
    }

    /**
     * Método estático que muestra un mensaje de bienvenida.
     * Representa una funcionalidad general del sistema.
     */
    public static void bienvenida() {
        System.out.println("=== SISTEMA DE EMPLEADOS ===");
    }
}