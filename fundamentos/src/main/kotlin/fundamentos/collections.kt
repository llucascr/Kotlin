package fundamentos

fun main() {
//    listaImutavel()

//    listaMutavel()

//    collectionSet()

    collectionMap()
}

fun listaImutavel() {
    var lista  = listOf (1,2,3,4,5,6)

    var pares = lista.filter { it % 2 == 0 }
    println(pares)

    var primeiropar = lista.filter { it % 2 == 0 }.first()
    println(primeiropar)

    var forEach = lista.forEach {
        println(it)
    }

    for (num in lista) {
        print("$num ")
    }

    println()
    println(lista[0])
    println(lista.get(0))

    println(lista.size)

    println(lista.indexOf(6))
}

fun listaMutavel() {
    var lista = mutableListOf(1,2,4,6,3,20,15)

    println(lista)

    lista.add(8)

    lista.removeAt(0) // remove o index 0
    lista.remove(3) // remove o elemento em si

    lista[0] = 20

    println(lista)

    lista.sort()
    println(lista)

    lista.shuffle()
    println(lista)

    var listaNomes = mutableListOf("Lucas", "Iris", "Pedro", "Thiago")
    println(listaNomes)
}

fun collectionSet() {
    var setNumeros = setOf(1,2,3,2) // o set é uma List mas não permite numeros duplicados

    println(setNumeros)

    var setNumerosMutable = mutableSetOf(1,2,3,2)
    setNumerosMutable.add(10)
    println(setNumerosMutable)

    println(setNumeros.contains(2))
}

fun collectionMap() {

    // Chave : valor
    var mapNomeIdade = mapOf("Lucas" to 19, "Iris" to 18, "Pedro" to 21)
    println(mapNomeIdade)

    var mutableMapNomeIdade = mutableMapOf("Lucas" to 19, "Iris" to 18, "Pedro" to 21)
    mutableMapNomeIdade.put("Thiago", 32)
    mutableMapNomeIdade["Patricia"] = 49
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.remove("Pedro")

    println(mutableMapNomeIdade)


}