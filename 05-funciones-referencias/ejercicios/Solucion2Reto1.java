public class Solucion2Reto1 {

    /*
     * Determina si un número es:
     * 0 -> Perfecto
     * 1 -> Abundante
     * 2 -> Deficiente
     */
    public static int tipoNumero(int n){

        int suma = 0;

        for(int i = 1; i < n; i++){
            suma += (n % i == 0) ? i : 0;
        }

        return (suma == n) ? 0 : (suma > n ? 1 : 2);
    }


    /*
     * Cuenta cuántos números hay de cada tipo
     */
    public static int[] contarTipos(int[] arr){

        int perfectos = 0;
        int abundantes = 0;
        int deficientes = 0;

        for(int i = 0; i < arr.length; i++){

            int tipo = tipoNumero(arr[i]);

            perfectos   += (tipo == 0) ? 1 : 0;
            abundantes  += (tipo == 1) ? 1 : 0;
            deficientes += (tipo == 2) ? 1 : 0;
        }

        return new int[]{perfectos, abundantes, deficientes};
    }


    /*
     * Clasifica los números en tres arreglos
     */
    public static void clasificarNumeros(int[] arr){

        int[] conteo = contarTipos(arr);

        int[] perfectos   = new int[conteo[0]];
        int[] abundantes  = new int[conteo[1]];
        int[] deficientes = new int[conteo[2]];

        int iP = 0;
        int iA = 0;
        int iD = 0;

        for(int i = 0; i < arr.length; i++){

            int tipo = tipoNumero(arr[i]);

            if(tipo == 0){
                perfectos[iP++] = arr[i];
            }
            else if(tipo == 1){
                abundantes[iA++] = arr[i];
            }
            else{
                deficientes[iD++] = arr[i];
            }
        }

        mostrarResultados(perfectos,"Perfectos");
        mostrarResultados(abundantes,"Abundantes");
        mostrarResultados(deficientes,"Deficientes");
    }


    /*
     * Muestra estadísticas del arreglo
     */
    public static void mostrarResultados(int[] arr, String tipo){

        if(arr.length == 0){
            System.out.println("No hay números " + tipo + "\n");
            return;
        }

        int min = arr[0];
        int max = arr[0];
        int suma = 0;

        String lista = "[ ";

        for(int i = 0; i < arr.length; i++){

            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;

            lista += (i != arr.length - 1) ? arr[i] + ", " : arr[i] + " ]";

            suma += arr[i];
        }

        System.out.println("Números " + tipo);
        System.out.println(lista);
        System.out.println("Cantidad: " + arr.length);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Suma: " + suma + "\n");
    }


    public static void main(String[] args){

        int[] datos = {6, 8, 12, 7, 28, 10, 15, 18, 20, 5};

        clasificarNumeros(datos);
    }

}