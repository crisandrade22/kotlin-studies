//Class: Defines properties and functions for what is essentially a new
//data type. Classes are also called user-defined types.
//Member: Either a property or a function of a class.
//Member function: A function that works only with a specific class of
//object.
//Creating an object: Making a val or var of a class. Also called
//creating an instance of that class.

class Classes {

}
class Alien(val name: String) {
    val greeting = "Poor $name!"

    override fun toString(): String {
        return "Alien = $name"
    }

}

fun main() {
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
    println(alien.name)
    println(alien)
}