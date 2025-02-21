package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    var result = when(numero) {
        1 -> "Um"
        2 -> "dois"
        else -> "Numero nao mapeado"
    }
// na verdade na aula ele so quis mostrar multiplos retornos com return
    return result
}

fun main() {
    println(retornaNumeroPorExtenso(5))
}