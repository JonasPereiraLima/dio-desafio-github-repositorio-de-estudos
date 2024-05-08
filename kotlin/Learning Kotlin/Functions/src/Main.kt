fun main() {
    /*sayHello("Jonas", 22)

    val hasInternetConnection: Boolean = false
    if (hasInternetConnection) getData("04/19/2024") else showMessage()*/
    /*val max: Int = getMax(5, 8)
    println(max)*/
//    sendMessage("Jonas", "Hello!")
    val sum: Int = sum(1,1,1,1)
    println(sum)
}

fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}


fun sendMessage(name: String, message: String = sendText()) {
    println("Name = $name and message = $message")
}

fun sendText() = "Some text!"


fun getMax(a: Int, b: Int): Int = if (a > b) a else b


fun sayHello(name: String, age: Int) {
    println("Hello, my name's $name, i'm $age years old")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no internet connection")
}