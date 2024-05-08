fun main() {
//    val names = arrayOf("Jonas", "Jonas2", "Jonas3", "Jonas4")
//    val mixedElements = arrayOf(1, 2, 3, 5, 8, "Jonas", "j")
//
//    for (i in 0 until names.size) {
//        println("${i + 1}º element ${names[i]}")
//    }
//
//    for (element in mixedElements){
//        if (element is Int) println(element)
//    }
//
//    println("The size of the array is: ${names.size}")
//    println("The size of the array is: ${mixedElements.count()}")


    // ----- CHALLENGE -----

    val numbers = arrayOf(1, 4, 9, 6, 8, 2, 5)

//    println("Max value = ${findMax(numbers)}")
//    println("Min value = ${findMin(numbers)}")

    var max = findMinAndMax(numbers, true)
    var min = findMinAndMax(numbers, false)

    println("-----------------------------------------")

    println("Max value = $max")
    println("Min value = $min")

}

fun findMax(numbers: Array<Int>) = numbers.max()
fun findMin(numbers: Array<Int>) = numbers.min()
fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax) {
        for (number in numbers) if (number > max) number.also { max = it }
        return max
    } else {
        for (number in numbers) if (number < min) number.also { max = it }
        return min
    }
}