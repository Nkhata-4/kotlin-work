// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(args: Array<String>): String {
    val text = args[0]
    val redactPart = args[1]
    val redactChar = args[2]

    if (redactChar == '') {
        val n = redactPart.length
        val output = text.replace(redactPart, "X".repeat(n))
        return output
    } else {
        val n = redactPart.length
        val output = text.replace(redactPart, redactChar.toString().repeat(n))
        return output
    }

}