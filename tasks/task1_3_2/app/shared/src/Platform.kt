package program.testing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
