// Task 4.2: use of if and ranges

fun main() {
    println("a) Margherita")
    println("b) Pepperoni")
    println("c) Hawaiian")
    println("d) Vegetarian")
    println("Enter your choice of pizza, a-d: ")

    val choice = readln().lowercase()
    if (choice == "a") {
        println("Order accepted")
    } else if (choice == "b") {
        println("Order accepted")
    } else if (choice == "c") {
        println("Order accepted")
    } else if (choice == "d") {
        println("Order accepted")
    } else {
        println("Invalid choice")
    }
}
