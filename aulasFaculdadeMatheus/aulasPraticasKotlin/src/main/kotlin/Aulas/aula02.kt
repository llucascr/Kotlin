package Aulas

fun f1() {
    // Usar o Structure para navegar entre as funções
    // TODO: comentario para anotar tarefas a fazer
}

fun main() {
    var resistorColors: List<String>;

    showInstructions()

    var colors = getColorsFromUser()

    if (colors != null) {
        resistorColors = getColorsList(cleanResistorString(colors))
        println(resistorColors)
    }
}

fun getColorsFromUser(): String? {
    return readln()
}

fun showInstructions() {
    println(">>>>>> Calculadora de Resistores <<<<<<")
    println("Informe as 4 cores separadas por virgula")
}

fun cleanResistorString(s: String): String {
    return s.replace(" ", "").uppercase()
}

fun getColorsList(cleanedString: String): List<String> {
    return cleanedString.split( ",")
}

