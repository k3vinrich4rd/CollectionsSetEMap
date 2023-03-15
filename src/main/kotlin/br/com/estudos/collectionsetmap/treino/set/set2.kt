package br.com.estudos.collectionsetmap.treino.set

fun set2() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin //'+' operator
    //Outra forma de se fazer a mesma coisa s
    //val assistiramAmbos = assistiramCursoAndroid.plus(assistiramCursoKotlin)
    println(assistiramAmbos)
}