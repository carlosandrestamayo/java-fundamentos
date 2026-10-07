import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Martes 25 de agosto de 2026 - 6:00 a. m.
        //
        // Tema:
        // - Ciclos while y for
        // - Arreglos
        // - Recorrido de arreglos
        // - Recorrido de String
        // - Índices
        // - charAt()
        // =========================================================


        // =========================================================
        // EJERCICIO 1
        // Encontrar los 10 primeros números primos
        // y almacenarlos en un arreglo.
        // =========================================================

        // Creamos un arreglo de 10 posiciones.
        // En este arreglo vamos a guardar los primeros
        // 10 números primos que encontremos.
        

        Scanner sc = new Scanner(System.in);

        // System.out.print("Tamaño  del Arreglo: ");
        // int size = sc.nextInt();

        // int [] arr = new int[size];

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print("Ingrese arr["+ i + "] = ");
        //     arr[i] = sc.nextInt();
        // }

        
        // System.out.println("\nArreglo Unidimensional de " + size + " Posiciones\n");
        // for(int i = 0; i < arr.length; i++){
        //     //System.out.println("arr["+ i + "] = " + arr[i]);
        //     System.out.printf("arr[%d] = %d\n",i, arr[i]);
        // }

        // String nombre = "Keren";
        // String apellido = "Gonzalez";
        // int edad = 23;

        //System.out.println("Mi nombre es " + nombre + " , Mi apellido es " + apellido + " y tengo " + edad + "años");
        //System.out.printf("Mi nombre es %s%nMi apellido es %s%nTengo %d años", nombre, apellido, edad);

        int size = 9;
        int [][] m = new int[size][size];
        int value = 1 - (size *size + 1)/2;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                m[i][j] = value++;
            }
        }

        
        System.out.printf("Arreglo Bidimensional de %d * %d%n",size,size);
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("m[%d][%d]=%d%n",i,j,m[i][j]);
                //m[i][j] = value++;
            }
        }
    }
}