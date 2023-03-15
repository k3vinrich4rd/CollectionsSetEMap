package br.com.estudos.collectionsetmap.mutable


//Como instanciar um map
fun mutableMapOf() {
    val pedidos = mutableMapOf(
        Pair(1, 20.00), //Pair(Par)  -> Pega pares de valores com uma relação
        Pair(2, 34.00), //Pair(Par)  -> Pega pares de valores com uma relação
        3 to 50.0 //outra forma de informar os valores utilizando o to (para) infix
        //to é mais utilizado quando não é se trabalhado com muitos valores e não se exige muito performance
    )

    println()
    val pedido = pedidos[5]
    pedido?.let {
        println("value pedido: $it")
    }
    println()

    //Para pegar o número do pedido e seu valor através do for e forEach:
    for (p in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")

    }
    println()

    pedidos.forEach { p ->
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    //Uma forma para inserir
    pedidos[4] = 70.00 // maneira mais convencional
    println(pedidos)

    //Outra forma de inserir
    pedidos.put(5, 80.00) //put = colocar (lá ele)
    println(pedidos)

    //Para atualizar:
    pedidos[1] = 10.00
    println(pedidos)

    //Outra forma de atualizar:
    pedidos.put(1, 5.00)
    println(pedidos)


    //Para fazer adicionar somente se a chave e o valor for ausente
    pedidos.putIfAbsent(6,20.00 ) //putIfAbsent -> Colocar se ausente (lá ele)
    println(pedidos)

    //Não atualiza por conta da regra
    pedidos.putIfAbsent(6,300.00 )
    println(pedidos)

    //Para remover um pedido (é necessário informar a chave):
    pedidos.remove(6)
    println(pedidos)

    //Para remover de acordo com uma condição
    //Só vai remover se o valor da chave cumprir o esperado do parâmetro:
    pedidos.remove(1, 5.0)
    println(pedidos)
}