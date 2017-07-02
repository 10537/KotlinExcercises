package collections

/**
 * Created by jmoreno on 29/05/17.
 */

fun main(args: Array<String>) {

    //Inmutable Array i can changed the values but not redim the array
    val ListA = listOf(1, 2, 3, "Kotlin")
    println(ListA)
    println(ListA.size)
    println(ListA.subList(1, 4))
    println(ListA.isEmpty())
    println(ListA.contains(2))

    var ListC = arrayOf("Jose", "Python", 2, 3, 4.50)
    println(ListC[1])
    ListC[3] = "New"
    println(ListC[3])
    println(ListC.size)
    println(ListC.isEmpty())
    // println(ListC.subList(1, 4)) List don't have this method
    println(ListC.contains(4.50))
    println(ListC[4])


    //Mutable List i can changed values and redim the array
    var ListB = arrayListOf("Jose", "Python", 2, 3, 4.50)
    println(ListB)
    println(ListB.add("New"))
    println(ListB.size)
    println(ListB.subList(3, 5))
    println(ListB.isEmpty())
    println(ListB.contains(4.50))
    ListB.remove("Jose")
    println(ListB)
    var Reversed = ListB.reversed()
    println(Reversed)

    // Comprehension list

    //Reduce
    var Lista = 1..100000
    var sum = Lista.reduce { x, i -> i + x }
    println(sum)

    // map
    Lista = 1..10
    var map = Lista.map { it * 3 }
    println(map)

    //filter
    var filter = Lista.filter { it % 3 == 0 }
    println(filter)

    //SumBy
    var sumby = Lista.sumBy { it % 5 }
    println(sumby)

    //Max and Min
    println(Lista.max())
    println(Lista.min())


}