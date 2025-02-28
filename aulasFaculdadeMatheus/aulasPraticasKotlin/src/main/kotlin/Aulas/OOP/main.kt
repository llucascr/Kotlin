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
    var c1 = Cachorro()
    c1.peso = 1.0
    c1.latir()

    var g1 = Gato()
    g1.peso = 0.7
    g1.miar()
}

// Classes são compostas de dados que chamamos de atributos e comportamentos(funções) que chamamos de metodos

// Herança: é quando uma classe herda caracteristicas(dados) e comportamentos de outra

open class Animal {
    var peso: Double = 0.0

}

// Cachorro é subclasse da classe Animal
// Animal é superClasse da classe Cachorro
class Cachorro : Animal() {
    fun latir() {
        println("Au Au...")
    }
}

class Gato : Animal() {
    fun miar() {
        println("Miau...")
    }
}