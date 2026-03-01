public class EjemploPrimitivos {

    public static void main(String[] args) {

        // Se declara una variable primitiva de tipo int
        // y se le asigna el valor 10
        int a = 10;

        // Al asignar 'a' a 'b', se copia el VALOR,
        // no existe ninguna relación posterior entre ambas variables
        int b = a;

        // Se modifica únicamente el valor de 'b'
        b = 20;

        // Imprime el valor original de 'a'
        // No cambia porque los primitivos se copian por valor
        System.out.println(a);

        // Imprime el nuevo valor de 'b'
        System.out.println(b);
    }
}
