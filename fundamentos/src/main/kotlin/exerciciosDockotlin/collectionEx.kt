package exerciciosDockotlin

fun main() {
    supportedByServer()
}

fun supportedByServer() {
    val SUPPORTED: Set<String> = setOf("HTTP", "HTTPS", "FTP")
    val requested = "stmp"
//    val requested = "http"
//    val isSupported = SUPPORTED.contains(requested)
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}