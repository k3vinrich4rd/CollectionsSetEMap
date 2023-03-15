package br.com.estudos.collectionsetmap.map

import br.com.estudos.collectionsetmap.templates.Pedido

fun mapBehaved9() {

    val pedidos = listOf<Pedido>(
        (Pedido(1, 20.00)),
        (Pedido(2, 60.00)),
        (Pedido(3, 30.00)),
        (Pedido(4, 70.00))
    )
    println("$pedidos\n")

    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }

    /*Com o Grouping podemos usar algumas operações, como é o caso da eachCount(),
     que conta quantos elementos foram agrupados com a nossa lógica:*/
    println(pedidosAgrupados.eachCount())


}