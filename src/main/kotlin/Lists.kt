fun main() {
    var ints = listOf(99, 3, 5, 7, 11, 13)

    var result = ""
    for (i in ints) {
        result += "$i"
    }
    println(result)

    val lista: List<Int>

    var listaMutavel: MutableList<Int> = mutableListOf<Int>()

    for (i in 1..10) {
        listaMutavel.add(i)
    }

    lista = listaMutavel

    for (i in lista) {
        println(i)
    }

    val constants = mapOf(
        "Pi" to 3.141,
        "e" to 2.718,
        "phi" to 1.618
    )

    for (entry in constants) {
        println("${entry.key}=${entry.value}")
    }

}

