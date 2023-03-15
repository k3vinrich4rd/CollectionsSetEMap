package br.com.estudos.collectionsetmap.treino.map

fun main() {
    map3()
}

fun map3() {

    //Fazendo a adição de valores com to (Menos performático)
    val pedidos: Map<Int, Double> = mapOf<Int, Double>(
        1 to 200.00,
        2 to 35.00,
        3 to 100.00
    )

    //Formas de percorrer (forEach):
    //Pegando o número do pedido e valor
    pedidos.forEach { pedido ->
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }

    println()

    for (pedido in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }
}