package fundamentos

fun main() {
    // tipo mutavel
    var nome = "Lucas"
    // tipo imutavel
    val nomeVal = "lucas"

    nome = "Iris"
//    nomeVal = "Iris" // ERROR: Val cannot be reassigned

    var idade = 24 // Variable is never modified, so it can be declared using 'val'
    println(idade)
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}