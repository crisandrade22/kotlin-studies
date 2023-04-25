fun main(args: Array<String>) {
    val range1: IntRange = 1..10
    val range2: IntRange = 0 until 10

    println(range1)
    println(range2)

    var sum = 0
    for (n in 10..100) {
        sum += n
    }
    println("sum = $sum")

    showRange(1..5)
    showRange(0 until 5)
    showRange(5 downTo 1)
    showRange(0..9 step 2)
    showRange(0 until 10 step 3)
    showRange(9 downTo 2 step 3)
}

fun showRange(r: IntProgression) {
    for (i in r) {
        print("$i ")
    }
    print("     // $r")
    println()

    println('t' in "Kotlin")
    println('z' in "Kotlin")
    println("hi".repeat(2))
    println('2' in '0'..'9')

//Floating-point ranges can only be created using .. because until would
//mean excluding a floating-point number as an endpoint, which doesn’t
//make sense.

    var i = 1
    println(i++ + ++i)
}