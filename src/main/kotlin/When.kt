val lista: List<Int> = listOf(10, 12, 18, 25, 32,90)

fun numero(i: Int): String =
    when (i) {
        10 -> "dez"
        12 -> "doze"
        18 -> "dezoito"
        25 -> "vinte e cinco"
        32 -> "trinta e dois"
        90 -> "noventa"
        else -> "Não há"
    }

fun main() {
    println(numero(10))
    println(numero(40))
}