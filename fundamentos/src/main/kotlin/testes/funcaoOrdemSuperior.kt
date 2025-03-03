package testes

fun operacao(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun soma(a: Int, b: Int) = a + b
fun mult(a: Int, b: Int) = a * b

fun main() {

    println(operacao(1, 2, ::soma))
    println(operacao(1, 2, ::mult))

}