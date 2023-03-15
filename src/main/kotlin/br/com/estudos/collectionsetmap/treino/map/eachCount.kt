package br.com.estudos.collectionsetmap.treino.map
import br.com.estudos.collectionsetmap.templates.Pedido

fun main() {
    eachCount()
}

fun eachCount(){

    val pedidos = listOf(
        Pedido(1, 200.00),
        Pedido(2, 30.00),
        Pedido(3, 55.00),
        Pedido(4, 70.00)
    )

    val pedidosAgrupados = pedidos.groupingBy { pedido: Pedido ->
        pedido.valor > 50.00
    }
    println(pedidosAgrupados.eachCount())
}