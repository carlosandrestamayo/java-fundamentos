package models;
public class Operaciones {

    public static void mostrarInformacion() {

        System.out.println("""
                
                ==========================================
                         CLASE: Operaciones
                ==========================================

                Descripción:
                Esta clase contiene métodos para realizar
                operaciones matemáticas básicas.

                Métodos disponibles:

                1. sumar()
                   - No recibe parámetros.
                   - Retorna 0.

                2. sumar(int a, int b)
                   - Recibe dos números enteros.
                   - Retorna la suma de ambos números.

                3. sumar(int a, int b, int c)
                   - Recibe tres números enteros.
                   - Retorna la suma de los tres números.

                4. restar(int a, int b)
                   - Recibe dos números enteros.
                   - Retorna la resta de a menos b.

                5. restar(int a, int b, int c)
                   - Recibe tres números enteros.
                   - Retorna la resta de a menos b menos c.

                6. absoluto(int a)
                   - Recibe un número entero.
                   - Retorna su valor absoluto.

                Concepto demostrado:
                Sobrecarga de métodos (Method Overloading).

                La sobrecarga permite definir varios métodos
                con el mismo nombre, siempre que tengan
                diferentes parámetros.

                ==========================================
                """);
    }

    public static int sumar() {
        return 0;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int absoluto(int a) {
        return a >= 0 ? a : a * -1;
    }
}