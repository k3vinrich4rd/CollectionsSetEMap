package br.com.estudos.collectionsetmap.map.mutablemap

fun mapBehaved6() {

    val pedidos = mutableMapOf(
        0 to 20.00,
        Pair(1, 14.00), //Pair(Par)  -> Pega pares de valores com uma relação
        Pair(2, 64.00), //Pair(Par)  -> Pega pares de valores com uma relação
        3 to 50.0, //outra forma de informar os valores utilizando o to (para) infix
        4 to 100.00,
        5 to 150.00,
        6 to 80.00,
        7 to 100.00
        //to é mais utilizado quando não é se trabalhado com muitos valores e não se exige muito performance
    )
//    println("Lista original: $pedidos\n")

   //Para remover pela chave
    pedidos.keys.remove(0)
    println(pedidos)

    //Para remover valores
    pedidos.values.remove(80.00)
    println(pedidos)

    //Para remover valores iguais (No caso o primeiro que encontrar):
    pedidos.values.remove(100.00)
    println(pedidos)


    //minusAssign -> tem o mesmo comportamento (De remoção), sendo vinculado a chave:
    pedidos -= 7
    println(pedidos)



    //Se fazer dessa forma vira uma impressão boolean
//    val remove = pedidos.keys.remove(0)
//    println(pedidos)




}
