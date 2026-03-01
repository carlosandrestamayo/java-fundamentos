# Ejercicios Propuestos – Operadores y expresiones en Java

## Instrucciones generales

Lee cuidadosamente cada ejercicio.

- Escribe el código en Java.
- Justifica mentalmente el resultado antes de ejecutarlo.
- No uses estructuras de control (`if`, `for`, `etc`.) a menos que se indique.
- Concéntrate únicamente en operadores y expresiones.

---

### Ejercicio 1 – Operadores aritméticos

Dadas las siguientes variables:

```java
int a = 15;
int b = 4;

```

1. Calcula la suma de `a` y `b`.
2. Calcula la resta de `a` menos `b`.
3. Calcula el producto de `a` por `b`.
4. Calcula la división entera de `a` entre `b`.
5. Calcula el residuo de la división de `a` entre `b`.

📌 Imprime cada resultado con un mensaje descriptivo.

---

### Ejercicio 2 – División real vs división entera

Declara dos variables enteras `x = 7` y `y = 2`.

1. Realiza la división `x / y` y guarda el resultado.
2. Realiza la división convirtiendo uno de los operandos a `double`.
3. Imprime ambos resultados.
4. Explica por qué los resultados son diferentes.

---

### Ejercicio 3 – Operadores de asignación compuesta

Dada la siguiente variable:

```java
int contador = 10;

```

Aplica, en orden, los siguientes operadores:

1. `+= 5`
2. `-= 3`
3. `*= 2`
4. `/= 4`
5. `%= 3`

📌 Imprime el valor de contador después de cada operación.

---

### Ejercicio 4 – Operadores relacionales

Dadas las variables:

```java
int a = 8;
int b = 12;

```

Evalúa las siguientes expresiones e imprime el resultado:

- `a == b`
- `a != b`
- `a > b`
- `a < b`
- `a >= 8`
- `b <= 10`

📌 Indica cuáles expresiones son verdaderas y cuáles falsas.

---

### Ejercicio 5 – Expresiones booleanas

Dadas las variables:

```java
boolean esMayor = true;
boolean tieneLicencia = false;

```

- Evalúa si una persona puede conducir usando el operador `&&`.
- Evalúa si puede realizar un trámite usando el operador `||`.
- Niega el valor de `esMayor`.

📌 Imprime cada resultado con un mensaje claro.

---

### Ejercicio 6 – Cortocircuito lógico

Observa el siguiente código:

```java
int x = 0;

boolean resultado = (x != 0) && (10 / x > 1);

```

1. ¿Se produce un error de ejecución?
2. Explica por qué ocurre o no ocurre el error.
3. ¿Qué pasaría si se usara el operador & en lugar de &&?

📌 No ejecutes el código sin analizarlo primero.

---

### Ejercicio 7 – Operadores unarios

Dada la variable:

```java
int n = 5;

```

1. Aplica el postincremento y guarda el resultado.
2. Aplica el preincremento y guarda el resultado.
3. Aplica el operador de negación aritmética.
4. Imprime el valor de `n` después de cada operación.

---

### Ejercicio 8 – Precedencia de operadores

Analiza y resuelve las siguientes expresiones:

```java
int resultado1 = 10 + 5 * 2;
int resultado2 = (10 + 5) * 2;

```

1. Imprime ambos resultados.
2. Explica por qué son diferentes.
3. Indica qué operador tiene mayor precedencia.

---

### Ejercicio 9 – Operador ternario

Dada la variable:

```java
int nota = 65;

```

Utiliza el operador ternario para asignar un mensaje según la condición:

- `"Aprobado"` si la nota es mayor o igual a 60
- `"Reprobado"` en caso contrario

📌 Imprime el mensaje final.

---

### Ejercicio 10 – Expresión completa

Construye una sola expresión que evalúe lo siguiente:

- Un número es mayor que 10
- Y es menor que 50
- Y no es igual a 30

Utiliza operadores relacionales y lógicos.

📌 Prueba la expresión con diferentes valores.

---

### Ejercicio desafío (opcional)

Sin usar `if`, construye una expresión que:

- Determine si un número es par o impar
- Asigne el resultado a un `String`
- Use únicamente operadores y el operador ternario

---

### Idea clave

- Los operadores construyen expresiones.
- Las expresiones definen el comportamiento del programa.
- Entender operadores evita errores lógicos difíciles de detectar.

---

