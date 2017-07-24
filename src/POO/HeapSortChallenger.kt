package POO

fun HeapSort(List: ArrayList<Int>): ArrayList<Int>{
    // Extend IntArray
    fun ArrayList<Int>.Swap(A: Int, B:Int){
        var tmp = this[A]
        this[A] = this[B]
        this[B] = tmp
    }

    fun heapify(List: ArrayList<Int>, Lenght: Int, Index: Int){
        var largest = Index
        var left = 2 * Index + 1
        var right = 2 * Index + 2

        if (left < Lenght && List[Index] < List[left]){
            largest = left
        }

        if (right < Lenght && List[Index] < List[right]){
            largest = right
        }

        if (largest != Index){
            List.Swap(Index, largest)
            heapify(List, Lenght, Index)
        }
    }

    fun heapSort(List: ArrayList<Int>){
        var lenght = List.size

        for (i in lenght downTo 0){
            heapify(List, lenght, i)
        }

        for (i in lenght-1 downTo 0){
            List.Swap(0, i)
            heapify(List, lenght, i)
        }
    }

    heapSort(List)
    return List
}

fun main(args: Array<String>) {
    var Numbers = arrayListOf(9,30,60,10,20,80,1)
    for (i in HeapSort(Numbers)) print("$i ")
}