// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.*

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        return true
    } 
    else {
        return false
    }
}
fun triangleArea(triangle: Triangle): Double {
    require(isValidTriangle(triangle)) {
        "Invalid triangle side lengths"
    }
    val (a, b, c) = triangle
    val s = (a + b + c) / 2
    val x = s * (s - a) * (s - b) * (s - c)
    val area = Math.sqrt(x)
    return area
} 
