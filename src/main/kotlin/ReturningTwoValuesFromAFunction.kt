fun pesoBmi(bmi: Double): Pair<Double, String> =
    when(bmi) {
        16.0 -> Pair(bmi,"Severe Thinness")
        17.0 -> Pair(bmi,"Moderate Thinness")
        18.5 -> Pair(bmi,"Mild Thinness")
        25.0 -> Pair(bmi,"Normal")
        30.0 -> Pair(bmi,"Overweight")
        35.0 -> Pair(bmi,"Obese")
        else -> Pair(bmi,"I don't know")
    }

fun pesoBmiFraseMotivacional(bmi: Double): Triple<Double, String, String> =
    when(bmi) {
        16.0 -> Triple(bmi,"Severe Thinness", "You need to eat a lot more")
        17.0 -> Triple(bmi,"Moderate Thinness", "You need to eat a little more")
        18.5 -> Triple(bmi,"Mild Thinness", "You are quite there.")
        25.0 -> Triple(bmi,"Normal", "You are in the right path")
        30.0 -> Triple(bmi,"Overweight", "You need to eat a little less")
        35.0 -> Triple(bmi,"Obese", "You need to keep yourself away from food")
        else -> Triple(bmi,"I don't know", "You are lost")
    }

fun main() {
    val (bmi, resultado) = pesoBmi(25.0)
    println(bmi)
    println(resultado)

    val(yourBmi, yourResult, yourPhrase) = pesoBmiFraseMotivacional(30.0)
    println(yourBmi)
    println(yourResult)
    println(yourPhrase)
}