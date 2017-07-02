/**
 * Created by jmoreno on 28/05/17.
 */

fun main(args: Array<String>) {
    var string: String = "Hola Janoj"
    val age: Int = 23

    println(string)
    println(age)

    var VarBool: Boolean = true
    println(VarBool)

    var VarByte: Byte = 0b10101
    println(VarByte)

    var VarLong: Long = 123456487984654
    println(VarLong)

    var VarDouble: Double = 123.5e10
    println(VarDouble)

    var VarShort: Short = 12333
    println(VarShort)

    var VarInt: Int = 15
    println(VarInt)

    var VarFloat: Float = 3.14159F
    println(VarFloat)

    var VarString: String = "Hello Kotlin"
    println(VarString)

    val CardNumber = 5789_1256_0987_3456
    println(CardNumber)

    var NullVariable: String? = null
    println(NullVariable)

    NullVariable = "Kotlin is magic"
    println(NullVariable)

    //But you can use NullVariable.length because for Kotlin you need do a security call
    //to avoid a null exception you need call in the for way.
    println(NullVariable?.length)

}