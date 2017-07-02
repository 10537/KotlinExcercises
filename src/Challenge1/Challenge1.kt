package Challenge1

/**
 * Created by jmoreno on 4/06/17.
 */

fun main(args: Array<String>) {

    var Books = arrayListOf("The collector", "a happy world", "the tunnel", "candido")
    for (Book in Books) {
        if ('e' in Book){
            for (letter in Book) {
                println(letter)
            }
        }
    }

    var Movies = arrayListOf("The collector", "a happy world", "Z war", "candido")
    for (Movie in Movies) {
        if ('Z' in Movie){
            println("I will break in this Movie: $Movie")
            break
        }
        println(Movie)
    }

    var MoviesB = arrayListOf("The collector", "a happy world", "Z war", "candido")
    for (Movie in MoviesB) {
        if ('Z' in Movie){
            continue
        }
        println(Movie)
    }

    first@ for (x in 1..10){
        for(y in 1..10){
            if ((y % x) == 0) continue@first
            println("{$x - $y}")
        }
    }

    // val sum: (Int, Int) -> Int = { x, y -> x + y }
    val sum = { x: Int, y: Int -> x + y }
    print(sum(12, 45))
}