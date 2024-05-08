fun main() {
    var x = 5
    var y = 3

    //here we are doing operations
    /*
    flgjflg
    dlfgjk
     */


    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x % y = ${x % y}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    val myNumber = 100
    if (myNumber > 150) {
        println("Greater than 150")
    } else if (myNumber > 50) {
        println("Greater than 50")
    } else {
        println("All the conditions failed")
    }
    /*
    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100){
        println("Next level opened")
    }else {
        println("Still at the same value")
    }
     */
    val num1 = -5
    val num2 = -3
    val text = if (num1 > 0 || num2 > 0) "this is text 1" else 5


    println(text)
}
