package fundamentos

fun main(args: Array<String>){

    //Tipos numéricos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647

    //Variável do tipo long; o valor máximo dessa variável foi atribuido a ela;
    val num4: Long = 9_223_372_036_854_775_807

    //Tipos numéricos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo caractere
    val char: Char = '?' //Outros exemplos... '1', 'g', ''

    //Tipo boolean
    val boolean: Boolean = true //ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int)
    println(2147483648 is Long)
    println(1.0 is Double)

    //A função "dec()" decrementa o valor de um número em uma unidade, ou seja, a função "println()" imprimirá o valor 9
    println(10.dec())

}