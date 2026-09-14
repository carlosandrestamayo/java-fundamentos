import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner permite leer información que el usuario
        // escribe por teclado.
        Scanner sc = new Scanner(System.in);

        /*
         * Creamos un arreglo capaz de almacenar 3 objetos Persona.
         *
         * IMPORTANTE:
         * Aquí todavía NO hemos creado ninguna Persona.
         * Solamente hemos creado un arreglo de 3 posiciones
         * que podrán contener referencias a objetos Persona.
         *
         * Inicialmente:
         *
         * arr[0] -> null
         * arr[1] -> null
         * arr[2] -> null
         */
        Persona[] arr = new Persona[3];

        String nombre;

        /*
         * Recorremos el arreglo para crear las 3 personas.
         *
         * j representa la posición que estamos ocupando
         * dentro del arreglo.
         */
        for (int j = 0; j < arr.length; j++) {

            // Pedimos el nombre de la persona.
            System.out.print("\nIngrese Nombre: ");
            nombre = sc.nextLine();

            /*
             * Creamos un arreglo de 3 números double
             * para almacenar las notas de la persona.
             *
             * notas[0] -> primera nota
             * notas[1] -> segunda nota
             * notas[2] -> tercera nota
             */
            double[] notas = new double[3];

            /*
             * Solicitamos las tres notas.
             *
             * i comienza en 0 porque los arreglos en Java
             * comienzan en la posición 0.
             *
             * Por eso:
             * i = 0 -> nota 1 -> notas[0]
             * i = 1 -> nota 2 -> notas[1]
             * i = 2 -> nota 3 -> notas[2]
             */
            for (int i = 0; i < 3; i++) {

                System.out.print("Ingrese nota " + (i + 1) + ": ");

                // Guardamos la nota introducida por el usuario.
                notas[i] = sc.nextDouble();
            }

            /*
             * Creamos un objeto Persona utilizando el constructor.
             *
             * Enviamos:
             * nombre
             * notas[0]
             * notas[1]
             * notas[2]
             *
             * El objeto creado queda referenciado por la variable p.
             */
            Persona p = new Persona(
                nombre,
                notas[0],
                notas[1],
                notas[2]
            );

            /*
             * Guardamos la referencia del objeto Persona
             * en la posición j del arreglo.
             *
             * Por ejemplo, en la primera iteración:
             *
             * arr[0] = p;
             */
            arr[j] = p;

            /*
             * nextDouble() deja pendiente el salto de línea
             * que escribió el usuario al presionar ENTER.
             *
             * nextLine() consume ese ENTER para que en la
             * siguiente iteración podamos leer correctamente
             * el nombre.
             */
            sc.nextLine();
        }

        /*
         * Ahora recorremos todas las personas almacenadas
         * en el arreglo.
         *
         * La variable p representa, en cada iteración,
         * una referencia a una Persona diferente.
         */
        for (Persona p : arr) {

            // Ejecutamos el método Reporte() del objeto.
            p.Reporte();
        }

        // Cerramos el Scanner.
        sc.close();
    }
}