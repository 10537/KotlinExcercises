package loops

/**
 * Created by jmoreno on 29/05/17.
 */

fun main(args: Array<String>) {
    var lista = 1..100000
    var downlist = 10 downTo 1

    for (i in downlist) println(i)

    var sum = 0
    for (i in 1..100) sum += i
    print(sum)

    for (x in lista){
        sum += x
    }

    println(sum)

    sum = 0
    var x = 0
    while (sum < 20) {
        sum += x
        x++

        if (sum == 10){
            println("Sum now is $sum!")
        }
    }

    println(sum)
}