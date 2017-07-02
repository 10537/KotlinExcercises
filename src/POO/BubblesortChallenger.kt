package POO


fun Bubblesort(List: IntArray): IntArray {
    // Extend IntArray
    fun IntArray.Swap(A: Int, B:Int){
        var tmp = this[A]
        this[A] = this[B]
        this[B] = tmp
    }

    var swap = true
    while (swap){
        swap = false
        for (i in 1..List.size - 1){
            if (List[i-1] > List[i]){
                List.Swap(i-1, i)
                swap = true
            }
        }

    }
    return List
}


fun main(args: Array<String>) {
    var Numbers = intArrayOf(12, 45, 67, 1, 89, 8, 0, 333, 5, 78, 1000, 56)
    Numbers = Bubblesort(Numbers)
    for (i in Numbers) println(i)
}