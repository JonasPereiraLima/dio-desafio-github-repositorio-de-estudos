package main

fun main() {
    //---- Lambda function ----

//    val myLambda = { a: Int -> println(a) }
//    main.add(5, 10, myLambda)
//    add(5, 10) {a: Int -> println(a) }

//    val loginButton = Button("Login", 34345) {}
//    val singUpButton = Button("Sing Up", 2345) {}

//    upperCase("hello") { it.uppercase() }

    //-------------------------

    //---- Scope function ----

//    val user = User().apply {
//        firstName = "Jonas"
//        lastName = "Pereira"
//        age = 22
//    }
//
//    with(user) {
//        println(firstName)
//        println(lastName)
//        println(age)
//    }

//    val result = with(user) {
//        firstName = "Jonas"
//        lastName = "Lima"
//        age = 22
//        this
//    }


//    val user = User("Jonas", "Pereira", 22).also {
//        println(it)
//    }

//    val text: String? = null
//
//    val result = text?.let {
//        println(it)
//        "text"
//    }

    val user: User? = null

    val result = user?.run {
        println(firstName)
        println(lastName)
        println(age)
        "text"
    }

    //------------------------

}

//---- Scope function ----

data class User(val firstName: String, val lastName: String, val age: Int)

//------------------------

//---- Lambda function ----

//fun upperCase(str: String, myFunction: (String) -> String) {
//    val upperCasedWord = myFunction(str)
//    println(upperCasedWord)
//}

//class Button(val text: String, val id: Int, val onClickListener: () -> Unit)
//
//interface OnClickListener{
//    fun onClick()
//}

//fun add(a: Int, b: Int, action: (Int) -> Unit) {
//    action(a + b)
//}

//-------------------------