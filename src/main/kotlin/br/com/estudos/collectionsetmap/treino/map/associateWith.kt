package br.com.estudos.collectionsetmap.treino.map

import br.com.estudos.collectionsetmap.templates.Pedido

fun main() {
    associateWith()
}

fun associateWith() {

    val pedidos = listOf(
        Pedido(1, 20.00),
        Pedido(2, 300.00),
        Pedido(3, 40.00),
        Pedido(4, 70.00),
        Pedido(5, 20.00),
        Pedido(6, 321.00)
    )

    val pedidosComRegraDeNegocio = pedidos.associateWith { pedido: Pedido ->
        pedido.valor > 50.00
    }

    println(pedidosComRegraDeNegocio)
    println(pedidosComRegraDeNegocio[Pedido(1, 20.00)]) //Forma de busca
    println(pedidosComRegraDeNegocio[Pedido(numero = 4, valor = 70.00)]) //Forma de busca


}