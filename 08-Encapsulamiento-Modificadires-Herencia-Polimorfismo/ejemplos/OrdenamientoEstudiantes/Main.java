// Clase principal del programa
public class Main{

    // Método para listar los estudiantes
    public static void listar(Estudiante [] arr){

        int position = 1; // Variable para numerar la lista

        // Recorre el arreglo usando for-each
        for (Estudiante estudiante : arr) {

            // Imprime posición, nombre y promedio con 2 decimales
            System.out.printf("%d. %s promedio: %.2f%n", 
                                position++, 
                                estudiante.getNombre(), 
                                estudiante.getPromedio());
        }
    }

    public static void main(String [] args){

        // Se crea un arreglo de objetos tipo Estudiante
        Estudiante [] arr = new Estudiante[5];

        // Se inicializan los objetos (instanciación)
        arr[0] = new Estudiante("Carlos", 2.3, 3.5, 5);
        arr[1] = new Estudiante("Andres", 4.3, 1.7, 1);
        arr[2] = new Estudiante("Luisa", 2.2, 3.1, 4.0);
        arr[3] = new Estudiante("Tamayo", 4.0, 4.5, 4.1);
        arr[4] = new Estudiante("Keywhan", 4.5, 4.5, 4.1);

        // Se ordena el arreglo usando el método de la clase Estudiante
        Estudiante [] newArr = Estudiante.sort(arr);

        // Se imprime el resultado ordenado
        listar(newArr);
    }

}