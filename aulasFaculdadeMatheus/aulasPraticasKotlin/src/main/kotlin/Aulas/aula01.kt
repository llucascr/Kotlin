package Aulas

/*fun main() {
	// val é VALUE (signifuca constante >>> imutavel)
    val pi = 3.14
    var r = 10

    // no Kotlin temos funcoes built-in
    println(pi)
    println(r)

    //


}*/

/*n main() {
    // VAR = Variavel
    // por INFERENCIA DE TIPO o Kotlin defini n sendo do tipo Int

    var n: Int = 100
    n = 150
    println(n)

}*/

/*
fun main() {
    // no Kotlin temos um tipo de dados chamado Any (qualquer coisa)
    // logo, se declararmos uma variavel do tipo Any, significa, que ela não só pode alterar o seu valor, como o tipo de dado que ela carrega

    var x: Any = "Lucas"
    println(x)
    x = true
    println(x)
    x = 44.32
    println(x)

    // Any é como se fosse o tipo Object do java
}*/

/*
fun main() {
    val pi = 3.1415
    val raio = 10
    (2 * pi * raio) // comprimento da circunferencia
    println(comp)
}*/

fun main() {
    val pi = 3.1415
    val raio = 10
    println((2 * pi * raio))
}

//fun ehPar(n:Int): Boolean {
//    if (n % 2 == 0) {
//        return true
//    }
//    return false
//}

fun ehPar(n:Int): Boolean {
    return(n % 2 == 0)
}