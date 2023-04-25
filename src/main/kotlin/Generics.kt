import atomictest.eq

class GenericHolder<T>(
    private val value: T
) {
    fun getValue(): T = value
}

data class Automobile(val brand: String)
data class Moto(val brand: String)

fun main() {
    val h1 = GenericHolder(Automobile("Ford"))
    val a: Automobile = h1.getValue()
    a eq "Automobile(brand=Ford)"

    val h2 = GenericHolder(1)
    val i: Int = h2.getValue()
    i eq 1

    val h3 = GenericHolder("Chartreuse")
    val s: String = h3.getValue()
    s eq "Chartreuse"

    val h4 = GenericHolder(Moto("Feizer"))
    val value: Moto = h4.getValue()

    print(value)

}