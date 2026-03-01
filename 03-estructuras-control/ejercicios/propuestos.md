# Ejercicios Propuestos – Estructuras de Control en Java

## Ejercicio 1 – Condicionales con rangos de valores

Crea un programa que solicite al usuario una temperatura en grados Celsius y muestre:

- `"Hace frío 🥶"` si la temperatura es menor a 10
- `"Clima agradable 🌤️"` si la temperatura está entre 10 y 25
- `"Hace calor 🔥"` si la temperatura es mayor a 25

---

## Ejercicio 2 - Calcular el precio final con descuento

Crea un programa que solicite al usuario el precio inicial de un producto y calcule el precio final según las siguientes reglas:

- Si el precio es menor a 500 → sin descuento
- Si el precio está entre 500 y 1000 → 10 % de descuento
- Si el precio es mayor a 1000 → 20 % de descuento

**El programa debe mostrar:**

- El precio original
- El descuento aplicado
- El precio final

## Ejercicio 3 – Días de la Semana con `switch`

Crea un programa que solicite al usuario un número entero entre **1 y 7**, donde cada número represente un día de la semana:

| Número | Día       |
|------:|-----------|
| 1     | Lunes     |
| 2     | Martes    |
| 3     | Miércoles |
| 4     | Jueves    |
| 5     | Viernes   |
| 6     | Sábado    |
| 7     | Domingo   |

**El programa debe:**

- Mostrar el nombre del día correspondiente usando una estructura `switch`
- Indicar si es **día laboral** o **fin de semana**
- Mostrar un mensaje especial para sábado y domingo

**Reglas**

- Usa únicamente la estructura `switch`
- No uses estructuras repetitivas (`for`, `while`)
- Usa `break` correctamente para evitar ejecuciones no deseadas
- Usa `default` para manejar valores inválidos

---

#### Ejemplo de entrada

```text
Ingrese un número del 1 al 7: 6
```
#### Ejemplo de entrada

```text
Día: Sábado
Tipo: Fin de semana
Mensaje: ¡Tiempo para descansar! 😎
```
---

## Ejercicio 4 – Sumar los números del 1 al 100 con `for`

Crea un programa que calcule la suma de todos los números enteros del 1 al 100 utilizando una estructura repetitiva for.

**El programa debe:**

- Usar un ciclo `for`
- Acumular la suma de los números
- Mostrar el resultado final en pantalla

---

## Ejercicio 5 – Determinar si un número es primo

Crea un programa que solicite al usuario un número entero positivo y determine si es un **número primo**.

**Un número primo es aquel que:**

- Es mayor que 1
- Solo es divisible entre 1 y él mismo

**El programa debe:**

- Usar una estructura repetitiva (`for`)
- Determinar si el número es primo
- Mostrar un mensaje indicando el resultado

---

## Ejercicio 6 – Determinar si un número es perfecto (usando `while`)

Crea un programa que solicite al usuario un número entero positivo y determine si es un **número perfecto**.

Un número perfecto es aquel cuya **suma de sus divisores propios** (sin incluirse a sí mismo) es igual al número.

**Ejemplos**

- 6 → 1 + 2 + 3 = 6 ✅  
- 28 → 1 + 2 + 4 + 7 + 14 = 28 ✅  
- 10 → 1 + 2 + 5 = 8 ❌  

---

## Ejercicio 7 – Validación de contraseña con `while`

Crea un programa que solicite al usuario ingresar una **contraseña**.

**El programa debe:**

- Repetir la solicitud de la contraseña **mientras sea incorrecta**
- Finalizar únicamente cuando la contraseña ingresada sea correcta
- Mostrar un mensaje de acceso concedido al final

**La contraseña correcta es:**

```text
admin
```

**Ejemplo de ejecución**

```text
Ingrese la contraseña: 1234
Contraseña incorrecta. Intente nuevamente.

Ingrese la contraseña: admin
Acceso concedido.
```

**Pistas**

- Recuerda que las cadenas de texto no se comparan con `==`
- Usa un Scanner para leer la entrada del usuario
- Piensa en una condición que mantenga el ciclo activo

---

## Ejercicio 8 – Menú de opciones con `do-while`

Crea un programa que muestre un **menú de opciones** y permita al usuario seleccionar una opción hasta que decida salir.

**El programa debe mostrar el siguiente menú:**

```text
MENÚ PRINCIPAL
1. Saludar
2. Mostrar un mensaje motivacional
3. Salir
```
**El programa debe:**

- Mostrar el menú al menos una vez
- Ejecutarse repetidamente mientras el usuario no elija la opción 3
- Mostrar un mensaje diferente según la opción seleccionada
- Finalizar cuando el usuario elija Salir

**Ejemplo de Ejecución:**

```text
MENÚ PRINCIPAL
1. Saludar
2. Mostrar un mensaje motivacional
3. Salir
Seleccione una opción: 2

¡Sigue aprendiendo, vas por buen camino! 🚀

MENÚ PRINCIPAL
1. Saludar
2. Mostrar un mensaje motivacional
3. Salir
Seleccione una opción: 3

Programa finalizado.
```

---

