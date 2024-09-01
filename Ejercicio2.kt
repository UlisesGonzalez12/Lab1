
// Ejercicio 2: FizzBuzz
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

// Ejemplo de uso
fun main() {
    val fizzBuzz = FizzBuzz(100)
    println(fizzBuzz.generar())
}
