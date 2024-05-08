fun main() {
    var text: String? = null
    val text2: String = text ?: "The variable is null"
    println(text2.length)
    /*var result = if (text != null) text.length else "The variable is null"
    println(result)

    text = "Name"
    result = if (text != null) text.length else "The variable is null"
    println(result)*/
}