# Lab 1: Manejo de Estructura de Datos

## Descripción
Este repositorio contiene las soluciones para los ejercicios del Laboratorio 1 del curso de Manejo de Estructura de Datos.

## Ejercicio 1: Conteo de Números Primos, Pares e Impares
Dado un número entero N, se evalúan todos los números desde 1 hasta N, determinando cuántos son primos, cuántos son pares y cuántos son impares.

### Implementación
Se implementó una clase `Numero` con métodos para verificar si un número es primo, par o impar. Luego, se cuentan estos números en el rango de 1 a N. Se manejan errores para entradas inválidas como números negativos o cero.

### Código
```kotlin
class Numero(val valor: Int) {
    fun esPrimo(): Boolean {
        if (valor <= 1) return false
        for (i in 2..Math.sqrt(valor.toDouble()).toInt()) {
            if (valor % i == 0) return false
        }
        return true
    }

    fun esPar(): Boolean = valor % 2 == 0

    fun esImpar(): Boolean = !esPar()
}

fun contarNumeros(N: Int): Triple<Int, Int, Int> {
    var primos = 0
    var pares = 0
    var impares = 0
    for (i in 1..N) {
        val numero = Numero(i)
        if (numero.esPrimo()) primos++
        if (numero.esPar()) pares++ else impares++
    }
    return Triple(primos, pares, impares)
}
```

### Ejemplo de Salida
```
Prime numbers count: 3
Even numbers count: 2
Odd numbers count: 3
```

## Ejercicio 2: FizzBuzz
El problema clásico de FizzBuzz consiste en imprimir los números del 1 al 100, pero para múltiplos de 3 imprimir "Fizz", para múltiplos de 5 imprimir "Buzz" y para múltiplos de ambos imprimir "FizzBuzz".

### Implementación
Se implementó la lógica en una clase `FizzBuzz` para determinar si un número es divisible por 3, 5 o ambos y se imprime el resultado correspondiente.

### Código
```kotlin
class FizzBuzz(val n: Int) {
    fun generar(): String {
        val resultado = mutableListOf<String>()
        for (i in 1..n) {
            when {
                i % 3 == 0 && i % 5 == 0 -> resultado.add("FizzBuzz")
                i % 3 == 0 -> resultado.add("Fizz")
                i % 5 == 0 -> resultado.add("Buzz")
                else -> resultado.add(i.toString())
            }
        }
        return resultado.joinToString(" ")
    }
}
```

### Ejemplo de Salida
```
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz
```

## Autor
Ulises Ismael Quintanilla Gonzalez

