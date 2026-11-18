// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

//typealias Triangle = Triple<Double,Double,Double>

class Triangle (val sideA: Double, val sideB: Double, val sideC: Double) { 
    
    fun isValidTriangle(): Boolean {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            return true
        } 
        else {
            throw IllegalArgumentException("Invalid triangle side lengths")
        }
    }
    init {
        require(isValidTriangle()) {throw IllegalArgumentException("Invalid triangle side lengths")}
    }

    fun perimeter() = sideA + sideB + sideC


    fun semiPerimeter() = (sideA + sideB + sideC) / 2

    fun triangleArea(): Double {
        val s = (sideA + sideB + sideC) / 2
        val x = s * (s - sideA) * (s - sideB) * (s - sideC)
        val area = Math.sqrt(x)
        if (x > 0.0) {
            return area
        }
        else {
            throw IllegalArgumentException("Invalid triangle side lengths")
        }
    } 



    override fun toString(): String {
        return "Triangle(sideA=$sideA, sideB=$sideB, sideC=$sideC)"
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
