package fundamentos

// val -> constante  |  var -> variavel
class Carro(var cor: String, var anoFrabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Lucas", 19))
    println(carro.cor)
    println(carro.anoFrabricacao)

//    carro.anoFrabricacao = 1999 // Val cannot be reassigned
    carro.anoFrabricacao = 1999
    println(carro.anoFrabricacao)

    // -------------------------
    println(carro.dono)
//    println(carro.dono.nome)
//    println(carro.dono.idade)
    carro.dono.nome = "Iris"

    println(carro.dono)
}