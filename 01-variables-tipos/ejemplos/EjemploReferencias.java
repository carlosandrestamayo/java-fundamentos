public class EjemploReferencias {

    public static void main(String[] args) {

        // Se crea un arreglo en memoria (heap)
        int[] x = {1, 2, 3};

        // y NO es una copia del arreglo,
        // es una referencia al mismo arreglo
        int[] y = x;

        // Se modifica el primer elemento usando y
        y[0] = 99;

        // Se imprime el primer elemento de x
        // También cambia porque x y y apuntan al mismo objeto
        System.out.println(x[0]);

        // Imprime el mismo valor
        System.out.println(y[0]);
    }
}
