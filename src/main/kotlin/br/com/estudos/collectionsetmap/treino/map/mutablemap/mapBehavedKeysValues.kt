package br.com.estudos.collectionsetmap.treino.map.mutablemap

fun mapBehaved2() {

    val pedidos = mutableMapOf(
        0 to 20.00,
        Pair(2, 20.00), //Pair(Par)  -> Pega pares de valores com uma relação
        Pair(2, 34.00), //Pair(Par)  -> Pega pares de valores com uma relação
        3 to 50.0, //outra forma de informar os valores utilizando o to (para) infix
        4 to null
        //to é mais utilizado quando não é se trabalhado com muitos valores e não se exige muito performance
    )

    //Para pegar todas as chaves da lista:
    val keysPedidos = pedidos.keys
    println(keysPedidos)

    //Navegando:
    for (numerosDePedidos in keysPedidos) {
        println(numerosDePedidos)
    }

    val valueListPedidos = pedidos.values
    println(valueListPedidos)

    valueListPedidos.forEach { valorDePedido ->
        println(valorDePedido)
    }

}