// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String, redactPart: String, redactChar: Char = 'X'): String {
    
    if (redactChar == 'X') {
        val n = redactPart.length
        val output = text.replace(redactPart, "X".repeat(n))
        return output
    } else {
        val n = redactPart.length
        val output = text.replace(redactPart, redactChar.toString().repeat(n))
        return output
    }

}