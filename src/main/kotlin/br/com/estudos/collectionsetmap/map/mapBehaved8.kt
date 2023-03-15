package br.com.estudos.collectionsetmap.map

import br.com.estudos.collectionsetmap.templates.Pedido

fun mapBehaved8() {

    val pedidos = listOf<Pedido>(
        (Pedido(1, 20.00)),
        (Pedido(2, 60.00)),
        (Pedido(3, 30.00)),
        (Pedido(4, 70.00))
    )
    println("$pedidos\n")

    //Utilizando groupBy (agrupando por) -> Consegue pegar uma chave e dada essa chave
    //Ele agrupa os elementos de uma lista, e nos da possibilidade de fazer uma busca filtrada
    //Ao imprimir esses elementos agrupados
    println("Pedidos com frete grátis")
    val agrupamentoPedidosComFreteGratis: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }
    println("$agrupamentoPedidosComFreteGratis\n")

    println("Números com frete grátis: ${agrupamentoPedidosComFreteGratis[true]}") //Para pegar números com frete grátis
    println("Números sem frete grátis: ${agrupamentoPedidosComFreteGratis[false]}\n") //Para buscar números sem frete grátis

    //Outro cenário: Lista, estilo agenda
    val nomes = listOf<String>(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A']) //Para fazer uma pesquisa específica
}

//Curiosidade: Associação não agrupa, no caso ela
// vai associar aos dois ultimos valores, um verdadeiro e um false


//Transformations: Tópico da documentação que mostra todos os comportamentos com a finalidade de transformar coleções
//Significado: Dado uma operação, devolver uma nova coleção baseada em outra
//Comportamento mapping -> Devolver uma nova coleção, fazendo uma operação em cada um dos elementos
