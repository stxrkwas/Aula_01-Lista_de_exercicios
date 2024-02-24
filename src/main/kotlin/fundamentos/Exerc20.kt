package fundamentos

//Break com label - matrix

// * Fun fact: é um ótimo jeito de mostrar a tabuada.

fun main(args: Array<String>){

    loop@for (i in 1..15){

        for(j in 1..15){

            if (i == 2 && j == 9) break@loop
            println("$i $j")
        }
    }

    println("Fim!")
}