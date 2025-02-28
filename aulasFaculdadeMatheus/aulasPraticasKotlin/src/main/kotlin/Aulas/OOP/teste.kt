package Aulas.OOP

import java.util.Date

/*
    Fundamentos de orientação a objetos

    CLASSE: É a especificação de um objeto
    FORMA = MOLDE = ESPECIFICAÇÃO DO QUE AQUELE OBJETO É E FAZ
    INSTANCIA: É a realização de um objeto (objeto com vida)

    C é uma linguagem ESTRUTURADA
    Isso significa que quando resolvemos os problemas usando C,
    criamos programas estruturados que usam funções e bibliotecas DE funções

    Kotlin, java, C++ são linguagens orientadas a objetos.
    Isso significa que a abordagem de construção de software é
    baseada em dividir os problemas em objetos e responsabilidades
    com foco no REAPROVETAMENTO posterior dessas classes ou COMPONENTES.
 */

fun main() {
    var pessoa = Pessoa("Lucas", "lucas.com", "12/09/2005")

    pessoa.calculaIdade()
    println(pessoa.nome)
}

class Pessoa(
    var nome: String,
    var email: String,
    var nascimento: String
    ) {

    fun calculaIdade() {
        var dataLimpa = nascimento.replace("/", " ").split(" ")
        var data = Date()

        var idade = dataLimpa[2].toInt()
    }
}