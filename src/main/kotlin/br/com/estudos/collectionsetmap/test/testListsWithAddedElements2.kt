package br.com.estudos.collectionsetmap.test

fun main() {
    testListsWithAddedElements2()
}

fun testListsWithAddedElements2() {
    val assistiramCursoAndroid = listOf("Kevin", "Katia", "Eric", "Fran")
    val assistiramCursoKotlin = listOf("Kevin", "Paulo", "Maria", "Maria")
    //A ordem da soma conta no resultado do log. e organização
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    //Distinct (Distinto) ->  Devolve uma nova lista,
    // contudo com os elementos distintos (Elementos não repetidos)
    //Função que é uma extensão de iterable e não um comportamento próprio da coleção
    println(assistiramAmbos.distinct())
}