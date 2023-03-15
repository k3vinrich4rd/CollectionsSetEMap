package br.com.estudos.collectionsetmap.map

//Como instanciar um mao
fun mapOf() {
    val pedidos = mapOf<Int, Double>(
        Pair(1, 20.00), //Pair(Par)  -> Pega, pares de valores com uma relação
        Pair(2, 34.00), //Pair(Par)  -> Pega, pares de valores com uma relação
        3 to 50.0 //outra forma de informar os valores utilizando o to (para) infix
        //to é mais utilizado quando não é se trabalhado com muitos valores e não se exige muito performance
    )
    for (pedido in pedidos) {
        println(pedido)
    }

    println()
    pedidos.forEach { pedido ->
        println(pedido)
    }

    println()
    //No map, se acessa os elementos através da chave
    //para pegar somente um elemento:
    println(pedidos[1])

    println()
    val pedido = pedidos[5]
    pedido?.let {
        println("value pedido: $it")
    }
    println()

    //Para pegar o número do pedido e seu valor através do for e forEach:
    for (p in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")

    }
    println()

    pedidos.forEach { p ->
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }
}