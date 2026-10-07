/*
 * PROGRAMACIÓN II - Clase del día
 * Tema: clases, constructores sobrecargados, métodos estáticos y ordenamiento burbuja.
 *
 * Idea central: una clase es el MOLDE de un objeto del mundo real.
 * Aquí el molde describe a una persona con cuatro características (atributos)
 * y con las cosas que se puede hacer con ella (métodos).
 */

// "package" indica en qué carpeta lógica vive esta clase.
// Otros archivos que estén fuera de Models deberán escribir: import Models.Persona;
package Models;

public class Persona {

    // ---------------------------------------------------------------
    // 1. ATRIBUTOS
    // ---------------------------------------------------------------
    // Son "private" para aplicar ENCAPSULAMIENTO: nadie desde afuera puede
    // tocarlos directamente. Solo se accede a ellos por los getters y setters.
    // ¿Por qué? Porque así la clase controla cómo cambian sus propios datos.
    private String nombre;
    private String apellido;
    private int edad;
    private boolean male;

    // ---------------------------------------------------------------
    // 2. CONSTRUCTORES (y SOBRECARGA)
    // ---------------------------------------------------------------
    // Un constructor es el método especial que se ejecuta al hacer "new Persona(...)".
    // Tiene el mismo nombre de la clase y NO declara tipo de retorno.
    //
    // SOBRECARGA (overloading): una clase puede tener varios constructores
    // (o métodos) con el mismo nombre, siempre que cambie la lista de
    // parámetros: la cantidad, el tipo o el ORDEN de los tipos.
    // Java decide cuál ejecutar según los argumentos que le pasas al "new".

    // Constructor vacío: crea la persona "en blanco".
    // Los atributos quedan con su valor por defecto: null (String), 0 (int), false (boolean).
    // Se usa después con los setters: p.setNombre("Ana");
    public Persona() {
    }

    // Constructor completo: recibe los cuatro datos de una vez.
    // "this.nombre" es el atributo del objeto; "nombre" (sin this) es el parámetro.
    // Se llaman igual, por eso "this" es necesario para distinguirlos.
    public Persona(String nombre, String apellido, int edad, boolean male) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.male = male;
    }

    // Constructor parcial: solo nombre y apellido. Edad y male quedan en 0 y false.
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // ⚠ PARA DISCUTIR EN CLASE: este constructor tiene el cuerpo vacío.
    // Compila y se puede usar, pero NO guarda ningún dato: el objeto queda
    // con todo en null/0/false aunque le pases argumentos.
    // Es un error muy común: declarar los parámetros y olvidar asignarlos.
    // Corrección: this.apellido = apellido; this.nombre = nombre; this.edad = edad;
    public Persona(String apellido, String nombre, int edad){
        
    }

    // Ojo con esta sobrecarga: los tipos son (String, int, String), distinto orden
    // que el constructor anterior (String, String, int). Java los distingue solo
    // por el ORDEN de los tipos. Funciona, pero es fuente de confusión: en la
    // práctica profesional se evita porque es fácil llamar al equivocado.
    public Persona(String apellido, int edad, String nombre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;    
    }

    // ---------------------------------------------------------------
    // 3. GETTERS Y SETTERS
    // ---------------------------------------------------------------
    // Getter = "dame el valor". Setter = "cambia el valor".
    // Son el único camino autorizado hacia los atributos privados.

    // Sobrecarga de un MÉTODO (no solo de constructores): mismo nombre
    // getNombre, pero este recibe un parámetro y devuelve el nombre con un
    // tratamiento delante. Ejemplo: getNombre("Sr.") -> "Sr. Carlos"
    public String getNombre(String tratamiento){
        return tratamiento + " " + nombre;
    }

    // Getter clásico: sin parámetros, devuelve el atributo tal cual.
    public String getNombre() {
        return nombre;
    }
   

    // Setter: recibe el nuevo valor y lo guarda. "void" porque no devuelve nada.
    // Aquí es donde, más adelante, se agregarían validaciones (por ejemplo,
    // rechazar un nombre vacío).
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Convención de Java: el getter de un boolean se llama "isXxx", no "getXxx".
    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    // ---------------------------------------------------------------
    // 4. MÉTODOS ESTÁTICOS
    // ---------------------------------------------------------------
    // "static" significa que el método pertenece a la CLASE, no a un objeto.
    // Se llama así: Persona.getClassName()   (sin necesidad de hacer "new").
    // Regla para recordar: un método static NO puede usar "this" ni los
    // atributos de un objeto concreto, porque no hay ningún objeto de por medio.
    public static String getClassName(){
        return "Lo que yo quiera";
    }

    // Muestra un arreglo de personas en forma de tabla.
    // Es static porque trabaja con un arreglo que recibe como parámetro,
    // no con "una persona" en particular.
    public static void mostrar(Persona[] arr, String title) {
        
        System.out.println("Sort by " + title);

        // Formato de printf:
        //   %n   -> salto de línea (funciona en cualquier sistema operativo)
        //   %-12s -> texto en 12 espacios, alineado a la IZQUIERDA (el "-" lo indica)
        //   %4s  -> texto en 4 espacios, alineado a la derecha
        //   %4d  -> número entero en 4 espacios, alineado a la derecha
        String linea = "+--------------+--------------+------+%n";

        System.out.printf(linea);
        System.out.printf("| %-12s | %-12s | %4s |%n", "Nombre", "Apellido", "Edad");
        System.out.printf(linea);

        // for-each: "para cada Persona p dentro de arr". Es la forma más
        // limpia de recorrer un arreglo cuando no necesitas el índice.
        for (Persona p : arr) {
            System.out.printf("| %-12s | %-12s | %4d |%n",
                    p.getNombre(), p.getApellido(), p.getEdad());
        }

        System.out.printf(linea);
    }

    // ---------------------------------------------------------------
    // 5. ORDENAMIENTO BURBUJA (Bubble Sort)
    // ---------------------------------------------------------------
    // Idea: recorrer el arreglo comparando VECINOS de dos en dos; si están
    // en el orden equivocado, se intercambian. Con cada pasada completa,
    // el elemento "más grande" queda en su posición final, como una
    // burbuja que sube hasta la superficie.
    public static void sortByName(Persona [] arr){
        int n = arr.length;
        
        // Ciclo externo (i): cuenta las pasadas. Se necesitan n-1 como máximo.
        for (int i = 0; i < n - 1; i++) {

            // Ciclo interno (j): recorre el arreglo comparando arr[j] con arr[j+1].
            // El límite "n - 1 - i" se va acortando porque las últimas i posiciones
            // ya quedaron ordenadas en las pasadas anteriores.
            for (int j = 0; j < n - 1 - i; j++) {

                // Los String NO se comparan con ">" ni "==".
                // compareTo devuelve: negativo si el 1º va antes, 0 si son iguales,
                // positivo si el 1º va después. Positivo = están al revés -> intercambiar.
                // Nota: aquí se accede a "arr[j].nombre" directamente (sin getter).
                // Se permite porque estamos DENTRO de la clase Persona.
                if(arr[j].nombre.compareTo(arr[j+1].nombre) > 0){

                    // Intercambio con variable auxiliar. Sin "aux" perderías
                    // una de las dos referencias:
                    // 1) guardo arr[j+1]  2) muevo arr[j] a la derecha  3) pongo aux a la izquierda
                    Persona aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        mostrar(arr, "Nombre");

    }

    // Refactorización: el intercambio se repetía en varios sitios, así que
    // se extrae a un método propio. Principio: "no repitas código" (DRY).
    // Recibe el arreglo y la posición j; intercambia arr[j] con arr[j+1].
    public static void intercambiar(Persona[] arr, int j){
        Persona aux = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = aux;
    }

    // Versión general de la burbuja: el atributo por el que se ordena llega
    // como parámetro de texto ("apellido", "edad" o cualquier otro -> nombre).
    public static void sort(Persona [] arr, String atribute){
         int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                
                // ⚠ PARA DISCUTIR EN CLASE: aquí se compara texto con "==".
                // En los String, "==" compara si son el MISMO objeto en memoria,
                // no si tienen el mismo contenido. Con literales como "apellido"
                // suele funcionar porque Java reutiliza los literales, pero deja
                // de funcionar si el texto viene de un Scanner o de otra operación.
                // Lo correcto es: atribute.equals("apellido")
                if(atribute == "apellido"){
                    if(arr[j].apellido.compareTo(arr[j+1].apellido) > 0){
                        intercambiar(arr, j);
                    }
                }
                // Para un número (int) sí se usa ">" directamente:
                // los tipos primitivos se comparan por valor.
                else if(atribute == "edad"){
                    if(arr[j].edad > arr[j + 1].edad){
                         intercambiar(arr, j);
                    }
                }
                // Caso por defecto: cualquier otro valor ordena por nombre.
                else{
                    if(arr[j].nombre.compareTo(arr[j+1].nombre) > 0){
                        intercambiar(arr, j);
                    }
                    // Se reasigna el parámetro para que el título de la tabla
                    // diga "nombre" aunque hayan enviado un texto inválido.
                    // Funciona, pero es más limpio decidirlo una sola vez fuera de los ciclos.
                    atribute = "nombre";
                }
            }
        }

        mostrar(arr, atribute);
    }
  
}