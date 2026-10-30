// Task 12.4.1: Circle class
import kotlin.math.PI
class Circle(var centre: Point, var radius: Double) {
    init {
        require(radius > 0.0) { "Radius must be greater than 0.0" }
    }
}