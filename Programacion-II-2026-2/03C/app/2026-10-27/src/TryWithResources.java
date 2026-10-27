import java.util.Scanner;

// TRY-WITH-RESOURCES (desde Java 7)
// Un "recurso" es algo que hay que CERRAR cuando terminamos de usarlo:
// un Scanner, un archivo, una conexion a base de datos, etc.
//
// Si declaramos el recurso dentro de los parentesis del try,
// Java lo cierra AUTOMATICAMENTE al terminar, haya error o no.
// Asi no tenemos que escribir close() ni usar finally.
//
//      try (Recurso r = new Recurso()) {
//          ... usamos r ...
//      }   <-- aqui Java llama a r.close() solito

public class TryWithResources {

    public static void main(String[] args) {

        ejemploConScanner();
        System.out.println();

        ejemploSinError();
        System.out.println();

        ejemploConError();
        System.out.println();

        ejemploVariosRecursos();

        System.out.println("\nEl programa termino sin caerse.");
    }

    // 1. El caso mas comun: un Scanner
    public static void ejemploConScanner() {
        System.out.println("--- 1. Scanner con try-with-resources ---");

        // Simulamos que el usuario escribio "25" y "abc"
        try (Scanner lector = new Scanner("25 abc")) {
            int primero = lector.nextInt();
            System.out.println("Primer numero leido: " + primero);

            int segundo = lector.nextInt();   // "abc" no es numero: aqui falla
            System.out.println("Segundo numero leido: " + segundo);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: se esperaba un numero");
        }
        // No escribimos lector.close(): Java ya lo cerro
    }

    // 2. Con nuestra propia clase vemos CUANDO se cierra el recurso
    public static void ejemploSinError() {
        System.out.println("--- 2. Recurso propio, sin error ---");

        try (Conexion conexion = new Conexion("BaseDeDatos")) {
            conexion.consultar("SELECT * FROM estudiantes");
        }
        // Mira la salida: "Cerrando..." aparece sin que lo hayamos llamado
    }

    // 3. Aunque ocurra un error, el recurso se cierra ANTES de entrar al catch
    public static void ejemploConError() {
        System.out.println("--- 3. Recurso propio, con error ---");

        try (Conexion conexion = new Conexion("BaseDeDatos")) {
            conexion.consultar("");   // consulta vacia: lanza un error
            System.out.println("Esta linea NO se imprime");

        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
    }

    // 4. Se pueden abrir varios recursos separados por punto y coma ;
    //    Se cierran en ORDEN INVERSO: el ultimo que se abrio es el primero que se cierra
    public static void ejemploVariosRecursos() {
        System.out.println("--- 4. Varios recursos a la vez ---");

        try (Conexion primera = new Conexion("Estudiantes");
             Conexion segunda = new Conexion("Notas")) {

            primera.consultar("SELECT nombre FROM estudiantes");
            segunda.consultar("SELECT nota FROM notas");
        }
    }
}

// Para usar una clase en try-with-resources debe implementar AutoCloseable.
// Esa interfaz solo pide un metodo: close()
class Conexion implements AutoCloseable {

    private String nombre;

    public Conexion(String nombre) {
        this.nombre = nombre;
        System.out.println("Abriendo conexion a " + nombre);
    }

    public void consultar(String sql) {
        if (sql.isEmpty()) {
            throw new IllegalArgumentException("la consulta no puede estar vacia");
        }
        System.out.println("Consultando en " + nombre + ": " + sql);
    }

    @Override
    public void close() {
        System.out.println("Cerrando conexion a " + nombre);
    }
}
