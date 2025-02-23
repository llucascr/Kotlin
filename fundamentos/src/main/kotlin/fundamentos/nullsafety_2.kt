package fundamentos

fun main() {
//    var pessoa: Pessoa? = Pessoa("Lucas", 19)
    var pessoa: Pessoa? = null

//    println(pessoa.nome) // essa variavel pode ser null então precisa usar o Only safe (?.) or non-null asserted (!!.)
//    println(pessoa!!.nome) // se for null vai extourar um NullPointerException

    println(pessoa?.nome)
}