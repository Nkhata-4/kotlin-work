// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

class Triangle (val a: Double, val b: Double, val c: Double) {

    fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        return true
    } 
    else {
        return false
    }
    }
    fun perimeter(): Double {
        return a + b + c
    }

    fun semiPerimeter(): Double {
        return perimeter() / 2
    }

    fun triangleArea(triangle: Triangle): Double {
    val (a, b, c) = triangle
    val s = (a + b + c) / 2
    val x = s * (s - a) * (s - b) * (s - c)
    val area = Math.sqrt(x)
    if (x > 0.0) {
        return area
    }
    else {
        throw IllegalArgumentException("Invalid triangle side lengths")
    }
    } 



    override fun toString(): String {
        return "Triangle(sideA=$a, sideB=$b, sideC=$c, perimeter=$perimeter(), semiPerimeter=$semiPerimeter(), area=$area())"
    }
}

/*mermaid
classDiagram
  class Triangle {
    sideA : Double
    sideB : Double
    sideC : Double
    perimeter : Double [computed]
    semiPerimeter : Double [computed]
    area : Double [computed]
    toString() String
  }
*/
