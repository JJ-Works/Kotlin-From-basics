package Kotlin

fun main(){
    //Creating variable;
    //Variables are declared in camelCase like this:
    //So from what I understand you don't have to specify the type of the variable it will understand automatically
    /*
    But what you have to consider is that the first value you assign is the type of variable it will infer to
    like for example:

    var cat = "This is a cat"
    this makes the variable String type but if you try to assign any other value then it will not be assigned.
    */
    var firstVariable : String = ">>Printed Variable<<"

    //overwriting the content of the variable

    firstVariable = ">>Second Variable<<"

    //Inorder to make the constant variable we use:

    val permVariable : String = ">>This is a permanent variable<<"
    //And to refer to that variable we use $ sign
    print("Hello Kotlin! $firstVariable and $permVariable")


    /*lets use operators*/

    var a = 254
    var b = 23

    var additionByThis = a + b

    println("\na * b = "+ a * b);
    print("a - b = ${a - b}")

}