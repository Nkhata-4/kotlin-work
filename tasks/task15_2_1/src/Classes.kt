// Task 15.2.1: syntax for subclasses
open class Person(val name: String)

class Student(name: String, val degree: String) : Person(name)