
// Ejercicio 1: Conteo de Números Primos, Pares e Impares
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

// Ejemplo de uso
fun main() {
    val (primos, pares, impares) = contarNumeros(10)
    println("Prime numbers count: $primos")
    println("Even numbers count: $pares")
    println("Odd numbers count: $impares")
}
