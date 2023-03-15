package br.com.estudos.collectionsetmap.treino.map

import br.com.estudos.collectionsetmap.templates.Pedido

fun main() {
    groupBy1()
}

fun groupBy1() {

    val pedidos = listOf(
        Pedido(numero = 1, valor = 200.00),
        Pedido(numero = 2, valor = 100.00),
        Pedido(numero = 3, valor = 10.00),
        Pedido(numero = 4, valor = 40.00),
        Pedido(numero = 5, valor = 50.00)
    )

    val pedidosComFreteGratis: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido ->
        pedido.valor >= 50
    }

    println("Pedidos com frete grátis: $pedidosComFreteGratis")
    println("Pedidos com frete grátis: ${pedidosComFreteGratis[true]}") //Forma de busca
    println("Pedidos sem frete grátis: ${pedidosComFreteGratis[false]}") //Forma de busca
}