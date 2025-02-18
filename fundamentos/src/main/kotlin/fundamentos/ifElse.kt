package fundamentos

fun main() {
    parOuImpar(2)
    parOuImpar(3)

    // ------------------------

    resultadoNota(7.2)
    resultadoNota(5.0)
    resultadoNota(2.0)

    // ------------------------

    println(parOuImpar(2))
}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
//        println("PAR")
        "PAR"
    } else {
//        println("IMPAR")
        "IMPAR"
    }
}

// se a nota > 6 -> APROVADO
// se a nota > 4 -> RECUPERACAO
// se a nota < 4 -> REPROVOU
fun resultadoNota(nota: Double) {
    if (nota >= 6) {
        println("APROVADO")
    } else if (nota >= 4 ) {
        println("RECUPERACAO")
    } else {
        println("REPROVADO")
    }
}
