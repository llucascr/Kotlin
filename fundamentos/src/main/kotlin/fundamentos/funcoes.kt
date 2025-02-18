package fundamentos

// Unit == void
fun main(): Unit {
    println("Hello, World!!")
//    println(retornaNome())
    var nome = retornaNome();

    dizOi(nome, 19)

    // outra opcao
    dizOi(retornaNome(), 19)

    // mudar a ordem dos parametros
    dizOi(idade = 18, nome = "Iris")

    // usando valor padrao
    dizOi("Luiz")
}

fun retornaNome(): String {
    return "Lucas";
}
// (idade: Int = 20) -> siginifica que foi definido um valor padrao
fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome} de idade ${idade}")
}