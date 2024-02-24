package fundamentos

//Usando template String:

fun main(args: Array<String>){

    val aprovados = listOf("João", "Maria", "Pedro")

    // "${aprovados[0]} é uma interpolação de string, ou seja, ela permite que variáveis sejam inseridas dentro de strings.
    print("O primeiro colocado foi ${aprovados[0]}")

}