fun median(args: List): Double {
    val sortedlist = args.sorted()
    val size = sortedlist.size()

    if (size == 0) {
        throw IllegalArgumentException("List cannot be empty")
    } else if (size % 2 == 0) {
        val median = (sortedlist[size / 2 - 1] + sortedlist[size / 2]) / 2.0
    } else {
        val median = sortedlist[size / 2].toDouble()
    }
    return median
}