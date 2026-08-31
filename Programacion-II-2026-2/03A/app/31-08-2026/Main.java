import java.util.StringJoiner;

public class Main {

    // Formatea el arreglo
    public static String formatList(int[] arr) {

        StringJoiner sj = new StringJoiner(",", "[", "]");

        for (int n : arr) {
            sj.add(String.valueOf(n));
        }

        return sj.toString();
    }

    // Muestra el encabezado
    public static void mostrarEncabezado() {

        System.out.printf(
            "%-6s %-4s %-4s %-14s %-14s %-20s %-14s %-25s%n",
            "Paso",
            "i",
            "j",
            "numeros[j]",
            "numeros[j+1]",
            "Comparación",
            "Intercambia",
            "Estado del arreglo"
        );

        System.out.println(
            "-------------------------------------------------------------------------------------------------------------"
        );
    }

    // Muestra cada paso
    public static void mostrarPaso(
            int paso,
            int i,
            int j,
            int valor1,
            int valor2,
            boolean intercambio,
            int[] numeros) {

        System.out.printf(
            "%-6d %-4d %-4d %-14d %-14d %-20s %-14s %-25s%n",
            paso,
            i,
            j,
            valor1,
            valor2,
            valor1 + " > " + valor2,
            intercambio ? "Sí" : "No",
            formatList(numeros)
        );
    }

    public static void main(String[] args) {

        //int[] numeros = {5, 2, 8, 1, 3};
        int[] numeros = {8, 5, 3, 2, 1};

        System.out.printf("Arreglo Original%n");
        System.out.println(formatList(numeros));
        System.out.println();

        mostrarEncabezado();

        int paso = 0;

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                // Valores que se van a comparar
                int valor1 = numeros[j];
                int valor2 = numeros[j + 1];

                boolean intercambio = false;

                if (numeros[j] > numeros[j + 1]) {

                    int temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;

                    intercambio = true;
                }

                paso++;

                mostrarPaso(
                    paso,
                    i,
                    j,
                    valor1,
                    valor2,
                    intercambio,
                    numeros
                );
            }
        }

        System.out.println();
        System.out.println("Arreglo Ordenado");
        System.out.println(formatList(numeros));
    }
}