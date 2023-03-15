package br.com.estudos.collectionsetmap.treino.map

import br.com.estudos.collectionsetmap.templates.Pedido


fun main() {
    associateBy()
}

fun associateBy() {

    val pedidos = listOf(
        Pedido(1, 200.00),
        Pedido(2, 300.00),
        Pedido(3, 150.00)
    )

    val pedidosAssociadosPorNumero: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }

    println("Pedidos associados por número: $pedidosAssociadosPorNumero\n")

    val pedidosAssociadosPorValor: Map<Double, Pedido> = pedidos.associateBy { pedido ->
        pedido.valor
    }

    println("Pedidos associados por valor: $pedidosAssociadosPorValor")

}