package conditionals

import java.util.*

/**
 * Created by jmoreno on 28/05/17.
 */

fun main(args: Array<String>) {
    val random = Random().nextInt(50)

    when (random) {
        in 1..10 -> println("The number is between 1 to 10: $random")
        in 11..20 -> println("The number is between 11 to 20: $random")
        in 21..30 -> println("The number is between 21 to 30: $random")
        in 31..40 -> println("The number is between 31 to 40: $random")
        else -> println("The number is above 40: $random")
    }
}