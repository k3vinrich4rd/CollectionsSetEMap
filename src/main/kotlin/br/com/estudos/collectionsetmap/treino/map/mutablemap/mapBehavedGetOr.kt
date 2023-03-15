package br.com.estudos.collectionsetmap.treino.map.mutablemap

fun mapBehaved1() {

    val pedidos = mutableMapOf(
        0 to 20.00,
        Pair(1, 20.00), //Pair(Par)  -> Pega pares de valores com uma relação
        Pair(2, 34.00), //Pair(Par)  -> Pega pares de valores com uma relação
        3 to 50.0, //outra forma de informar os valores utilizando o to (para) infix
        4 to null
        //to é mais utilizado quando não é se trabalhado com muitos valores e não se exige muito performance
    )
    //getValue (Pegar valor) -> Pega os valores através da chave e se a chave não existir na lista
    //Estoura uma exception (Se a chave existir na lista e o valor for null, retorna null)
    // Pegando valores com o getValue:
    // val valorPedido = pedidos.getValue(5)
    // println(valorPedido)
    //Diferente do get value que também pega valores numa lista, mas retorna null
    // se a chave não, se tornando impreciso em comparação com o getValue


    //getOrElse -> Tem um comportamento similar ao, a diferença é que ele
    // vai fazer um retorno a partir de uma expressão lambda caso a chave não for encontrada
    // Pegando valores com o getOrElse:
    //A sua ideia é não ficar tão restrito
    val message = pedidos.getOrElse(0) {
        "Pedido não encontrado"
    }
    println(message)


    //getOrDefault ( Obter ou padrão) -> Caso não encontrar a chave na lista,
    // devolve um valor padrão estipulado pelo dev
    //Pegando valores com o getOrDefault:
    val valueDefault = pedidos.getOrDefault(1, -1)
    println(valueDefault)

    //Forma mais convencional de pegar valores:
    val valuePedidos = pedidos[1]
    println(valuePedidos)




}