package Aulas.OOP

fun main() {

    var b = Bola()
    b.peso = 0.410
    b.posicaoAtualX = 700
    b.posicaoAtualY = 500


    var j1 = Jogador()
    j1.peso = 75.0
    j1.nome = "Neymar"
    j1.idade = 32
    j1.posicaoAtualX = 700
    j1.posicaoAtualY = 500

    j1.chutar(b, 1, "NORTE")
}

class Bola {
    var peso: Double = 0.0
    var parada: Boolean = true
    var posicaoAtualX: Int = 0
    var posicaoAtualY: Int = 0

    fun deslocar(posicaoDestinoX: Int,
                 posicaoDestinoY: Int,
                 velocidade: Double,
                 aceleracao: Double) {
        println("Bola se deslocu, " +
                "para:($posicaoDestinoX, $posicaoDestinoY)" +
                "velocidade: $velocidade e aceleração: $aceleracao")
    }
}

class Jogador {
    var peso: Double = 0.0
    var nome: String = ""
    var idade: Int = 0
    var posicaoAtualX: Int = 0
    var posicaoAtualY: Int = 0
    var parado: Boolean = false

    fun chutar(b: Bola, forca: Int, direcao: String) {
        val jogadorNabola: Boolean = this.posicaoAtualX == b.posicaoAtualX && this.posicaoAtualY == b.posicaoAtualY
        if (jogadorNabola) {
            b.deslocar(500, 500, 0.5, 0.2)
            println("Chute realizado")
        } else {
            print("Chute falhou")
        }
    }
}