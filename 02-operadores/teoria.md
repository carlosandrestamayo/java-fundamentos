# Operadores y expresiones en Java

## ¿Qué es un operador?

Un operador es un símbolo especial que permite realizar una operación
sobre uno o más valores llamados **operandos**, produciendo un resultado.

Ejemplo:

```java
int suma = 5 + 3;

```
En este ejemplo:

- `+` es el operador
- `5` y `3` son los operandos
- `8` es el resultado de la expresión

---

## ¿Qué es una expresión?

Una expresión es una combinación de:

- Variables
- Valores literales
- Operadores

que al evaluarse produce un resultado.

Ejemplos:

```java
int x = 10 + 5;
boolean mayor = x > 10;
double area = 3.14 * radio * radio;

```

---

## Clasificación de operadores en Java

Los operadores en Java se agrupan en varias categorías:

- Operadores aritméticos
- Operadores de asignación
- Operadores relacionales
- Operadores lógicos
- Operadores unarios
- Operador ternario

### Operadores aritméticos

Permiten realizar operaciones matemáticas básicas.

| Operador | Descripción      | Ejemplo |
| -------- | ---------------- | ------- |
| `+`      | Suma             | `a + b` |
| `-`      | Resta            | `a - b` |
| `*`      | Multiplicación   | `a * b` |
| `/`      | División         | `a / b` |
| `%`      | Módulo (residuo) | `a % b` |

Ejemplo:

```java
int a = 10;
int b = 3;

int suma = a + b;
int residuo = a % b;

```

### División entre enteros

Cuando ambos operandos son enteros, el resultado también es entero.

```java
int resultado = 10 / 3;
System.out.println(resultado); // Imprime 3

```

Para obtener decimales, al menos uno debe ser double o float.

```java
double resultado = 10.0 / 3;

```
---

### Operadores de asignación

Permiten asignar valores a variables.

| Operador | Ejemplo  | Equivalente a |
| -------- | -------- | ------------- |
| `=`      | `a = b`  | `a = b`       |
| `+=`     | `a += b` | `a = a + b`   |
| `-=`     | `a -= b` | `a = a - b`   |
| `*=`     | `a *= b` | `a = a * b`   |
| `/=`     | `a /= b` | `a = a / b`   |
| `%=`     | `a %= b` | `a = a % b`   |

Ejemplo: 

```java
int x = 10;
x += 5; // x ahora vale 15

```
---

### Operadores relacionales (comparación)

Comparan dos valores y devuelven un `boolean`.

| Operador | Descripción       | Ejemplo  |
| -------- | ----------------- | -------- |
| `==`     | Igual a           | `a == b` |
| `!=`     | Diferente de      | `a != b` |
| `>`      | Mayor que         | `a > b`  |
| `<`      | Menor que         | `a < b`  |
| `>=`     | Mayor o igual que | `a >= b` |
| `<=`     | Menor o igual que | `a <= b` |

```java
int edad = 18;
boolean esMayor = edad >= 18;

```
---

### Operadores lógicos

Se utilizan para combinar expresiones booleanas.

| Operador | Nombre | Descripción                         |    
| -------- | ------ | ---------------------------------   | 
| `&&`     | AND    | Verdadero si ambas son verdaderas   |
| `\|\|`   | OR     | Verdadero si al menos una es verdad  |
| `!`      | NOT    | Niega el valor booleano             |


```java
boolean tieneEdad = true;
boolean tieneDocumento = false;

boolean puedeEntrar = tieneEdad && tieneDocumento;

```
---

### Operadores unarios

Operan sobre un solo operando.

| Operador | Descripción     |
| -------- | --------------- |
| `+`      | Positivo        |
| `-`      | Negativo        |
| `++`     | Incremento      |
| `--`     | Decremento      |
| `!`      | Negación lógica |

```java
int x = 5;
x++;
--x;

```

#### Preincremento y postincremento

```java
int x = 5;
int y = x++;

```
- `y` vale `5`
- `x` vale `6`

```java
int a = 5;
int b = ++a;

```
- `a` vale `6`
- `b` vale `6`

---

### Operador ternario

Es una forma compacta de escribir una estructura condicional simple.

Sintaxis:

```java
condicion ? valor_si_verdadero : valor_si_falso;

```
Ejemplo:

```java
int edad = 20;
String mensaje = edad >= 18 ? "Mayor de edad" : "Menor de edad";

```
---

### Precedencia de operadores

La precedencia define el orden en que se evalúan los operadores.

Ejemplo:

```java
int resultado = 10 + 5 * 2; // resultado = 20

```
Se recomienda usar paréntesis para mayor claridad.

```java
int resultado = (10 + 5) * 2;

```
---

### Errores comunes

- Confundir  `=` con `==`
- Comparar objetos con `==` en lugar de equals
- No considerar la precedencia de operadores
- Usar operadores lógicos sin entender el cortocircuito

---

### Idea clave

- Los operadores permiten construir expresiones.
- Las expresiones producen valores.
- Comprender operadores es esencial para controlar el flujo del programa.