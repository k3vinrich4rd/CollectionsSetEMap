package br.com.estudos.collectionsetmap.map.mutablemap

fun mapBehaved3() {

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

    //Para filtrar um pedido pela chave e valor com condições:
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70
    }
    println("$pedidosFiltrados\n")


    val pedidosFiltradosPorValores = pedidos.filterValues { valor ->
        valor >= 70.00
    }
    println("$pedidosFiltradosPorValores\n")


    val pedidosFiltradosPorChave = pedidos.filterKeys { key ->
        key % 2 != 0
    }
    println(pedidosFiltradosPorChave)
}