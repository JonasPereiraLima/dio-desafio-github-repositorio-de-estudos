fun main() {

//    val user2 by lazy {
//        User("User1", "lastName", 0)
//    }
//    for (direction in Direction.values()) {
//        println(direction)
//    }


//    val clickListener = ClickListener()
//    val loginButton = Button("Login", 1324, object: OnClicklistener{
//        override fun onClick() {
//            TODO("Not yet implemented")
//        }
//
//    })

}



//class App : A by FirstDelegate(), B by SecondDelegate() {
//    override fun print() {
//        TODO("Not yet implemented")
//    }
//
//    override fun print2() {
//        TODO("Not yet implemented")
//    }
//}

//interface A {
//    fun print()
//}
//
//interface B {
//    fun print2()
//}
//
//open class FirstDelegate(): A {
//    override fun print() {
//        TODO("Not yet implemented")
//    }
//}
//
//open class SecondDelegate(): B {
//    override fun print2() {
//        TODO("Not yet implemented")
//    }
//}





//class Button(val text: String, val id: Int, val onClicklistener: OnClicklistener)
//class ClickListener() : OnClicklistener {
//    override fun onClick() {
//
//    }
//
//}
//interface OnClicklistener {
//    fun onClick()
//}

//------------------- Interface ---------------------

//interface Engine {
//    fun startEngine()
//}
//
//class Car(val name: String, val color: String): Engine {
//    override fun startEngine() {
//        println("The car is starting the engine.")
//    }
//
//}
//
//class Truck(val name: String, val color: String): Engine {
//    override fun startEngine() {
//        println("The truck is starting the engine.")
//    }
//
//}
//
//class plane(val name: String, val color: String): Engine {
//    override fun startEngine() {
//        println("The plane is starting the engine.")
//    }
//
//}

//----------------------------------------------------


//open class View(){
//    open fun draw() {
//        println("Drawing the view")
//    }
//}
//
//open class Button(val text: String, val orientation: String): View() {
//    override fun draw() {
//        //here is the code for creating the button
//        println("Drawing the button")
//        super.draw()
//    }
//}
//
//class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation) {
//    override fun draw() {
//        println("Drawing the round button")
//        super.draw()
//    }
//}


//abstract class Vehicle {
//    abstract fun move()
//    abstract fun stop()
//}
//
//class Car(val name: String, val color: String, val engines: Int, val doors: Int): Vehicle() {
//    override fun move() {
//        TODO("Not yet implemented")
//    }
//
//    override fun stop() {
//        TODO("Not yet implemented")
//    }
//
//}


//class Account(val accountName: String) {
//    private var balance = 0
//    private var transactions = mutableListOf<Int>()
//
//    fun deposit(amount: Int) {
//        if (amount > 0) {
//            transactions.add(amount)
//            balance += amount
//            println("$amount deposited. Balance is now ${this.balance}")
//        } else {
//            println("Cannot deposit negative sums")
//        }
//    }
//
//    fun withdraw(withdrawal: Int) {
//        if (-withdrawal < 0) {
//            transactions.add(-withdrawal)
//            balance += -withdrawal
//            println("$withdrawal withdrawn. Balance is now ${this.balance}")
//        }else {
//            println("Cannot withdraw negative sums")
//        }
//    }
//
//    fun calculateBalance(): Int {
//        balance = 0
//        for (transaction in transactions) {
//            this.balance += transaction
//        }
//
//        return this.balance
//    }
//}


//class ListView(val items: Array<String>) {
//    inner class ListViewItem() {
//        fun displayItem(position: Int) {
//            println(items[position])
//        }
//    }
//}


//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north", 10),
//    SOUTH("south", 20),
//    EAST("east", 15),
//    WEST("West", 40);
//
//    fun printData() {
//        println("Direction = $direction and Distance = $distance")
//    }
//}


//class Database private constructor() {
//
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//
//            return instance
//        }
//    }
//}


//class User(firstName: String, lastName: String = "LastName", var age: Int = 0) {
//    var firstName = firstName
//        get() = field
//
//        set(value) {
//            field = value
//        }
//}


//class User(var name: String, var lastName: String, var age: Int) {
////    var name: String
//
//    constructor(name: String) : this(name, "lastName", 0) {
//        println("2nd")
//    }
//
//    constructor(name: String, lastName: String) : this(name, lastName, 0) {
//        println("3rd")
//    }

//    init {
//        if (name.lowercase().startsWith("j")) {
//            this.name = name
//        }else{
//            this.name = "User"
//            println("The name doesn't start with the letter 'j' or 'J'")
//        }
//    }
//}