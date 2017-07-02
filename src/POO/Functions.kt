package POO

import java.util.*

//fun NameOfFunction(Parameter: Type, Parameter: Type ...): Return Type {
//    Body
//}

fun Bubblesort(List: IntArray): IntArray {
    var swap = true
    while (swap){
        swap = false
        for (i in 1..List.size - 1){
            if (List[i-1] > List[i]){
                var tmp = List[i-1]
                List[i-1] = List[i]
                List[i] = tmp
                swap = true
            }
        }

    }
    return List
}

fun PrintHello() {
    println("Hello Guys!!")
}

var PrintGreat =  { println("Great!!") }

fun Double(Num: Int): Int = Num * 2 //Declaring the return value

fun Triple(Num: Int) = Num * 3 //return value is optional

fun Max(A: Int, B: Int): Int {
    return if (A > B) A else B
}

fun MaxAndString(A: Int, B: Int): Pair<Int, String> {
    var tmp = if (A > B) A else B
    return Pair(tmp, "This is the max value:")
}

fun SumDateString(A: Int, B: Int): Triple<Int, Date, String>{
    return kotlin.Triple(A + B, Date(), "Great")
}

var LambdaMax = {A: Int, B: Int -> if (A > B) A else B}

fun main(args: Array<String>) {
    PrintHello()
    PrintGreat()
    println(Max(99,68))
    println(LambdaMax(99,300))
    var (value, string) = MaxAndString(15,45)
    println(string)
    println(value)
    var (X, Y, Z) = SumDateString(12, 12)
    println(Z)
    println(X)
    println(Y)
    var Numbers = intArrayOf(12, 45, 67, 1, 89, 8, 0, 333, 5, 78, 1000, 56)
    Numbers = Bubblesort(Numbers)
    for (i in Numbers) println(i)
}