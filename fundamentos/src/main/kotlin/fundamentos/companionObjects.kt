package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object { // como se fosse um metodo static de outras linguagens
        fun criarComValorPadrao(): MinhaClasse {
            return MinhaClasse("Lucas", "Rua ABC", 32)
        }

        fun builder(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {

    fun criarComValorPadrao(): SegundaClasse {
        return SegundaClasse("Lucas", "Rua ABC", 32)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criarComValorPadrao()

    var minhaClasse = MinhaClasse.criarComValorPadrao() // não é preciso instanciar a classe para utiliar ele

    var minhaClasse2 = MinhaClasse.builder(segundaClasse)
}