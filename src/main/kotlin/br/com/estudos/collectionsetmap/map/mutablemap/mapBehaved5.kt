package br.com.estudos.collectionsetmap.map.mutablemap

fun mapBehaved5() {

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

    //Não tem restrição de referência
    //Se colocarmos a mesma chave com valores diferentes, ele sobrescreve
    //Muda os valores da lista original (Sobrescreve)
    val mutableListOf = mutableListOf<Pair<Int, Double>>(
        7 to 20.00,
        8 to 36.00
    )
    pedidos.putAll(mutableListOf)
    println(pedidos)

    //Outra forma de fazer a mesma coisa:
    val listOf = listOf<Pair<Int, Double>>(
        9 to 100.00,
        10 to 110.00
    )
    pedidos += (listOf)
    println(pedidos)

    //Outra forma de fazer a mesma coisa:
    pedidos += listOf(
        11 to 300.00,
        12 to 500.00
    )
    println(pedidos)


}