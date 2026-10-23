// Task 7.7.1: statistics functions
fun median(args: List): Double {
    val sortedlist = args.sorted()
    val size = sortedlist.size
    if (size % 2 == 0) {
        val median = (sortedlist[size / 2 - 1] + sortedlist[size / 2]) / 2.0
    } else {
        val median = sortedlist[size / 2].toDouble()
    }
    return median
}