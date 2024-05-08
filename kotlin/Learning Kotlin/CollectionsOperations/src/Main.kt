fun main() {
//    val numbers = setOf(1, 2, 3, 4, 5)
//    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })
//
//    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3)
//    println(numbersMap.map { it.key to 3 })


//    //zipping
//    val colors = listOf("red","brown","grey")
//    val animals = listOf("fox", "bear", "wolf")
//    println(colors zip animals)
//    println(colors.zip(animals){color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})
//
//    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
//    println(numberPairs.unzip())


    //associate
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.associateWith { it.length })
//    println(numbers.associateBy { it.first().uppercase() })
//    println(numbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))


    //flatten
//    val numbersSets = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
//    println("\n")
//    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
//    for (numbers in numbersSets) {
//        for (number in numbers)
//            println(number)
//        println("\n")
//    }
//
//    val numbersFlatten = numbersSets.flatten()
//
//    println(numbersFlatten)


    //string representation
//    val numbersStrings = listOf("one", "two", "three", "four")
//    println(numbersStrings.joinToString())
////    val listString = StringBuffer("The list of numbers: ")
////    println(numbersStrings.joinTo(listString))
//    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
//
//    val numbers = (1..100).toList()
//    println(numbers.joinToString(limit = 15, truncated = "<...>"))
//
//    println(numbersStrings.joinToString { "Element ${it.uppercase()}" })


    //filtering
//    val numbers = listOf("one", "two", "three", "four")
//    val longerThan3 = numbers.filter { it.length > 3 }
//    println(longerThan3)
//
//    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4, "key 101" to 101)
//    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
//    println(filteredMap)
//
//    val filterIndexed = numbers.filterIndexed { index, value -> index != 0 && value.length < 5 }
//    println(filterIndexed)
//
//    val filteredNot = numbers.filterNot { it.length <= 3 }
//    println(filteredNot)
//
//    println("\n")
//    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "Jonas", "Hellow World", "Chad", false, true)
//    mixedList.filterIsInstance<Char>().forEach {
//        println(it)
//    }
//
//    //partition
//    val (match, rest) = numbers.partition { it.length > 3 }
//    println(rest)
//    println(numbers.any { it.endsWith("e") })
//    println(numbers.none { it.endsWith("w") })
//    println(numbers.all { it.length > 1 })


    //plus and minus operators
//    val numbers = mutableListOf("one", "two", "three", "four")
//    val plusList = numbers + "five"
//    val minusList = numbers - mutableListOf("three", "four")
//    println(plusList)
//    println(minusList)


    //grouping
//    val numbers = listOf("one","two","three","four","five")
//    println(numbers.groupBy { it.first().uppercase() })
//    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))


    //retrieve collections parts
//    val numbersStrings = listOf("one", "two", "three", "four", "five", "six")
//    println(numbersStrings.slice(1..3))
//    println(numbersStrings.slice(0..4 step 2))
//    println(numbersStrings.slice(setOf(3, 5, 0)))
//
//    println("\n")
//    println(numbersStrings.take(3))
//    println(numbersStrings.takeLast(3))
//    println(numbersStrings.drop(1))
//    println(numbersStrings.dropLast(5))
//
//    println("\n")
//    println(numbersStrings.takeWhile { !it.startsWith("f") })
//    println(numbersStrings.takeLastWhile { it != "three" })
//    println(numbersStrings.dropWhile { it.length == 3 })
//    println(numbersStrings.dropLastWhile { it.contains("i") })
//
//    println("\n")
//    val numbers = (0..13).toList()
//    println(numbers.chunked(3))
//    println(numbers.chunked(3) { it.sum() })
//
//    println("\n")
//    val numbersStrings2 = numbersStrings
//    println(numbersStrings2.windowed(3))


    //retrieve single elements
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.elementAt(3))
//    println(numbers.first())
//    println(numbers.last())
//
//    println("\n")
//    println(numbers.first { it.length > 3 })
//    println(numbers.last { it.startsWith("f") })
//    println(numbers.random())
//    println(numbers.isEmpty())


    //aggregate operations
//    val numbers = listOf(6,10,14,4,100)
//    println("The sum is ${numbers.sum()}")
//    println("The count is ${numbers.count()}")
//    println("The average is ${numbers.average()}")
//    println("The max value is ${numbers.max()}")
//    println("The min value is ${numbers.min()}")
//    println("The sum is: ${numbers.sumOf { it * 2 }}")


    //comparable and comparator
//    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
//    numbers.sorted().forEach { println(it) }
//
//    println("\n")
//    val laptops = mutableListOf(
//        LapTop("Dell", 2021, 4, 600),
//        LapTop("Acer", 2020, 8, 800),
//        LapTop("Apple", 2022, 16, 1000)
//    )
//    laptops.sortedWith(compareBy<LapTop> { it.price }.thenBy { it.year }).forEach { println(it) }
//    println("\n")
//    laptops.sortedBy { it.ram }.forEach { println(it) }


    //binary search
//    println(
//        searchElement(
//            27,
//            mutableListOf(
//                1,
//                2,
//                3,
//                4,
//                5,
//                6,
//                7,
//                8,
//                9,
//                10,
//                11,
//                12,
//                13,
//                14,
//                15,
//                16,
//                17,
//                18,
//                19,
//                20,
//                21,
//                22,
//                23,
//                24,
//                25,
//                26,
//                27,
//                28,
//                29,
//                30,
//                31
//            )
//        )
//    )


    //Generics: Type Parameters and Casting
    val footballPlayer = FootballPlayer("Football player 1")
    val footballPlayer2 = FootballPlayer("Football player 2")

    val baseballPlayer = BaseballPlayer("Baseball player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball player 2")

//    val team = Team<FootballPlayer>("Football team", mutableListOf<FootballPlayer>(footballPlayer, footballPlayer2))
//    val team2 = Team<BaseballPlayer>("Football team", mutableListOf<BaseballPlayer>(baseballPlayer, baseballPlayer2))


    //Generics - Covariance and Contravariance
//    val footballTeam = Team<Player>(
//        "Football Team",
//        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"), FootballPlayer("Player 2"))
//    )


    //Generics - Type Erasure and reifeid keyword
    val mixedList = mutableListOf(1,2,360,'a','b','c',"Hello","World")
    val specificList = getSpecificList<Char>(mixedList)


    //Generics - Where keyword; and 2 Upper Bounds
    addPlayer(FootballPlayer("Player 1"))
}

interface Listener {
    fun listen()
}

fun <T> addPlayer(player: T) where T:Player, T:Listener{}

class Team<T>(val name: String, val players: MutableList<out T>) where T:Player, T:Listener{

    fun addPlayers(player: T){
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the team ${this.name}")
        }else {

            //players.add(player)
            println("Player: ${(player as Player).name} was added in the team ${this.name}")
        }
    }
}

open class Player(val name: String)
class FootballPlayer(name: String) : Player(name), Listener {
    override fun listen() {
        TODO("Not yet implemented")
    }
}
class BaseballPlayer(name: String) : Player(name)
open class GamesPlayer(name:String):Player(name)
class CounterStrikePlayer(name: String):GamesPlayer(name)


//Generics - Type Erasure and reifeid keyword
inline fun <reified T> getSpecificList(list: List<Any>): List<T> {
    val specificList = mutableListOf<T>()

    for (element in list){
        if (element is T){
            specificList.add(element)
        }
    }
    return specificList
}
//------------------------------------------------












private fun searchElement(searchedElement: Int, numbers: MutableList<Int>): Int = numbers[numbers.binarySearch(searchedElement)] //{
//    var low = 0
//    var high = numbers.size - 1
//
//    var i = 0
//    while (low <= high) {
//        i++
//        println(i)
//        val mid = (low + high) / 2
//        val cmp = numbers[mid].compareTo(searchedElement)
//        println("actually number: ${numbers[mid]}")
//
//        if (cmp < 0){
//            low = mid + 1
//        }else if (cmp > 0) {
//            high = mid - 1
//        } else {
//            return numbers[mid]
//        }
//    }
//
//    return -1
//}

//data class LapTop(val brand: String, val year: Int, val ram: Int, val price: Int)
