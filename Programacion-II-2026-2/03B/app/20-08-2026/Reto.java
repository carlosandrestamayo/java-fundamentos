public class Reto {

    public static void main(String[] args) {

        // =========================================================
        // RETO: ENCONTRAR NÚMEROS PERFECTOS EN UN ARREGLO
        // =========================================================
        //
        // Dado un arreglo de números enteros, determina cuáles
        // de sus elementos son números perfectos.
        //
        // Los números perfectos encontrados deben almacenarse
        // en un NUEVO arreglo.
        //
        // ---------------------------------------------------------
        // ¿QUÉ ES UN NÚMERO PERFECTO?
        // ---------------------------------------------------------
        //
        // Un número perfecto es un número que es igual a la suma
        // de todos sus divisores positivos propios.
        //
        // Los divisores propios son los divisores del número
        // diferentes del mismo número.
        //
        // Ejemplo:
        //
        // El número 6 tiene como divisores propios:
        //
        // 1, 2 y 3
        //
        // Entonces:
        //
        // 1 + 2 + 3 = 6
        //
        // Por lo tanto, 6 es un número perfecto.
        //
        // Otro ejemplo:
        //
        // 28 tiene como divisores propios:
        //
        // 1, 2, 4, 7 y 14
        //
        // Entonces:
        //
        // 1 + 2 + 4 + 7 + 14 = 28
        //
        // Por lo tanto, 28 también es un número perfecto.
        //
        // ---------------------------------------------------------
        // ARREGLO INICIAL
        // ---------------------------------------------------------
        //
        // Utiliza el siguiente arreglo:
        //
        // int[] numeros = {
        //     6, 10, 15, 28, 30, 12, 496, 20, 8, 100
        // };
        //
        // Debes recorrer todos los elementos del arreglo y
        // determinar cuáles son números perfectos.
        //
        // ---------------------------------------------------------
        // OBJETIVO
        // ---------------------------------------------------------
        //
        // 1. Recorrer el arreglo utilizando un ciclo.
        //
        // 2. Para cada número, determinar cuáles son sus
        //    divisores propios.
        //
        // 3. Sumar los divisores propios.
        //
        // 4. Determinar si la suma de los divisores es igual
        //    al número analizado.
        //
        // 5. Si el número es perfecto, almacenarlo en un
        //    NUEVO arreglo llamado, por ejemplo:
        //
        //    arrPerfectos
        //
        // 6. Finalmente, recorrer el nuevo arreglo y mostrar
        //    los números perfectos encontrados.
        //
        // ---------------------------------------------------------
        // RESULTADO ESPERADO
        // ---------------------------------------------------------
        //
        // Para el arreglo propuesto, los números perfectos
        // encontrados deben ser:
        //
        // 6
        // 28
        // 496
        //
        // Por lo tanto, el nuevo arreglo debe contener:
        //
        // [6, 28, 496]
        //
        // ---------------------------------------------------------
        // PISTAS
        // ---------------------------------------------------------
        //
        // Para determinar si un número es perfecto:
        //
        // - Necesitas una variable para acumular la suma
        //   de los divisores.
        //
        // - Necesitas un ciclo para buscar los divisores.
        //
        // - Puedes utilizar el operador % para determinar
        //   si un número es divisible entre otro.
        //
        //   Ejemplo:
        //
        //   numero % divisor == 0
        //
        //   significa que la división es exacta.
        //
        // - Recuerda que el mismo número NO debe incluirse
        //   como divisor propio.
        //
        // ---------------------------------------------------------
        // PISTA PARA EL NUEVO ARREGLO
        // ---------------------------------------------------------
        //
        // Antes de crear el nuevo arreglo necesitas saber
        // cuántos números perfectos existen.
        //
        // Puedes utilizar un contador para llevar la cantidad
        // de números perfectos encontrados.
        //
        // Después podrás utilizar ese contador para crear
        // un arreglo que tenga exactamente el tamaño necesario.
        //
        // ---------------------------------------------------------
        // RETO ADICIONAL
        // ---------------------------------------------------------
        //
        // Modifica el programa para mostrar también los divisores
        // propios de cada número perfecto.
        //
        // Ejemplo:
        //
        // Número: 6
        // Divisores: 1, 2, 3
        // Suma: 6
        //
        // Número: 28
        // Divisores: 1, 2, 4, 7, 14
        // Suma: 28
        //
        // =========================================================


        // Escribe aquí tu solución.
        

    }
}