import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. NullPointerException
        // Pasa cuando usamos una variable que vale null
        try {
            String nombre = null;
            System.out.println(nombre.length());
        } catch (NullPointerException e) {
            System.out.println("1. Error: la variable nombre esta vacia (null)");
        }

        // 2. ArithmeticException
        // Pasa cuando dividimos un numero entero entre cero
        try {
            int total = 100;
            int cantidad = 0;
            int resultado = total / cantidad;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("2. Error: no se puede dividir entre cero");
        }

        // 3. ArrayIndexOutOfBoundsException
        // Pasa cuando pedimos una posicion que no existe en el arreglo
        try {
            int[] notas = {4, 5, 3};            // posiciones: 0, 1 y 2
            System.out.println(notas[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3. Error: la posicion 3 no existe en el arreglo");
        }

        // 4. StringIndexOutOfBoundsException
        // Pasa cuando pedimos una letra que no existe en el texto
        try {
            String placa = "ABC";               // letras en posiciones: 0, 1 y 2
            System.out.println(placa.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("4. Error: el texto no tiene posicion 5");
        }

        // 5. IllegalArgumentException
        // La lanzamos nosotros cuando nos mandan un dato que no sirve
        try {
            double precio = -5000;
            if (precio < 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("5. Error: el precio no puede ser negativo");
        }

        // 6. NumberFormatException
        // Pasa cuando intentamos convertir a numero un texto que no es numero
        try {
            int edad = Integer.parseInt("abc");
            System.out.println(edad);
        } catch (NumberFormatException e) {
            System.out.println("6. Error: \"abc\" no se puede convertir a numero");
        }

        // 7. IllegalStateException
        // Pasa cuando usamos algo que ya no esta disponible
        try {
            Scanner lector = new Scanner("hola");
            lector.close();                     // cerramos el Scanner
            lector.nextLine();                  // y despues intentamos usarlo
        } catch (IllegalStateException e) {
            System.out.println("7. Error: el Scanner ya estaba cerrado");
        }

        // 8. ClassCastException
        // Pasa cuando convertimos un objeto a un tipo que no es
        try {
            Object dato = "Hola";
            Integer numero = (Integer) dato;    // "Hola" es texto, no numero
            System.out.println(numero);
        } catch (ClassCastException e) {
            System.out.println("8. Error: un texto no se puede convertir a Integer");
        }

        // 9. UnsupportedOperationException
        // Pasa cuando intentamos cambiar una lista que no se puede modificar
        try {
            List<String> colores = List.of("rojo", "azul");   // lista fija
            colores.add("verde");
        } catch (UnsupportedOperationException e) {
            System.out.println("9. Error: a esta lista no se le pueden agregar elementos");
        }

        // 10. ConcurrentModificationException
        // Pasa cuando borramos elementos de una lista mientras la recorremos
        try {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);

            for (Integer n : numeros) {
                if (n == 2) {
                    numeros.remove(n);
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("10. Error: no se puede borrar de la lista mientras se recorre");
        }

        // 11. InputMismatchException
        // Pasa cuando el Scanner espera un numero y le escriben texto
        try {
            Scanner lector = new Scanner("veinte");   // simula que el usuario escribio "veinte"
            int edad = lector.nextInt();
            System.out.println(edad);
        } catch (InputMismatchException e) {
            System.out.println("11. Error: se esperaba un numero y escribieron texto");
        }

        System.out.println("\nEl programa termino sin caerse.");
    }
}