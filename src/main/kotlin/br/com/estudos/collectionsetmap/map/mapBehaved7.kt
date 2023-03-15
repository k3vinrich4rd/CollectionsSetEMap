package br.com.estudos.collectionsetmap.map

import br.com.estudos.collectionsetmap.templates.Pedido

fun mapBehaved7() {

    val pedidos = listOf<Pedido>(
        (Pedido(1, 20.00)),
        (Pedido(2, 60.00)),
        (Pedido(3, 30.00)),
        (Pedido(4, 70.00))
    )
    println("$pedidos\n")
    /*Utilizando a função associate() (Associar) para pegar cada um dos pedidos, a partir dos seus números:
    associate() (Associação) -> passa por cada um dos elementos da lista, com isso vamos ter acesso ao "pedido"
    Como parâmetro da expressão lambda, e dentre disso devolvemos um pair que vai determinar
    o que esperamos, que nesse caso, a chave é o número do pedido e o valor é o próprio pedido
     */
    val pedidosMapeadosPeloNumero: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido) //Associação do pedido
        //pedido.numero to pedido //Também é possível utilizar um infix
    }
    println("(Associando pedidos ao número da chave):")
    println(pedidosMapeadosPeloNumero)
    println("${pedidosMapeadosPeloNumero[1]}\n") //Forma de busca


    //Utilizando a função associateBy() (Associar por) para pegar cada um dos pedidos, a partir dos seus números:
    // associateBy() -> Pega cada um dos objetos e coloca como valor de referência, e (substituindo o to/
    // ou a vírgula do pair) //Porque já está sendo pré estabelecido a associação desse mapa
    // única coisa que temos que determinar, é a sua associação:
    val pedidosMapeadosPeloValor = pedidos.associateBy { pedido ->
        pedido.valor //Associação do pedido
    }

    println("(Associando pedidos ao valor da chave):")
    println(pedidosMapeadosPeloValor)
    println("${pedidosMapeadosPeloValor[70.00]}\n") //Forma de busca


    println("Associando valores de pedido com regra de negócio")
    //Utilizando a função associateWith() (Associar com) para executar regra de negócio
    //Regra: Se o valor do pedido for maior que 50,00 tem frete grátis (retorna true) se não retorna false
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.00)]) //Forma de busca
    println("${pedidosFreteGratis[Pedido(numero = 2, valor = 60.00)]}\n") //Forma de busca


}


//Transformations: Tópico da documentação que mostra todos os comportamentos com a finalidade de transformar coleções
//Significado: Dado uma operação, devolver uma nova coleção baseada em outra
//Comportamento mapping -> Devolver uma nova coleção, fazendo uma operação em cada um dos elementos