/**
 * Created by Conrad
 */

package KotlinStarter

import java.util.Random

fun main (args: Array<String>) {

    fun add (num1: Int, num2: Int) : Int = num1 + num2
    fun subtract (num1: Int = 1, num2: Int = 1) = num1 - num2
    println("4 - 5 : ")

    /*
    val rand = Random()
    val magicNum = rand.nextInt(50) + 1
    var guess = 0
    while (magicNum != guess) {
        guess++
    }
    println(guess)
    for (x in 1..10) {
        if (x % 2 == 0) continue
        println("Odd : $x")
        if (x == 15) break
    }
    var arr = Array<Int> = arrayOf(3,6,9)
    for (i in arr.indices) {
        println("MULT 3 ${arr[i]}")
    }
    for ((index, value) in arr.withIndex()) {
        println("Index $index Value: $value")
    }

    val age = 8
    when (age) {
        0,1,2,3,4 -> println("Go to preschool")
        5 -> println("Go to kindergarden")
        in 6..16 -> {
            val grade = age - 5
            println("Go to grade $grade")
        }
        else -> println("Go to college")
    }

    //ranges
    val oneToTen = 1..10
    val alpha = "A".."Z"
    println("R in alpha : ${"R" in alpha}")
    val tenToOne = 10.downTo(1)
    val twoToTwenty = 2.rangeTo(20)
    val rng2 = oneToTen.step(2)
    for (x in rng2) println(x)
    for (x in tenToOne.reversed()) println(x)

    var array = arrayOf(1, 1.2, "conrad")
    println(array[1])
    println(array.size)
    var partArray = array.copyOfRange(0, 1)

    var squareArray = Array(5, {x -> x * x})
    var intArray: Array<Int> = arrayOf(1,2,4)

    val name = "Conrad"
    var longStr = """This is a long string"""

    println(longStr.length)
    println(longStr.equals(name))
    println("A".compareTo("B"))
    println(longStr[2])
    println(longStr.subSequence(2, 8))  // include 2nd index, doesn't include 8th index
    println(longStr.contains("this"))

    // type casting
    println("3.1415 to Int : ${3.1415.toInt()}")
    println("A to Int : ${'A'.toInt()}")

    var letterChar : Char = 'A'
    println("A is char : ${letterChar is Char}")

    if (true is Boolean) {
        print("true is boolean\n")
    }

    println("Hello world")

    val name = "conrad"
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest int : " + bigInt)
    println("Smallest int : $smallInt")
    */
}
