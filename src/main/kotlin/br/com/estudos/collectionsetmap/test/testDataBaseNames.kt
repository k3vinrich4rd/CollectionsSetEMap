package br.com.estudos.collectionsetmap.test

import br.com.estudos.collectionsetmap.templates.DataName

fun main() {

    /*Isso é errado, pois, feri o princípio de encapsulamento
    val banco = DataName()
    //  banco.names.add("Kevin Richard") - Impossivel efetuar essa ação
    println(banco.names) */


    //Maneira correta de se fazer a mesma coisa:
    //dessa forma é a correta porque tira o acesso do usuário a property interna da classe
    //Nos fornecendo também mais poder de controle
    val banco = DataName()
    banco.saveInList("Silvio")

    val banco2 = DataName()
    banco2.saveInList("Cassio")
    println(DataName().names)

    //[Silvio, Cassio] (Retorno
    /* Explicação — esse retorno só é possível porque desde o momento
    que utilizamos o companion object, ele desentrelaçou toda a instância de objeto
    da lista, mas sim unificou a sua criação a valores que já estavam nesta lista  */
}