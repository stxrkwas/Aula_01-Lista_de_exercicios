package fundamentos

//Usando template String:

fun main(args: Array<String>){

    val bomHumor = true

    //"${if (bomHumor) "feliz" else "chateado"}" é um operador ternário, ele permite realizar uma operação condicional em uma única linha de código.
    println("Hoje estou ${if (bomHumor) "feliz" else "chateado"}")
}