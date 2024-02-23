package fundamentos

//Usando template String:

fun main(args: Array<String>){

    val bomHumor = true
    println("Hoje estou ${if (bomHumor) "feliz" else "chateado"}")
}