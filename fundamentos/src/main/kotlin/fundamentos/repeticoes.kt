package fundamentos

fun main() {
    // FOR
//    print1a10()
//    print10a1()
//    printPar1a10()
//    printRange(10, 20);

    // WHILE
//    whileMenorQue10()

    // DO WHILE
    doWhileMenorQue10()
}

// FOR
fun print1a10() {
    for (numero in 1 .. 10) {
        println(numero)
    }
}

fun print10a1() {
    for (numero in 10 downTo  1) {
        println(numero)
    }
}

fun printPar1a10() {
    for (numero in 2 .. 10 step 2) {
        println(numero)
    }
}

fun printRange(inicio: Int, fim: Int) {
    for (numero in inicio .. fim) {
        println(numero)
    }
}

// WHILE
fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

// DOWHILE
fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}