import kotlin.math.*


fun median(args: List): Double {
    val sortedlist = args.sorted()
    val quant = sortedlist.size
    val z = quant / 2

    if (quant == 0) {
        throw IllegalArgumentException("List cannot be empty")
    } else if (quant % 2 == 0) {
        val x = sortedlist[z] + sortedlist[z - 1]
        val y = x / 2
        val ans = y.toDouble()
        return ans
    } 
    else {
        val x = sortedlist[z.ceil()]
        val ans = x
        return ans
    }
}