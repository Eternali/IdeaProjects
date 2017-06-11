/**
 * Created by Conrad
 */

package KotlinStarter

import java.util.Random

fun main (args: Array<String>) {

    var power: (Int, Int) -> Int = { x, y -> Math.pow(x.toDouble(), y.toDouble()).toInt() }

    var nullVal: String? = null
    fun returnNull (): String? {
        return null
    }

    var nullVal2 = returnNull()

    if (nullVal2 != null) println(nullVal2.length)

    var nullVal4 = nullVal2!!.length

    // if you try to assign nullVal5 a value of null, instead assign it "No name"
    // called the "Elvis" operator
    var nullVal5: String = returnNull() ?: "No name"


    val buddy = Dog("Buddy", 20.0, 14.9, "conrad")
    buddy.getInfo()

    val tweety = Bird("Tweety", true)
    tweety.fly(10.0)

}

open class Animal (val name: String, var height: Double, var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {"Animal name can't contain numbers."}
        require(height > 0) {"Height must be >0."}
        require(weight > 0) {"Weight must be >0."}
    }

    open fun getInfo () : Unit {
        println("$name is $height tall and weighs $weight.")
    }
}

class Dog (name: String, height: Double, weight: Double, var owner: String) : Animal(name, height, weight) {
    override fun getInfo() {
        println("$name is $height tall and weighs $weight and is owned by $owner.")
    }
}

interface Flyable {
    var flies: Boolean
    fun fly (distMile: Double) : Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable {
    override fun fly(distMile: Double) {
        if (flies) {
            println("$name flies $distMile miles")
        }
    }
}




/*
var map = mutableMapOf<Int, Any?>()
var map2 = mutableMapOf(1 to "conrad", 2 to 26)
map[1] = "conrad"
map[2] = 26

println(map.size)
map.put(3, "Ottawa")
map.remove(2)
for ((x, y) in map) {
    println("Key $x, Value $y")

}

fun main (args: Array<String>) {
    var list : MutableList<Int> = mutableListOf(1,2,4,5)
    val list2 : List<Int> = listOf(1,2,4)
    list.add(6)
    println("FIRST : ${list.first()}")
    println("LAST : ${list.last()}")
    println("SECOND : ${list[1]}")


fun main (args: Array<String>) {
    val list = 1..20
    val listSum = list.reduce { x, y -> x + y }
    println("Sum of list : $listSum")
    val listSum2 = list.fold(5) { x, y -> x + y }
    println("Fold of list : $listSum2")

    println("Evens in list : ${list.any { it % 2 == 0 }}")
    println("Evens in list : ${list.all { it % 2 == 0 }}")

    val times7 = list.map { it * 7 }
    times7.forEach { n -> println(n) }
    times7.forEach { it -> println(it) }


fun main (args: Array<String>) {

    val numList = 2..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    val mult3 = makeMathFun(3)
    println(mult3(5))

    val mult2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, mult2)

}

fun makeMathFun (num: Int) : (Int) -> Int = {num2 -> num * num2}
fun mathOnList (numList: Array<Int>, myFunc : (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}



fun main (args: Array<String>) {

    println("Sum ${getSum(1,2,3,4,5)}")

    val multiply = {num1: Int, num2: Int -> num1 * num2}


}

fun fact (x: Int) : Int {
    tailrec fun factTail (y: Int, z: Int) : Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x, 1)
}

fun getSum (vararg nums: Int) : Int {
    var sum = 0

    nums.forEach { n -> sum += n }
    return sum
}

    fun add(num1: Int, num2: Int): Int = num1 + num2
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("4 - 5 : ${subtract(num2 = 5, num1 = 4)}")
    fun sayHello(name: String): Unit = println("Hello $name")

    val (two, three) = nextTwo(1)
    println("1 $two $three")
}

fun nextTwo (num: Int) : Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}


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

} */
