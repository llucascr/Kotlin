package fundamentos

fun main() {

//    var x = 5
//
//    when(x){
//        1, 2, 3 -> println("Value is 1,2,3")
//        in 4..7 -> println("Value is between 4 and 7")
//        !in 8..10 -> println("Value is not between 8 and 10")
//        else -> println("Value is none of the above")
//    }

//    println(comecaComOi("oi lucas"))

    when { // sempre procura pela opção verdadeira
        comecaComOi(5) -> println("5")
        comecaComOi("oi tudo bem") -> println("oi tudo bem")

    }

}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}