fun main() {
    /* Loops: FOR */
//    for (i in 1..10){
//        println(i)
//    }
//    for (i in 1 until 10) {
//        println(i)
//    }
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//    for (i in 1 until 10 step 2) {
//        println(i)
//    }
    /*------------*/

    /* Loops: WHILE */

//    var number = 0
//    outer@ while (number < 5) {
//        number++
//        if (number == 7) continue
//        println(number)
//
//        var i = 0
//        while (i < 5){
//            i++
//            if (i == 1) break@outer
//            println("***$i")
//        }
//    }
    /*----------------*/
    /* Loops: DO WHILE */
//    do {
//        println(number)
//    } while (number < 10)
    /*-------------*/
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++
        if ((number % 2) != 0) continue
        println(number)
        evenNumberCounter++
    }
    println("total number of even numbers found = $evenNumberCounter")
}