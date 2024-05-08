//class Car(name: String, var model: String, var color: String, var doors: Int) {
//
//    var name = name.trim()
//
//    fun move() = println("The car is moving")
//    fun stop() = println("The car has stopped")
//}


class Calculator() {
    companion object {
        fun sum(n1: Int, n2: Int) = n1 + n2
    }
}

object Database {
    init {
        println("Database created")
    }
}

class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    init {
        println("User: $firstName was created")
    }

}


//----------- SEALED CLASS ------------

fun getData(result: Result) {
    when (result) {
        is Result.Progress -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }
}

sealed class Result(val message: String) {
    fun showMessage() = println("Result: $message")

    class Success(message: String): Result(message)
    class Progress(message: String): Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError(exception: Exception, message: String): Error(message)
        class NonRecoverableError(exception: Exception, message: String): Error(message)
    }

}

//--------------------------------------------

class UserTest(val firstName: String, val lastName: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (other is UserTest) {
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }

        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "User(firstName: \"${this.firstName}\", lastName: \"${this.lastName}\", age: ${this.age})"
    }
}