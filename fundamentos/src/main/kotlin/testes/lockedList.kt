package testes

fun main() {
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

    val shapesLocked: List<String> = shapes // Tranformei ela em uma lista imutavel

    val lista: List<Int?> = listOf(1,2,3,null,4)

    println("square" in shapes)

}