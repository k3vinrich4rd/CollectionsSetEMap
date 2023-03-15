package br.com.estudos.collectionsetmap.treino.map

import br.com.estudos.collectionsetmap.templates.Pedido

fun main() {
    associate()
}

fun ass() {

    val pedidos = listOf(
        Pedido(1, 200.00),
        Pedido(2, 300.00),
        Pedido(3, 10.00)
    )

    val pedidosAssociadosPorNumero = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
    }

    println("Pedidos associados por número: $pedidosAssociadosPorNumero\n")

    val pedidosAssociadosPorValores = pedidos.associate { pedido: Pedido ->
        pedido.valor to pedido
    }

    println("Pedidos associados por valor: $pedidosAssociadosPorValores\n")
}