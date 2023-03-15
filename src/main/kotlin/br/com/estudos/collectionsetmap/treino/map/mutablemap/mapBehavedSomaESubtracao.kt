package br.com.estudos.collectionsetmap.treino.map.mutablemap

fun mapBehaved4() {

    val pedidos = mutableMapOf(
        0 to 20.00,
        Pair(1, 14.00), //Pair(Par)  -> Pega pares de valores com uma relação
        Pair(2, 64.00), //Pair(Par)  -> Pega pares de valores com uma relação
        3 to 50.0, //outra forma de informar os valores utilizando o to (para) infix
        4 to 100.00,
        5 to 150.00,
        6 to 80.00
        //to é mais utilizado quando não é se trabalhado com muitos valores e não se exige muito performance
    )
    println("Lista original: $pedidos\n")

    //Plus(mais) e minus (menos) operator -> Operadores de soma e subtração, cujo objetivo é
// formar novos conjuntos de elementos através de adição ou subtração, sem alterar a lista original,
// exemplo com pair (plus):

    println("Somando valores a partir da lista original e criando outra(v1)")
    val pair = pedidos + Pair(7, 10.00)
    println("$pair\n")

    //Exemplo com mapOOf:
    println("Somando valores a partir da lista original e criando outra(v2)")
    val mapOf = pedidos + mapOf<Int, Double>(7 to 20.00, 8 to 40.00)
    println("$mapOf\n")

    //minus:
    //Retirando a chave:
    println("Retirando um valor através de um número: ")
    val removendoAChave = pedidos - 6
    println("$removendoAChave\n")

    println("Retirando valores através de uma lista de números: ")
    val removendoAsChavesDaLista = pedidos - listOf<Int>(4, 5, 6)
    println("$removendoAsChavesDaLista\n")
}