package com.example.activitylifecycle_aula14_03

abstract class Animal {
    var peso: Double? = null
    abstract fun caminhar()
//    abstract fun surgir() {} // metodo abstrato nao pode ter corpo
    open fun surgir() {
        println("aaaaaaaaaaaaaa")
    }
}

interface Animal2 {
    fun surgir() {

    }
}

class Cachorro : Animal() {
    fun latir() {
        println("Au Au...")
    }

    override fun caminhar() {
        println("Cachorro caminhando...")
    }

    override fun surgir() {
        super.surgir()
        println("bbbbbbbbbbbbbb")
    }
}

class Gato : Animal() {
    fun miar() {
        println("Miau ... Miau ...")
    }

    override fun caminhar() {
        println("Gato caminhando...")
    }
}

fun main() {
//    val a = Animal() // não pode instanciar uma class abstrata
//    a.peso = 3.0

    val c = Cachorro()
    c.peso = 4.0
    c.latir()
    c.caminhar()

    val g = Gato()
    g.peso = 2.0
    g.miar()
    c.caminhar()
}