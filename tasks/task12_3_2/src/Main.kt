// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val bday = LocalDate(2007, 1, 8)
    val pers = Person("", bday)
    println(pers)
}