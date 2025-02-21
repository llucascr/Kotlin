package Aulas

fun main() {
    var nome: String
    nome = "Mateus"
    nome = "Mateus Dias"
//    println(nome)

    var acesa: Boolean
    acesa = true
    acesa = false

    var saldo: Double = 1000.0
    saldo = 900.0

    // Optional
    var teste: Boolean?
    teste = true
    teste = false
    teste = null

    var valorPix: Double? = null
//    acesa = null // ERRO: NullPointerException


}

fun operacao(op: Int): Boolean? {
    when(op) {
        1 -> return true
        2 -> return false
        else -> return null //
    }
}
