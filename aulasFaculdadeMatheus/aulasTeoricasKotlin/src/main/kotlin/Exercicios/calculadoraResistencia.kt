package Exercicios

// Fazer em Kotlin puro, uma calculadora de resistores
// 4 faixas
// a tolerancia é a última cor
// a do meio é o multipicador

fun main() {

    instructions()

    var colors = cleanResistorString(readln())

    var resistorColors = cleanResistorString(colors).split(",")

    var faixa = "${getFaixas(resistorColors[0])}${getFaixas(resistorColors[1])}".toInt() // gambiarra

    var multiplicador = getMult(resistorColors[2])

    var tolerancia = getTolerancia(resistorColors[3])

//    println(resistencia)
//    println(faixa)
//    println(multiplicador)
//    println(tolerancia)

    result(faixa, multiplicador, tolerancia)
}

fun instructions() {
    println(">>>>>> Calculadora de Resistores <<<<<<")
    println("Informe as 4 cores separadas por virgula")
}

fun cleanResistorString(s: String): String {
    return s.replace(" ", "").lowercase()
}

fun result(faixa: Int, multiplicador: Double?, tolerancia: Double?) {
    var resistencia = faixa * multiplicador!!
    println("Valor do resistor: \n$resistencia Ohms ${tolerancia!! * 10}%")
}

fun getFaixas(cor: String): Int? {
    val colorsResistors = mapOf(
        "preto" to 0,
        "marrom" to 1,
        "vermelho" to 2,
        "laranja" to 3,
        "amarelo" to 4,
        "verde" to 5,
        "azul" to 6,
        "violeta" to 7,
        "cinza" to 8,
        "branco" to 9,
        )

    if (!colorsResistors.containsKey(cor)) {
        println("cor $cor não cadastrada")
        return null
    }
    return colorsResistors.getValue(cor)
}

fun getMult(cor: String): Double? {
    val colorsMult = mapOf(
        "preto" to 1.0,
        "marrom" to 10.0,
        "vermelho" to 100.0,
        "laranja" to 1000.0,
        "amarelo" to 10000.0,
        "verde" to 100000.0,
        "azul" to 1000000.0,
        "violeta" to 10000000.0,
        "cinza" to 100000000.0,
        "dourado" to 0.1,
        "prateado" to 0.01,
        "branco" to 1000000000.0
    )
    if (!colorsMult.containsKey(cor)) {
        println("cor $cor não cadastrada")
        return null
    }
    return colorsMult.getValue(cor)
}

fun getTolerancia(cor: String): Double? {
    val colorsTolerance = mapOf(
        "marrom" to 0.1,
        "vermelho" to 0.2,
        "verde" to 0.25,
        "violeta" to 0.1,
        "cinza" to 0.05,
        "dourado" to 0.5,
        "prateado" to 0.10
    )
    if (!colorsTolerance.containsKey(cor)) {
        println("cor $cor não cadastrada")
        return null
    }
    return colorsTolerance.getValue(cor)
}

