# Funciones y referencias en Java

## 1. Métodos (funciones) en Java

En Java, las funciones reciben el nombre de **métodos**. Un método es un bloque de código que realiza una tarea específica y puede ser reutilizado desde distintas partes del programa.

### Estructura general de un método

```java
modificador tipoRetorno nombreMetodo(parametros) {
    // instrucciones
    return valor; // si el tipoRetorno no es void
}
```

### Partes de un método
- **Modificador**: define el nivel de acceso (`public`, `private`, `protected`)
- **Tipo de retorno**: tipo de dato que devuelve el método (`int`, `double`, `String`, `void`, etc.)
- **Nombre del método**: identificador que describe la acción que realiza
- **Parámetros**: valores que recibe el método para operar
- **Cuerpo**: conjunto de instrucciones que se ejecutan

---

## 2. Métodos con y sin retorno

### Método sin retorno (`void`)

```java
public static void saludar() {
    System.out.println("Hola");
}
```

Este tipo de método ejecuta una acción pero **no devuelve ningún valor**.

### Método con retorno

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

Este método devuelve un valor que puede ser almacenado o utilizado en una expresión.

---

## 3. Paso de parámetros en Java

En Java, **todos los parámetros se pasan por valor**, pero es importante distinguir entre **tipos primitivos** y **referencias a objetos**.

### Paso de tipos primitivos

Cuando se pasa un tipo primitivo (`int`, `double`, `char`, `boolean`, etc.), el método recibe **una copia del valor**.

```java
public static void cambiar(int x) {
    x = 10;
}
```

El valor original no se modifica fuera del método.

---

## 4. Paso por referencia (referencia a objetos)

Cuando se pasa un **objeto** (como un arreglo o una clase), se pasa una **copia de la referencia**, no del objeto en sí.

Esto significa que el método puede **modificar el contenido del objeto**, pero no la referencia original.

### Ejemplo con arreglos

```java
public static void modificar(int[] arr) {
    arr[0] = 100;
}
```

El cambio se refleja fuera del método porque ambos apuntan al mismo objeto en memoria.

---

## 5. Métodos que reciben arreglos

Los arreglos se comportan como objetos, por lo tanto se pasan por referencia.

```java
public static int sumarElementos(int[] numeros) {
    int suma = 0;
    for (int n : numeros) {
        suma += n;
    }
    return suma;
}
```

Este tipo de método es muy común en programación estructurada.

---

## 6. Retorno de arreglos

Un método también puede devolver un arreglo.

```java
public static int[] crearArreglo() {
    int[] datos = {1, 2, 3};
    return datos;
}
```

---

## 7. Métodos estáticos vs no estáticos

### Métodos estáticos (`static`)
- Pertenecen a la clase
- Se pueden usar sin crear objetos
- Usados comúnmente en `main`

### Métodos no estáticos
- Pertenecen a un objeto
- Requieren una instancia de la clase

---

## 8. Errores comunes

- Olvidar el `return` en métodos con tipo de retorno
- Confundir paso por valor con referencia
- Modificar una referencia esperando que cambie el objeto
- Declarar métodos sin claridad en su responsabilidad

---

## 9. Buenas prácticas

- Usar nombres descriptivos para los métodos
- Cada método debe cumplir **una sola función**
- Evitar métodos demasiado largos
- Reutilizar métodos cuando sea posible

---

## 10. Idea clave para el estudiante

> En Java no se pasan variables, se pasan **valores**. En el caso de objetos, ese valor es una **referencia**.

Comprender este concepto es fundamental para trabajar correctamente con arreglos, objetos y métodos.

---