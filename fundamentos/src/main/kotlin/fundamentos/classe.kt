package fundamentos

// contrutor()
class Pessoa(var nome: String,  var idade: Int) {


    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}";
    }
}

fun main() {
    var lucas = Pessoa("Lucas", 19);
    println(lucas)
}