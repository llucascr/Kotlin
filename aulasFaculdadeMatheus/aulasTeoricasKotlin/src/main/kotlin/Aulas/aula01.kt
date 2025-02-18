package Aulas

// Aula do dia 17/02
// Conteudo: Optional, Collections(List), função one-line, when()

fun main() {
//    optional()

//    collectionList()

//    println(calCircunferencia(3.14, 4.5))

    caseWhen()
}

// OPTIONAL ---------------------------------------------
fun optional() {
    var teste: String = "Precisa ser inicializada com algum conteudo do tipo String"
//    teste = null // ERRO: esse tipo é não null então ele não aceita null
    println(teste)

    // ? = optional (faz a variavel aceitar null)
    var teste2: String? = null // Inicalizada com null porem podendo atribuir valor a variavel depois
    println(teste2)
    teste2 = "Lucas"
    println(teste2)
}

// COLLECTIONS(LIST) ---------------------------------------------
fun collectionList() {
    // listOf() -> lista imutavel (não é possivel adicional mais itens)
    val fruits = listOf("orange", "banana", "pineapple")
        // pyhton: List polimorfica (aceita todos os tipos)
        // Kotlin: List não é polimorfica só se form do tipo Any
    println(fruits)

    val colors: List<String> = listOf("black", "white", "red") // inferindo o tipo List<String> com Generics
    println(colors)

    println("-------------------------------------")
    // List Mutaveis
    val p = mutableListOf("Carlos", "Renata")
    println(p)
    p.add("Lucas")
    println(p)
    p.remove("Carlos")
    println(p)

    // quero atribuir colors em p, ou seja, fazer uma copia de colors em p
    // p = colors -> isso só é possivel se as duas listas forem do mesmo tipo
    // p = mutableListOf() e colors = mutableListOf()
    // p = listOf() e colors = listOf()
}

// funcao one-line ---------------------------------------------
fun calCircunferencia(pi: Double, raio: Double) = 2 * pi * raio

fun caseWhen() {
    var n: Any = 10
    n = "aula"
    when(n) {
        1 -> println("oi")
        2 -> println("tchau")
        "aula" -> println("case do tipo String")
        else -> println("não atribuido")
    }
}