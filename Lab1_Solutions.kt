
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
