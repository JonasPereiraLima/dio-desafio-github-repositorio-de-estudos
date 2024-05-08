fun main() {
//    val names = listOf<String>("name 1", "name 2", "name3")
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Jonas", 3 to "John")
    users[5] = "Alex"
    users.remove(5)
    users.forEach { k, v ->
        println("$k = $v")
    }

}

