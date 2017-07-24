package RPG

open class CharacterA (open var name: String) {
    var healh = 100

    open fun Walk(){
        println("Walking...")
    }

    open fun Run(){
        println("Running...")
    }

    open fun Talk(){
        println("Hello, I'm $name")
    }

    open fun Eat(){
        println("I've eaten a fruit")
    }

    open fun Learn(theme: String) {
        println("I've learned $theme")
    }
}

class Human(name: String, val color: String, val height: Double, var age: Int): CharacterA(name) {
    var head_armor = false
    var body_armor = false
    var boots_armor = false
    var weapon = false

    override fun Walk(){
        println("Walking...")
    }

    override fun Run(){
        super<CharacterA>.Run()
        println("Running in beast mode...")
    }

    override fun Talk(){
        println("Hello, I'm $name")
    }

    override fun Eat(){
        println("I've eaten a fruit")
    }

    override fun Learn(theme: String) {
        println("I've learned $theme")
    }

    fun set_head_armor(){
        head_armor = true
    }

    fun set_body_armor(){
        body_armor = true
    }

    fun set_boots_armor(){
        boots_armor = true
    }

    fun set_weapon(){
        weapon = true
    }

}

fun main(args: Array<String>) {
    val Player = Human("Iskender","Black",1.70, 30)
    Player.Walk()
    Player.Talk()
    Player.Run()
    Player.Eat()
    Player.Learn("Meteor Punch Combo")
}
