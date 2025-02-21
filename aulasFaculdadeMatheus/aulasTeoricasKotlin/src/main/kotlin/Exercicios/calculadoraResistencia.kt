package Exercicios

// Fazer em Kotlin puro, uma calculadora de resistores
// 4 faixas
// a tolerancia é a última cor
// a do meio é o multipicador

fun main() {

    instructions()
//    var faixa1 = getFaixas("marrom")
    var faixa1 = getFaixas(readln())
//    var faixa2 = getFaixas("preto")
    var faixa2 = getFaixas(readln())

    if (faixa1 == -1 || faixa2 == -1) {
        println("Cor usada somente na tolerancia e no multiplicador")
        return
    }

    var faixa = "$faixa1$faixa2".toInt()

    var multiplicador = getMult("vermelho")

    if (multiplicador == 0.0)  {
        println("Cor não utilizada nessa posição")
        return
    }

    var tolerancia = getTolerancia("dourado")

    if (tolerancia == 0.0) {
        println("Cor não usada para mostrar tolerancia")
        return
    }

//    println(faixa)
//    println(multiplicador)
//    println(tolerancia)

    var minimo = (faixa * multiplicador) - (tolerancia * 100 )
    var maximo = (faixa * multiplicador) + (tolerancia * 100)

    println("Minimo: " + minimo)
    println("Maximo: " + maximo)
}

fun instructions() {
    println(">>>>>> Calculadora de Resistores <<<<<<")
    println("Informe as 4 cores separadas por virgula")
}

fun getFaixas(cor: String): Int {
    var result = -1
    when(cor.lowercase()) {
        "preto" -> result = 0
        "marrom" -> result = 1
        "vermelho" -> result = 2
        "laranja" -> result = 3
        "amarelo" -> result = 4
        "verde" -> result = 5
        "azul" -> result = 6
        "violeta" -> result = 7
        "cinza" -> result = 8
        "branco" -> result = 9
        else -> println("cor invalida")
    }
    return result
}

fun getMult(cor: String): Double {
    var result: Double = 0.0
    when(cor.lowercase()) {
        "preto" -> result = 1.0
        "marrom" -> result = 10.0
        "vermelho" -> result = 100.0
        "laranja" -> result = 1000.0
        "amarelo" -> result = 10000.0
        "verde" -> result = 100000.0
        "azul" -> result = 1000000.0
        "violeta" -> result = 10000000.0
        "cinza" -> result = 100000000.0
        "dourado" -> result = 0.1
        "prateado" -> result = 0.01
        else -> println("cor não registrada")
    }
    return result
}

fun getTolerancia(cor: String): Double {
    var result: Double = 0.0
    when(cor.lowercase()) {
        "marrom" -> result = 0.1
        "vermelho" -> result = 0.2
        "verde" -> result = 0.05
        "azul" -> result = 0.025
        "violeta" -> result = 0.1
        "cinza" -> result = 0.005
        "dourado" -> result = 0.5
        "prateado" -> result = 0.10
        else -> println("cor invalida")
    }
    return result
}

