// Clase que representa un estudiante con sus notas
public class Estudiante{

    // Atributos del estudiante
    private String nombre;
    private double nota1, nota2, nota3, promedio;   
    
    // Constructor: inicializa los datos del estudiante
    public Estudiante(String nombre, double nota1, double nota2, double nota3){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

        // Se calcula el promedio al momento de crear el objeto
        this.promedio = this.getPromedio();
    }

    // Método getter para obtener el nombre
    public String getNombre(){
        return this.nombre;
    }

    // Método que calcula el promedio ponderado
    public double getPromedio(){
        return this.nota1 * 0.3 + this.nota2 * 0.3 + this.nota3 * 0.4;
    }

    // Método estático para ordenar un arreglo de estudiantes
    public static Estudiante [] sort(Estudiante [] arr){

        // Implementación del algoritmo Bubble Sort
        // Recorre el arreglo varias veces
        for (int j = 1; j < arr.length; j++) {

            // En cada pasada, compara elementos adyacentes
            for (int i = 0; i < arr.length - j; i++) {

                // Caso 1: ordenar por promedio (de mayor a menor)
                if(arr[i].promedio < arr[i+1].promedio){
                    intercambiar(arr, i, i+1);
                }

                // Caso 2: si tienen el mismo promedio
                else if(arr[i].promedio == arr[i+1].promedio){

                    // Se ordena alfabéticamente por nombre
                    if(arr[i].nombre.compareTo(arr[i+1].nombre) > 0){
                       intercambiar(arr, i, i+1);
                    }
                } 
            }
        }

        // Retorna el arreglo ya ordenado
        return arr;
    }

    // Método auxiliar para intercambiar dos posiciones del arreglo
    private static void intercambiar(Estudiante[] arr, int i, int j) {
        Estudiante aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

}