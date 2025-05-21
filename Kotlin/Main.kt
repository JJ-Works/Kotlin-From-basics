package Kotlin

fun main() {
    //Creating variable;
    //Variables are declared in camelCase like this:
    //So from what I understand you don't have to specify the type of the variable it will understand automatically
    /*
    But what you have to consider is that the first value you assign is the type of variable it will infer to
    like for example:

    var cat = "This is a cat"
    this makes the variable String type but if you try to assign any other value then it will not be assigned.
    */
    var firstVariable: String = ">>Printed Variable<<"


    /*We can set null values like this*/
    var nuller: String? = null
    var nuller2: Nothing? = null

    //overwriting the content of the variable

    firstVariable = ">>Second Variable<<"

    //Inorder to make the constant variable we use:

    val permVariable: String = ">>This is a permanent variable<<"
    //And to refer to that variable we use $ sign
    print("Hello Kotlin! $firstVariable and $permVariable\n\n")
    println(firstVariable.length)


    val texter: String? = null
//    println(texter!!.length)
    /*this !!. is the not-null assertion operator, it tells the compiler "I am sure this value is not null.
    *  if the text is actually null, it throws a NullPointerException. so the program will crash as there is null*/
    println(texter?.length)
    /*So ?. returns null if there is null unlike !!. it doesn't crash the program.*/


    /*lets use operators*/

    var a = 254
    var b = 23

    var additionByThis = a + b

    println("\na * b = " + a * b);
    print("a - b = ${a - b}")


    val returnedVal = if (a < 255) {
        "\nreturned VAl for If\n"
    } else {
        "returned Val for else\n"
    }

    val returnedButShort = if (b < 44) "returned for short if is true" else "returned for else for short"
    println(returnedVal)
    println(returnedButShort)

    usingFunction("Giving argument in newly created Functions.")
    var shorter = usingShortwayfunction()
    println(shorter)
    sum(1,2,3,54,6,34,345)
}

// Now this function returns String
fun usingFunction(argument: String): String {
    println(argument)
}

fun usingShortwayfunction() = "\nalsdfjdlasjflasjd"

//If we use varargs it creates array of specified type we can give it as much arguments as you want.
fun sum(vararg numbers: Int) : Int {
    var counter = 0
    for(number in numbers){
        counter += number
    }
    return counter
}