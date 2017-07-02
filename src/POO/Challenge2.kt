package POO

class Book() {
    var borrow = false
    var title = ""
    var author = ""
    var publication_year = 0

    fun set_boot(name: String, writer: String, year: Int) {
        title = name
        author = writer
        publication_year = year
    }

    fun do_borrow() {
        borrow = true
    }

    fun get_borrow() {
        borrow = false
    }

    fun printmyself() {
        println("Book: $title")
        println("Author: $author")
        println("Year: $publication_year")
        println("Borrowed: $borrow")
    }
}

fun main(args: Array<String>) {
    var bookA = Book()
    var bookB = Book()
    bookA.set_boot("Metamorphosis", "Frank Kafka", 1935)
    bookB.set_boot("The Collector", "Jhon Fowless", 1978)
    bookA.do_borrow()
    bookB.get_borrow()
    bookA.printmyself()
    bookB.printmyself()
}