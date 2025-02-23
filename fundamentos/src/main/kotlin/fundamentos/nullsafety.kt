package fundamentos

fun main() {

    var nome = "Lucas"
//    nome = null // ERRO: pois nome é uma variavel non-null

    var nomeInferenciaNulo = null

    var nomeNull: String? = null

    println(nome.length)
//    println(nomeNull)
    println(nomeNull?.length) // Não podemos fazer isso, pois esse valor pode ser null

//    nomeNull? -> if (nomeNull != null) {
//                     println(nomeNull)
//                  }

//    !! -> certeza que essa variavel não vai ser null então não precisa verificar
//    var toShort: Short = nomeNull!!.length.toShort()

    elvisOperator()

}

fun elvisOperator() {
    // ?:
//    var nome: String? = null // 0
    var nome: String? = "Lucas" // 5
    var tamanhoNome: Int = nome?.length?:0
    println("Tamanho: $tamanhoNome")
}

fun listaNull() {
    var lista: List<Int?> = listOf(1, 2, null, 4) // os intens da lista podem ser null
    var listaNullable: List<Int>? = null // lista null

}